/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitapnetpro;

import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author tranngoctien
 */
public class baiTap1 {

    public static void main(String[] args) {
        //Tạo đối tượng InetAddress
        //InetAddress biễu diễn một địa chỉ internet
        InetAddress i;  
        try{
            //getLocalHost() để lấy thông tin về địa chỉ cục bộ và hiển thị nó
            i=InetAddress.getLocalHost();
            System.out.println("The localhost is: "+ i);
            
            //getByName(null) để lấy thông tin về địa chỉ null và hiển thị nó
            i=InetAddress.getByName(null);
            System.out.println("The Null host is: "+ i);
            
            //getByName(URL) để lấy thông tin về địa chỉ URL của một website và hiển thị nó
            i=InetAddress.getByName("daotao.ute.udn.vn");
            System.out.println("The Host address is: "+i);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
