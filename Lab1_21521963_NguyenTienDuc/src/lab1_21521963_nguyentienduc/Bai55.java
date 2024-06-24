/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_21521963_nguyentienduc;

/**
 *
 * @author User
 */
public class Bai55 {
    public static int chuVi(int cd , int cr){
        return (cd+cr)*2;
    }
    public static int dienTich(int cd , int cr){
        return cd*cr;
    }
    public static void ve(int cd , int cr){
       for (int i = 1; i <= cr; i++) {
            for (int j = 1; j <= cd; j++) {
               if (i == 1 || i == cr || j == 1 || j == cd) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");                }
            }
    }
    }
     public static void main(String[] args){
         System.out.println("Chu vi "+chuVi(4,2));
         System.out.println("dientich "+dienTich(4,2));
         ve(8,4);


     }   
}
