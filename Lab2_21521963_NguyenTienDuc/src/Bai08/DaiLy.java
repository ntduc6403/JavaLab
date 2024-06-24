package Bai08;


import java.util.*;
import java.util.ArrayList;

/**
 * 
 */
  public class DaiLy {

    /**
     * Default constructor
     */
    public DaiLy() {
    }

    /**
     * 
     */
    private int MaNV;

    /**
     * 
     */
    private String HoTen;

    /**
     * 
     */
    private float LuongCB;

    /**
     * 
     */
    private float LuongHT;

    /**
     * @param MaNV 
     * @param HoTen 
     * @param LuongCB 
     * @param LuongHT
     */
    public void DaiLy(int MaNV, String HoTen, float LuongCB) {
        // TODO implement here
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.LuongCB = LuongCB;
    }

    /**
     * @return
     */
//    public void Nhap() {
//        // TODO implement here
//        System.out.println("Nhap thong tin");
//
//        
//    }

    /**
     * @return
     */
    public void Xuat() {
        // TODO implement here
        System.out.println("Ma NV: "+this.MaNV);
        System.out.println("Ho Ten: "+this.HoTen);
        System.out.println("Luong Co Ban: "+this.LuongCB);
        
    }

    /**
     * @return
     */
    public int getMaNV() {
        // TODO implement here
        
        return this.MaNV;
    }

    /**
     * @param MaNv 
     * @return
     */
    public void setMaNV(int MaNV) {
        // TODO implement here
        this.MaNV = MaNV;
        
    }

    /**
     * @return
     */
    public float getLuongCB() {
        // TODO implement here
        return this.LuongCB;
    }

    /**
     * @param LuongCB 
     * @return
     */
    public void setLuongCB(float LuongCB) {
        // TODO implement here
        this.LuongCB = LuongCB;
    }

    /**
     * @return
     */
    public float tinhLuongHT(){
        
     return 0.0f;   
    }
    
    
    
     public DaiLy maxLuong(ArrayList<DaiLy> ds) {
        // TODO implement here
        DaiLy nvMax = null;
        float max =0;
        for(DaiLy a : ds){
            if(a.tinhLuongHT() > max){
                max =  a.tinhLuongHT();
                nvMax = a;
                
            }
        }
        return nvMax;
    }
     public VanPhong minSP(ArrayList<VanPhong> ds) {
        // TODO implement here
        VanPhong a = new VanPhong();
        a = ds.get(0);
        VanPhong t1 = null;
        for(VanPhong b : ds){
            if(b.getSoNgay() < a.getSoNgay()){
//                System.out.println(""+b);
                    b.Xuat();
            }
        }
        return null;
    }
     public ArrayList<DaiLy> top10LuongCaoNhat(ArrayList<DaiLy> ds) {
        ArrayList<DaiLy> result = new ArrayList<>();
        int n = ds.size();
        for (int i = 1; i < n; i++) {
            DaiLy temp = ds.get(i);
            int j = i - 1;
            while (j >= 0 && ds.get(j).tinhLuongHT() < temp.tinhLuongHT()) {
                ds.set(j + 1, ds.get(j));
                    j--;
        }
        ds.set(j + 1, temp);
    }
        for (int i = 0; i < Math.min(10, n); i++) {
        result.add(ds.get(i));
    }
    return result;
}
  }