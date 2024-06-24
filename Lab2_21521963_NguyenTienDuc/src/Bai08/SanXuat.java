package Bai08;


import java.util.*;
import java.util.ArrayList;

/**
 * 
 */
public class SanXuat extends DaiLy {

    /**
     * Default constructor
     */
  

    /**
     * 
     */
    private int SoSP;

    /**
     * 
     */

    /**
     * @return
     */
    public void SanXuat(int MaNV, String HoTen, float LuongCB,int SoSP){
        super.DaiLy(MaNV, HoTen, LuongCB);
        this.SoSP = SoSP;
        
    }
    @Override
    public void Xuat(){
        System.out.println("----NhanVienSanXuat----");
        super.Xuat();
        System.out.println("So San Pham: "+ this.SoSP);
        System.out.println("Luong Hang Thang: "+this.tinhLuongHT());

    }
    public int getSoSP(){
        return SoSP;
    }
    @Override
     public float tinhLuongHT() {
        // TODO implement here
        float LuongHT;
        LuongHT = (float) (getLuongCB() + getSoSP()*170.000);
//        System.out.println(LuongHT);
        return LuongHT;
    }

    /**
     * @return
     */
     

}