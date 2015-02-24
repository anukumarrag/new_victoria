/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setting;

import hotel.Guest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anurag
 */
public class Database {

    public static String loginTest(String user, String password) {
    String isValid="false";
    try{
        Connection c=new Database().getConnection();
        PreparedStatement ps=c.prepareStatement("select * from login where username='"+user+"' and password='"+password+"'");
        ResultSet rs=ps.executeQuery();
        while (rs.next()) {
            isValid="true";
                       
        }
    }
    catch(Exception e){
        
    }
    
    
    return isValid;
    }

   

    private Connection con;

    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DBA db = new DBA();
            String url = "jdbc:mysql://127.0.0.1/" + db.getDb() + "?autoReconnect=true";
            this.con = DriverManager.getConnection(url, db.getUn(), db.getUp());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

    public Connection getConnection() {

        return con;
    }

    public static int isEligibleCo(String mobile) throws SQLException{
        int result = 0;
        Connection c = null;
        try {
            c = new Database().getConnection();
            Statement s = c.createStatement();
            String sql = "select count(mobile) as count from checkin where mobile='" + mobile + "' and doco is null";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                result = rs.getInt("count");

            }
            return result;
        } catch (Exception ex) {
            System.out.println("Exception in isEligibleCo "+ex);
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return -1;
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }
    
    
    public int isGuestexist(String mobile) throws SQLException {
        int result = 0;
        Connection c = null;
        try {
            c = new Database().getConnection();
            Statement s = c.createStatement();
            String sql = "select count(mobile) as count from guest where mobile='" + mobile + "'";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                result = rs.getInt("count");

            }
            return result;
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return -1;
        } finally {
            if (c != null) {
                c.close();
            }
        }

    }

    public static Guest getGuest(String mobile) throws SQLException {
        Guest guest = null;
        Connection c = null;
        try {
            c = new Database().getConnection();
            Statement s = c.createStatement();
            String sql = "select *  from guest where mobile='" + mobile + "'";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                guest = new Guest();
                guest.setMobile(rs.getString("mobile"));
                guest.setName(rs.getString("name"));
                guest.setEmail(rs.getString("email"));
                guest.setDob(rs.getString("dob"));
                guest.setDoa(rs.getString("doa"));
                guest.setAddress(rs.getString("address"));

            }

        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);

        } finally {
            if (c != null) {
                c.close();
            }
        }

        return guest;
    }

   
    public int newGuest(String name, String mobile, String address, String email, String dob, String doa) {
        int status=0;
         Connection c=null;
    try{
      c=new Database().getConnection();
      String sql="insert into guest (mobile,name,address,email,dob,doa) values('"+mobile+"','"+name+"','"+address+"','"+email+"','"+dob+"','"+doa+"');";
        PreparedStatement p=c.prepareStatement(sql);
        p.execute();
        status=1;
        
    }   catch(SQLException e){
        status=0;
    }
    
    return status;
    }

    public int checkIN(String mobile) {
       int status=0; 
    Connection c=null;
    int isCheckin=0;
    try{
      c=new Database().getConnection();
      PreparedStatement pc=c.prepareStatement("select count(mobile) as count from checkin where mobile='"+mobile+"' and doco is null");
      ResultSet rs=pc.executeQuery();
      while(rs.next())
          isCheckin=rs.getInt("count");
      
      if(isCheckin==0){
      String sql="insert into checkin (mobile,doci) values('"+mobile+"',now());";
        PreparedStatement p=c.prepareStatement(sql);
        p.execute();
        status=1;
      }
      else{
          status=2;
      }
        
    }   catch(SQLException e){
        status=0;   
    }
    
    return status;
    
    }
    
    
    public static ResultSet getResult(String mobile){
        ResultSet rs=null;
        try{
            PreparedStatement ps=new Database().getConnection().prepareStatement("SELECT checkin.sl,checkin.mobile,"
                    + "guest.name,guest.email,checkin.doci FROM checkin,guest where checkin.mobile=guest.mobile "
                    + "and checkin.mobile='"+mobile+"' and checkin.doco is null ;");
            rs=ps.executeQuery();
            
        }
        catch(Exception ee){
            System.out.println("Exception occure in DataBase.getResult Method "+ee);
        }
        
        
        return rs;
    }
    
    
     public static int doCheckout(String mobile) throws SQLException {
        int result = 0;
        Connection c = null;
        try {
            c = new Database().getConnection();
            Statement s = c.createStatement();
            String sql = "update checkin set doco=now() where doco is null and mobile='"+mobile+"';";
            result=s.executeUpdate(sql);
          
            return result;
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return -1;
        } finally {
            if (c != null) {
                c.close();
            }
        }

    }
     
     
        public static int doAdmincheckout(String sl) throws SQLException {
        int result = 0;
        Connection c = null;
        try {
            c = new Database().getConnection();
            Statement s = c.createStatement();
            String sql = "update checkin set doco=now() where doco is null and sl="+sl+";";
            s.execute(sql);
            result=1;
            return result;
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return -1;
        } finally {
            if (c != null) {
                c.close();
            }
        }

    }
    
     public static int insertBill(String mobile,String amount,String description) throws SQLException {
      int result = 0;
        Connection c = null;
        try {
            c = new Database().getConnection();
            Statement s = c.createStatement();
            String sql = "insert into bill (mobile,amount,description) values('"+mobile+"',"+amount+",'"+description+"')";
              s.execute(sql);
            result=1;
            return result;
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return -1;
        } finally {
            if (c != null) {
                c.close();
            }
        }
    
    
    
    }
    
    
   public static void main(String[] args) throws SQLException {
//        int isNew = new Database().isGuestexist("8802339925");
//        System.out.println(isNew);
//
//        Guest g = Database.getGuest("8803339625");
//        if (g != null) {
//            System.out.println(g);
//        }
       
       
       System.out.println(doCheckout("8802339625"));
       
    }


}
