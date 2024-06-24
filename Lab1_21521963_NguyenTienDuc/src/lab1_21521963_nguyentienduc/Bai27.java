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
public class Bai27 {
    public  static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap loai hinh can tinh: ");
        String id = input.nextLine();
        switch(id){
            case "hinh vuong":
                System.out.println("Nhap Canh Cua Hinh: ");
                double n = input.nextInt();
                System.out.println("Dien Tich: " + n*n);
                break;
            case "hinh chu nhat":
                System.out.println("Nhap Chieu Dai Chieu rong: ");
                double a = input.nextInt();
                double b = input.nextInt();
                System.out.println("Dien Tich" + a*b);
                break;
            case "hinh tron":
                System.out.println("Nhap Ban Kinh Hinh Tron");
                double d = input.nextInt();
                System.out.println("Dien Tich: "+d*d*3.14);
        }
        
    }
}
