package me.xueyao.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author XueYao
 * @date 2017-11-26
 */
public class HelloJob implements Job{

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("hello quartz Spring ... thanks");
    }
}
