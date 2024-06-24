package Bai03;


import java.util.*;

/**
 * 
 */
public class NghienCuuVien extends NhanVien {

    /**
     * Default constructor
     */
    public NghienCuuVien() {
    }

    /**
     * 
     */
    private int soLuongCT;

    public NghienCuuVien( int maNV, String hoTen, float luongCB, float heSoTN,int soLuongCT) {
        super(maNV, hoTen, luongCB, heSoTN);
        this.soLuongCT = soLuongCT;
    }

    public int getSoLuongCT() {
        return soLuongCT;
    }
    
    
    @Override
    public void xuat(){
        System.out.println("--------NghienCuuVien--------");
        super.xuat();
        System.out.println("So Luong Cong Trinh Phat Minh: " + this.soLuongCT);
        System.out.println("Luong Hang Thang : " + this.tinhLuongHT());
    }
    @Override
    public float tinhLuongHT() {
        this.luongHT = (float) (this.luongCB + this.luongCB * ( this.heSoTN - 0.2 )+ this.getSoLuongCT() * 5500.000);
        
        return this.luongHT;
    }

}