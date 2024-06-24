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
public class Bai30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao a b c");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a+b > c && b+c>a && c+a>b){
            System.out.println("Ba canh nay tao thanh 1 tam giac");
        }
    }
}
