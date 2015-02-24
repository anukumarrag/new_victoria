/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package setting;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author anurag
 */
public class SaveInfo {
    
    public static void setinfo(String args) {
        Connection con=null;
       try{
           con=new Database().getConnection();
           String query="insert into information (message) values('"+args+"')";
           Statement s=con.createStatement();
           s.execute(query);
       }
       catch(Exception e){
           System.out.println("Exception occure in saving information "+e);
       }
    }
    
    public static void main(String[] args) {
        SaveInfo.setinfo("hello anurag , it is a test messae");
    }
    
}
