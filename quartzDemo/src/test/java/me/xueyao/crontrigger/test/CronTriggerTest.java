package me.xueyao.crontrigger.test;

import me.xueyao.simpletrigger.test.HelloJob;
import org.junit.Test;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * 定时任务
 * @author XueYao
 * @date 2017-11-26
 */
public class CronTriggerTest {

    @Test
    public void testCronTrigger() throws SchedulerException {
        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler scheduler = sf.getScheduler();

        // define the job and tie it to our HelloJob class
        //构建调度任务详情对象:包装job，并指定任务的组group1和任务名字job1
        JobDetail job = newJob(HelloJob.class)
                .withIdentity("job1", "group1")
                .build();

        //构建一个触发器(触发规则、什么时候如何调用任务的规则)
        /*
        * @param1 解决器的名字
        * @param2  触发任务的组的名字
        * */
        Trigger trigger = newTrigger()
                .withIdentity("trigger1", "group1")
                .startNow() //马上开始执行任务
                .withSchedule(
                        //每隔5秒运行一次
                        //CronScheduleBuilder.cronSchedule("0/5 * * * * ?")
                        CronScheduleBuilder.cronSchedule("0/5 51 18 ? * 1")

                ) //永远执行下去
                .build();

        // Tell quartz to schedule the job using our trigger
        scheduler.scheduleJob(job, trigger);
        scheduler.start();
        while (true) {

        }
    }
}
