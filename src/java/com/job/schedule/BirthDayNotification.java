/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anurag
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.schedule;

import email.BirthDayMail;
import hotel.Guest;
import java.util.List;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author wjirawong
 */
public class BirthDayNotification implements Job {

    public void execute(JobExecutionContext jec) throws JobExecutionException {
        
        try{
            List emails=EmailDataforDOB.getEmails();
            BirthDayMail bmail=null;
                 String email=null;
                String name=null;
        if(emails!=null){
            for(int i=0;i<emails.size();i++){
                email=((Guest)emails.get(i)).getEmail();
                name=((Guest)emails.get(i)).getName();
                bmail=new BirthDayMail(name, email);
                bmail.sendMail();
            }
        }
        }
        catch(Exception e){
            System.out.println("  Exception occure in ");  
        }
    }
    public static void main(String[] args) {
        BirthDayNotification b=new BirthDayNotification();
       
    }
}
