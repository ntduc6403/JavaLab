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
public class Bai50 {
    public static int check(int n){
        if(n < 0 && n % 2 != 0){
            return  1;
        }
        else if( n > 0 && n % 2 == 0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        System.out.println(check(2));
        System.out.println(check(-1));
        System.out.println(check(5));

    }
}
