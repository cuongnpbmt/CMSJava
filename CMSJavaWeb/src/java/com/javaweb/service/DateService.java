/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author CuongNP
 */
public class DateService {

    public DateService() {
        
    }
    static String pattern = "yyyy-MM-dd";
    static SimpleDateFormat format = new SimpleDateFormat(pattern);
    
    public static Date getDate(String strDate){
        
        Date date = null;
        try {
          date = format.parse(strDate);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }        
        return date;
    }
    
    public static String getStrDate(Date date){
        if(date!=null){
            return format.format(date);
        }
        else {
            return format.format(new Date()); 
        }
    }
    
}
