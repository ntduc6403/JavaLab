/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_Bai3_Bai4_Bai7;

/**
 *
 * @author User
 */
public class TamGiac extends ToaDo  {
    private ToaDo A;
    
    private ToaDo B;
    
    private ToaDo C;
    
    private float a;
    
    private float b;
    
    private float c;
    
    public void TamGiac(ToaDo A, ToaDo B, ToaDo C){
    
        this.A = A;
        this.B = B;
        this.C= C;
        
        this.a = (float) this.B.KhoangCach(this.A);
        this.b = (float) this.C.KhoangCach(this.B);
        this.c = (float) this.A.KhoangCach(this.C);

        
    }

    @Override
    public void Xuat(){
//        System.out.println("A: "+ A);
//        System.out.println("B: "+ B);
//        System.out.println("C: "+ C);

        System.out.println("AB: " + a);
        System.out.println("BC: " + b);
        System.out.println("AC: "+ c);
    }
    public void loaiTamGiac(){
         
            if ((this.a == this.b) && (this.b == this.c)) {
                System.out.println("Tam giác đều!");
            } else if ((this.a == this.b) || (this.a == this.c) || (this.b == this.c)) {
                System.out.println("Tam giác cân!");
            } else if ((this.a * this.a == this.b * this.b + this.c * this.c) ||
                    (this.b * this.b == this.a * this.a + this.c * this.c) ||
                    (this.c * this.c == this.a * this.a + this.b * this.b)) {
                System.out.println("Tam giác vuông!");
            } else if (((this.a * this.a + this.b * this.b == this.c * this.c) && (this.a == this.b)) ||
                    ((this.a * this.a + this.c * this.c == this.b * this.b) && (this.a == this.c)) ||
                    ((this.b * this.b + this.c * this.c == this.a * this.a) && (this.b == this.c))) {
                System.out.println("Tam giác vuông cân!");
            } else {
                System.out.println("Tam giác thường!");
            }
    }
    
    public double tinhCV(){
        double cv = a + b + c;
        
        return cv;
    }
    
    public double tinhDT(){
        double p = (a+b+c)/2;
        double dt = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
       return dt;
    }
    public double rNgoaiTiep(){
        double r1 = (a*b*c)/4*tinhDT();
        
        return r1;
    }
    public double rNoiTiep(){
        double p = (a+b+c)/2;
        double r2 = tinhDT()/p;
        
        return r2;     
    }
   
    
}
