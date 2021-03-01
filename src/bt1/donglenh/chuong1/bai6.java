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
public class bai6 {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df= new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);
        String input="11-03-2001";
        Date ngaysinh=df.parse(input);
      person per = new person("Nguyen van A", 1,ngaysinh );
      System.out.println("Ho ten: "+per.getHoten()+ "; gioi tinh: "+per.getGioitinh()+"; ngaysinh"+df.format(per.getNgaysinh()));
      
      Student sinhvien=new Student();
      sinhvien.setHoten("Nguyen van B");
      sinhvien.setGioitinh(1);
      sinhvien.setNgaysinh(df.parse("12-12-2002"));
      sinhvien.setTruonghoc("Dai hoc hue");
      System.out.println(sinhvien.getHoten()+"; gioi tinh"+sinhvien.getGioitinh()+"; ngaysinh"+df.format(sinhvien.getNgaysinh())+sinhvien.getTruonghoc());
      System.out.println(sinhvien.calcTax(1200));
      work congnhan=new work();
      
      congnhan.setHoten("Nguyen van C");
      congnhan.setGioitinh(1);
      congnhan.setNgaysinh(df.parse("12-12-2000"));
      congnhan.setCongty("Cong ty 1");
      System.out.println(congnhan.getHoten()+"; gioi tinh"+congnhan.getGioitinh()+"; ngaysinh"+df.format(congnhan.getNgaysinh())+congnhan.getCongty());
      System.out.println(congnhan.calcTax(2000));
    }
}
