package Bai02;


import java.util.*;

/**
 * 
 */
abstract public class NhanVien implements InterfaceNhanVien {

    /**
     * Default constructor
     */
    public NhanVien() {
    }

    /**
     * 
     */
    protected String MaNV;

    /**
     * 
     */
    protected String HoTen;

    /**
     * 
     */
    protected float luongCB;

    /**
     * @param MaNV
     * @param HoTen
     * @param luongCB
     * @return
     */
    public NhanVien(String MaNV, String HoTen, float luongCB) {   
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.luongCB = luongCB;
    }
   

    /**
     * @return
     */
    @Override
    public String getMaNV() {
        // TODO implement here
        return this.MaNV;
    }

    /**
     * @return
     */
    @Override
    public String getHoTen() {
        // TODO implement here
        return this.HoTen;
    }

    /**
     * @return
     */
    @Override
    public float getLuongCB() {
        // TODO implement here
        return this.luongCB;
    }

    public void setLuongCB(float luongCB) {
        this.luongCB = luongCB;
    }
    
    @Override
      public void xuat() {
        // TODO implement here
        System.out.println("Ma Nhan Vien: "+this.MaNV);
        System.out.println("Ho Ten: "+ this.HoTen);
        System.out.println("Luong Co Ban: "+ this.luongCB);
       
    }
}