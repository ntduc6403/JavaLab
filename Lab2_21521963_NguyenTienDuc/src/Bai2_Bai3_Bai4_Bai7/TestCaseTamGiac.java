/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_Bai3_Bai4_Bai7;


/**
 *
 * @author User
 */
public class TestCaseTamGiac {
    public static void main(String[] args){
        ToaDo n1 = new ToaDo();
        ToaDo n2 = new ToaDo();
        ToaDo n3 = new ToaDo();
        n1.ToaDo(1, 2);
        n2.ToaDo(5,6);
        n3.ToaDo(7, 3);
        TamGiac a = new TamGiac();
        a.TamGiac(n1, n2, n3);
        System.out.println("Thong tin tam giac a la: ");
        a.Xuat();
        a.loaiTamGiac();
        System.out.println("Chu Vi Tam Giac: "+ a.tinhCV());
        System.out.println("Dien Tich Tam Giac: "+a.tinhDT());
        System.out.println("R Ngoai Tiep: "+a.rNgoaiTiep());
        System.out.println("R Ngoai Tiep: "+a.rNoiTiep());
        
       
        
    }
}
