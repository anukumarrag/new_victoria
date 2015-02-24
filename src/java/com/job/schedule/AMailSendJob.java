/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.job.schedule;

/**
 *
 * @author anurag
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author wjirawong
 */
public class AMailSendJob {
    private  Scheduler scheduler;

    public Scheduler getScheduler() {
        return scheduler;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }
    
    public void jobSchedule(JobDetail job,Trigger trigger) throws SchedulerException{
        
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job, trigger);
       
        setScheduler(scheduler);
    }
    
      public static void update() throws SchedulerException {
        JobDetail job = JobBuilder
                .newJob(AnniversaryNotification.class)
                .withIdentity("sendmailforAnniversary")
                .build();

        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("sendmail")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 12 21 * * ?"))
                .build();
        
        new AMailSendJob().jobSchedule(job, trigger);
        
        
    }
    
    
    

    public static void main(String[] args) throws SchedulerException {
        JobDetail job = JobBuilder
                .newJob(AnniversaryNotification.class)
                .withIdentity("sendmail")
                .build();

        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("sendmail")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 16 21 * * ?"))
                .build();
        
        new AMailSendJob().jobSchedule(job, trigger);
        
        
    }
}
