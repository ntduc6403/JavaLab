/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_21521963_nguyentienduc;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Bai22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac nhat ax+b");
        System.out.println("Nhap vao he so a");
        int a = input.nextInt();
        System.out.println("Nhap vao he so b");
        int b = input.nextInt();
        if(a==0){
           if(b==0){
               System.out.println("Phuong trinh Vo So Nghiem");
           }else if(b!=0){
               System.out.println("Phuong trinh Vo Nghiem");
           }
        }else if (a!=0){
            System.out.println("Phuong trinh co nghiem la:"+ -b/a);
        }
    }
}
