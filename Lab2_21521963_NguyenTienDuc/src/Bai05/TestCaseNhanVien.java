/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai05;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class TestCaseNhanVien {
    public static void main(String[] args){
        
        NhanVien n1 = new NhanVien();
        NhanVien n2 = new NhanVien();
        NhanVien n3 = new NhanVien();
        NhanVien n4 = new NhanVien();
        NhanVien n5 = new NhanVien();
        NhanVien n6 = new NhanVien();
        NhanVien n7 = new NhanVien();
        NhanVien n8 = new NhanVien();
        NhanVien n9 = new NhanVien();
        NhanVien n10 = new NhanVien();
        NhanVien n11 = new NhanVien();
        NhanVien n12 = new NhanVien();
        NhanVien n13 = new NhanVien();
       

        
        n1.NhanVien(1, "Nguyen Duc", (float) 1.000, 3);
        n2.NhanVien(2, "Thai Duc", (float) 223.000, 12);
        n3.NhanVien(3, "Minh Cuong", (float) 23.000, 12);
        n3.NhanVien(3, "Minh Cuong2", (float) 233.000, 1);
        n4.NhanVien(3, "Minh Cuon3", (float) 253.000, 12);
        n5.NhanVien(3, "Minh Cuon4", (float) 723.000, 14);
        n6.NhanVien(3, "Minh Cuon5", (float) 83.000, 13);
        n7.NhanVien(3, "Minh Cuong6", (float) 13.000, 131);
        n8.NhanVien(3, "Minh Cuon7", (float) 43.000, 11);
        n9.NhanVien(3, "Minh Cuon8", (float) 53.000, 41);
        n10.NhanVien(3, "Minh Cuong9", (float) 43.000, 45);
        n11.NhanVien(3, "Minh Cuong10", (float) 13.000, 100);
        n12.NhanVien(3, "Minh Cuong11", (float) 53.000, 33);
        n13.NhanVien(3, "Minh Cuong12", (float) 63.000, 66);
        

//        n1.Xuat();
//        n2.Xuat();
//        n3.Xuat();
        ArrayList<NhanVien> ds = new ArrayList();
        ds.add(n1);
        ds.add(n2);
        ds.add(n3);
        ds.add(n4);
        ds.add(n5);
        ds.add(n6);
        ds.add(n7);
        ds.add(n8);
        ds.add(n9);
        ds.add(n10);
        ds.add(n11);
        ds.add(n12);
        ds.add(n13);
       

        System.out.println("Ma Nhan Vien so 2 trong danh sach la:  ");
        NhanVien a = new NhanVien();
        a.timMaNV(ds, 2);
        System.out.println("-------------------");
        System.out.println("Nhan Vien Muc Luong cao Nhat trong danh sach la: ");
        NhanVien max = a.maxLuong(ds);
        max.Xuat();
        System.out.println("-------------------");
        System.out.println("Nhan Vien co So sp thap nhat la:");
        a.minSP(ds);
        System.out.println("-------------------");
        System.out.println("Top 10 nhan vien co luong cao nhat trong danh sach la: ");
        a.top10LuongCaoNhat(ds);
        for (int i = 0; i < ds.size(); i++) {
            NhanVien nv = ds.get(i);
            if(i == 10){
                break;
            }
            System.out.println((i + 1) + ". " + nv.getTen() + ": " + nv.tinhLuongHT());
    }
        
        
        

    }
}
