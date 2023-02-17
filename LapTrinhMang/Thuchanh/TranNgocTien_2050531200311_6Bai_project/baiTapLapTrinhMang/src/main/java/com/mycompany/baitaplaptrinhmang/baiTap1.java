/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.baitaplaptrinhmang;

import java.util.Scanner;

/**
 *
 * @author tranngoctien
 */
public class baiTap1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,tam;
        int dem = 0,c=0,u=0,tAS=1,AS=0;
        System.out.print("Nhap vao 1 so: ");
        a=sc.nextDouble();
        b= Math.sqrt(a);
        c=(int) b;
        tam=a;
        if(b%c>0){
            System.out.println("So nay 0 phai la so chinh phuong");
            
        }
        else{
            System.out.println("So nay la so chinh phuong");
        }
        for(int i=2;i<=b;i++){
            if(a%i == 0){
                dem++;
            }
        }
        for(int i=2;i<=(a/2);i++){
            if(a%i==0){
                u+=i;
            }
        }
        while(tAS!=0){
            tAS=(int)tam%10;
            tam=(int)tam/10;
            AS+=Math.pow(tAS, 3);
        }
        if(AS==(int)a){
            
            System.out.println("So nay la so Amstrong");
        }
        else{
            System.out.println("So nay 0 phai la so Amstrong");
        }
        if(a==u){
            System.out.println("So nay la so hoan hoan");
        }
        else{
            System.out.println("So nay 0 phai la so hoan hao");
        }
        if(dem!=0){
            System.out.println("So nay 0 phai la so nguyen to");
        }
        else{
            System.out.println("So nay la so nguyen to");
        }
        
    }
}
