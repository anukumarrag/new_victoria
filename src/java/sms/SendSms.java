/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sms;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import setting.DBA;

/**
 *
 * @author anurag
 */
public class SendSms {
    
    public static String callURL(String strURL){
System.out.println(" URL is :"+strURL);
String iStatus="";
try{
java.net.URL obj = new java.net.URL(strURL);
HttpURLConnection httpReq = (HttpURLConnection)obj.openConnection();
httpReq.setDoOutput(true);
httpReq.setInstanceFollowRedirects(true);
httpReq.setRequestMethod("GET");
 iStatus = httpReq.getResponseMessage();
System.out.println("iStatus: "+iStatus);
 
} catch (MalformedURLException ex) {
     ex.printStackTrace();
}catch (IOException ex) {
      ex.printStackTrace();
}catch(Exception e){
        e.printStackTrace();
}

return iStatus;
}
    
  public static String sendSmsCheckin(String mobile, String name) throws UnsupportedEncodingException{  
     String status="";
     String msg="Dear "+name+" welcome to Victoria Club Hotel. For Reception dial 9, For Restaurant dial 280. We wish you a comfortable stay. Regards ,Victoria club hotel";
//      String msg="Dear "+name+",\n"
//              + "Thank you for choosing Victoria club hotel.\n"
//              + "We hope you had a comfortable stay."
//              + " we look forward to serve you again."
//              + "\n Regards,\n Victoria club hotel";
//String strMsg=java.net.URLEncoder.encode("This is a test from mVaayoo API", "UTF-8");
    DBA dba=new DBA();
    String username=dba.getUsername();
    String password=dba.getPassword();
    String strSenderId=dba.getSenderId();
    String strMsg=java.net.URLEncoder.encode(msg, "UTF-8");
    strSenderId=java.net.URLEncoder.encode(strSenderId, "UTF-8");
      System.out.println("url =  http://api.mVaayoo.com/mvaayooapi/MessageCompose?user="+username+":"+password+"&senderID="+strSenderId+"&receipientno="+mobile+"&dcs=0&msgtxt="+strMsg+"&state=4");
status=callURL("http://api.mVaayoo.com/mvaayooapi/MessageCompose?user="+username+":"+password+"&senderID="+strSenderId+"&receipientno="+mobile+"&dcs=0&msgtxt="+strMsg+"&state=4");
 
  
return status;
  }
  
  public static String sendSmsCheckout(String mobile, String name) throws UnsupportedEncodingException{  
      String status="";
      String msg="Dear "+name+" Thank you for choosing Victoria club hotel. We hope you had a comfortable stay. we look forward to serve you again. Regards, Victoria club hotel";
//      String msg="Hello  "+name+",\n Thank For Staying.\n Victoria Club Hotel !!";
//    String msg="Dear "+name+" ,\n"
//              + "welcome to Victoria Club Hotel.\n"
//              + "For Reception dial 9\n"
//              + "For Restaurant dial 280.\n"
//            + "We wish you a comfortable stay."
//              + "\n Regards,\n Victoria club hotel";
//String strMsg=java.net.URLEncoder.encode("This is a test from mVaayoo API", "UTF-8");
    DBA dba=new DBA();
    String username=dba.getUsername();
    String password=dba.getPassword();
    String strSenderId=dba.getSenderId();
    String strMsg=java.net.URLEncoder.encode(msg, "UTF-8");
    strSenderId=java.net.URLEncoder.encode(strSenderId, "UTF-8");
    
status=callURL("http://api.mVaayoo.com/mvaayooapi/MessageCompose?user="+username+":"+password+"&senderID="+strSenderId+"&receipientno="+mobile+"&dcs=0&msgtxt="+strMsg+"&state=4");
 
  
return status;
  }
    
  
    public static String sendSmsbill(String mobile, String name, String amount) throws UnsupportedEncodingException{  
      String status="";
      String msg="Hello "+name+",\n You have submitted Rs "+amount+" .\n Victoria Club Hotel !!";
    
//String strMsg=java.net.URLEncoder.encode("This is a test from mVaayoo API", "UTF-8");
    DBA dba=new DBA();
    String username=dba.getUsername();
    String password=dba.getPassword();
    String strSenderId=dba.getSenderId();
    String strMsg=java.net.URLEncoder.encode(msg, "UTF-8");
    strSenderId=java.net.URLEncoder.encode(strSenderId, "UTF-8");
    
status=callURL("http://api.mVaayoo.com/mvaayooapi/MessageCompose?user="+username+":"+password+"&senderID="+strSenderId+"&receipientno="+mobile+"&msgtxt="+strMsg+"&state=4");
 
  
return status;
  
    }
  
  
  
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(sendSmsCheckout("9015967965", "Anurag"));
    }
}
