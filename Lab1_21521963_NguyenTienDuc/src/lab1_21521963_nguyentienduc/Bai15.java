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
public class Bai15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao Gia tri cua a: ");
        double a = input.nextInt();
        System.out.println("Nhap vao Gia Tri cua b: ");
        double b = input.nextInt();
        double GiaTri = ((a+b)/(Math.pow(a, 1/3)+Math.pow(b, 1/3))-Math.pow(a*b, 1/3))/Math.pow(Math.pow(a, 1/3)-Math.pow(1, 3), 1/2);
        System.out.println("Gia tri cua Bieu thuc la: " + GiaTri);
        
    }
}
