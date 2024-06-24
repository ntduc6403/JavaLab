package Bai01;


import java.util.*;
import java.util.Scanner;
/**
 * 
 */
public class CongTy {

    /**
     * Default constructor
     */
    

    /**
     * 
     */
//    private int maCT;

    /**
     * 
     */
//    public String tenCT;

    /**
     * 
     */
    protected ArrayList<NhanVien> dsNV;

    /**
     * 
     */
//    private int soNV;

    /**
     * @return
     */
//    public None DaiLy() {
//        // TODO implement here
//        return null;
//    }

    
    

    /**
     * @param nv
     */
    public CongTy(){
              this.dsNV = new ArrayList<NhanVien>();


    }
    public void CongTy(){
        this.dsNV = new ArrayList<NhanVien>();
    }
//    public void add(NhanVien nv ){
//        
//        this.dsNV.add(nv);
//        
//        
//    }
    
    public void loadData(){
        NhanVien n1 = new SanXuat(1,"Hoang", 2000,78);
        NhanVien n2 = new SanXuat(2,"Hoang", 2000,122);
        NhanVien n3 = new SanXuat(3,"Hoang", (float) 2000.89,70);
        NhanVien n4 = new VanPhong(4,"Hoang", 2000,20);
        NhanVien n5 = new VanPhong(5,"Hoang", 2000,25);
        NhanVien n6 = new VanPhong(12,"Hoang", 2000,18);
        NhanVien n7 = new SanXuat(7,"Hoang", 2000,100);
        
        this.dsNV.add(n1);
        this.dsNV.add(n2);
        this.dsNV.add(n3);
        this.dsNV.add(n4);
        this.dsNV.add(n5);
        this.dsNV.add(n6);
        this.dsNV.add(n7);



    }
    public void xuat() {
        // TODO implement here
        for(NhanVien nv: dsNV){
            nv.Xuat();
        }
        
    }

    /**
     */
    public void tinhLuong() {
        // TODO implement here
        
        for(NhanVien nv : dsNV){
            
            nv.tinhLuong();
        }
    }
    public NhanVien timNV( int id){
        for(NhanVien ds : dsNV){
            if(ds.getMaNV() == id){
                ds.Xuat();
                
                break;
            }
        }
        
        return null;
    }
    public void capNhatNV(int id){
        Scanner input = new Scanner(System.in);
        for(NhanVien ds : dsNV){
            if(ds.getMaNV() == id){
                System.out.println("Cap Nhat Thong Tin Cho Nhan Vien Co Ma: "+ id);
                System.out.print("Ho Ten: ");
                ds.setHoTen(input.nextLine());
                System.out.print("Luong CB");
                ds.setLuongCB(input.nextFloat());
                if(ds instanceof SanXuat){
                    System.out.print("So San Pham: " );
                    ((SanXuat) ds).setSoSP(input.nextInt());
                }else if(ds instanceof VanPhong){
                    ((VanPhong) ds).setSoNgay(input.nextInt());
                }
                
               
            }
        }
        System.out.println("Da Cap Nhat Thong Tin Thanh Cong");
         
    }
    public NhanVien maxLuong(){
        NhanVien nvMax = dsNV.get(0);
        for(NhanVien ds : dsNV){
            if(ds.getLuongHT() > nvMax.getLuongHT()){
                nvMax = ds;
        }
      }
        return nvMax;
        
}
    public NhanVien minSP(){
        NhanVien minSP = dsNV.get(0);
        for(NhanVien ds:dsNV){
            if(ds instanceof SanXuat && ((SanXuat) ds).getSoSP() < ((SanXuat) minSP).getSoSP()){
                minSP = ds ;
        }
    }
               return minSP;
 
}
    
    
    
    
    
}