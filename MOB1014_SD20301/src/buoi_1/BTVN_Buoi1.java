/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_1;

/**
 *
 * @author Huyen
 */
//Gán giá trị cho các biến thông tin của Sinh viên: Họ và tên, Mã SV, Ngày sinh, Địa chỉ, Giới tính (True- nam, False- nữ)
//Sau đó in toàn bộ thông tin ra màn hình

public class BTVN_Buoi1 {
    public static void main(String[] args) {
        String hoTen = "Do Anh Tuan";
        String maSv = "PH58016";
        String ngaySinh = "08/11/2005";
        String diaChi = "Phu THo";
        boolean gioiTinh = true;//lớp bao
        
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ma SV: " + maSv);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Dia Chi: " + diaChi);
        System.out.println("Gioi tinh: " + (gioiTinh == true ? "nam" : "nu"));
        /*
        Toán tử 3 ngôi:
            Biểu thức ? <giá trị đúng> : <giá trị sai>
        */
        if(gioiTinh == true){
            System.out.println("Gioi tinh: Nam");
        }else{
            System.out.println("Gioi tinh: Nu");
        }
        
        
        
        
    }
}
