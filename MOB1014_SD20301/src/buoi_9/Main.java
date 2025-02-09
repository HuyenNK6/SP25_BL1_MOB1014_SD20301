/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_9;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class Main {

    //main tab
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Khởi tạo đối tượng bằng constructor có tham số
        //mac book  => Alt + Enter
        MayTinh mt1 = new MayTinh("MT01", "Macbook", 2024, 40000, 3);
        //2. Khởi tạo đối tượng bằng constructor không tham số
        MayTinh mt2 = new MayTinh();
        //nhập từ bàn phím
        System.out.println("------NHẬP THÔNG TIN--------");
        System.out.print("Mời nhập mã: ");
//        String ma= sc.nextLine();
//        mt2.setMa(ma);
        mt2.setMa(sc.nextLine());
        System.out.print("Mời nhập hãng: ");
        mt2.setHang(sc.nextLine());
        System.out.print("Mời nhập năm sản xuất: ");
        mt2.setNamSX(Integer.parseInt(sc.nextLine()));
        System.out.print("Mời nhập giá: ");
        mt2.setGia(Integer.parseInt(sc.nextLine()));
        System.out.print("Mời nhập trạng thái (1-2): ");
        mt2.setTrangThai(Integer.parseInt(sc.nextLine()));
        //3. Khởi tạo đối tượng bằng constructor có tham số 
        System.out.println("------NHẬP THÔNG TIN--------");
        System.out.print("Mời nhập mã: ");
        String ma= sc.nextLine();
        System.out.print("Mời nhập hãng: ");
        String hang= sc.nextLine();
        System.out.print("Mời nhập năm sản xuất: ");
        int namSX= Integer.parseInt(sc.nextLine());
        System.out.print("Mời nhập giá: ");
        int gia = Integer.parseInt(sc.nextLine());
        System.out.print("Mời nhập trạng thái (1-2): ");
        int trangThai= Integer.parseInt(sc.nextLine());
        MayTinh mt3 = new MayTinh(ma, hang, namSX, gia, trangThai);
        //=> nhập từ bàn phím
        //4. in thông tin
        System.out.println("------IN THÔNG TIN--------");
        mt1.inThongTin();
        mt2.inThongTin();
        mt3.inThongTin();
    }
}
