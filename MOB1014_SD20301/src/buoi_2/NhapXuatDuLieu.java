/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_2;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */

/*
         * P1: Ép kiểu - Chuyển đổi từ kiểu dữ liệu số sang dạng số khác - Không đổ kiểu dữ liệu lớn về bé mà chỉ bé lên lớn ví dụ int lớn hơn byte hoặc long nhất trong số nguyên. Ngoài ra các bạn có thể tham khảo lại trong bảng kích thước kiểu dữ liệu.
         *
         * Công thức ép kiểu tường minh:
         *        (<kiểu dữ liệu>) <biến cần ép kiểu>;
         *
         * P2: Ép kiểu từ string về số
         *  
 */
 /* Lớp bao- Wrapper
        Đối vs mỗi kiểu dữ liệu nguyên thủy,
        => 1 lớp bao tương ứng
        int => Integer
        double => Double
        float => Float
        char => Character
        boolean => Boolean.....
 */
public class NhapXuatDuLieu {

    //main + tab
    public static void main(String[] args) {
        //Nhập thông tin từ bàn phím 
        //=> cần lớp Scanner để hỗ trợ cho việc nhập từ bàn phím
        //tổ hợp phím Ctrl + space => gợi ý code 
        Scanner sc = new Scanner(System.in);//khởi tạo 1 đối tượng scanner sc từ lớp Scanner
        System.out.println("Mời nhập mã SV: ");
        String msv = sc.nextLine();// đọc hết 1 dòng dữ liệu
        //họ và tên, năm sinh, giới tính, địa chỉ 
        System.out.println("Mời nhập họ và tên: ");
        String hoTen = sc.nextLine();
        System.out.println("Mời nhập năm sinh: ");
//        int namSinh = sc.nextInt();
        //tránh tình trạng trôi lệnh -> sc.nextLine()
        // int namSinh= sc.nextLine();
        //Kiểu dữ liệu khác String -> Ép kiểu
//ÉP KIỂU: ép từ kiểu String -> int
//kiểu dữ liệu nguyên thủy -> Lớp bao tương ứng
    //int -> Integer
        int namSinh = Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập giới tính: ");
        boolean gioiTinh = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Mời nhập địa chỉ: ");
        String diaChi = sc.nextLine();

        System.out.println("--------IN THÔNG TIN------");
        System.out.println("MSV: " + msv);
        System.out.println("Họ và tên: " + hoTen);
    }
}
