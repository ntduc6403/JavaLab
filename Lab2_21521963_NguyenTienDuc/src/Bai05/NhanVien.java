package Bai05;

import java.util.*;
import java.util.HashMap;
/**
 * 
 */
public class NhanVien {

    /**
     * Default constructor
     */
    public NhanVien() {
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
    private int SoSP;

    /**
     * 
     */
    private float LuongHT;

  

    /**
     * @param MaNV 
     * @param HoTen 
     * @param LuongCB 
     * @param SoSP
     */
    

    public void NhanVien(int MaNV, String HoTen, float LuongCB, int SoSP) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.LuongCB = LuongCB;
        this.SoSP = SoSP;
    }
    public void Xuat(){
        System.out.println("Ma NV: "+this.MaNV);
        System.out.println("Ho Ten: "+this.HoTen);
        System.out.println("Luong Co Ban: "+this.LuongCB);
        System.out.println("So San Pham: "+this.SoSP);
        System.out.println("Luong Hang Thang: "+this.tinhLuongHT());
        ;
    }
    /**
     * @return
     */
    public int getMaNV() {
        // TODO implement here
        
        return this.MaNV;
    }

    /**
     * @param NhanVien 
     * @return
     */
    public void setMaNV(int MaNV) {
        // TODO implement here
        this.MaNV = MaNV;
    }

    /**
     * @return
     */
    public String getTen() {
        // TODO implement here
        
        return this.HoTen;
    }

    /**
     * @param HoTen 
     * @return
     */
    public void setTen(String HoTen) {
        // TODO implement here
        this.HoTen = HoTen;
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
    public int getSoSP() {
        // TODO implement here
        return this.SoSP;
    }

    /**
     * @param SoSP 
     * @return
     */
    public void setSoSP(int SoSP) {
        // TODO implement here
        this.SoSP = SoSP;
    }

    /**
     * @param LuongHT 
     * @return
     */
    public float tinhLuongHT() {
        // TODO implement here
        LuongHT = (float) (getLuongCB() + getSoSP()*175.000);
//        System.out.println(LuongHT);
        return LuongHT;
    }

    /**
     * @return
     */
    public NhanVien timMaNV(ArrayList<NhanVien> nv , int id) {
        // TODO implement here
        for(NhanVien ds : nv){
            if(ds.getMaNV() == id){
//                System.out.println(ds);
                ds.Xuat();
                break;
        }       
       }  
        return null;
        
    }

    /**
     * @return
     */
    public float capNhatLuong() {
        // TODO implement here
        
        return 0.0f;
    }

    /**
     * @return
     */
    public NhanVien maxLuong(ArrayList<NhanVien> ds) {
        // TODO implement here
        NhanVien nvMax = null;
        float max =0;
        for(NhanVien a : ds){
            if(a.tinhLuongHT() > max){
                max =  a.tinhLuongHT();
                nvMax = a;
                
            }
        }
        return nvMax;
    }
    
    /**
     * @return
     */
    public NhanVien minSP(ArrayList<NhanVien> ds) {
        // TODO implement here
        NhanVien a = new NhanVien();
        a = ds.get(0);
        
        for(NhanVien b : ds){
            if(b.getSoSP() < a.getSoSP()){
//                System.out.println(""+b);
                    b.Xuat();
            }
        }
        return null;
    }

    /**
     * @param ArrayList ds 
     * @return
     */
    public ArrayList<NhanVien> top10LuongCaoNhat(ArrayList<NhanVien> ds) {
        ArrayList<NhanVien> result = new ArrayList<>();
        int n = ds.size();
        for (int i = 1; i < n; i++) {
            NhanVien temp = ds.get(i);
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

    /**
     * 
     */
    

}