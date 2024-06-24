/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_21521963_nguyentienduc;

/**
 *
 * @author User
 */
public class Bai56 {
    public static void tinh(String loaiHinh, String id , double cd , double cr){
        loaiHinh = "ChuNhat";
        if(id.equals("dt") ){
            System.out.println(cr*cd);
        }else if(id.equals("cv"))
            System.out.println(cr*2+cd*2);
    } 
    
    public static void tinh(String loaiHinh, String id, double cd){
        loaiHinh = "Vuong";
         if(id.equals("dt") ){
            System.out.println(cd*cd);
        }else if(id.equals("cv"))
            System.out.println(cd*4);
    }
    
   public static void main( String[] args){
            tinh("ChuNhat","dt",4,3);
            tinh("Vuong","cv",4);
    }
}
