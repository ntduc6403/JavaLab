package Lab04;


import Lab04.KhachHang;
import java.util.*;

/**
 * 
 */
public class QuanLy {

    /**
     * Default constructor
     */
    
    

    public  ArrayList<KhachHang> dsKH;

    /**
     * 
     */
   

    /**
     * @return
     */
    public QuanLy(){
        this.dsKH = new ArrayList<KhachHang>();
    }
    public void loadData(){
        KhachHang kh1 = new HoKinhDoanh(123,"A",120,960, (float) 1.8);
        KhachHang kh2 = new HoGiaDinh(124,"B",400,450);
        KhachHang kh3 = new HoKinhDoanh(125,"C",300,689, (float) 1.3);
        KhachHang kh4 = new HoSanXuat(126,"D",150,965, (float) 1.5);
        KhachHang kh5 = new HoGiaDinh(127,"E",500,999);
        KhachHang kh6 = new HoSanXuat(128,"F",350,987, (float) 1.6);
        KhachHang kh7 = new HoSanXuat(129,"G",100,989, (float) 1.9);
        
        dsKH.add(kh1);
        dsKH.add(kh2);
        dsKH.add(kh3);
        dsKH.add(kh4);
        dsKH.add(kh5);
        dsKH.add(kh6);
        dsKH.add(kh7);
//        dsKH.add(kh7);

    }
    public void xuat() {
        // TODO implement here
        for(KhachHang ds : dsKH){
            ds.xuat();
        }
        
    }

    /**
    
     */
    public void tinhTien() {
        // TODO implement here
        
        for(KhachHang ds :dsKH){
           
           ds.tinhGiaDien();
            
        }
       
    }

    /**
     * @return
     */
    public KhachHang timKiem(int id) {
        // TODO implement here
        for(KhachHang ds : dsKH){
            if(ds.getMaKH() == id){
                ds.xuat();
            }
        }
        return null;
    }

    /**
     * @return
     */
    public double trungBinhDien() {
        // TODO implement here
        double tong = 0;
        int dem = 0;
        for(KhachHang ds : dsKH){
            tong += ds.getGiaDien();
            dem++;
        }
        double giaTB =  tong/dem;
        
        return giaTB;
    }
    public KhachHang maxGia(){
        KhachHang max = dsKH.get(0);
        for(KhachHang ds : dsKH){
            if(ds.getGiaDien() > max.getGiaDien()){
                max = ds;
            }
        }
        return max;
    }
    public KhachHang minGiaSX(){
        HoSanXuat min = null;
        double minGia = Double.MAX_VALUE;
        for(KhachHang ds : dsKH){
            if(ds instanceof HoSanXuat && ((HoSanXuat) ds).getGiaDien() < minGia){
                min = (HoSanXuat) ds;
                minGia = min.getGiaDien();
            
        }
        }
        return min;
    }
    
}