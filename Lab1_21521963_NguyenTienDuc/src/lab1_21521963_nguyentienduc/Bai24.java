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
public class Bai24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao Gio phut giay");
        int h = input.nextInt();
        int p = input.nextInt();
        int s = input.nextInt();
        if((h<23 && h>0 )&& (p >0 && p <60) &&(s >0 && s <60) ){
            System.out.println("Gio cua ban hop le: "+h+ "h"+ p +"p"+s);
        }else{
            System.out.println("Gio cua ban nhap khong hop le");
        }
    }
}
