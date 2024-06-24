/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab04;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args){
    QuanLy a = new QuanLy();
    a.loadData();
    a.tinhTien();
    a.xuat();
    System.out.println("Tim Kiem Ma Nhan Vien 123");
    a.timKiem(123);
    System.out.println(" Trung Binh Tien Dien Cua Cac Khach Hang: " );
    System.out.println(a.trungBinhDien());
    System.out.println("Khach Hang co Tien Dien Cao Nhat: ");
    a.maxGia().xuat();
    System.out.println("Ho San Xuat Co Tien Dien Nho Nhat: ");
    a.minGiaSX().xuat();
    
    
    }
    
}
