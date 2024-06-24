package Bai02;


import java.util.*;

/**
 * 
 */
public class LapTrinhVien extends NhanVien {

    /**
     * Default constructor
     */
    public LapTrinhVien() {
    }

    /**
     * 
     */
    private int soGio;

    

    /**
     * 
     */
  

    /**
     * @param MaNV 
     * @param HoTen 
     * @param luongCB 
     * @param soGio 
    
     */
    
    public  LapTrinhVien( String MaNV, String HoTen, float luongCB, int soGio) {
        super(MaNV, HoTen, luongCB);
        this.soGio = soGio;
        // TODO implement here
        
       
    }

   

    /**
     
     */
    @Override
    public void xuat() {
        // TODO implement here
        System.out.println("------------LapTrinhVien------------");
       super.xuat();
       System.out.println("So Gio Tang Ca: "+ this.soGio);
    }
    @Override
    public float tinhLuong() {
        float luongHT;
        luongHT = (float) (this.luongCB + this.soGio * 250.000);
        return luongHT;
    }
}