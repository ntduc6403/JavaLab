/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_Bai3_Bai4_Bai7;

/**
 *
 * @author User
 */
public class DuongTron extends ToaDo{
    private ToaDo Tam;
    
    private float R;
    
    public void DuongTron(ToaDo Tam, float R){
        this.Tam = Tam;
        this.R = R;
        
    }
    @Override
    public void Xuat(){
        System.out.println( "Duong tron Ban Kinh: " + R);
    }
    public float getR(){
        return this.R;
    }
    public void setR(float R){
        this.R = R;
    }
    public double tinhCV(){
           double cv = getR() * 2 * 3.14;
        return cv;
                
    }
    public double tinhDT(){
        double dt = getR()* getR() * 3.14;
        
        return dt;
    }
        
    public void zoomIn(double percent) {
        this.R *= (1 + percent / 100);
    }
    public void zoomOut(double percent){
        this.R *= (1- percent / 100);
    }
 
  public static boolean checkGiaoNhau(DuongTron circle1, DuongTron circle2) {
    double distance = Math.sqrt((circle2.GetHoanhDo()-circle1.GetHoanhDo())*(circle2.GetHoanhDo()-circle1.GetHoanhDo()) 
                        + (circle2.GetTungDo()-circle1.GetTungDo())*(circle2.GetTungDo()-circle1.GetTungDo()));
    double radiusSum = circle1.getR() + circle2.getR();

    if(distance > radiusSum) {
        return false;
    }
    else {
        return true;
    }
}
    
    
}
   