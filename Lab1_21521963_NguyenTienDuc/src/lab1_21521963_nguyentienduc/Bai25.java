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
public class Bai25 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Nhap vao chu thuong muon chyen thanh chu hoa:");
         String str;
         str = input.next();
         char[] tr = str.toCharArray();
         
             for(int i = 0; i < tr.length; i++) {
                if(tr[i] > 97 && tr[i] < 122){
                    tr[i] -= 32;
                
   }      
         }System.out.println("Sau khi chuyen thanh chu hoa la: "+str);
       
   }
}
