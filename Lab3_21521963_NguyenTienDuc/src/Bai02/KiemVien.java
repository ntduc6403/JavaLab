package Bai02;


import java.util.*;

/**
 * 
 */
public class KiemVien extends NhanVien {

    /**
     * Default constructor
     */
    public KiemVien() {
    }

    /**
     * 
     */
    private int soLoi;

    /**
     * @param MaNV 
     * @param HoTen 
     * @param luongCB 
     * @param soLoi
     
     */
    public KiemVien( String MaNV, String HoTen, float luongCB, int soLoi) {   
        super(MaNV, HoTen, luongCB);
        this.soLoi = soLoi;
    }

    /**
    
     */
    @Override
    public void xuat() {
        // TODO implement here
       System.out.println("------------KiemVien------------");
       super.xuat();
       System.out.println("So Loi Phat Hien: "+ this.soLoi);
        
    }

    @Override
    public float tinhLuong() {
        float luongHT;
        luongHT = (float) (this.luongCB + this.soLoi * 85.000);
        return luongHT;
    }

}