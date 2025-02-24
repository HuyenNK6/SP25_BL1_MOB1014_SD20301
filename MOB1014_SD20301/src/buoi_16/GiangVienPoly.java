/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_16;

/**
 *
 * @author Huyen
 */
//Lớp Giảng viên: LỚP CHA
//Lớp Giảng viên Poly: LỚP CON
//=> sử dụng từ hóa: extends: gõ ex + ctrl+ cách
public class GiangVienPoly extends GiangVien {

    //=> Lớp con sẽ kế thừa toàn bộ thuộc tính & phương thức
    //của lớp cha 
    //=> nên ko cần khai báo lại các thuộc tính của CHA
    //CON có thể bổ sung thuộc tính riêng mà CHA chưa có
    private String accountFPL;

    //tạo constructor => Ctrl cách enter x3
    //Insert Code => Select None=> Generate => COnstructor ko tham số
    public GiangVienPoly() {
    }

    public GiangVienPoly(String accountFPL) {
        this.accountFPL = accountFPL;
    }
//super: tham chiếu tới đối tượng của lớp cha

    public GiangVienPoly(String accountFPL, String maGV, String ten, String boMon, int bacLuong) {
        super(maGV, ten, boMon, bacLuong);
        this.accountFPL = accountFPL;
    }

    public String getAccountFPL() {
        return accountFPL;
    }

    public void setAccountFPL(String accountFPL) {
        this.accountFPL = accountFPL;
    }
//KẾ THỪA PHƯƠNG THỨC TIN THÔNG TIN
//Ghi đè phương thức
    //Insert code => Override Method => tích chọn inThonTin()

    @Override
    public void inThongTin() {
        //bổ sung super.toString()
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("accountFPL: " + accountFPL);
    }

    @Override
    public String toString() {
        //super.toString(): của LỚP CHA
        return super.toString() + "GiangVienPoly{" + "accountFPL=" + accountFPL + '}';
    }

}
