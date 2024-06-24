package Bai01;



import java.util.*;

/**
 * 
 */
public class SanXuat extends NhanVien {

    /**
     * Default constructor
     */
    public SanXuat() {
    }

    /**
     * 
     */
    public int SoSP;

    /**
     * 
     */
  

    /**
     * @param MaNV
     * @param HoTen
     * @param LuongCB
     * @param luongHT
     * @param SoSP
     */


    public  SanXuat( int MaNV, String HoTen, float LuongCB,int SoSP) {
        super(MaNV, HoTen, LuongCB);
        this.SoSP = SoSP;
    }

    public int getSoSP() {
        return SoSP;
    }

    public void setSoSP(int SoSP) {
        this.SoSP = SoSP;
    }
    
    @Override
    public void Xuat() {
        // TODO implement here
        System.out.println("----NhanVienSanXuat----");
        System.out.println("Ma NV: "+this.MaNV);
        System.out.println("Ho Ten: "+this.HoTen);
        System.out.println("Luong Co Ban: "+this.LuongCB);
        System.out.println("So San Pham: "+this.SoSP);
        System.out.println("Luong Hang Thang: "+ this.tinhLuong());
    }

    /**
     * @return
     */
    @Override
    public float tinhLuong() {
        // TODO implement here
         float LuongHT;
        this.luongHT = (float) (getLuongCB() + getSoSP()*170.000);
//        System.out.println(LuongHT);
        return luongHT;
    }

}