/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1.chuong2.donglenh;

import bt1.chuong2.employeelogic.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class testStudent {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df=new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);
        String input="12-12-1999";
        Date ngaysinh=df.parse(input);
        Student obj = new Student("Dai hoc Hue", "Xuat sac", "Nguyen Van A", 1, ngaysinh);
        switch(obj.getHocluc()){
            case "Xuat sac":
                obj.setHocbong(1000);
                break;
            case "gioi":
                obj.setHocbong(855.5);
                break;
            default :
                obj.setHocbong(0);
                break;
        }
        System.out.println(obj);
    }
}
