/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1.chuong2.donglenh;

import bt1.chuong2.logiclayer.Phuongtrinhbac2;

/**
 *
 * @author ASUS
 */
public class testPTB2 {
   public static void main(String[] args){
      System.out.println("Giai Phuong trinh bac 2");
       Phuongtrinhbac2 obj=new Phuongtrinhbac2(3.5, -4, 2);
       obj.GiaiPhuongTrinh();
       System.out.println(obj.getKetqua());
   } 
}
