/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class NhapXuatList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Chocolate> lstChocolates = new ArrayList<>();
        System.out.println("Mời nhập số lượng Chocolate: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("--------NHẬP THÔNG TIN---------");
        for (int i = 0; i < n; i++) {
            //1. Khởi tạo đối tượng Chocolate -> ctor ko tham số
            Chocolate choco = new Chocolate();
            //2. nhập thông tin
            System.out.println("-----------");
            System.out.print("Mời nhập id:");
            choco.setId(Integer.parseInt(sc.nextLine()));
            System.out.print("Mời nhập tên: ");
            choco.setTen(sc.nextLine());
            System.out.print("Mời nhập hãng: ");
            choco.setHang(sc.nextLine());
            System.out.print("Mời nhập giá:");
            choco.setGia(Integer.parseInt(sc.nextLine()));
            System.out.print("Mời nhập khối lượng:");
            choco.setKhoiLuong(Double.parseDouble(sc.nextLine()));
            //3. thêm đối tượng vào danh sách
            lstChocolates.add(choco);
        }
        //duyệt danh sách
        System.out.println("----IN THÔNG TIN----");
        for (Chocolate choco : lstChocolates) {
            choco.inThongTin();
        }

    }

}
