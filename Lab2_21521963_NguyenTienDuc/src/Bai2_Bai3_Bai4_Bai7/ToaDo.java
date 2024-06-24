package Bai2_Bai3_Bai4_Bai7;

import java.util.Scanner;
import java.util.*;

/**
 * 10. input: 2 tọa độ lấy từ thuộc tính tung độ , hoành độ
 * out put: tọa độ trung điểm giữa 2 tọa độ input
 */
public class ToaDo {

    /**
     * Default constructor
     */
    public ToaDo() {
    }

    /**
     * 
     */
    private double HoanhDo;

    /**
     * 
     */
    private double TungDo;

    /**
     * 1 Phương thức hoành độ
     * @param HoanhDo 
     * @param TungDo
     */
    public void ToaDo(double HoanhDo, double TungDo) {
        // TODO implement here
        this.HoanhDo = HoanhDo;
        this.TungDo = TungDo;
    }

    /**
     * 2.Nhập hoành độ , tung độ
     * @return
     */
    public void Nhap() {
        // TODO implement here
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao hoanh do");
        this.HoanhDo = input.nextDouble();
        System.out.println("Nhap vao tung do");
        this.TungDo = input.nextDouble();
        
    }

    /**
     * 3. xuất tọa độ
     * @return
     */
    public void Xuat() {
        // TODO implement here
        System.out.println("Toa Do Diem: " + "(" + this.HoanhDo + "," +this.TungDo + ")");
        
    }

    /**
     * 4. lấy hoành độ
     * @return
     */
    public double GetHoanhDo() {
        // TODO implement here
        return HoanhDo;
    }

    /**
     * 5. thay đổi hoành độ
     * @return
     */
    public void SetHoanhDo(double HoanhDo) {
        // TODO implement here
        this.HoanhDo = HoanhDo;
        
    }

    /**
     * 6.Lấy tung độ
     * @return
     */
    public double GetTungDo() {
        // TODO implement here
        return TungDo;
    }

    /**
     * 7. Thay đổi tung dộ
     * @return
     */
    public void SetTungDo(double TungDo) {
        // TODO implement here
        this.TungDo = TungDo;
        
    }

    /**
     * 8. input : tọa độ được lấy từ thuộc tính tung độ , hoành độ
     * output: di chuyển đến tọa độ cần di chuyển
     * @return
     */
    public void DiChuyen(double dx , double dy) {
        
        // TODO implement here
        this.TungDo += dx;
        this.HoanhDo += dy;
        
    }

    /**
     * 9. input: 2 điểm tọa độ lấy từ thuộc tính hoành độ , tung độ
     * output: khoảnh cách giữa 2 tọa độ
     * @return
     */
    public double KhoangCach(ToaDo x) {
        // TODO implement here
        
        return Math.sqrt((this.HoanhDo - x.HoanhDo) * (this.HoanhDo - x.HoanhDo) + (this.TungDo - x.TungDo) * (this.TungDo - x.TungDo) );
    }

    /**
     * 10. input : 2 tọa độ lấy từ thuộc tính hoành độ , tung độ
     * output: tọa độ trung điểm giữa 2 tọa độ
     * @return
     */
    public ToaDo ToaDoTD(ToaDo a) {
        // TODO implement here
        ToaDo td = new ToaDo();
        td.HoanhDo = (this.HoanhDo + a.HoanhDo) / 2;
        td.TungDo = ( this.TungDo + a.TungDo) / 2;
        return td;
    }

    /**
     * 11. input : tọa độ cần xóa
     * output : xóa thành công tọa độ cần xóa
     * @return
     */
    public void XoaTD() {
        // TODO implement here
        this.HoanhDo = 0;
        this.TungDo = 0;
        return ;
    }

    /**
     * 12. input: tọa độ lấy từ thuộc tính hoành độ, tung độ
     * output: sao chép 1 điểm tọa độ giống tọa độ input
     * @return
     */
    public ToaDo SaoChep() {
        // TODO implement here
        ToaDo sc = new ToaDo();
        
        sc.HoanhDo = this.GetHoanhDo();
        sc.TungDo = this.GetTungDo();
        return sc;
    }

    /**
     * 12. input : Các tọa độ từ danh sách các tọa đọ
     * oupt
     * ut: tọa độ  đầu tiên gần với tâm O nhất
     * @return
     */
    public ToaDo GanTamO(List<ToaDo> ds) {
        // TODO implement here
        ToaDo tamO = new ToaDo();
        tamO.ToaDo(0, 0);
        ToaDo ganNhat = null;
        double min =  Double.MAX_VALUE;
        for(ToaDo c : ds){
            double tamMin = Math.sqrt(Math.pow(c.GetHoanhDo() - tamO.GetHoanhDo(), 2) + Math.pow(c.GetTungDo() - tamO.GetTungDo(), 2));
             if (tamMin < min) {
                 min = tamMin;
                 ganNhat = c;
      }
        }
        return ganNhat;
    }

}