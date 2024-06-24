/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai02;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args){
        CongTy h1 = new CongTy();
        h1.loadData();
        h1.tinhLuong();
        System.out.println("Danh sach cac nhan vien thap hon luong TB: ");
        h1.timbeluongTB();
        System.out.println("Nhan Vien Co Muc Luong Cao Nhat La: ");
        h1.maxLuong().xuat();
        System.out.println("Nhan Vien Co Muc Luong Thap  Nhat La: ");
        h1.minLuong().xuat();
        System.out.println("Lap Trinh Vien Co Muc Luong Cao Nhat La:");
        h1.lapTrinhMax().xuat();
        System.out.println("Nhan Vien Kiem Thu Co Muc Luong Thap Nhat La:");
        h1.kiemThuMin().xuat();
        System.out.println("Cap Nhat Luong Co  Ban Cho Ma Nhan Vien n2");
        h1.capNhatLuongCB("n2");
        
    }
}
