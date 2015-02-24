/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.job.schedule;

import email.AniversaryMail;
import hotel.Guest;
import java.util.List;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class AnniversaryNotification implements Job {

    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {
        
        try{
            List emails=EmailDataforDOA.getEmails();
            AniversaryMail amail=null;
                 String email=null;
                String name=null;
        if(emails!=null){
                for (Object email1 : emails) {
                    email = ((Guest) email1).getEmail();
                    name = ((Guest) email1).getName();
                    amail=new AniversaryMail(name, email);
                    amail.sendMail();
                }
        }
        }
        catch(Exception e){
            System.out.println("  Exception occure in AnniversaryNotification");  
        }
    }
    
}

