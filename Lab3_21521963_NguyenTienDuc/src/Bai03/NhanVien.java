package Bai03;


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
    protected int maNV;

    /**
     * 
     */
    protected String hoTen;

    /**
     * 
     */
    protected float luongCB;

    /**
     * 
     */
    protected float heSoTN;

    /**
     * 
     */
   

    
    protected float luongHT;

    public NhanVien(int maNV, String hoTen, float luongCB, float heSoTN) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.heSoTN = heSoTN;
      
    }

    
    /**
     * @return
     */
    @Override
    public void xuat() {
        System.out.println("Ma NV: "+ this.maNV);
        System.out.println("Ho Ten: "+ this.hoTen);
        System.out.println("Luong Co Ban: "+ this.luongCB);
        System.out.println("He So Trach Nghiem : "+ this.heSoTN);
         
    }
    
    

    /**
     * @return
     */
    @Override
    abstract public float tinhLuongHT();

    @Override
    public int getMaNV() {
        return maNV;
    }
        
 

    /**
     * @return
     */
    @Override
    public String getHoTen() {
        // TODO implement here
        return this.hoTen;
    }

    /**
     * @return
     */
    @Override
    public float getluongCB() {
        // TODO implement here
        return this.luongCB;
    }

    public void setLuongCB(float luongCB) {
        this.luongCB = luongCB;
    }
    
    /**
     * @return
     */
    @Override
    public float getheSoTN() {
        // TODO implement here
        return this.heSoTN;
    }

    /**
     * @return
     */
    @Override
    public float getluongHT() {
        // TODO implement here
        return this.luongHT;
    }

}