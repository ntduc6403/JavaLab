/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai08;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class TestCaseDaiLy {
    public static void main(String [] args){
        SanXuat s1 = new SanXuat();
        SanXuat s2 = new SanXuat();
        VanPhong p1 = new VanPhong();
        VanPhong p2 = new VanPhong();
        s1.SanXuat(1, "Nguyen Duc", (float)123.000, 34);
        s2.SanXuat(31, "The Cuong", (float) 30.000, 41);
        p1.VanPhong(2, "Minh Huy", (float) 34.000, 39);
        p2.VanPhong(21, "Quang Minh", (float) 13.000, 34);
//        System.out.println("Thong Ca Nhan Vien");
//        s1.Xuat();
//        s2.Xuat();
//        p1.Xuat();
//        p2.Xuat();
        ArrayList<DaiLy> ds = new ArrayList();
        ds.add(s1);
        ds.add(s2);
        ds.add(p1);
        ds.add(p2);
        DaiLy a = new DaiLy();
        System.out.println("Nhan Vien Co Luong Cao Nhat La:");
        DaiLy max = a.maxLuong(ds);
        max.Xuat();
      
        ArrayList<VanPhong> dsvp = new ArrayList();
        dsvp.add(p2);
        dsvp.add(p1);
        System.out.println("NhanVien Co So San Pham Thap Nhat: ");
        VanPhong a1 = new VanPhong();
        DaiLy minNg = a1.minSP(dsvp);
//        minNg.Xuat();
        
        
      
    } 
}
