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
public class Bai53 {
    public static int Tong(int n){
        int s = 0;
        for(int i = 0; i <= n; i++){
            s += i;
        }
        return s;
    }
    public static int TongTich(int n){
        int s = 0;
        for(int i = 0; i <= n; i++){
            s += i*(i+1);
        }
        return s;
    }
    public static double TongPs(int n){
        double s = 0;
        for(int i = 1; i <= n; i++){
            s += 1/i;
        }
        return s;
    }
    public static int Tich(int n){
        int s = 1;
        for(int i = 1; i <= n; i++){
            s *= i;
        }return s;
    }
    public static int TongGt(int n){
        int s = 1;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            s *= i;
            sum = sum + s;
        }
        return sum;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = input.nextInt();
        System.out.println("Bai 53a: " + Tong(n));
        System.out.println("Bai 53b: " + TongTich(n));
        System.out.println("Bai 53c: " + TongPs(n));
        System.out.println("Bai 53e: " + Tich(n));
        System.out.println("Bai 53d: " + TongGt(n));
        

    }
}
