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
public class baiTap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Nhap 1 so nguyen duong: ");
        a = sc.nextInt();
        while(a<=0){
            System.out.print("Nhap lai 1 so nguyen duong: ");
            a = sc.nextInt();
        }
        System.out.println("Tich cac chu so cua " + a + " la: " + TichCacChuSo(a) + "\n" + "Tong cac so cua " + a + " la: " + TongCacChuSo(a));
    }

    private static int TongCacChuSo(int a) {
        int Tong = 0;
        while (a != 0) {
            Tong += a % 10;
            a /= 10;
        }
        return Tong;
    }

    public static int TichCacChuSo(int a) {
        int Tich = 1;
        while (a != 0) {
            Tich *= a % 10;
            a /= 10;
        }
        return Tich;
    }
}
