/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_Bai3_Bai4_Bai7;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class TestCaseToaDo {
    public static void main(String[] args){
        
        ToaDo a1 = new ToaDo();
        ToaDo a2 = new ToaDo();
        ToaDo a3 = new ToaDo();
        
        a3.ToaDo(2, 5);
        a2.ToaDo(3, 4);
        System.out.println("Xuat Toa Do a2 , a3: ");
        a3.Xuat();
        a2.Xuat();
        System.out.println("Nhap vao toa do a1");
        a1.Nhap();
        System.out.println("Toa Do Trung Diem a2 , a3");
        a2.ToaDoTD(a3).Xuat();
        System.out.println("Toa Do a1");
        a1.Xuat();
        System.out.println("Di chuyen toa do a1 them 3 don vi");
        a1.DiChuyen(3, 3);
        a1.Xuat();
        
       System.out.println("Khoang cach giua 2 toa do: "+a1.KhoangCach(a3));
       
       System.out.println("Xoa toa do" );
       a1.XoaTD();
       a1.Xuat();
       System.out.println("Sao chep toa do");
       a3.SaoChep().Xuat();
       ToaDo a5 = new ToaDo();
       ToaDo a6 = new ToaDo();
       ToaDo a7 = new ToaDo();
       
       a5.ToaDo(45, 3);
       a6.ToaDo(67, 34);
       a7.ToaDo(24, 11);
       ArrayList<ToaDo> td = new ArrayList<>();
       td.add(a5);
       td.add(a6);
       td.add(a7);
       
       ToaDo d = new ToaDo();
       ToaDo near = d.GanTamO(td);
       System.out.println("Toa Do gan tam o trong danh sach la: ");
       near.Xuat();
       
    }
}
