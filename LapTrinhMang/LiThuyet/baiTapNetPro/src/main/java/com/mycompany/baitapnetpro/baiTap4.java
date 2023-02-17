/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.baitapnetpro;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
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
        String nhap;
        Scanner sc = new Scanner(System.in);
        do {
            int i = 0,l;
            System.out.print("Nhap URL: ");
            String url = sc.nextLine();
            try { 
                //tao tham chiếu địa chỉ url
                URL ul = new URL(url);
                // phuương thức openConnection , mở kết nối đối tượng URL
                URLConnection u = ul.openConnection();
                //InputStream: là đại diện cho luồn dữ liệu được khi đọc một nguồn dữ liệu nào đó.
                //getContent(): lấy nội dung trang website
                InputStream s = (InputStream) u.getContent();
                //int read(): Nó được sử dụng để trả về một ký tự trong mẫu ASCII. Nó trả về -1 vào cuối tập tin.
                while ((i = s.read()) > 0) {
                    System.out.print((char) i);
                }
            } catch (MalformedURLException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println(e);
            }
            System.out.print("Muon nhap nua khong (nhap y): ");
            nhap = sc.nextLine();

        } while (nhap.equals("y"));
        System.out.println("Ket thuc chuong trinh");
    }
}
