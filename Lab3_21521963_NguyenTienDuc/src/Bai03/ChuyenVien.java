package Bai03;


import java.util.*;

/**
 * 
 */
public class ChuyenVien extends NhanVien {

    /**
     * Default constructor
     */
    public ChuyenVien() {
    }

    /**
     * 
     */
    private int soGio;

    public ChuyenVien( int maNV, String hoTen, float luongCB, float heSoTN,int soGio) {
        super(maNV, hoTen, luongCB, heSoTN);
        this.soGio = soGio;
    }

    public int getSoGio() {
        return soGio;
    }

    
    @Override
    public void xuat(){
        System.out.println("--------ChuyenVien--------");
        super.xuat();
        System.out.println("So Gio Tang Ca: "+ this.soGio);
        System.out.println("Luong Hang Thang: "+ this.luongHT);
    }
    @Override
    public float tinhLuongHT() {
        this.luongHT = (float) (this.luongCB + this.luongCB * ( this.heSoTN) + this.getSoGio()*180.000);
        
        return this.luongHT;
    }
    

}