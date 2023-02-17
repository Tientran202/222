
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
public class baiTap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int a, b, SL, SN, tt;
        String C;
        Scanner sc = new Scanner(System.in);
        do {

            a = b = SL = SN = tt = 0;
            do {
                System.out.print("Nhap so a: ");
                a = Integer.parseInt(sc.nextLine());
                System.out.print("Nhap so b: ");
                b = Integer.parseInt(sc.nextLine()); 
            } while (a <= 0 || b <= 0);
            if (a == b) {
                System.out.println("Uoc chung lon nhat cua a la " + a);
            } else {
                if (a > b) {
                    SL = a;
                    SN = b;
                } else {
                    SL = b;
                    SN = a;
                }
                System.out.println("Uoc chung lon nhat cua hai so " + a + " va " + b + " la: " + UCLN(SL, SN));
            }
            System.out.println("--------------------------------------------------");
            System.out.print("Ban co muon nhap them 2 so nguyen duong nua khong (y/n): ");
            do {
                C = sc.nextLine();
                if (C.equals("y") || C.equals("n")) {
                    tt = 1;
                } else {
                    System.out.print("Phai nhap y/n: ");
                }
            } while (tt == 0);
        } while (C.equals("y"));
        System.out.println("Ket thuc chuong trinh");
    }

    private static int UCLN(int a, int b) {
        int tam = 0;
        while (b != 0) {
            tam = a % b;
            a = b;
            b = tam;
        }
        return a;
    }
}
