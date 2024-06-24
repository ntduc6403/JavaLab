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
public class Bai16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao Gio Phut Giay");
        int h = input.nextInt();
        int p = input.nextInt();
        int s = input.nextInt();
        System.out.println("Gio phut giay sau khi doi ra s la: "+h*3600+p*60+s);
    }
}
