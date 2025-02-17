/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class QLTraSua {

    Scanner sc = new Scanner(System.in);
    ArrayList<TraSua> lstTraSuas = new ArrayList<>();
    //tạo constructor ko tham số => Ctrl cách enter
    //=> tạo sẵn dữ liệu mặc định -> fake data
    public QLTraSua() {
        lstTraSuas.add(new TraSua(1, "TocoToco", 20000, 1, 5, true));
        lstTraSuas.add(new TraSua(2, "DingTea", 35000, 1, 8, false));
        lstTraSuas.add(new TraSua(3, "Highland", 45000, 2, 3, false));
        lstTraSuas.add(new TraSua(4, "KOI", 80000, 2, 1, true));
        lstTraSuas.add(new TraSua(5, "Phela", 6000, 1, 4, true));
    }
    
    public void nhap() {
        String tiepTuc;
        do {
            //1. khởi tạo đối tượng
            TraSua ts = new TraSua();
            //2. nhập thông tin
            System.out.print("Moi nhap id: ");
            ts.setId(Integer.parseInt(sc.nextLine()));
            System.out.print("Moi nhap hang: ");
            ts.setHang(sc.nextLine());
            System.out.print("Moi nhap gia: ");
            ts.setGia(Double.parseDouble(sc.nextLine()));
            System.out.print("Moi nhap size: ");
            ts.setSize(Integer.parseInt(sc.nextLine()));
            System.out.print("Moi nhap so luong: ");
            ts.setSoLuong(Integer.parseInt(sc.nextLine()));
            System.out.print(" moi nhap han su dung: ");
            ts.setHanSuDung(Boolean.parseBoolean(sc.nextLine()));
            //3. thêm đối tượng vào list
            lstTraSuas.add(ts);
            //4. hỏi tiếp tục?
            System.out.println("bạn có muốn tiếp tục không ?");
            tiepTuc = sc.nextLine();
        } while (tiepTuc.equalsIgnoreCase("co"));
    }

    public void xuat() {
        for (TraSua ts : lstTraSuas) {
            ts.inThongTin();
        }

    }
    //3.  Tìm kiếm đối tượng theo id => kèm vị trí
    public void timKiemTheoId(){
        System.out.print("Mời nhập id cần tìm: ");
        int id =  Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lstTraSuas.size(); i++) {
            if(id == lstTraSuas.get(i).getId()){
                System.out.println("Đã tìm thấy: ");
                lstTraSuas.get(i).inThongTin();
                return;//thoát luôn khỏi hàm
            }
        }
        System.out.println("Không tìm thấy");
    }
}
