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
public class Bai52 {
    public static double CanBac(double y, double x){
        double kq;
        
        kq = Math.pow(y,1/x);
        return kq;
    }
    
    public static int soDao(int x){
        int tmp, res = 0;
        while(x > 0){
            tmp = x % 10;
            res = res*10 + tmp;
            x /= 10;
        }return res;
    }
    public static int tichLe(int x){
        int s = 1;
            while(x !=0 ){
                if(x % 2 !=0){
                    s = s*(x%10);
                }
                x = x /10;
            } return s;
    }
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap vao 1 so nguyen duong n");
            int n = input.nextInt();
           double x1 = CanBac((double)n,3);
           System.out.println("Phuong thuc a: " + x1);
           System.out.println("Pthuc b: "+ soDao(n));
           System.out.println("Tich Chu So Le: "+ tichLe(n));
    }
}
