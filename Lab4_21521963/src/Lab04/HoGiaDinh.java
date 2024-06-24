package Lab04;


import Lab04.KhachHang;
import java.util.*;

/**
 * 
 */
public class HoGiaDinh extends KhachHang {

    /**
     * Default constructor
     */
    public HoGiaDinh() {
    }

    public HoGiaDinh(int maKH, String tenCH, int chiSoCu, int chiSoMoi) {
        super(maKH, tenCH, chiSoCu, chiSoMoi);
    }
    
    
     
    @Override
    public void xuat(){
        System.out.println("-------HoGiaDinh-------");
        super.xuat();
        System.out.println("Gia Dien: " + this.giaDien);
    }
    @Override
    public float tinhGiaDien() {
        
        if(this.A() > 100){
            this.giaDien = (float) (this.A()*5.500);
        }else{
            this.giaDien = (float) (this.A() * 3.500);
        }
        return this.giaDien;
//        
    
    }

  

    /**
     * 
     */
    

}