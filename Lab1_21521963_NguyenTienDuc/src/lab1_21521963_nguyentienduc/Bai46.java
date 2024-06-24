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
public class Bai46 {
    public static void main( String[] args){
        int a , b ,c ;
        int max = -1;
        int dem= 0;
        a = (979 - 7 - 9 ) /2;
        b = (979 -2-9)/7;
        c = (979 - 2 - 7)/9;
        for(int i =0; i < a; i++){
            for(int j =0; j < b; j++){
                for(int k = 0; k < c; k++){
                    if(2*i+7*j+9*k == 979){
                        System.out.println("("+ i +";"+j+";" + k +")");
                        dem++;
                        
                        if(i+j+k>max){
                            max = j+j+k;
                        }
                    }
                }
            }
        }
    }
}
