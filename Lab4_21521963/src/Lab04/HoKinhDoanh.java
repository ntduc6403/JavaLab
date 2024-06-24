package Lab04;


import Lab04.KhachHang;
import java.util.*;

/**
 * 
 */
public class HoKinhDoanh extends KhachHang {

    /**
     * Default constructor
     */
    public HoKinhDoanh() {
    }

    /**
     * 
     */
    private float HeSoSD;

  

    public HoKinhDoanh( int maKH, String tenCH, int chiSoCu, int chiSoMoi,float HeSoSD) {
        super(maKH, tenCH, chiSoCu, chiSoMoi);
        this.HeSoSD = HeSoSD;
    }
    
    
    @Override
    public void xuat(){
        System.out.println("-------HoKinhDoanh-------");
        super.xuat();
        System.out.println("He So Su Dung: " + this.HeSoSD);
        System.out.println("Gia Dien: " + this.giaDien);
    }
    @Override
    public float tinhGiaDien() {
       
       

        if(this.A() > 500){
            this.giaDien = (float) (this.A()*7.500);
        }else{
            this.giaDien = (float) (this.A() * 5.500);
        }
        return this.giaDien;
    }

    

}