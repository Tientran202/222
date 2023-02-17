/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.baitapnetpro;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author tranngoctien
 */
public class baiTap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws MalformedURLException, IOException {
        /*String diaChi;
        URLConnection con; 
        URL url;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap dia chi URL: ");
        diaChi=sc.nextLine();
        url = new URL(diaChi);     
        con = url.openConnection();*/

        String nhap;
        Scanner input = new Scanner(System.in);

        do {
            int i = 0;
            System.out.print("Nhap URL: ");
            String URL = input.nextLine();
            try {
                URL ul = new URL(URL);
                // phuương thức openConnection , mở kết nối đối tượng URL
                URLConnection u = ul.openConnection();
                // phương thức getHeadeField để lấy thông tin header 
                String s = u.getHeaderField(i);
                // phương thức getHeaderFieldKey để lấy thông tin header
                String sg = u.getHeaderFieldKey(i);
                while (s != null) {
                    System.out.println("Header " + i + ": " + sg + " = " + s);
                    i++;
                    s = u.getHeaderField(i);
                    sg = u.getHeaderFieldKey(i);
                }
            } catch (MalformedURLException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println(e);
            }
            System.out.print("Muon nhap nua khong (nhap y): ");
            nhap = input.nextLine();

        } while (nhap.equals("y"));
        System.out.println("Ket thuc chuong trinh");
    }

}
