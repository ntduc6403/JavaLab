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
public class Bai51 {
    public static void Nhap(){
        int n;
        Scanner input= new Scanner(System.in);
        System.out.println("nhap vao 1 so n");
            n = input.nextInt();
       while(n <= -89 || n >= 90){
            System.out.println("Ban da nhap sai. Vui long nhap lai");
            n = input.nextInt();
        }
    }
    
    public static void main(String[] args){
        Nhap();
    }
}
