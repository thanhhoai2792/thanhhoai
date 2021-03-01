/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1.chuong2.employeelogic;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class work extends person implements TaxInterface{
    private String congty;

    public work() {
    }

    public work(String congty, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.congty = congty;
    }

    public String getCongty() {
        return congty;
    }

    public void setCongty(String congty) {
        this.congty = congty;
    }

    @Override
    public double calcTax(double income) {
        return(0.04*income);
    }
    
    
}
