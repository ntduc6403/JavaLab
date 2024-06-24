/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_Bai3_Bai4_Bai7;

/**
 *
 * @author User
 */
public class TestCaseDuongTron {
    public static void main(String[] args){
        ToaDo n1 = new ToaDo();
        n1.ToaDo(4, 4);
        DuongTron t1 = new DuongTron();
        t1.DuongTron(n1, 4);
        System.out.println("Duong tron tam n1");
        t1.Xuat();
        System.out.println("Chu vi duong tron n1 la: " + t1.tinhCV());
        System.out.println("Dien Tich duong tron n1 la: " + t1.tinhDT());
        t1.zoomIn(20);
        System.out.println("Phong to duong tron len 20% " + t1.tinhDT());
        t1.zoomOut(80);
        System.out.println("Thu Nho Duong Tron 80 % " + t1.tinhDT());
        DuongTron t2 = new DuongTron();
        t2.DuongTron(n1, 9);
        if(t1.checkGiaoNhau(t1,t2)){
            System.out.println("Hai Duong Tron Giao Nhau");
        }else {
            System.out.println("Hai Duong Tron Khong Giao Nhau");
        }
    }
}
