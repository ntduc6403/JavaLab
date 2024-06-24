package Bai1_Bai6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

/**
 * 
 */
public class PhanSo {

    /**
     * Default constructor
     */
   
    private int MauSo;

    /**
     * 
     */
    private int TuSo;
    public PhanSo(){
    }
    public PhanSo(int TuSo, int MauSo) {
        this.MauSo = MauSo;
        this.TuSo = TuSo;
    }

    /**
     * 1 Phương thức phân số
     * @param TuSo 
     * @param MauSo
     */
    public void PhanSo(int TuSo, int MauSo) {
        // TODO implement here
        this.TuSo = TuSo;
        this.MauSo = MauSo;
    }

    public void nhap(){
         Scanner input = new Scanner(System.in);
         System.out.println("Nhap Tu So");
         this.TuSo = input.nextInt();
         System.out.println("Nhap Mau So");
         this.MauSo = input.nextInt();
    }
    /**
     * 2. Xuất Phân Số
     * @return
     */
    public void xuat() {
        // TODO implement here
        System.out.println("PhanSo: " + this.TuSo + "/"+ this.MauSo);
        return ;
    }

    /**
     * 3. Đổi dấu phân số
     * input : phân số lấy từ thuộc tính tử và mẫu
     * output : cập nhật lại dấu của phân số
     * @return
     */
    public int getTu(){
        return TuSo;
    }
    public void setTu(int TuSo){
        this.TuSo = TuSo;
    }
    public int getMau(){
        return MauSo;
    }
    public void setMau(int MauSo){
        this.MauSo = MauSo;
    }
    public void doiDau() {
        // TODO implement here
       System.out.println("Doi dau phan so: "+ -1*this.TuSo + "/" +this.MauSo);
        
    }
 public int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
 } 
    /**
     * 4. rút gọn phân số
     * input : phân số lấy từ thuộc tính tử số và mẫu số
     * ouput: rút gọn phân số về dạng tối giản nhất
     * @return
     */
        public void RutGon(){
        // TODO implement here
        int i = UCLN(this.getTu() , this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
       
    }

    /**
     * 5. Nhân chia cong tru các phân số
     * input: các phân số lấy từ các thuộc tính tử và mẫu
     * ouput: nhân các phân số và trả về kiểu phân số
     * @param a 
     * @return
     */
    public PhanSo cong(PhanSo a){
        PhanSo kq = new PhanSo();
        kq.TuSo = this.getTu() * a.getMau() + a.getTu() * this.getMau();
        kq.MauSo = this.getMau() * a.getMau();
        kq.RutGon();
        System.out.println("Ket qua  cong 2 phan so la: ");
        return kq;
    }
      public PhanSo tru(PhanSo a){
       PhanSo kq = new PhanSo();
        kq.TuSo = this.getTu() * a.getMau() - a.getTu() * this.getMau();
        kq.MauSo = this.getMau() * a.getMau();
        kq.RutGon();
        System.out.println("Ket qua tru 2 phan so la: ");
        return kq;
    }
      
    public PhanSo nhan(PhanSo a) {
        // TODO implement here
        PhanSo kq = new PhanSo();
        kq.TuSo = this.getTu() * a.getTu();
        kq.MauSo= this.getMau() * a.getMau();
        kq.RutGon();
        System.out.println("Ket qua cua nhan 2 phan so la: ");
        return kq;
    }
    public PhanSo chia(PhanSo a){
        PhanSo kq = new PhanSo();
         kq.TuSo = this.getTu() * a.getMau();
         kq.MauSo = this.getMau() * a.getTu();
         kq.RutGon();
         System.out.println("Ket qua cua chia 2 phan so la: ");
         return kq;
    }

    /**
     * 6. So sánh 2 phân số
     * input: 2 phân số lấy từ kiểu phân số
     * ouput: trả về kết quả kiểu int
     * @param a 
     * @param b 
     * @return
     */
    public void soSanh(PhanSo a, PhanSo b) {
        // TODO implement here
        int tsa = a.getTu() * b.getMau();
        int tsb = b.getTu() * a.getMau();
        if(tsa > tsb){
            System.out.println("Phan so t1  >   Phan so t2 ");
        }else if (tsa == tsb){ 
            System.out.println("Phan so t1  =   Phan so t2 ");
        }else if (tsa < tsb){
             System.out.println("Phan so t1  <   Phan so t2 ");
        }
        
    }
    public boolean lonHon(PhanSo other) {
        return this.TuSo* other.MauSo > other.TuSo * this.MauSo;
    }
    public PhanSo maxPhanSo(ArrayList<PhanSo> ds){
           PhanSo max = ds.get(0);
           
           for(int i = 0; i < ds.size(); i++){
               PhanSo a = ds.get(i);
               if(lonHon(a)){
                   a = max;
           }     
    }
        return max;   
        }
}