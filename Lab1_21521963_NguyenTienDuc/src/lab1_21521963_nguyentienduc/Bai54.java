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
public class Bai54 {
    public static int fibonacci(int n) {
    if (n < 0) {
        return -1;
    } else if (n == 0 || n == 1) {
        return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so pt cua 1 Day Fibonaci can in: ");
        int n = input.nextInt();
        for(int i = 0; i <= n; i++){
            System.out.println(fibonacci(i) + " ");
        }
    }
}
