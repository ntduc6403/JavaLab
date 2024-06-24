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
public class Bai38 {
       public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = input.nextInt();
        int S = 0;
       for(int i = 0; i <=n; i++){
           S *= i;
       }System.out.println("S=" + S);
    }
}
