package Lab04;


import java.util.*;

/**
 * 
 */
 abstract class KhachHang implements InterfaceKH {

    /**
     * Default constructor
     */
    public KhachHang() {
    }

    /**
     * 
     */
    protected int maKH;

    /**
     * 
     */
    protected String tenCH;

    /**
     * 
     */
    protected int chiSoCu;

    /**
     * 
     */
    protected int chiSoMoi;

    /**
     * 
     */
    
    protected float giaDien;
    /**
     * 
     *
    public float tinhGiaDien() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @return
     */
    
    public KhachHang(int maKH, String tenCH, int chiSoCu, int chiSoMoi) {
        this.maKH = maKH;
        this.tenCH = tenCH;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }
    public void KhachHang(int maKH, String tenCH, int chiSoCu, int chiSoMoi) {
        this.maKH = maKH;
        this.tenCH = tenCH;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }
       
    @Override
    public int getMaKH() {
        // TODO implement here
        return this.maKH;
    }

    /**
     * @return
     */
    @Override
    public String getTenChuHo() {
        // TODO implement here
        return this.tenCH;
    }

    @Override
    public float getGiaDien() {
        return giaDien;
    }
    
    @Override
    public void xuat(){
        System.out.println("Ma Khach Hang: "+this.maKH);
        System.out.println("Ten Chu Ho: "+this.tenCH);
        System.out.println("Chi So Cu: "+this.chiSoCu);
        System.out.println("Chi So Moi: "+this.chiSoMoi);
        

    }
    public float A(){
        return this.chiSoMoi - this.chiSoCu;
    }
    /**
     * 
     */
    

}