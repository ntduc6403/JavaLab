package Lab04;


import Lab04.KhachHang;
import java.util.*;

/**
 * 
 */
public class HoSanXuat extends KhachHang {

    /**
     * Default constructor
     */
    public HoSanXuat() {
    }

    /**
     * 
     */
    private float HeSoSD;

    

    public HoSanXuat( int maKH, String tenCH, int chiSoCu, int chiSoMoi,float HeSoSD) {
        super(maKH, tenCH, chiSoCu, chiSoMoi);
        this.HeSoSD = HeSoSD;
    }

    public float getHeSoSD() {
        return HeSoSD;
    }

    
    @Override
    public void xuat(){
        System.out.println("-------HoSanXuat-------");
        super.xuat();
        System.out.println("He So Su Dung: " + this.HeSoSD);
        System.out.println("Gia Dien: " + this.giaDien);
    }
    
    
    @Override
    public float tinhGiaDien() {
         this.giaDien = (float) (this.A() * 7.000 * this.getHeSoSD());
        return this.giaDien;
    }

   

}