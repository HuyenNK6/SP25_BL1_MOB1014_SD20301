/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_1;

/**
 *
 * @author Huyen
 */
public class Bien_KieuDuLieu {
    /*
    ------------------------BUỔI 1: BIẾN-----------------------------
/* 
	* Phần 1- KHÁI NIỆM VỀ BIẾN
	* 1. Biến: dùng để lưu trữ giá trị
	* 2. Biến sẽ dc lưu trên RAM có khi CT chạy, mất CT dừng
	* 3. Biến cần có kiểu dữ liệu
	* 
	* Phần 2- KIỂU DỮ LIỆU
	* - Logic: boolean trả về giá trị True/False, trong C là 1/0
	* - Ký tự: char (lưu 1 ký tự)
	* - Số nguyên: short, int, long
	* - Số thực: float, double
	* - Chuỗi: String (trong C ko có)
	* 
	* Phần 3- KHAI BÁO BIẾN
	* - C1: <kiểu dữ liệu> <tên biến>;
	* - C2: <kiểu dữ liệu> <tên biến> = <giá trị>;
	* 
	* Phần 4- QUY TẮC ĐẶT TÊN BIẾN
	* Lưu ý: ko dc bắt đầu bởi số, ko phải là keyword: 
	* int, main, return, double,...
	* * cách đặt tên
	* - normal case: hoten
	* - camel case: hoTen # HoTen => Pascal 
	* - under score: ho_ten
	
    */
    public static void main(String[] args) {
        int tuoi = 18;
        System.out.println("Tuoi la: " + tuoi);
        String ho = "Nguyen"; //kiểu chuỗi
        String ten = "Huyen";
        System.out.println("Ten la: "+ ho + " " + ten);
        boolean gioiTinh = true;//chỉ 2 giá trị là true /false
        System.out.println("Gioi tinh: "+ gioiTinh);
    }
}
