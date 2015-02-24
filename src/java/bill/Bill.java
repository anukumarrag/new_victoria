/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bill;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import setting.Database;

/**
 *
 * @author buzzkart
 */
public class Bill {
    
 
         // for home pagination
    
    
    
    
  

      public String getBill(int page,int size) throws SQLException {
        String result="";
                            int offset=(page-1)*size;
                            int totalrows=(int)getItemCount("select count(*) as count from bill");
                            int totalpage=totalrows/size;
                            if(totalrows%size>0)
                            totalpage++;
        
//        System.out.print("offset= "+offset+" total rows ="+totalrows+" totalpage = "+totalpage+"");
//        
        Connection con=null;
        try{
         con= new Database().getConnection();
        String sql="select * from bill"
                + " ORDER BY dos DESC limit "+size+" OFFSET "+offset ;
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery(sql);
        int count=offset+1;
        while(rs.next()){
           
            result+=" <tr>\n" +
"                    <td>"+count+"</td>\n" +
"                  <td>"+rs.getString("mobile")+"</td>\n" +
"                  <td>"+rs.getString("description")+"</td>\n" +
"                  <td>"+rs.getString("dos")+"</td>\n" +
"                  <td>"+rs.getString("amount")+"</td>\n" +
//"                  <td>"+rs.getString("dob")+"</td>\n" +
//"                  <td><a href=\"./guestdetail.jsp?mobile="+rs.getString("mobile")+"\"><button class=\"btn-sm\"> Show detail </button></td>\n" +
"                </tr>";
            
            count++;
        }
        
      if(totalrows>size)
          result+=getPagination(page, totalpage); 
         }
        catch(SQLException e){
            Logger.getLogger(Bill.class.getName()).log(Level.FINE, e.getMessage(), e);
            result=e.getMessage();
        }
         finally{
             if(con!=null)
                 con.close();
         }
        
        return result;
    }
    
      
      
      public static double getItemCount(String sql) throws SQLException{
         double count=0;
          Connection c=null;
         try{
          c=new Database().getConnection();
         Statement s=c.createStatement();
         ResultSet rs=s.executeQuery(sql);
         while(rs.next()){
             count=rs.getDouble("count");
         }
        
         }
         catch(Exception ee){
             Logger.getLogger(Bill.class.getName()).log(Level.OFF, ee.getMessage(), ee);
             System.out.println(ee);
         }
          finally{
             if(c!=null)
                 c.close();
         }
          return count;
     }
      
      
           public String getPagination(int page,int totalpage){
           
             String pagination0="<tr>\n <td colspan=\"8\" >\n  <ul class=\"pagination \" style=\" margin:0px;\">\n";
          if(page<=1){
        pagination0+= "  <li class='disabled'><a href=\"?pageno="+(page)+"\">&laquo;</a></li>";
          }
          else{
            pagination0+= "  <li><a href=\"?pageno="+(page-1)+"\">&laquo;</a></li>";  
          }
        String pagination2="";
        if(page>=totalpage)
           pagination2="<li class='disabled'><a href=\"?pageno="+(page)+"\">&raquo;</a></li>\n" +
                            "</ul>\n" +
                            "  \n" +
                            "</td>\n" +
                                "</tr>";
        else{
            pagination2="<li><a href=\"?pageno="+(page+1)+"\">&raquo;</a></li>\n" +
                            "</ul>" +
                            "  \n" +
                            "</td>\n" +
                                "</tr>";
        }
        
        String pagination1="";
        
        if(totalpage>0){
            String itemdata="";
            if(totalpage<=10){
                
                for(int item=1;item<=totalpage;item++){
                itemdata="";
                if(item==page)
                itemdata="<li class='active'><a href=\"?pageno="+item+"\">"+item+"</a></li>";
                else
                    itemdata="<li><a href=\"?pageno="+item+"\">"+item+"</a></li>";
                
                     pagination1+=itemdata;
             
             }
        }
            else{
                  itemdata="";
               if(page>=1 && page<4){
                   for(int item=1;item<=4;item++){
                       if(item==page)
                          itemdata="<li class='active'><a href=\"?pageno="+(item)+"\">"+item+"</a></li>";
                       else
                           itemdata="<li><a href=\"?pageno="+(item)+"\">"+item+"</a></li>";
                    pagination1+=itemdata;
                   }
                    itemdata="<li><a>---</a></li>";
                     pagination1+=itemdata;
                     itemdata="<li><a href=\"?pageno="+(totalpage/2-1)+"\">"+(totalpage/2-1)+"</a></li>"
                             + "<li><a href=\"?pageno="+(totalpage/2)+"\">"+(totalpage/2)+"</a></li>"
                             + "<li><a href=\"?pageno="+(totalpage/2+1)+"\">"+(totalpage/2+1)+"</a></li>"
                             + "<li><a>---</a></li>"
                             + "<li><a href=\"?pageno="+(totalpage)+"\">"+(totalpage)+"</a></li>";
                      pagination1+=itemdata;
                     
               }
                  else{
                   
                       if(page>=((totalpage/2) -1) && page<((totalpage/2) +2))
                       {
                           itemdata="";
                             itemdata="<li><a href=\"?pageno=1\">1</a></li>"
                                     + "<li><a href=\"?pageno=2\">2</a></li>"
                                     + "<li><a>---</a></li>";
                              pagination1+=itemdata;
                              for(int item=((totalpage/2) -1);item<=((totalpage/2) +2);item++){
                       if(item==page)
                          itemdata="<li class='active'><a href=\"?pageno="+(item)+"\">"+item+"</a></li>";
                       else
                           itemdata="<li><a href=\"?pageno="+(item)+"\">"+item+"</a></li>";
                    pagination1+=itemdata;
                   }
                             itemdata="<li><a>---</a></li>"
                                     + "<li><a href=\"?pageno="+(totalpage-1)+"\">"+(totalpage-1)+"</a></li>"
                                     + "<li><a href=\"?pageno="+(totalpage)+"\">"+(totalpage)+"</a></li>";
                              pagination1+=itemdata;      
                              
                       }
                       else{

                               if(page>=(totalpage-4) && page<=(totalpage))
                               {
                                   
                                   itemdata="";
                             itemdata="<li><a href=\"?pageno=1\">1</a></li>"
                                     + "<li><a>---</a></li>"
                                     + "<li><a href=\"?pageno="+(totalpage/4)+"\">"+(totalpage/4)+"</a></li>"
                                     + "<li><a>---</a></li>"
                                     + "<li><a href=\"?pageno="+(totalpage/2)+"\">"+(totalpage/2)+"</a></li>"
                                     + "<li><a>---</a></li>";
                              pagination1+=itemdata;
                                      for(int item=(totalpage-4);item<=(totalpage);item++){
                       if(item==page)
                          itemdata="<li class='active'><a href=\"?pageno="+(item)+"\">"+item+"</a></li>";
                       else
                           itemdata="<li><a href=\"?pageno="+(item)+"\">"+item+"</a></li>";
                    pagination1+=itemdata;
                   }
                              
                              

                               }

                               else{
                                   
                       itemdata="";
                       itemdata="<li><a href=\"?pageno=1\">1</a></li>"
                               + "<li><a>---</a></li>";
                       pagination1+=itemdata;   
                       
                                      for(int item=(page-1);item<=(page+2);item++){
                       if(item==page)
                          itemdata="<li class='active'><a href=\"?pageno="+(item)+"\">"+item+"</a></li>";
                       else
                           itemdata="<li><a href=\"?pageno="+(item)+"\">"+item+"</a></li>";
                    pagination1+=itemdata;
                   }
                       
                       itemdata="<li><a>---</a></li>"
                               + "<li><a href=\"?pageno="+totalpage+"\">"+totalpage+"</a></li>";
                       pagination1+=itemdata;                  
                                      

                               }
                       }
               }
                
                
                
            }
        }
           return pagination0+pagination1+pagination2;
       }
    
           
           public static void main(String[] args) throws SQLException {
          
               System.out.println(new Bill().getBill(1, 3));
    }
}
