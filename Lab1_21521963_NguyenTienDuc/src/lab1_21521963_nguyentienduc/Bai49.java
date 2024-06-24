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
public class Bai49 {
    public static boolean laSoChanAm(double n){
        if(n < 0 && n % 2 == 0){
            System.out.println("So Chinh Xac");
            return true;
        }else{
            System.out.println("So nay khong chinh xac");
            return false;
        }
    }
    public static void main(String[] args){
           laSoChanAm(2); 
           laSoChanAm(-2); 
    }
}
