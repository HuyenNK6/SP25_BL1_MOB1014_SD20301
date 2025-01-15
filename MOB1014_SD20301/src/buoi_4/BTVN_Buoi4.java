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
public class BTVN_Buoi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {            
            System.out.println("---MENU---");
            System.out.println("1.Bai 1");
            System.out.println("2. Bai 2");
            System.out.println("0.Thoat!!!");
            System.out.println("----------");
            System.out.println("Moi lua chon: ");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    System.out.println("Moi nhap so: ");
                    int so = Integer.parseInt(sc.nextLine());
                    if (so%3==0 && so%5==0) {
                        System.out.println("So " + so + " chia het cho 3&5");
                    } else {
                        System.out.println("So " + so + " khong chia het cho 3&5");
                    }
                    break;
                case 2:
                    System.out.println("Moi nhap ma sp: ");
                    String ma = sc.nextLine();
                    System.out.println("Moi nhap ten sp: ");
                    String ten = sc.nextLine();
                    System.out.println("Moi nhap gia nhap sp");
                    float gia = Float.parseFloat(sc.nextLine());
                    System.out.println("---IN THONG TIN---");
                    System.out.println("Ma sp la: "+ma);
                    System.out.println("Ten sp la: "+ten);
                    System.out.println("Gia nhap: "+gia);
                    System.out.println("Gia ban: "+gia*115/100);
                    break;
                case 0:
                    System.out.println("0.Thoat!!!");
                    System.exit(0);
                    
                default:
                    System.out.println("Moi chon lai!!!");;
            }
        } while (luaChon!=0);
    }
}
