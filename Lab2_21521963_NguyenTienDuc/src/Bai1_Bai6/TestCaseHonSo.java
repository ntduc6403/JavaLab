/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_Bai6;

/**
 *
 * @author User
 */
public class TestCaseHonSo {
    public static void main(String[] args){
        HonSo a1 = new HonSo(1,3,4);
        HonSo a2 = new HonSo(3,5,7);
        PhanSo p1 = new PhanSo(1,2);
        a1.xuat();
        a2.xuat();
        System.out.println("Chuyen Hon So Sang PhanSo:");
        a1.chuyenHonSoSangPhanSo().xuat();
        System.out.println("Chuyen Phan SO Sang Hon So:");
        
        a2.chuyenPhanSoSangHonSo(p1).xuat();
        HonSo hs1 = new HonSo(4,3,4);
        HonSo hs2 = new HonSo(6,5,7);
        System.out.println("Cong 2 Hon So:");
        a1.cong(a2).xuat();
        System.out.println("Tru 2 Hon So:");
        a1.tru(a2).xuat();
        System.out.println("Nhan 2 Hon So:");
        a1.nhan(a2).xuat();
        System.out.println("Chia 2 Hon So:");
        a1.chia(a2).xuat();
        System.out.println("So Sanh Phan So: ");
        hs1.soSanh(hs2);
    }
}
