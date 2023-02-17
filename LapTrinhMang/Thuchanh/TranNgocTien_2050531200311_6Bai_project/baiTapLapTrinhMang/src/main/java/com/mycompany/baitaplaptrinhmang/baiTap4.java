/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.baitaplaptrinhmang;

import java.util.Scanner;

/**
 *
 * @author tranngoctien
 */
public class baiTap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
       String chuoi;
        char ktu;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        chuoi = sc.nextLine();
        System.out.print("Chuoi dao nguoc la: ");
        for (int i=chuoi.length()-1;i>=0;i--){
            ktu = chuoi.charAt(i);
            System.out.print(ktu+" ");
        }
    }
  }

