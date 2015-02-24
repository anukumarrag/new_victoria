/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package email;

import static email.MailSend.email2;

/**
 *
 * @author buzzkart
 */
public class AniversaryMail {
     private String email;
    private String name;
    private String subject="Happy Marriage Anniversary  From Victoria Club Hotel !!!";
    

    public AniversaryMail( String name, String email) {
        this.name=name;
        this.email=email;
    }
    
      public String getMsg(){
        String msg=null;
        
        msg="<html><head>\n" +
"<title></title>\n" +
"\n" +
"<style type=\"text/css\">@media only screen and (max-width:480px){body,table,td,p,a,li,blockquote{-webkit-text-size-adjust:none !important}body{width:100% !important;min-width:100% !important}td[id=bodyCell]{padding:10px !important}table.kmMobileHide{display:none !important}table[class=kmTextContentContainer]{width:100% !important}table[class=kmBoxedTextContentContainer]{width:100% !important}td[class=kmImageContent]{padding-left:0 !important;padding-right:0 !important}img[class=kmImage]{width:100% !important}table[class=kmSplitContentLeftContentContainer],table[class=kmSplitContentRightContentContainer],table[class=kmColumnContainer],td[class=kmVerticalButtonBarContentOuter] table[class=kmButtonBarContent],td[class=kmVerticalButtonCollectionContentOuter] table[class=kmButtonCollectionContent],table[class=kmVerticalButton],table[class=kmVerticalButtonContent]{width:100% !important}td[class=kmButtonCollectionInner]{padding-left:9px !important;padding-right:9px !important;padding-top:9px !important;padding-bottom:0 !important;background-color:transparent !important}td[class=kmVerticalButtonIconContent],td[class=kmVerticalButtonTextContent],td[class=kmVerticalButtonContentOuter]{padding-left:0 !important;padding-right:0 !important;padding-bottom:9px !important}table[class=kmSplitContentLeftContentContainer] td[class=kmTextContent],table[class=kmSplitContentRightContentContainer] td[class=kmTextContent],table[class=kmColumnContainer] td[class=kmTextContent],table[class=kmSplitContentLeftContentContainer] td[class=kmImageContent],table[class=kmSplitContentRightContentContainer] td[class=kmImageContent]{padding-top:9px !important}td[class=\"rowContainer kmFloatLeft\"],td[class=\"rowContainer kmFloatLeft firstColumn\"],td[class=\"rowContainer kmFloatLeft lastColumn\"]{float:left;clear:both;width:100% !important}table[id=templateContainer],table[class=templateRow]{max-width:600px !important;width:100% !important}h1{font-size:24px !important;line-height:130% !important}h2{font-size:20px !important;line-height:130% !important}h3{font-size:18px !important;line-height:130% !important}h4{font-size:16px !important;line-height:130% !important}td[class=kmTextContent]{font-size:14px !important;line-height:130% !important}td[class=kmTextBlockInner] td[class=kmTextContent]{padding-right:18px !important;padding-left:18px !important}table[class=\"kmTableBlock kmTableMobile\"] td[class=kmTableBlockInner]{padding-left:9px !important;padding-right:9px !important}table[class=\"kmTableBlock kmTableMobile\"] td[class=kmTableBlockInner] [class=kmTextContent]{font-size:14px !important;line-height:130% !important;padding-left:4px !important;padding-right:4px !important}}</style>\n" +
"</head>\n" +
"<body style=\"margin:0;padding:0;background-color:#c7c7c7\">\n" +
"<center>\n" +
"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" id=\"bodyTable\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:0;background-color:#c7c7c7;height:100%;margin:0;width:100%\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td align=\"center\" id=\"bodyCell\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding-top:50px;padding-left:20px;padding-bottom:20px;padding-right:20px;border-top:0;height:100%;margin:0;width:100%\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" id=\"templateContainer\" width=\"600\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;border:1px solid #aaa;background-color:#f4f4f4;border-radius:0\">\n" +
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
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageBlock\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody class=\"kmImageBlockOuter\">\n" +
"<tr>\n" +
"<td class=\"kmImageBlockInner\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:9px;\" valign=\"top\">\n" +
"<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageContentContainer\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"kmImageContent\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:0;padding-top:0px;padding-bottom:0;padding-left:9px;padding-right:9px;\">\n" +
"<center>\n" +
"<img alt=\"\" class=\"kmImage\" src=\"http://goo.gl/6brEqS\" width=\"540\" style=\"border:0;height:auto;line-height:100%;outline:none;text-decoration:none;padding-bottom:0;display:inline;vertical-align:bottom;margin-right:0;max-width:540px;\">\n" +
"</center>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageBlock\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody class=\"kmImageBlockOuter\">\n" +
"<tr>\n" +
"<td class=\"kmImageBlockInner\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:0px;\" valign=\"top\">\n" +
"<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageContentContainer\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"kmImageContent\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:0;padding:0;\">\n" +
"<img align=\"center\" alt=\"Shadow\" class=\"kmImage\" src=\"https://d3k81ch9hvuctc.cloudfront.net/assets/email/bottom_shadow_444.png\" width=\"600\" style=\"border:0;height:auto;line-height:100%;outline:none;text-decoration:none;padding-bottom:0;display:inline;vertical-align:bottom\">\n" +
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
"<td class=\"kmTextContent\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;color:#505050;font-family:Helvetica, Arial;font-size:14px;line-height:150%;text-align:left;padding-top:9px;padding-bottom:9px;padding-left:18px;padding-right:18px;\">\n" +
"<h3 style=\"color:#666;display:block;font-family:Helvetica, Arial;font-size:16px;font-style:normal;font-weight:normal;line-height:110%;letter-spacing:normal;margin:0;margin-bottom:9px;text-align:left\">"
                + "<strong>Dear "+this.name+",</strong></h3>\n" +
"<h3 style=\"color:#666;display:block;font-family:Helvetica, Arial;font-size:16px;font-style:normal;font-weight:normal;line-height:110%;letter-spacing:normal;margin:0;margin-bottom:9px;text-align:left;text-align: justify;\"><br>\n" +
"Victoria Club Hotel wishes you a very happy anniversary. May god bless you with all the happiness in life.</h3>\n" +
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
"<p style=\"margin:0;padding-bottom:1em;text-align: center;\"> </p>\n" +
"<h3 style=\"color:#666;display:block;font-family:Helvetica, Arial;font-size:16px;font-style:normal;font-weight:normal;line-height:110%;letter-spacing:normal;margin:0;margin-bottom:9px;text-align:left;text-align: center;\"><img alt=\"Tripadvisor\" src=\"http://goo.gl/H3Px5R\" style=\"border:0;height:auto;line-height:100%;outline:none;text-decoration:none;height: 80%; width: 80%;\"></h3>\n" +
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
"<p style=\"margin:0;padding-bottom:1em;text-align: center;\"> </p>\n" +
"<p style=\"margin:0;padding-bottom:1em;text-align: center;\"> </p>\n" +
"<div style=\"text-align: justify;\"><span style=\"font-size: 12px; color: rgb(149, 165, 166); font-family: Helvetica, arial, sans-serif; line-height: 24px;\">We had be grateful if you would review us on </span><a href=\"https://www.tripadvisor.com/UserReviewEdit-g503703-d1910886-a_placetype.10023-e__2F__Hotel__5F__Review__2D__g503703__2D__d1910886__2D__Reviews__2D__Victoria__5F__Club__5F__Hotel__2D__Puri__5F__Orissa__2E__html-Victoria_Club_Hotel-Puri_Orissa.html\" style=\"word-wrap:break-word;color:#0000cd;font-weight:normal;text-decoration:underline;color: rgb(17, 85, 204); font-size: 12px; font-family: Helvetica, arial, sans-serif; line-height: 24px;\" target=\"_blank\">Trip Advisor</a><span style=\"font-size: 12px; color: rgb(149, 165, 166); font-family: Helvetica, arial, sans-serif; line-height: 24px;\">. It’s the world’s largest travel site, helping over 60 million visitors every month plan the perfect trip</span></div>\n" +
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
"</td>\n" +
"<td class=\"rowContainer kmFloatLeft lastColumn\" valign=\"top\" width=\"50%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
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
"<td class=\"kmTextContent\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;color:#505050;font-family:Helvetica, Arial;font-size:14px;line-height:150%;text-align:left;padding-top:9px;padding-bottom:9px;padding-left:18px;padding-right:18px;\">\n" +
"<h3 style=\"color:#666;display:block;font-family:Helvetica, Arial;font-size:16px;font-style:normal;font-weight:normal;line-height:110%;letter-spacing:normal;margin:0;margin-bottom:9px;text-align:left;text-align: center;\"><span style=\"font-family:lucida sans unicode,lucida grande,sans-serif;\"><span style=\"color:#2F4F4F;\"><span style=\"font-size:20px;\"><u><strong>Victoria Club Hotel</strong></u></span></span></span></h3>\n" +
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
"<td class=\"rowContainer kmFloatLeft firstColumn\" valign=\"top\" width=\"33%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageBlock\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody class=\"kmImageBlockOuter\">\n" +
"<tr>\n" +
"<td class=\"kmImageBlockInner\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:9px;\" valign=\"top\">\n" +
"<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageContentContainer\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"kmImageContent\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:0;padding-top:0px;padding-bottom:0;padding-left:9px;padding-right:9px;text-align: center;\">\n" +
"<img align=\"center\" alt=\"victoria club hotel\" class=\"kmImage\" src=\"http://goo.gl/gI07RM\" width=\"162\" style=\"border:0;height:auto;line-height:100%;outline:none;text-decoration:none;padding-bottom:0;display:inline;vertical-align:bottom;max-width:228px;\">\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"<td class=\"rowContainer kmFloatLeft\" valign=\"top\" width=\"33%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageBlock\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody class=\"kmImageBlockOuter\">\n" +
"<tr>\n" +
"<td class=\"kmImageBlockInner\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:0px;\" valign=\"top\">\n" +
"<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageContentContainer\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"kmImageContent\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:0;padding:0;text-align: center;\">\n" +
"<img align=\"center\" alt=\"victoria club hotel\" class=\"kmImage\" src=\"http://goo.gl/6mEy2T\" width=\"198\" style=\"border:0;height:auto;line-height:100%;outline:none;text-decoration:none;padding-bottom:0;display:inline;vertical-align:bottom;max-width:228px;\">\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageBlock\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody class=\"kmImageBlockOuter\">\n" +
"<tr>\n" +
"<td class=\"kmImageBlockInner\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:0px;\" valign=\"top\">\n" +
"<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageContentContainer\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"kmImageContent\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:0;padding:0;\">\n" +
"<img align=\"center\" alt=\"Shadow\" class=\"kmImage\" src=\"https://d3k81ch9hvuctc.cloudfront.net/assets/email/bottom_shadow_444.png\" width=\"198\" style=\"border:0;height:auto;line-height:100%;outline:none;text-decoration:none;padding-bottom:0;display:inline;vertical-align:bottom\">\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"</td>\n" +
"<td class=\"rowContainer kmFloatLeft lastColumn\" valign=\"top\" width=\"33%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageBlock\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody class=\"kmImageBlockOuter\">\n" +
"<tr>\n" +
"<td class=\"kmImageBlockInner\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:9px;\" valign=\"top\">\n" +
"<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"kmImageContentContainer\" width=\"100%\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0\">\n" +
"<tbody>\n" +
"<tr>\n" +
"<td class=\"kmImageContent\" valign=\"top\" style=\"border-collapse:collapse;mso-table-lspace:0;mso-table-rspace:0;padding:0;padding-top:0px;padding-bottom:0;padding-left:9px;padding-right:9px;text-align: center;\">\n" +
"<img align=\"center\" alt=\"\" class=\"kmImage\" src=\"http://goo.gl/xrgVvh\" width=\"162\" style=\"border:0;height:auto;line-height:100%;outline:none;text-decoration:none;padding-bottom:0;display:inline;vertical-align:bottom;max-width:238px;\">\n" +
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
"    <br>Victoria Club Hotel Sea Beach, Puri, 752001 &nbsp;&nbsp; Contact: 06752 – 222005 / 222920 &nbsp;&nbsp;  Fax: 06752 – 222583 &nbsp;&nbsp; Email: victoria.puri@gmail.com / admin@victoriaclubhotel.com         \n" +
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
            
//           System.out.println(email2(this.email, this.subject, this.getMsg())+"  to "+this.email);  
         String status=""+com.mailgun.api.SendMailApi.sendMail(this.email, this.subject, this.getMsg()) ;
            System.out.println(status);
            setting.SaveInfo.setinfo(status + " email id="+email+"  subject ="+subject);
            
          }
        catch(Exception e){
            System.out.println("Exception in sending BirthDay Email "+e);
            
        }
        
    }
    
    public static void main(String[] args) {
        
        
        AniversaryMail obj=new AniversaryMail("Anurag Kumar", "payrolldiatm@gmail.com");
        System.out.println(obj.getMsg());
         
      obj.sendMail();
    }
    
}

