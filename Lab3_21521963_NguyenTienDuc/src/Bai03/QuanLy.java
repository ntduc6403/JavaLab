package Bai03;


import java.util.*;

/**
 * 
 */
public class QuanLy extends NhanVien {

    /**
     * Default constructor
     */
    public QuanLy() {
    }

    /**
     * 
     */
    private float heSoKN;

    public QuanLy( int maNV, String hoTen, float luongCB, float heSoTN,float heSoKN) {
        super(maNV, hoTen, luongCB, heSoTN);
        this.heSoKN = heSoKN;
    }

    public float getHeSoKN() {
        return heSoKN;
    }

    @Override
    public void xuat(){
        System.out.println("--------QuanLy--------");
        super.xuat();
        System.out.println("He So Kiem Nghiem: "+ this.heSoKN);
        System.out.println("Luong Hang Thang: "+ this.luongHT);
        
    } 
    @Override
    public float tinhLuongHT() {
        this.luongHT = (float) (this.luongCB * 0.7 + this.luongCB * this.heSoTN + this.luongCB * this.getHeSoKN());
        return this.luongHT;
    }

    
}