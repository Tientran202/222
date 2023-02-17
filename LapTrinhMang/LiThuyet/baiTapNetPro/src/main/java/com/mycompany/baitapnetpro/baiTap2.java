/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.baitapnetpro;

import java.io.IOException;
import java.net.InetAddress;

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
        InetAddress i[];  
        try{
            //getAllByName(String hostname): trả về tên website và tất cả các địa chỉ IP.
            i= InetAddress.getAllByName("google.com");
            for(int t=0;t < i.length;t++){
                System.out.println(i[t]);
            }
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
