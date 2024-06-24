/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CongTy {
    private ArrayList<NhanVien> dsNV;
    
    
    public CongTy(){
        this.dsNV = new ArrayList<NhanVien>();
    }
    public void loadData(){
        NhanVien n1 = new ChuyenVien(123,"Nguyen A",(float)4500.000,(float)0.5,50);
        NhanVien n2 = new NghienCuuVien(124,"Nguyen B",(float)5600.00,(float)1.2,10);
        NhanVien n3 = new QuanLy(125,"Nguyen C",(float) 7800.000,(float)1.5, (float) 1.3);
        NhanVien n4 = new NghienCuuVien(126,"Nguyen D",(float)8100.00,(float)0.8,12);
        NhanVien n5 = new QuanLy(127,"Nguyen E",(float) 9500.000,(float)1.0, (float) 1.6);
        NhanVien n6 = new ChuyenVien(128,"Nguyen F",(float)6500.000,(float)0.8,30);
        this.dsNV.add(n1);
        this.dsNV.add(n2);
        this.dsNV.add(n3);
        this.dsNV.add(n4);
        this.dsNV.add(n5);
        this.dsNV.add(n6);
        

        

        
        
    }
    public void xuat(){
        for(NhanVien ds : dsNV){
           ds.xuat();
    }
}
    public void tinhLuong(){
        for(NhanVien ds: dsNV){
            ds.tinhLuongHT();
    }
    
  } 
    public void timKiem(int id){
        for(NhanVien ds : dsNV){
            if(ds.getMaNV() == id){
                ds.xuat();
            }
        }
        
                    System.out.println("********Da tim thay nhan vien*********");

        
    }
    
    public double tongLuong(){
        double all = 0;
        for(NhanVien ds : dsNV){
            all += ds.getluongHT();
        }
        
        return (double)all;
    }
    
    public NhanVien maxLuong(){
        NhanVien max = dsNV.get(0);
        for(NhanVien ds: dsNV){
            if(ds.getluongHT() > max.getluongHT()){
                max = ds;
//                break;
            }
        }
        return max;
    }
    
    public void capNhatLuongCB(int id){
        Scanner input = new Scanner(System.in);
        for(NhanVien ds : dsNV){
            if(ds.getMaNV() == id){
                System.out.print("Luong Co Ban: ");
                ds.setLuongCB(input.nextFloat());
            }
        }
    }
    
}
