/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_Bai6;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class TestCasePhanSo {
    public static void main(String [] args){
           PhanSo a1 = new PhanSo(); 
           PhanSo a2 = new PhanSo();
           PhanSo a3 = new PhanSo();
           PhanSo a4 = new PhanSo();
           
           a1.PhanSo(1, 2);
           a2.PhanSo(3, 4);
           a3.PhanSo(4, 6);
           System.out.println("Nhap vao phan so a4");
           a4.nhap();
           System.out.println("Ps a4 :");
           a4.xuat();
           
           a1.xuat();
           a2.xuat();
           
           a1.doiDau();
           a2.doiDau();
           System.out.println("Rut gon phan so a3: ");
           a3.RutGon();
           a3.xuat();
           System.out.println("Cong vao 2 phan so: ");
           a1.cong(a2).xuat();
            System.out.println("Tru vao 2 phan so: ");
           a1.tru(a2).xuat();
            System.out.println("Chia vao 2 phan so: ");
           a1.chia(a2).xuat();
           System.out.println("Nhan 2 phan so a1 a2: ");
           a2.nhan(a1).xuat();
           
           a1.soSanh(a1, a2);
           
          
           PhanSo p1 = new PhanSo();
           PhanSo p2 = new PhanSo();
           PhanSo p3 = new PhanSo();

           p1.PhanSo(4, 7);
           p2.PhanSo(3, 4);
           p3.PhanSo(8, 9);
         
           ArrayList<PhanSo> ps = new ArrayList<>();
           ps.add(p1);
           ps.add(p2);
           ps.add(p3);
           
           PhanSo d = new PhanSo();
           PhanSo max = d.maxPhanSo(ps);
           System.out.println("Phan So lon nhat trong danh sach la" );
           max.xuat();

           
           
           
    }
}
