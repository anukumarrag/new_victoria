/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package email;

import com.sun.mail.smtp.SMTPTransport;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author anurag
 * 
 * 
 */
public class MailSend {
    public static String email2_previous(String to,String subject,String messageText ){
    try
        {
final String username="info@victoriaclubhotel.info";
             final String password="victoria@123";
String host = "uc1.nodecluster.net";  // For gmail hosting
String from="info@victoriaclubhotel.info";  // write your email address means from email address.
    
Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "465");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
                        @Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
 
Message msg = new MimeMessage(session);
try{
msg.setFrom(new InternetAddress(from,"Victoria Club Hotel"));
InternetAddress[] address = {new InternetAddress(to)};

msg.setRecipients(Message.RecipientType.TO, address);
msg.setSubject(subject);
msg.setSentDate(new Date());
msg.setText(messageText);
  msg.setContent(messageText,"text/html" );  
Transport.send(msg);
return "message send Successfully "+ to+ messageText+subject;
    }
catch(Exception exc){
return "Message sending failed  1"+exc + to+ messageText+subject;
}
}

        catch(Exception e)
        {
return "Message sending failed  2"+e+ to+ messageText+subject;
    }
        }
    
    
     public static String email2(String email,String subject, String mymsg){
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
    
    
    
     
}
