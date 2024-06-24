/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_21521963_nguyentienduc;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author User
 */

public class Bai58 {
    public static HashMap taoNV(String maNV,String HoTen,int LuongCoBan,int cong){
        HashMap<String,String> nv=new HashMap<String,String>();
        nv.put("maNV", String.valueOf(maNV));
        nv.put("HoTen",HoTen);
        nv.put("LuongCoBan",String.valueOf(LuongCoBan));
        nv.put("Cham Cong",String.valueOf(cong));
        nv.put("LuongHangThang","");
        
        return nv;
    }
    
    public static void taoDSNV(ArrayList<HashMap> ds){
        HashMap nv1=taoNV("VP01", "Nguyen A", 10000,26);
        HashMap nv2=taoNV("VP02", "Nguyen B", 20000,27);
        HashMap nv3=taoNV("BH01", "Nguyen C", 30000,123);
        HashMap nv4=taoNV("BH02", "Nguyen F", 40000,19);
        HashMap nv5=taoNV("BH03", "Nguyen D", 5000,162);
        HashMap nv6=taoNV("VP03","Nguyen G", 60000,21);
        HashMap nv7=taoNV("VP07", "Tran A", 70000,29);
        HashMap nv8=taoNV("BH08", "Tran B", 80000,410);
        HashMap nv9=taoNV("BH09", "Tran C", 90000,201);
        HashMap nv10=taoNV("BH09", "Tran D", 10000,19);
        HashMap nv11=taoNV("BH03", "Hoang Q", 12000,640);
      
        ds.add(nv1);
        ds.add(nv2);
        ds.add(nv3);
        ds.add(nv4);
        ds.add(nv5);
        ds.add(nv6);
        ds.add(nv7);
        ds.add(nv8);
        ds.add(nv9); 
        ds.add(nv10);
        
    }
  
    public static void inDSNV(ArrayList<HashMap> ds){
        for(HashMap i : ds){
            System.out.println(""+i);
        }
    }
    
    public static void tinhLuong(ArrayList<HashMap> ds) {
        for (HashMap i : ds) {
            String maNV = (String) i.get("maNV");
            float luonghangthang = 0;
            if (maNV.startsWith("BH")) {
                int cong = Integer.parseInt((String) i.get("cong"));
                luonghangthang = Float.parseFloat((String) i.get("LuongCoBan")) + cong * 18000;
            } else if (maNV.startsWith("VP")) {
                int cong = Integer.parseInt((String) i.get("cong"));
                luonghangthang = Float.parseFloat((String) i.get("LuongCoBan")) + cong * 150000;
            }
            i.put("LuongHangThang", String.valueOf(luonghangthang));
        }
    }
    public static void xuat(ArrayList<HashMap> ds){
        for(HashMap i : ds){
            System.out.println("[ MaNV : "+i.get("maNV")+" ; HoVaTen : "+i.get("HoTen")+" ; LuongCoBan"+i.get("LuongCoBan")+" ; LuongHangThang : "+i.get("LuongHangThang")+" ]");
        }
    }
    public static void timMaNV(ArrayList<HashMap> ds, String s) {
        for(HashMap i:ds){
         if(i.get("maNV").equals(s)){
             System.out.println(""+i);
             return;
         }
 
        }
        System.out.println("Khong tim thay ma sinh vien");
         
     }

     public static void maxLuong(ArrayList<HashMap> ds) {
        HashMap <String,String> NVMAX=null;
        float maxLUONG=-1;

        for(HashMap i:ds){
            float LUONG=Float.valueOf((String) i.get("LuongHangThang"));
                if(LUONG>maxLUONG){
                    maxLUONG=LUONG;
                    NVMAX=i;
            }
        }
        System.out.println(""+NVMAX);
    }
    public static void luongBhMIn(ArrayList<HashMap> ds) {
        HashMap<String,String> NVTHAP=null;
        float minLuong=-1;
        
        for(HashMap i:ds){
            if(i.get("maNV").toString().startsWith("NVBH")) {
                float luonghangthang = Float.parseFloat(i.get("LuongHangThang").toString());
                if (minLuong == -1 || luonghangthang < minLuong) {
                    minLuong = luonghangthang;
                    NVTHAP = i;
                }
            }
        }
        if(NVTHAP!=null){
            System.out.println("[ MaNV : "+NVTHAP.get("maNV")+" ; HoVaTen : "+NVTHAP.get("HoTen")+" ; LuongCoBan : "+NVTHAP.get("LuongCoBan")+" ; LuongHangThang : "+NVTHAP.get("LuongHangThang")+" ]");
        } else {
            System.out.println("Khong tim thay ");
        }
    }
    
    public static void main(String[] args) {
        ArrayList<HashMap> ds=new ArrayList<HashMap>();
        taoDSNV(ds);
        tinhLuong(ds);
        System.out.println("Danh sach nhan vien cong ty : ");
        xuat(ds);
        System.out.println("Tim nhan vien theo ma nhan vien la : ");
        timMaNV(ds, "BH01");
        System.out.println("Nhan vien  muc luong  thang cao nhat la : ");
        maxLuong(ds);
        System.out.println("Nhan vien ban hang co muc luong thap nhat : ");
        luongBhMIn(ds);
   
    }

}