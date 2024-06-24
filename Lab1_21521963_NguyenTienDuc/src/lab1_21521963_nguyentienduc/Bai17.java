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
public class Bai17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap 3 so nguyen vao: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = a;
        if(b > max){
         max = b;
        if(c > max){
            max= c;
        }}System.out.println("Max: "+ max);
    }
}
