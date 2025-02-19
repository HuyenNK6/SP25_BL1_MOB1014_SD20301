/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_13;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        QLTraSua quanLy= new QLTraSua();
        int choice;
        do {            
            
            System.out.println("1.Nhập danh sách: ");
            System.out.println("2.xuất danh sách: ");
            System.out.println("3.Tim theo id ");
            System.out.println("0.Thoát");
            System.out.println("Xin mời bạn chọn");
            choice= Integer.parseInt(sc.nextLine());
            
            switch (choice) {
                case 1:
                    quanLy.nhap();                    
                    break;
                case 2: 
                    quanLy.xuat();
                    break;
                case 3:
                    quanLy.timKiemTheoId();
                    break;
                case 4:
                    quanLy.timKiemTheoHang2();
                    break;
                case 5:
                    quanLy.suaThongTin();
                    break;
                case 8:
                    quanLy.xoa();
                    break;
                case 9:
                    quanLy.sapXep();
                    break;
                case 0:
                    System.out.println("Thoát");
                    System.exit(0);
                default:
                    System.out.println("mời bạn nhập lại");
            }
        } while (choice !=0);
    }
}
