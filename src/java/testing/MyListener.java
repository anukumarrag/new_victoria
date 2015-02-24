/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import com.job.schedule.AMailSendJob;
import com.job.schedule.AnniversaryNotification;
import com.job.schedule.BMailSendJob;
import com.job.schedule.BirthDayNotification;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
 
/**
 * Web application lifecycle listener.
 *
 * @author Anurag
 */
@WebListener()
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
      
        ServletContext ctx=sce.getServletContext();
     
        try { 
        JobDetail job = JobBuilder
                .newJob(BirthDayNotification.class)
                .withIdentity("Send mail for Birth day ")
                .build();

        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("Send mail for Birth day ")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 17 03 * * ?"))
                .build();
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.scheduleJob(job, trigger);
           
       
      }catch(Exception e){
            System.out.println(" Exception in MyListener Class");
      }
        
            try { 
        JobDetail job = JobBuilder
                .newJob(AnniversaryNotification.class)
                .withIdentity("Send mail for  Anniversary")
                .build();

        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("Send mail for  Anniversary")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 20 03 * * ?"))
                .build();
        
       Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.scheduleJob(job, trigger);
            
       
      }catch(Exception e){
            System.out.println(" Exception in MyListener Class"+e);
      }
        
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("Context destroyed from MyListener class"+sce);
    }
}
