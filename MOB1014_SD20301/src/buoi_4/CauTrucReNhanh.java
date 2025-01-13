/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_4;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class CauTrucReNhanh {

    /*
    1. Nhập vào 1 số nguyên kiểm tra đó là số chẵn hay số lẻ 
    2. Nhập vào 3 số nguyên. Tìm max, min trong 3 số vừa nhập 
    Nhập điểm toán kiểu int, lý kiểu int, hoá kiểu int. Tính điểm trung bình bằng trung bình cộng của 3 điểm toán , lý , hoá vừa nhập và in ra màn hình loại sinh viên tương ứng nếu: 	
    0 <= điểm trung bình <5 : SV yếu 	
    5<=điểm trung bình <7 : SV TB 	
    7<= điểm trung bình <8 : SV khá 
    8<= điểm trung bình < 9: SV giỏi 
    9<= điểm trung bình <= 10 : SV xuất sắc 

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số thứ nhất a= ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập số thứ hai b= ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập số thứ ba c= ");
        int c = Integer.parseInt(sc.nextLine());
        //sử dụng Ctrl +Shift+ mũi tên xuống
        //if + tổ hợp phím Ctrl + cách

        System.out.println("------IN THONG TIN-----");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        if (a % 2 == 0) {
            System.out.println(a + " la so chan!");
        } else {
            System.out.println(a + " la so le!");
        }

        if (a > b && a > c) {
            System.out.println("Max = " + a);
        } else if (b > c) {
            System.out.println("Max = " + b);
        } else {
            System.out.println("Max = " + c);
        }

        int max = a;
        if (b > max) {
            max = b;
        } 
        if (c > max) {
            max = c;
        }
        System.out.println("Max= " + max);

    }
}
