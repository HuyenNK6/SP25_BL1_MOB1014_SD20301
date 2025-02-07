/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_8;

/**
 *
 * @author Huyen
 */
public class Main {

    public static void main(String[] args) {
        //sử dụng tổ hợp phím Ctrl + cách để gợi ý
        //Khởi tạo đối tượng SV sử dụng Constructor không tham số
        SinhVien sv = new SinhVien();
        //Khởi tạo đối tượng SV2 sử dụng Constructor có tham số
        SinhVien sv2 = new SinhVien("PH01", "Nguyen Khanh Huyen", 
                false, "07/02/2005", "PTPM", 2, 10);
        //sử dụng Getter & setter
        sv.setMSV("PH02"); //gán giá trị cho thuộc tính MSV của đối tượng sv
        sv.setHoTen("Nguyen Anh Dung");
        sv.setGioiTinh(true);
        sv.setNgaySinh("14/02/2000");
        sv.setNganhHoc("UDPM");
        sv.setKyHoc(5);
        sv.setDiem(3);
        
        System.out.println("Diem sv= "+ sv.getDiem());
        //in thông tin sv
        sv.inThongTin();
        sv2.inThongTin();
       
    }
}
