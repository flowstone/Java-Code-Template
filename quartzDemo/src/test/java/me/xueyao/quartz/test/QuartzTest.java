package me.xueyao.quartz.test;

import org.junit.Test;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author XueYao
 * @date 2017-11-26
 */
public class QuartzTest {
    //quartz容器启动和关闭
    @Test
    public void testFirst() throws Exception {
        //Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        // and start it off
        scheduler.start();

        scheduler.shutdown();

    }
}
