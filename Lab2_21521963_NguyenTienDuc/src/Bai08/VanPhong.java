package Bai08;


import java.util.*;
import java.util.ArrayList;

/**
 * 
 */
public class VanPhong extends DaiLy {

    /**
     * Default constructor
     */
    public VanPhong() {
    }

    /**
     * 
     */
    private int SoNgay;

    /**
     * 
     */
    

    /**
     * @return
     */
    public void VanPhong(int MaNV, String HoTen, float LuongCB,int SoNgay){
        super.DaiLy(MaNV, HoTen, LuongCB);
        this.SoNgay = SoNgay;
        
    }
 
    @Override
    public void Xuat(){
        System.out.println("----NhanVienVanPhong----");
        super.Xuat();
        System.out.println("So Ngay Lam Viec: "+ this.SoNgay);
        System.out.println("Luong Hang Thang: "+this.tinhLuongHT());

    }
    /**
     * @return
     */
    public int getSoNgay() {
        // TODO implement here
        return this.SoNgay;
    }
    @Override
    public float tinhLuongHT() {
        // TODO implement here
        float LuongHT;
        LuongHT = (float) (getLuongCB() + getSoNgay()*220.000);
//        System.out.println(LuongHT);
        return LuongHT;
    }
     
    
}