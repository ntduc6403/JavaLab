package Bai01;


import java.util.*;

/**
 * 
 */
public class VanPhong extends NhanVien {

    /**
     * Default constructor
     */
    public VanPhong() {
    }

    /**
     * 
     */
    public int SoNgay;

    /**
     * 
     */

    /**
     * @param MaNV
     * @param HoTen
     * @param LuongCB
    
     * @param SoNgay
     */
    

    public VanPhong( int MaNV, String HoTen, float LuongCB, int SoNgay) {
        super(MaNV, HoTen, LuongCB);
        this.SoNgay = SoNgay;
    }

    public int getSoNgay() {
        return SoNgay;
    }

    public void setSoNgay(int SoNgay) {
        this.SoNgay = SoNgay;
    }
    
    @Override
    public void Xuat() {
        // TODO implement here
        System.out.println("----NhanVienVanPhong----");
        System.out.println("Ma NV: "+this.MaNV);
        System.out.println("Ho Ten: "+this.HoTen);
        System.out.println("Luong Co Ban: "+this.LuongCB);
        System.out.println("So So Ngay: "+this.SoNgay);
        System.out.println("Luong Hang Thang: "+ this.tinhLuong());

    }

    /**
     * @return
     */
    @Override
    public float tinhLuong() {
       float LuongHT;
        this.luongHT = (float) (getLuongCB() + getSoNgay()*220.000);
//        System.out.println(LuongHT);
        return luongHT;
    }
}