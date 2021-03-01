/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1.donglenh.chuong1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class bai5 {
    public static void main(String[] args) throws ParseException{
        //chuyen kieu du lieu date thanh string
        SimpleDateFormat df= new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);
        Date currentDate = new Date();
        String output= df.format(currentDate);
        System.out.println(output);
       //chuyen kieu du lieu tu string thanh date
        String input="15-05-1995";
        Date ngay=df.parse(input);
        System.out.println(ngay);
        System.out.println(df.format(ngay));
    }
}
