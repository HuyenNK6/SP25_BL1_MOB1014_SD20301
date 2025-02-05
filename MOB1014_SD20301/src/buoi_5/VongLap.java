/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_5;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class VongLap {

    /*
    Tạo menu sử switch case => menu có lặp đến khi chọn 0
Viết chương trình nhập vào số nguyên dương  N. Sử dụng vòng lặp for để tính tổng tất cả các số nguyên từ 1 đến  N .
Viết chương trình nhập vào số nguyên dương  N . Tính  N!  (giai thừa của  N ) bằng cách nhân tất cả các số từ 1 đến  N .
Nhập số  N  và tính tổng các số lẻ từ 1 đến  N  (nếu  N  lẻ thì tính đến  N ).

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {            
            System.out.println("-----MENU-----");
            System.out.println("1.Bài 1 ");
            System.out.println("2. Bài 2");
            System.out.println("3. Bài 3");
            System.out.println("0. Thoát CT!!!");
            System.out.println("Mời nhập lựa chọn: ");
            luaChon = Integer.parseInt(sc.nextLine());
                  
            switch (luaChon) {
                case 1:
                    System.out.println("Nhap vao so nguyen duong : ");
                    int n = Integer.parseInt(sc.nextLine());
                    
                    int tong = 0;
                    for(int i = 1; i <= n; i++){
                        tong += i;
                    }
                    System.out.println("Tong tu 1 den " + n + " : " + tong);
                    break;
                case 2:
                    System.out.println("Bai 2");
                    System.out.println("Moi nhap so nguyen n: ");
                    int num1 = Integer.parseInt(sc.nextLine());
                    
                    int giaiThua = 1;
                    for (int i = 1; i <= num1; i++) {
                        giaiThua *= i;//giaiThua = giaiThua * i;
                    }
                    System.out.println("Gia Thua cua cac so tu 1 den " + num1 + " la: " + giaiThua);
                    break;
                case 3:
                    System.out.println("nhap n : ");
                    int num = Integer.parseInt(sc.nextLine());
                    int sum =0;
                    for(int i = 1 ; i <= num ; i++ ){
                        if(i % 2 != 0){
                            sum += i;
                        }    
                    }
                    System.out.println("tong cac so le la = "+sum);
                    break;
                case 0:                    
                    System.out.println("Thoát CT");
                    System.exit(0);
                default:
                    System.out.println("Mời bạn nhập lại!!");
                    
            
            }
            
        } while (luaChon != 0);
    }
}
