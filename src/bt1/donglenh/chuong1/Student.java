 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1.donglenh.chuong1;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Student extends person implements TaxInterface {
    private String truonghoc;

    public Student() {
    }

    public Student(String truonghoc, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
    }

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    @Override
    public double calcTax(double income) {
        double tax;
        tax=0.01*income;
        return tax;
    }
    
    
}
