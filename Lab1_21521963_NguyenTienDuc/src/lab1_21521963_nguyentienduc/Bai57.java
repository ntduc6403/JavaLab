/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_21521963_nguyentienduc;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author User
 */
public class Bai57 {
    public static HashMap taoSV(int maSV,String hoTen,float GPA){
        HashMap<String,String> sv=new HashMap<String,String>();
        sv.put("maSV:", String.valueOf(maSV));
        sv.put("Ho Ten:",hoTen);
        sv.put("GPA:",String.valueOf(GPA));
        sv.put("XepLoai:","");
        
        return sv;
    }
  
 
    public static void taoDDSV(ArrayList<HashMap> ds){
        HashMap sv1=taoSV(1,"Tien Duc",10f);
        HashMap sv2=taoSV(2,"Van DUc",9.6f);
        HashMap sv3=taoSV(3,"Hoang Duc",5.6f);
        HashMap sv4=taoSV(4,"Manh Duc",8.9f);
        HashMap sv5=taoSV(5,"Tuan Duc ",7.4f);
        HashMap sv6=taoSV(6,"Xuan DUc",1.9f);
        HashMap sv7=taoSV(7,"Quang Duc",5.6f);
        HashMap sv8=taoSV(8,"HUng Duc",6.7f);
        HashMap sv9=taoSV(9,"Tinh Duc",5.8f);
        HashMap sv10=taoSV(10,"Nguyen Duc",2.6f);
            
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        ds.add(sv4);
        ds.add(sv5);
        ds.add(sv6);
        ds.add(sv7);
        ds.add(sv8);
        ds.add(sv9); 
        ds.add(sv10);
    
    }
    
    public static void xuat(ArrayList<HashMap> ds){
        for(HashMap i : ds){
            System.out.println(""+i);


        }
    }
    public static void maxGPA(ArrayList<HashMap> ds) {
        HashMap <String,String> sv=null;
        float max = -1;

        for(HashMap i:ds){
                float DTB=Float.valueOf((String) i.get("DTB"));
                if(DTB > max){
                    max = DTB;
                    sv = i;
            }
        }
        System.out.println(sv);
    }
    public static void timKiem(ArrayList<HashMap> ds, String s) {
       for(HashMap i:ds){
        if(i.get("maSV").equals(s)){
            System.out.println(""+i);
            
        }
       }   
    }

    public static void xepLoai(ArrayList<HashMap> ds) {
        for(HashMap i:ds){
            float dtb=Float.valueOf((String) i.get("GPA"));
            String xeploai="";
            if(dtb<3.5){
                xeploai="Kem";
            }
            else if(dtb<5&&dtb>=3.5){
                xeploai="Yeu";     
            }
            else if(dtb<7&&dtb>=5){
                xeploai="Trung binh";     
            }
            else if(dtb<8&&dtb>=7){
                xeploai="Kha"; 
            }
            else if(dtb<9&&dtb>=8){
                xeploai="Gioi";    
            }
            else if(dtb<=10&&dtb>=9){
                xeploai="Xuat sac";   
            }
            i.put("XepLoai",xeploai);
        }
    }
    
    public static void timDTB(ArrayList<HashMap> ds, String string) {
        for(HashMap i:ds){
         if(i.get("DTB").equals(string)){
             System.out.println(""+i);
             return;
         }
 
        }
        System.out.println("Khong tim thay ma sinh vien");
         
     }
      public static void sapXep(ArrayList<HashMap> ds) {
        Collections.sort(ds, new Comparator<HashMap>() {
            @Override
            public int compare(HashMap o1, HashMap o2) {
                float dtb1 = Float.valueOf((String) o1.get("DTB"));
                float dtb2 = Float.valueOf((String) o2.get("DTB"));
    
                if (dtb1 > dtb2) {
                    return -1;
                } else if (dtb1 < dtb2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
     public static void topMin(ArrayList<HashMap> ds){
        sapXep(ds);
        int k=0;
        for(HashMap i:ds){
            System.out.println(""+i);
            k++;
            if(k==10){
                break;
            }

        }
    }
    public static void topMax(ArrayList<HashMap> ds){
        sapXep(ds);
        int k=0;
        for(int i=ds.size()-1;i>0;i--){
            System.out.println(""+ds.get(i));
            k++;
            if(k==10){
                break;
            }

        }
    }
    public static void main(String[] args) {
        ArrayList<HashMap> ds=new ArrayList<HashMap>();
        taoDDSV(ds);
        xuat(ds);
        System.out.println("SInh vien co GPA cao nhat: ");
        maxGPA(ds);
        System.out.println("Xep Loai Hoc Luc Sinh Vien: ");
        xepLoai(ds);
        xuat(ds);
        System.out.println("Tim kiem sinh vien theo ma SV :");
        timKiem(ds,"3");
        System.out.println("Sinh vien tim kiem theo DTB la :");
        timDTB(ds,"9.0");
        System.out.println("top 10 sinh vien co gpa cao nhat");
        topMin(ds);
        System.out.println("top 10 sinh vien co gpa thap nhat");
        topMax(ds);

    }
}
        

        
    
