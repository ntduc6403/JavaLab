/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai03;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args){
        CongTy t1 = new CongTy();
        t1.loadData();
        t1.tinhLuong();
        t1.xuat();
        System.out.println("Tim kiem nhan vien co ma 123 ");
        t1.timKiem(123);
        System.out.println("Tong So Luong Phai Tra Cho Nhan Vien: ");
        System.out.println(t1.tongLuong());
        System.out.println("Nhan Vien Dau Tien Co Tong Luong Lon Nhat: ");
        t1.maxLuong().xuat();
        System.out.println("Cap Nhat Lai Luong Co Ban Cua Nhan Vien Ma 123");
        t1.capNhatLuongCB(123);
        
        
        
    }
}
