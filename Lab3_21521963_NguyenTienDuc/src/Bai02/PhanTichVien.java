package Bai02;


import java.util.*;

/**
 * 
 */
public class PhanTichVien extends NhanVien {

    /**
     * Default constructor
     */
    public PhanTichVien() {
    }

    /**
     * 
     */
    private int soGio;

    /**
     * 
     */
    private float phuCap;

    /**
     * @param MaNV 
     * @param HoTen 
     * @param luongCB 
     * @param soGio 
     * @param phuCap 
     
     */
   

    public PhanTichVien(String MaNV, String HoTen, float luongCB, int soGio, float phuCap) {
        // TODO implement here
        super(MaNV, HoTen, luongCB);
        this.soGio = soGio;
        this.phuCap = phuCap;
        
    }

    /**
     
     */
    @Override
    public void xuat() {
        // TODO implement here
       System.out.println("------------PhanTichVien------------");
       super.xuat();
       System.out.println("So Gio Tang Ca: "+ this.soGio);
       System.out.println("Phu Cap: "+this.phuCap);
       
       
    }

    @Override
    public float tinhLuong() {
        float luongHT ;
        luongHT = (float) (this.luongCB * this.soGio * this.phuCap * 1.8);
        return luongHT;
    }

}