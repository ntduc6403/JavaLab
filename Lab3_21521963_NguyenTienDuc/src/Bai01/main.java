/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai01;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args){
        CongTy t1 = new CongTy();
       t1.loadData();
       t1.xuat();
       t1.tinhLuong();
       System.out.println("--------------------------------");
       System.out.println("Tim nhan vien co ma 1");
       t1.timNV(1);
       System.out.println("--------------------------------");
       t1.capNhatNV(1);
       System.out.println("--------------------------------");
       System.out.println("Nhan Vien Co Muc Luong Hang Thang Cao Nhat La");
       t1.maxLuong().Xuat();
       System.out.println("--------------------------------");
       System.out.println("Nhan Vien Co So San Pham Thap Nhat La: ");
       t1.minSP().Xuat();
    }
}
