/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_Bai6;

/**
 *
 * @author User
 */
public class HonSo extends PhanSo {
    public int nguyen;

    public HonSo(int nguyen,int TuSo, int MauSo) {
        this.nguyen = nguyen;
        super.PhanSo(TuSo, MauSo);
    }

    public void HonSo(int nguyen, int TuSo , int MauSo) {
        this.nguyen = nguyen;
        super.PhanSo(TuSo, MauSo);
    }
    
//   public void HonSo(int nguyen, int TuSo , int MauSo) {
//        this.nguyen = nguyen;
//        super.PhanSo(TuSo, MauSo);
//    }
//   
    @Override
   public void xuat(){
       System.out.println("Hon So: " +this.nguyen +"+"+ this.getTu()+"/"+this.getMau());
       
   }

    public int getNguyen() {
        return this.nguyen;
    }
    public HonSo chuyenPhanSoSangHonSo(PhanSo ps) {
        int nguyen = ps.getTu() / ps.getMau();
        int tuSo = ps.getTu() % ps.getMau();
        int mauSo = ps.getMau();
        return new HonSo(nguyen, tuSo, mauSo);
    }
    public PhanSo chuyenHonSoSangPhanSo() {
        int tuSo = getTu() + this.nguyen * getMau();
        return new PhanSo(this.getTu(), this.getMau());
    }
    
      public HonSo cong(HonSo hs) {
        PhanSo ps1 = this.chuyenHonSoSangPhanSo();
        PhanSo ps2 = hs.chuyenHonSoSangPhanSo();
        PhanSo psTong = ps1.cong(ps2);
        HonSo d = new HonSo(nguyen,this.getTu(),this.getMau());
        HonSo k = d.chuyenPhanSoSangHonSo(psTong);
        return k;
    }
     public HonSo tru(HonSo hs) {
        PhanSo ps1 = this.chuyenHonSoSangPhanSo();
        PhanSo ps2 = hs.chuyenHonSoSangPhanSo();
        PhanSo psTru = ps1.tru(ps2);
        HonSo d = new HonSo(nguyen,this.getTu(),this.getMau());
        HonSo k = d.chuyenPhanSoSangHonSo(psTru);
        return k;
    }
     
     public HonSo nhan(HonSo hs) {
        PhanSo ps1 = this.chuyenHonSoSangPhanSo();
        PhanSo ps2 = hs.chuyenHonSoSangPhanSo();
        PhanSo psNhan = ps1.nhan(ps2);
        HonSo d = new HonSo(nguyen,this.getTu(),this.getMau());
        HonSo k = d.chuyenPhanSoSangHonSo(psNhan);
        return k;
    }
      public HonSo chia(HonSo hs) {
        PhanSo ps1 = this.chuyenHonSoSangPhanSo();
        PhanSo ps2 = hs.chuyenHonSoSangPhanSo();
        PhanSo psChia = ps1.chia(ps2);
        HonSo d = new HonSo(nguyen,this.getTu(),this.getMau());
        HonSo k = d.chuyenPhanSoSangHonSo(psChia);
        return k;
    }
    public void soSanh(HonSo hs) {
        PhanSo ps1 = this.chuyenHonSoSangPhanSo();
        PhanSo ps2 = hs.chuyenHonSoSangPhanSo();
        ps1.soSanh(ps1, ps2);
        
    
    }
}
