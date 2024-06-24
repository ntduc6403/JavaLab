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
public class Bai28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen duong: ");
        int n = 0;
        n = input.nextInt();
      
            while(n < 0){
                
                System.out.println("Ban Nhap sai vui long nhap lai.");
                n= input.nextInt();
            }
    for(int i =0 ; i < n; i++){
        if(n%i==0){
            System.out.println("Uoc cua n : " + i);
        }
    }

    }
}
