/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mert tan
 */
public class TarihCevir {
    public static  String convertStringToDate(LocalDateTime indate)
{
    String dateString = null;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

   try{
	dateString = indate.format(formatter);
   }catch (Exception ex ){
	System.out.println(ex);
   }
   return dateString;
}
    public static LocalDateTime tarihCevir(String inDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	
	LocalDateTime localDate = LocalDateTime.parse(inDate+" 00:00:00", formatter);
        return localDate;
    }
    public static boolean mailAdresKontroluYap(String mailAdresi){
        char[] mailAdresKarakterleri = mailAdresi.toCharArray();
        boolean karakterVarmi = true;
        for(char karakter:mailAdresKarakterleri){
            if(karakter=='@'){
                karakterVarmi = false;
            }
        }
        return karakterVarmi;
    }
    
}
