package Bai01;


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
    protected int MaNV;

    /**
     * 
     */
    protected String HoTen;

    /**
     * 
     */
    protected float LuongCB;

    /**
     * 
     */
    protected float luongHT;

    /**
     * @return
     */
    
     public NhanVien(int MaNV, String HoTen, float LuongCB) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.LuongCB = LuongCB;
        
    }

    public int getMaNV() {
        return MaNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    /**
     * @return
     */
    public float getLuongCB() {    
        return LuongCB;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setLuongCB(float LuongCB) {
        this.LuongCB = LuongCB;
    }

    public float getLuongHT() {
        return luongHT;
    }

    
    
     @Override
    abstract public void Xuat();
        // TODO implement here
     

    /**
     * @return
     */
     @Override
    abstract public float tinhLuong();
        // TODO implement here
    

    /**
     * @return
     */
  

}