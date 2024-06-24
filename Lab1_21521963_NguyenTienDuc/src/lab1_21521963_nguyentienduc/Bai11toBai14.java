/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1_21521963_nguyentienduc;

/**
 *
 * @author User
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Bai11toBai14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Cau1
       System.out.println("---Cau 1---");
       Scanner input = new Scanner(System.in);
       System.out.print("Nhap vao so nguyen thu 1 : ");
       int a = input.nextInt();
       System.out.print("Nhap vao so nguyen thu 2 : ");
       int b = input.nextInt();
       System.out.print("Nhap vao so nguyen thu 3 : ");
       int c = input.nextInt();
       System.out.print("Nhap vao so nguyen thu 4 : ");
       int d = input.nextInt();
       
       System.out.println("4 So Nguyen Vua Lap La: " + a+ " "+ b + " "+ c + " "+ d);
       double trungBinh = (a + b + c +d)/4.0;
       
       System.out.println("Trung Binh Cong 4 So Nguyen: " +trungBinh);
       
       //Cau2
       System.out.println("---Cau 2---");
       System.out.println(" a + b = " + (a+b));
       System.out.println(" a - b = " + (a-b));
       System.out.println(" a * b = " + (a*b));
       
       double Thuong = (double)a/b; //ep kieu
       
       System.out.println( " a / b = "+(double) Math.round((Thuong) * 1000) / 1000);
       
    //Cau3
       System.out.println("---Cau 3---");
        
       System.out.println( " Chia lay phan nguyen = "+ (a/b));
       System.out.println(" Chia lay phan du = "+(a%b) );
       //Cau4
       
       System.out.println("---Cau 4---");
       System.out.println("Nhap vao so nguyen co 2 chu so: ");
       int soNguyen2Chu = input.nextInt();
       System.out.println("Tong cac chu so cua so vua nhap la " + ((soNguyen2Chu/10)+(soNguyen2Chu%10)));
       
       //Cau5
       System.out.println("---Cau 5---");
       
       System.out.println("Nhap Thoi Gian Gio Phut Giay: ");
       int Gio = input.nextInt();
       int Phut = input.nextInt();
       int Giay = input.nextInt();
       System.out.println("Time: "+ Gio +":"+Phut+":"+Giay);
       System.out.println("Tong So Giay La: " + ((Gio*3600)+(Phut*60)+Giay));
       //Cau6
       System.out.println("---Cau 6---");
       
       System.out.println("Nhap vao nam sinh :");
       int namSinh = input.nextInt();
       System.out.println("Tuoi cua ban la: " +(2023-namSinh));
       
       //cau7
       System.out.println("---Cau 7---");
       System.out.println("Nhap vao ban kinh cua hinh tron: ");
       double r = input.nextDouble();
       System.out.println("Chu Vi: "+r*2*3.14);
       System.out.println("Dien Tich: "+ r*r*3.14);
       
       //Cau8
       
        System.out.println("---Cau 8---");
        System.out.println("Nhap vao can nag va chieu cao:" );
        double canNang = input.nextDouble();
        double chieuCao = input.nextDouble();
        System.out.println("Chi so BMI la " + (canNang/(chieuCao*chieuCao)));
        
        //Cau9
        System.out.println("---Cau 9---");
        
        System.out.println("===========MENU=========");
        System.out.println("1.Hu Tieu");
        System.out.println("2.Chao long");
        System.out.println("3.Banh canh");
        System.out.println("4.Bun rieu");
        System.out.println("5.Pho bo ");
        System.out.println("=========================");
        System.out.println("Moi Nhap Lua Chon");
        System.out.println("=========================");
        
        //Cau10
        System.out.println("---Cau 10---");
        System.out.print("Nhap vao bien so xe cua ban: ");
        int bienSo = input.nextInt();
        int soNut = 0;
        while(bienSo !=0){
            soNut += bienSo % 10;
            bienSo /= 10;
        }
        System.out.println("So Nut: "+ soNut);
        
        //Cau11
         System.out.println("---Cau 11---");
         System.out.println("Nhap vao chu thuong muon chyen thanh chu hoa:");
         String str;
         str = input.next();
         char[] tr = str.toCharArray();
         
             for(int i = 0; i < tr.length; i++) {
                if(tr[i] > 97 && tr[i] < 122){
                    tr[i] -= 32;
                
   }      
         }System.out.println("Sau khi chuyen thanh chu hoa la: "+str);
       
         
         //Cau12
         System.out.println("---Cau 12---");
         	
         Random ran = new Random();
         
         int value1 = ran.nextInt((100) + 1);
         System.out.println("12 A: "+ value1);
         int value2 = ran.nextInt((99 - 50) + 1) + 50;
         System.out.println("12 B: "+ value2);
         int value3 = ran.nextInt((79 + 39) + 1) -39;
         System.out.println("12 c: "+ value3);
         int value4 = ran.nextInt((-39 + 79) + 1) -79;
         System.out.println("12 D: "+ value4);
         
         //Cau13
         System.out.println("---Cau 13---");
         System.out.println("Nhap ngay thang nam sinh: ");
         int Ngay = input.nextInt();
         int Thang = input.nextInt();
         int Nam = input.nextInt();
         System.out.println("13 A :  "+Ngay+ "/" + Thang+"/"+Nam);
         System.out.println("13 B:");
         
    }
    
}
