/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package email;

/**
 *
 * @author buzzkart
 */
public class BirthDayMail {
    private String email;
    private String name;
    private String subject="Happy Birthday From Victoria Club Hotel !!!";
    

    public BirthDayMail( String name, String email) {
        this.name=name;
        this.email=email;
    }
    
    public String getMsg(){
        String msg=null;
        msg="<html><head>\n" +
"<meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\">\n" +
"<title></title>\n" +
"\n" +
"<style type=\"text/css\">@media only screen and (max-width:480px){body,table,td,p,a,li,blockquote{-webkit-text-size-adjust:none !important}body{width:100% !important;min-width:100% !important}td[id=bodyCell]{padding:10px !important}table.kmMobileHide{display:none !important}table[class=kmTextContentContainer]{width:100% !important}table[class=kmBoxedTextContentContainer]{width:100% !important}td[class=kmImageContent]{padding-left:0 !important;padding-right:0 !important}img[class=kmImage]{width:100% !important}table[class=kmSplitContentLeftContentContainer],table[class=kmSplitContentRightContentContainer],table[class=kmColumnContainer],td[class=kmVerticalButtonBarContentOuter] table[class=kmButtonBarContent],td[class=kmVerticalButtonCollectionContentOuter] table[class=kmButtonCollectionContent],table[class=kmVerticalButton],table[class=kmVerticalButtonContent]{width:100% !important}td[class=kmButtonCollectionInner]{padding-left:9px !important;padding-right:9px !important;padding-top:9px !important;padding-bottom:0 !important;background-color:transparent !important}td[class=kmVerticalButtonIconContent],td[class=kmVerticalButtonTextContent],td[class=kmVerticalButtonContentOuter]{padding-left:0 !important;padding-right:0 !important;padding-bottom:9px !important}table[class=kmSplitContentLeftContentContainer] td[class=kmTextContent],table[class=kmSplitContentRightContentContainer] td[class=kmTextContent],table[class=kmColumnContainer] td[class=kmTextContent],table[class=kmSplitContentLeftContentContainer] td[class=kmImageContent],table[class=kmSplitContentRightContentContainer] td[class=kmImageContent]{padding-top:9px !important}td[class=\"rowContainer kmFloatLeft\"],td[class=\"rowContainer kmFloatLeft firstColumn\"],td[class=\"rowContainer kmFloatLeft lastColumn\"]{float:left;clear:both;width:100% !important}table[id=templateContainer],table[class=templateRow]{max-width:600px !important;width:100% !important}h1{font-size:24px !important;line-height:130% !important}h2{font-size:20px !important;line-height:130% !important}h3{font-size:18px !important;line-height:130% !important}h4{font-size:16px !important;line-height:130% !important}td[class=kmTextContent]{font-size:14px !important;line-height:130% !important}td[class=kmTextBlockInner] td[class=kmTextContent]{padding-right:18px !important;padding-left:18px !important}table[class=\"kmTableBlock kmTableMobile\"] td[class=kmTableBlockInner]{padding-left:9px !important;padding-right:9px !important}table[class=\"kmTableBlock kmTableMobile\"] td[class=kmTableBlockInner] [class=kmTextContent]{font-size:14px !important;line-height:130% !important;padding-left:4px !important;padding-right:4px !important}}</style>\n" +
"</head>\n" +
"<body style=\"margin:0;padding:0;background-color:#FFF\">\n" +
"<center>\n" +
"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" id=\"bodyTable\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:0;background-color:#FFF;height:100%;margin:0;width:100%\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td align=\"center\" id=\"bodyCell\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding-top:20px;padding-left:20px;padding-bottom:20px;padding-right:20px;border-top:0;height:100%;margin:0;width:100%\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" id=\"templateContainer\" width=\"600\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;border:1px solid #aaa;background-color:#EEE;border-radius:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td id=\"templateContainerInner\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:0\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody><tr>\n" +
"<td align=\"center\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"templateRow\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"rowContainer kmFloatLeft\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmTextBlock\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody class=\"kmTextBlockOuter\">\n" +
"<tr>\n" +
"<td class=\"kmTextBlockInner\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;\">\n" +
"<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmTextContentContainer\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"\n" +
"\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageBlock\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody class=\"kmImageBlockOuter\">\n" +
"<tr>\n" +
"<td class=\"kmImageBlockInner\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:9px;\" valign=\"top\">\n" +
"<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageContentContainer\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"kmImageContent\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:0;padding-top:0px;padding-bottom:0;padding-left:9px;padding-right:9px;\">\n" +
"<img align=\"left\" alt=\"\" class=\"kmImage\" src=\"http://goo.gl/emG5gO\" width=\"564\" style=\"border:0;height:auto;line-height:100%;outline:none;text-decoration:none;padding-bottom:0;display:inline;vertical-align:bottom;margin-right:0;max-width:849px;\">\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td align=\"center\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"templateRow\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"rowContainer kmFloatLeft firstColumn\" valign=\"top\" width=\"50%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageBlock\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody class=\"kmImageBlockOuter\">\n" +
"<tr>\n" +
"<td class=\"kmImageBlockInner\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:9px;\" valign=\"top\">\n" +
"<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageContentContainer\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"kmImageContent\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:0;padding-top:0px;padding-bottom:0;padding-left:9px;padding-right:9px;\">\n" +
"<img align=\"left\" alt=\"\" class=\"kmImage\" src=\"http://goo.gl/MtJCR4\" width=\"264\" style=\"border:0;height:auto;line-height:100%;outline:none;text-decoration:none;padding-bottom:0;display:inline;vertical-align:bottom;margin-right:0;max-width:550px;\">\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"<td class=\"rowContainer kmFloatLeft lastColumn\" valign=\"top\" width=\"50%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmTextBlock\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody class=\"kmTextBlockOuter\">\n" +
"<tr>\n" +
"<td class=\"kmTextBlockInner\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;\">\n" +
"<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmTextContentContainer\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"kmTextContent\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;color:#505050;font-family:Helvetica, Arial;font-size:14px;line-height:150%;text-align:left;padding-top:9px;padding-bottom:9px;padding-left:18px;padding-right:18px;\">\n" +
"<p style=\"margin:0;padding-bottom:1em\"><span style=\"font-size:16px;\"><strong>Dear "
                + this.name+ " ,"
                + "</strong></span></p>\n" +
"<p style=\"margin:0;padding-bottom:0\">Victoria Club Hotel wishes you a very happy birthday. May God bless you with all the happiness in life.</p>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td align=\"center\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"templateRow\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"rowContainer kmFloatLeft firstColumn\" valign=\"top\" width=\"50%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmTextBlock\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody class=\"kmTextBlockOuter\">\n" +
"<tr>\n" +
"<td class=\"kmTextBlockInner\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;\">\n" +
"<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmTextContentContainer\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"kmTextContent\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;color:#505050;font-family:Helvetica, Arial;font-size:14px;line-height:150%;text-align:left;padding-top:9px;padding-bottom:9px;padding-left:18px;padding-right:18px;\">\n" +
"<p style=\"margin:0;padding-bottom:1em\"> </p>\n" +
"<p style=\"margin:0;padding-bottom:0\"><span style=\"color: rgb(136, 144, 152); font-family: Helvetica, arial, sans-serif; font-size: 14px; line-height: 24px; background-color: rgb(252, 252, 252);\">We had be grateful if you would review us on</span><a href=\"https://www.tripadvisor.com/UserReviewEdit-g503703-d1910886-a_placetype.10023-e__2F__Hotel__5F__Review__2D__g503703__2D__d1910886__2D__Reviews__2D__Victoria__5F__Club__5F__Hotel__2D__Puri__5F__Orissa__2E__html-Victoria_Club_Hotel-Puri_Orissa.html\" style=\"word-wrap:break-word;color:#0000cd;font-weight:normal;text-decoration:underline;color: rgb(51, 185, 255); font-family: Helvetica, arial, sans-serif; font-size: 14px; line-height: 24px; text-decoration: none !important; background-color: rgb(252, 252, 252);\" target=\"_blank\">TripAdvisor</a><span style=\"color: rgb(136, 144, 152); font-family: Helvetica, arial, sans-serif; font-size: 14px; line-height: 24px; background-color: rgb(252, 252, 252);\">. It’s the world’s largest travel site, helping over 60 million visitors every month plan the perfect trip.</span></p>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"kmButtonBlock\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody class=\"kmButtonBlockOuter\">\n" +
"<tr>\n" +
"<td valign=\"top\" align=\"left\" class=\"kmButtonBlockInner\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:9px 18px;\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"\" class=\"kmButtonContentContainer\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;border-top-left-radius:5px;border-top-right-radius:5px;border-bottom-right-radius:5px;border-bottom-left-radius:5px;background-color:#999;background-color:#C1292B;border-radius:5px;\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td align=\"center\" valign=\"middle\" class=\"kmButtonContent\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;color:white;font-family:Helvetica, Arial;font-size:16px;padding:15px;padding-top:15px;padding-bottom:15px;padding-left:15px;padding-right:15px;color:#ffffff;font-weight:bold;font-size:16px;font-family:Helvetica, Arial;\">\n" +
"<a class=\"kmButton\" title=\"\" href=\"https://www.tripadvisor.com/UserReviewEdit-g503703-d1910886-a_placetype.10023-e__2F__Hotel__5F__Review__2D__g503703__2D__d1910886__2D__Reviews__2D__Victoria__5F__Club__5F__Hotel__2D__Puri__5F__Orissa__2E__html-Victoria_Club_Hotel-Puri_Orissa.html\" target=\"_self\" style=\"word-wrap:break-word;font-weight:normal;letter-spacing:-0.5px;line-height:100%;text-align:center;text-decoration:underline;color:#0000cd;font-family:Helvetica, Arial;font-size:16px;text-decoration:initial;color:#ffffff;font-weight:bold;font-size:16px;font-family:Helvetica, Arial;padding-top:0;padding-bottom:0;\"> TripAdvisor </a>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"<td class=\"rowContainer kmFloatLeft lastColumn\" valign=\"top\" width=\"50%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageBlock\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody class=\"kmImageBlockOuter\">\n" +
"<tr>\n" +
"<td class=\"kmImageBlockInner\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:9px;\" valign=\"top\">\n" +
"<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageContentContainer\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"kmImageContent\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:0;padding-top:0px;padding-bottom:0;padding-left:9px;padding-right:9px;\">\n" +
"<img align=\"left\" alt=\"\" class=\"kmImage\" src=\"http://goo.gl/sLSyMV\" width=\"264\" style=\"border:0;height:auto;line-height:100%;outline:none;text-decoration:none;padding-bottom:0;display:inline;vertical-align:bottom;margin-right:0;max-width:440px;\">\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td align=\"center\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"templateRow\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"rowContainer kmFloatLeft\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmTextBlock\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody class=\"kmTextBlockOuter\">\n" +
"<tr>\n" +
"<td class=\"kmTextBlockInner\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;\">\n" +
"<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmTextContentContainer\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"kmTextContent\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;color:#505050;font-family:Helvetica, Arial;font-size:14px;line-height:150%;text-align:left;font-size:12px;color:#727272;padding-bottom:9px;text-align:center;padding-right:18px;padding-left:18px;padding-top:9px;\">\n" +
"            No longer want to receive these emails? You can <a class=\"unsubscribe-link\" style=\"color:#0000cd;font-weight:normal;text-decoration:underline;\" href=\" \">unsubscribe here</a>.<br>\n" +
"Victoria Club Hotel Sea Beach, Puri, 752001 &nbsp;&nbsp; Contact: 06752222005 / 222920 &nbsp;&nbsp;  Fax: 06752222583 &nbsp;&nbsp; Email: victoria.puri@gmail.com / admin@victoriaclubhotel.com\n" +
"          </td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody></table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</center>\n" +
"\n" +
"</body></html>";
        
        
        return msg;
        
    }
 
    public void sendMail(){
        try{
//              System.out.println(com.mailgun.api.SendMailApi.sendMail(this.email, this.subject, this.getMsg())+ "  to "+this.email);  
       
            String status=""+com.mailgun.api.SendMailApi.sendMail(this.email, this.subject, this.getMsg()) ;
            System.out.println(status);
            setting.SaveInfo.setinfo(status + " email id="+email+"  subject ="+subject);
            
        }
        catch(Exception e){
            System.out.println("Exception in sending BirthDay Email "+e);
            
        }
        
    }
    
    public static void main(String[] args) {
        
        
        BirthDayMail obj=new BirthDayMail("Anurag Kumar", "payrolldiatm@gmail.com");
        System.out.println(obj.getMsg());
         
        MailSend.email2(obj.email, obj.subject, obj.getMsg());
    }
    
}
