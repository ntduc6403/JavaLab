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
public class Bai19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap 4 so nguyen vao: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int min = a;
        if (b<min){
            min = b;
        } if(c< min){
            min = c;
        } if(d< min){
            min = d;
        }System.out.println("Min :"+min);
    }
}
