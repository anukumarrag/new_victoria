/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.victoria.emailtemplate;

/**
 *
 * @author anurag
 */
public class Template {
    
    public static String getAnnivarsary(String name){
        String msg="<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
"<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
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
"Dear "+name+" ,\n" +
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
        
        return msg;
    }
    
    
    public static String getBirthday(String name){
        String msg="";
        return msg;
    }
    
}
