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
public class baiTap5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String chuoi, lap = "";
        int t = 0, ttLap = 0;
        Scanner sc = new Scanner(System.in);
        do {
            ttLap = 0;
            lap = "";
            System.out.print("Nhap chuoi: ");
            chuoi = sc.nextLine();
            System.out.println("Chon cac chuc nang sau: \n"
                    + " 1. In ra chuoi dao nguoc da cho.\n"
                    + " 2. Doi chuoi da cho sang chu in hoa.\n"
                    + " 3. Doi chuoi da cho sang chu thuong.\n"
                    + " 4. Doi chuoi da cho ra chu in hoa va thuong (Neu la in hoa thi doi thanh thuong va nguoc lai\n"
                    + " 5. Dem so tu trong chuoi.\n"
                    + " 6. In ra cac nguyen am");
            System.out.print("  Chon: ");
            t = Integer.parseInt(sc.nextLine());
            switch (t) {
                case 1 ->
                    InChuoiDaoNguoc(chuoi);
                case 2 ->
                    DoiThanhInHoa(chuoi);
                case 3 ->
                    DoiThanhThuong(chuoi);
                case 4 ->
                    DoiNguocKieuChu(chuoi);
                case 5 ->
                    DemSoTuTrongChuoi(chuoi);
                case 6 ->
                    InNguyenAm(chuoi);

            }
            System.out.println("\n------------------------------------------------");
            System.out.println("Ban muon nhap mot chuoi moi nua khong: ");
            System.out.print("Nhap y/n: ");
            do {
                ttLap = 0;
                lap = sc.nextLine();
                if (lap.equals("y")) {
                    ttLap = 1;
                } else if (lap.equals("n")) {
                    break;
                } else {
                    System.out.print("Phai nhap y hoac n: ");
                }
            } while (ttLap == 0);

        } while (ttLap == 1);
        System.out.println("Ket thuc chung trinh.");
    }

    public static void InChuoiDaoNguoc(String chuoi) {
        System.out.print(" Chuoi dao nguoc cua " + chuoi + " la: ");
        for (int i = chuoi.length() - 1; i >= 0; i--) {
            System.out.print(chuoi.charAt(i) + "");
        }
    }

    public static void DoiThanhInHoa(String chuoi) {
        System.out.print(" Chuoi in hoa cua " + chuoi + ": " + chuoi.toUpperCase());
    }

    public static void DoiThanhThuong(String chuoi) {
        System.out.print(" Chuoi thuong cua " + chuoi + ": " + chuoi.toLowerCase());
    }

    public static void DoiNguocKieuChu(String chuoi) {
        String t;
        System.out.print("Doi kieu chu in hoa hanh thuong va nguoc lai cua chuoi "+chuoi+": ");
        for (int i = 0; i < chuoi.length(); i++) {
            t = String.valueOf(chuoi.charAt(i));
            if (chuoi.charAt(i) <= 'z' && chuoi.charAt(i) >= 'a') {
                System.out.print(t.toUpperCase());
            } else if (chuoi.charAt(i) <= 'Z' && chuoi.charAt(i) >= 'A') {
                System.out.print(t.toLowerCase());
            } else {
                System.out.print(t);
            }
        }
    }

    public static void DemSoTuTrongChuoi(String chuoi) {
        System.out.print("Trong chuoi " + chuoi + " co " + chuoi.length() + " tu.");
    }

    public static void InNguyenAm(String chuoi) {
        String nguyenAm = "ueoai";
        System.out.print("Cac nguyen am trong chuoi " + chuoi + " la: ");
        for (int i = 0; i < chuoi.length(); i++) {
            for (int t = 0; t < nguyenAm.length(); t++) {
                if (chuoi.charAt(i) == nguyenAm.charAt(t)) {
                    System.out.print(chuoi.charAt(i) + " ");
                }
            }
        }

    }
}
