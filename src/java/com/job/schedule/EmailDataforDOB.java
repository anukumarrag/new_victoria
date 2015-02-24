/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.job.schedule;

import hotel.Guest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import setting.Database;

/**
 *
 * @author anurag
 */
public class EmailDataforDOB {
    public static List<Guest> getEmails() throws SQLException {
        List emails=new ArrayList();
        Connection con=null;
        try{
            con=new Database().getConnection();
            ResultSet  rs=con.createStatement().executeQuery("SELECT * FROM guest where dob!='' and( MONTH(dob) = MONTH(CURRENT_DATE) AND day(dob) = DAY(CURRENT_DATE));");
            while(rs.next()){
                Guest g=new Guest();
                g.setName(rs.getString("name"));
                g.setMobile(rs.getString("mobile"));
                g.setEmail(rs.getString("email"));
                g.setAddress(rs.getString("dob"));
                emails.add(g);
                
            }
        }
        catch(Exception e){
            if(null!=con)
                con.close();
            
        }
        
        return emails;
    }
    
    
    public static void main(String[] args) throws SQLException {
        
        List emails=EmailDataforDOB.getEmails();
        if(emails!=null){
            for(int i=0;i<emails.size();i++){
                
                System.out.println("Email :-  "+((Guest)emails.get(i)).getEmail());   
                
            }
        }      
        
        
    }
}
