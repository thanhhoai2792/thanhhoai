/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1.chuong2.logiclayer;

/**
 *
 * @author ASUS
 */
public class Phuongtrinhbac1 implements PhuongtrinhInter{
   private double a;
   private double b;
   private double nghiem_x;
   private String ketqua;

    public Phuongtrinhbac1() {
    }

    public Phuongtrinhbac1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void GiaiPhuongTrinh() {
       if(a!=0){
         nghiem_x=-b/a;
         ketqua="Phuong trinh bac nhat co nghiem la: "+nghiem_x;
       }else{
         if(b!=0){
            ketqua="Phuonwg trinh bac 1 vo nghiem";
         }else{
           ketqua="Phuong trinh bac 1 co vo so nghiem";
         }
       }
    }

    @Override
    public String toString() {
       if(ketqua==null||ketqua.isEmpty()){
       GiaiPhuongTrinh();
       }
       return ketqua;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getNghiem_x() {
        return nghiem_x;
    }

    public void setNghiem_x(double nghiem_x) {
        this.nghiem_x = nghiem_x;
    }

    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }
   
   
}
