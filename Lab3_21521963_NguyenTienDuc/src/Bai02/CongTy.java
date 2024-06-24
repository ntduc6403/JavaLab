package Bai02;

import java.util.Scanner;

import java.util.*;

/**
 * 
 */
public class CongTy {

    /**
     * Default constructor
     */
    public CongTy() {
       this.dsNV = new ArrayList<NhanVien>();

    }

    /**
     * 
     */
    private ArrayList<NhanVien> dsNV;

    /**

     */
//    public void CongTy(){
//        this.dsNV = new ArrayList<NhanVien>();
//    }
    public void loadData(){
        NhanVien n1 = new PhanTichVien("n1", "Hoang Duc", (float) 1000.12,20,100);
        NhanVien n2 = new PhanTichVien("n2", "Duc Tien", 1003,10,100);
        NhanVien n3 = new PhanTichVien("n3", "Tien Duc", 2004,15,100);
        NhanVien n4 = new LapTrinhVien("n4", " The Cuong", 1230,10);
        NhanVien n5 = new LapTrinhVien("n5", "Huy Cuong", 3000,12);
        NhanVien n6 = new LapTrinhVien("n6", "Minh Hui", 1200,9);
        NhanVien n7 = new KiemVien("n7", "Van Tai", 1040,100);
        NhanVien n8 = new KiemVien("n8", "Hoang Xiu", 4100,200);
        NhanVien n9 = new KiemVien("n9", "Anh Ba", 5200,108);
        NhanVien n10 = new KiemVien("n10", "Duc Tu", 3400,67);
        this.dsNV.add(n1);
        this.dsNV.add(n2);
        this.dsNV.add(n3);
        this.dsNV.add(n4);
        this.dsNV.add(n5);
        this.dsNV.add(n6);
        this.dsNV.add(n7);
        this.dsNV.add(n8);
        this.dsNV.add(n9);
        this.dsNV.add(n10);
      


        
    }
    public void xuat() {
       for(NhanVien ds : dsNV){
           ds.xuat();
       }
        
    }

    /**
    
     */
    public void tinhLuong() {
        for(NhanVien ds : dsNV){
           ds.xuat();
           System.out.print("Luong Hang Thang: ");
           System.out.println(ds.tinhLuong());
        }
        
    }

    /**
     * 
     * @return 
     */
  
    public NhanVien timbeluongTB(){
        double tongLuong = 0;
        int dem = 0;
        for(NhanVien ds: dsNV){
            tongLuong += ds.tinhLuong();
            dem++;
        }
        double luongTB = tongLuong / dem;
        
        
        for(NhanVien ds : dsNV){
            if(ds.tinhLuong() < luongTB){
                ds.xuat();
               
            }
        }
        return null;
    }
    
    public NhanVien maxLuong(){
        NhanVien max = dsNV.get(0);
        for(NhanVien ds : dsNV){
            if(ds.tinhLuong() > max.tinhLuong()){
                ds = max;
            }
        }
        return max;
    }
    public NhanVien minLuong(){
        NhanVien min = dsNV.get(0);
        for(NhanVien ds : dsNV){
            if(ds.tinhLuong() < min.tinhLuong()){
                ds = min;
            }
        }
        return min;
    }
    public LapTrinhVien lapTrinhMax(){
    LapTrinhVien max = null;
    double maxLuong = Double.MIN_VALUE;

    for(NhanVien ds : dsNV){
        if(ds instanceof LapTrinhVien && ((LapTrinhVien) ds).tinhLuong() > maxLuong ){
            max = (LapTrinhVien) ds;
            maxLuong = max.tinhLuong();
        }
    }
    return max;
}
    public KiemVien kiemThuMin(){
        KiemVien min = null;
        double minLuong = Double.MAX_VALUE;
        for (NhanVien ds : dsNV){
            if(ds instanceof KiemVien && ((KiemVien) ds).tinhLuong() < minLuong){
                min = (KiemVien) ds;
                minLuong = min.tinhLuong();
            }
        }
        return min;
    }
    public void capNhatLuongCB(String id){
        Scanner input = new Scanner(System.in);
        
        for(NhanVien ds : dsNV){
            if(ds.getMaNV().equals(id)){
                System.out.println("Cap Nhat Luong CB co Ma : " + id);
                System.out.print("Luong Co Ban: ");
                ds.setLuongCB(input.nextFloat());
            }
            
        }
                System.out.println("Da Cap Nhat Thong Tin Thanh Cong");

    }
    
    
}