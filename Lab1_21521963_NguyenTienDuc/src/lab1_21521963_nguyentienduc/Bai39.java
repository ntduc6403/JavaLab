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
public class Bai39 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = input.nextInt();
        double Sum = 0;
       for(int i = 1; i <=n; i++){
           Sum += 1.0/i;
       }System.out.println("S=" + Sum);
    }
}
