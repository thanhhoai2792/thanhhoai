/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1.chuong2.donglenh;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class testWhile {
    public static void main(String[] args){
    int n = 0;
    int i;
    //ki thuat cong don
//    double s1=0;
//    n=100;
//    i=1;
//    while(i<=n){
//    s1=s1+(double)1/i;
//    i=i+1;
//    }
//    System.out.println("Tong thu nhat la s1="+s1);
    Scanner sc= new Scanner(System.in);
    boolean flag=false;
    while(!flag){
    System.out.println("Nhap so nguyen duong le n =");
    String input=sc.nextLine();
    n=Integer.parseInt(input);
//    if((n>0) && (n%2!=0)){
//    flag=true;
//    }else{flag=false;}
    flag=((n>0)&&(n%2!=0))?true:false;
    }
    //ki thuat thay doi buoc nhay
    int s2=0;
    i=1;
    while ( i<= n){
    s2=s2+i;
    i=i+2;
    }
    System.out.println("Tong thu hai la s2="+s2);

    }
}
