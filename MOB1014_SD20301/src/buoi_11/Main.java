/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_11;

import java.util.ArrayList;


/**
 *
 * @author Huyen
 */
public class Main {
    public static void main(String[] args) {
        Chocolate c1= new Chocolate(1, "Vani", "VietNam", 15000, 3.5);
        Chocolate c2= new Chocolate(2, "Socola", "TrungQuoc", 10000, 4.2);
        Chocolate c3= new Chocolate(3, "Matcha", "VietNam", 20000, 5.8);
        
        System.out.println("---------IN THÔNG TIN------");
        c1.inThongTin();
        c2.inThongTin();
        c3.inThongTin();
        //1. Khởi tạo ArrayList => import java.util.ArrayList;
        //ArrayList lstChocolates= new ArrayList();
        ArrayList<Chocolate> lstChocolates= new ArrayList<>();
        System.out.println("size= "+ lstChocolates.size());
        //2. thêm đối tượng vào danh sách
        lstChocolates.add(c1);
        lstChocolates.add(c2);
        lstChocolates.add(c3);
        System.out.println("size= "+ lstChocolates.size());
        //3. duyệt danh sách
        //cách 1: for i
        System.out.println("Cách 1: for i");
        for (int i = 0; i < lstChocolates.size(); i++) {
            lstChocolates.get(i).inThongTin();
            //lstChocolates.get(i): 
            //lấy ra đối tượng tại vị trí i trong list
        }
        //cách 2: for each => fore tab
         System.out.println("Cách 2: for each");
        for (Chocolate chocolate : lstChocolates) {
            chocolate.inThongTin();
        }
        
    }
}
