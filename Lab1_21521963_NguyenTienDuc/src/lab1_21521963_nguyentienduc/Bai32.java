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
public class Bai32 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Gia = 0;
        System.out.println("Nhap vao so km taxi da di duoc");
        int km = input.nextInt();
        if(km <=1){
            Gia = km*15000;
        }else if(km >= 2 && km  <= 5){
            Gia = (km -1 ) * 13500 + km*15000; 
        }else if (km >=6){
            Gia = (km - 6 )*11000 + (km -1 ) * 13500 + km*15000;
        }
        System.out.println("Gia tien taxi phai tra:" + Gia);
    }
}
