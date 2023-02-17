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
public class baiTap6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String chuoi, lap = "";
        int chon, ttLap;
        Scanner sc = new Scanner(System.in);
        do {
            ttLap = 0;
            System.out.print("Nhap chuoi: ");
            chuoi = sc.nextLine();
            System.out.println("Chon chuc nang: \n"
                    + "---------------\n"
                    + "    1. In ra moi ki tu trong chuoi thanhh tung dong.\n"
                    + "    2. In tang so suat hien cac ki hieu trong mang.");
            System.out.print("Chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1 ->
                    InKiTu(chuoi);
                case 2 ->
                    tanSoKiTu(chuoi);
            }
            System.out.print("-----------------------------\nBan muon nhap mot chuoi moi nua khong (y/n): ");
            do {
                lap = sc.nextLine();
                if (lap.equals("y")) {
                    ttLap = 1;
                } else if (lap.equals("n")) {
                    System.out.println("Ket thuc chuong trinh");
                    break;
                } else {
                    System.out.print("Phai nhap y/n: ");
                }
            } while (ttLap == 0);
        } while (ttLap == 1);

    }

    public static void InKiTu(String chuoi) {
        System.out.println("In tung ki tu trong chuoi thanh tung dong: ");
        for (int i = 0; i < chuoi.length(); i++) {
            System.out.println(chuoi.charAt(i));
        }
    }

    public static void tanSoKiTu(String chuoi) {
        int soluong = chuoi.length(), dem = 0, tong = 0;
        char kiTu[] = new char[soluong];
        for (int i = 0; i < soluong; i++) {
            kiTu[i] = chuoi.charAt(i);
            System.out.print(kiTu[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < soluong; i++) {
            dem = 0;
            if (kiTu[i] == 0) {
            } else {
                for (int t = i + 1; t < soluong; t++) {
                    if (kiTu[i] == kiTu[t]) {
                        dem++;
                        kiTu[t] = 0;
                    }
                }
                tong += dem + 1;
                System.out.println("Co " + (dem + 1) + " ki tu '" + kiTu[i] + "' trong chuoi");
            }
        }
    }
}
