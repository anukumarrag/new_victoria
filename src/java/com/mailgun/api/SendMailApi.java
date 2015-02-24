/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mailgun.api;
 
import com.sun.mail.smtp.SMTPTransport;
import static com.sun.xml.ws.api.message.Packet.State.ClientResponse;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage; 

/**
 *
 * @author anurag
 */
public class SendMailApi {
    static String msg="<html>\n" +
"<head>\n" +
"<title>Wedding wishes from victoria club hotel</title>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"<center><table style=\"background-color:rgb(244,244,244); max-width:700px;font-family:Helvetica,Arial;  width:90%;border:thin rgb(153,153,153) solid\">\n" +
"<tr>\n" +
"<td>\n" +
"<img src=\"http://www.bannerbuzz.com/media/catalog/category/wedding-anniversary-vinyl-banners.jpg\" style=\"width:100%; height:auto\" />\n" +
"</td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><p style=\"margin-left:5%; font-weight:600; color:#666\">\n" +
"Dear Anurag ,\n" +
"</p>\n" +
"<p style=\"margin-left:5%; color:#666\">\n" +
"Victoria Club Hotel wishes you a very happy anniversary. May god bless you with all the happiness in life.\n" +
"</p>\n" +
"</td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td>\n" +
"<span style=\"float:left; margin-left:2%;\">\n" +
"<img src=\"http://zamkovyi.com/upload/images/news-SbsTREGz.jpg\" />\n" +
"</span>\n" +
"<p style=\"padding-left:50px; max-width:90%; color:rgb(149,165,166); font-size:14px\">\n" +
"We had be grateful if you would review us on <a href=\"http://goo.gl/Kgcbks\">Trip Advisor</a>. It’s the world’s largest travel site, helping over 60 million visitors every month plan the perfect trip \n" +
"</p>\n" +
"</td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td>\n" +
"<p style=\"color:rgb(153,153,153); border-top:thin rgb(102,102,102) solid; font-size:12px; text-align:center; padding-top:2%; \">\n" +
"Victoria Club Hotel Sea Beach, Puri, 752001    Contact: 06752 – 222005 / 222920    Fax: 06752 – 222583    Email: <a href=\"mail:victoria.puri@gmail.com\">victoria.puri@gmail.com</a> / <a href=\"mailto:admin@victoriaclubhotel.com\">admin@victoriaclubhotel.com</a></p>\n" +
"</td>\n" +
"</tr>\n" +
"</table></center>\n" +
"\n" +
"</body>\n" +
"</html>";
    
    
    public static String SendComplexMessage(Email email){
        String status="";
        try{
        GetProperty api=new GetProperty();
        Properties props = System.getProperties();
        props.put("mail.smtps.host","smtp.mailgun.org");
        props.put("mail.smtps.auth","true");
        Session session = Session.getInstance(props, null);
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(api.getFrom()));
        msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email.getTo(), false));
      
        msg.setSubject(email.getSubject());
        msg.setContent(email.getMessage(), "text/html; charset=utf-8");
        
        msg.setSentDate(new Date());
        SMTPTransport t =(SMTPTransport)session.getTransport("smtps");
        t.connect(api.getSmtp(), api.getUser(), api.getPassword());
        t.sendMessage(msg, msg.getAllRecipients());
        System.out.println("Response: " + t.getLastServerResponse());
        status=t.getLastServerResponse();
        t.close();
        
        
        }
        catch(MessagingException e){
            
        }
        
//       System.out.println(email);
//      
//       
//       client.addFilter(new HTTPBasicAuthFilter("api",api.getApikey()));
//       WebResource webResource = client.resource(api.getApiurl());
//       FormDataMultiPart form = new FormDataMultiPart();
//       form.field("from", api.getFrom());
//       form.field("to", email.getTo());
////       form.field("bcc", "payrolldiatm@gmail.com");
////       form.field("cc", "baz@example.com");
//       form.field("subject", email.getSubject());
//       form.field("html", email.getMessage());
//       
////       String file_separator = System.getProperty("file.separator");
////       File txtFile = new File("." + file_separator +
////                       "files" + file_separator + "test.txt");
////       form.bodyPart(new FileDataBodyPart("attachment",txtFile,MediaType.TEXT_PLAIN_TYPE));
////       File jpgFile = new File("." + file_separator +"files" + file_separator + "test.jpg");
////       form.bodyPart(new FileDataBodyPart("attachment",jpgFile, MediaType.APPLICATION_OCTET_STREAM_TYPE));
//       return webResource.type(MediaType.MULTIPART_FORM_DATA_TYPE).post(ClientResponse.class, form);
        
        return status;
}
    
    
     public static String sendMail(String email,String subject, String mymsg){
        String status="";
        try{
        GetProperty api=new GetProperty();
        Properties props = System.getProperties();
        props.put("mail.smtps.host","smtp.mailgun.org");
        props.put("mail.smtps.auth","true");
        Session session = Session.getInstance(props, null);
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(api.getFrom()));
        msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email, false));
      
        msg.setSubject(subject);
        msg.setContent(mymsg, "text/html; charset=utf-8");
        
        msg.setSentDate(new Date());
        SMTPTransport t =(SMTPTransport)session.getTransport("smtps");
        t.connect(api.getSmtp(), api.getUser(), api.getPassword());
        t.sendMessage(msg, msg.getAllRecipients());
        System.out.println("Response: " + t.getLastServerResponse());
        status=t.getLastServerResponse();
        t.close();
        
        
        }
        catch(MessagingException e){
            
        }
        
//       System.out.println(email);
//      
//       
//       client.addFilter(new HTTPBasicAuthFilter("api",api.getApikey()));
//       WebResource webResource = client.resource(api.getApiurl());
//       FormDataMultiPart form = new FormDataMultiPart();
//       form.field("from", api.getFrom());
//       form.field("to", email.getTo());
////       form.field("bcc", "payrolldiatm@gmail.com");
////       form.field("cc", "baz@example.com");
//       form.field("subject", email.getSubject());
//       form.field("html", email.getMessage());
//       
////       String file_separator = System.getProperty("file.separator");
////       File txtFile = new File("." + file_separator +
////                       "files" + file_separator + "test.txt");
////       form.bodyPart(new FileDataBodyPart("attachment",txtFile,MediaType.TEXT_PLAIN_TYPE));
////       File jpgFile = new File("." + file_separator +"files" + file_separator + "test.jpg");
////       form.bodyPart(new FileDataBodyPart("attachment",jpgFile, MediaType.APPLICATION_OCTET_STREAM_TYPE));
//       return webResource.type(MediaType.MULTIPART_FORM_DATA_TYPE).post(ClientResponse.class, form);
        
        return status;
}
    
    
    
    public static void main(String[] args) {
        
        System.out.println(com.mailgun.api.SendMailApi.sendMail("anukumarrag@gmail.com","Testing for Victoria" ,msg ));
    }
}
