/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bill;

import hotel.Guest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import setting.Database;


public class Check {
    
    public static List getDetails(int min,int max)
    {
         List list=new ArrayList();
         
        try
        {
         Database db=new Database();
         Connection con=db.getConnection();
         PreparedStatement ps=con.prepareStatement("select *, bill.amount from guest,bill where guest.mobile in (select mobile from bill where amount>=? and amount<=? group by mobile);");
           ps.setInt(1, min);
           ps.setInt(2, max);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
             Guest data=new Guest();
             data.setMobile(rs.getString("mobile"));
             data.setName(rs.getString("name"));
             data.setAddress(rs.getString("address"));
             data.setEmail(rs.getString("email"));
             data.setDoa(rs.getString("doa"));
             data.setDob(rs.getString("dob"));
             data.setAmount(rs.getDouble("amount"));
             list.add(data);

             
            }  
        
       
        }
        catch(Exception e)
        {
            System.out.println("Connection Problem....."+e);
        }
        return list;
    }
    
    
     public static List getSearch(String address)
     {
         List list=new ArrayList();
         
        try
        {
         Database db=new Database();
         Connection con=db.getConnection();
         PreparedStatement ps=con.prepareStatement("select mobile,name,address,email,doa,dob from guest where address like '%' ? '%'");
          ps.setString(1, address);
          // ps.setInt(2, max);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
             Guest data=new Guest();
             data.setMobile(rs.getString("mobile"));
             data.setName(rs.getString("name"));
             data.setAddress(rs.getString("address"));
             data.setEmail(rs.getString("email"));
             data.setDoa(rs.getString("doa"));
             data.setDob(rs.getString("dob"));
             //data.setAmount(rs.getDouble("amount"));
             list.add(data);

             
            } 
        } 
           catch(Exception e)
        {
            System.out.println("Connection Problem....."+e);
        }
        return list;
    }
     public static List getDate(String date1,String date2)
     {
         Connection con = null;
         PreparedStatement ps;
         List list=new ArrayList();
          try
        {
         Database db=new Database();
          con=db.getConnection();
          ps=con.prepareStatement("SELECT p.*, p1.doci FROM guest p INNER JOIN checkin p1 ON p.mobile = p1.mobile INNER JOIN(  SELECT mobile FROM checkin s where (doci BETWEEN ? and ?)GROUP BY s.mobile)d ON p1.mobile = d.mobile group by p.mobile");
           ps.setString(1,date1);
           ps.setString(2,date2);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
             Guest data=new Guest();
             data.setMobile(rs.getString("mobile"));
             data.setName(rs.getString("name"));
             data.setAddress(rs.getString("address"));
             data.setEmail(rs.getString("email"));
             data.setDoa(rs.getString("doa"));
             data.setDob(rs.getString("dob"));
             data.setDoci(rs.getString("doci"));
             //data.setAmount(rs.getDouble("amount"));
             list.add(data);

             
            } 
        } 
           catch(Exception e)
        {
            System.out.println("Connection Problem....."+e);
        }
          finally
          {
              try
              {
              if(con!=null)
              {
                  con.close();
              }
              }
              catch(Exception e)
              {
                  e.printStackTrace();
              }
          }
         return list;
     }
//    public static void main(String[] args) {
//        //Check check=new Check();
//        System.out.println(Check.getDate("2014-12-16","2014-12-28"));
//    }
    
}
