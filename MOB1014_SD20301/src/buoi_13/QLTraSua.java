/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        lstTraSuas.add(new TraSua(6, "Phela", 6000, 1, 4, true));
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
    public void timKiemTheoId() {
        System.out.print("Mời nhập id cần tìm: ");
        int id = Integer.parseInt(sc.nextLine());
        //cách 1:
        for (int i = 0; i < lstTraSuas.size(); i++) {
            if (id == lstTraSuas.get(i).getId()) {
                System.out.println("Đã tìm thấy: ");
                lstTraSuas.get(i).inThongTin();
                return;//thoát luôn khỏi hàm
            }
        }
        //cách 2:fore tab
        for (TraSua ts : lstTraSuas) {
            if (id == ts.getId()) {
                System.out.println("Đã tìm thấy: ");
                ts.inThongTin();
                return;//thoát luôn khỏi hàm
            }
        }
        System.out.println("Không tìm thấy");
    }
    //4. Tìm kiếm đối tượng theo hãng
    public void timKiemTheoHang(){
        System.out.println("Mời nhập hãng cần tìm: ");
        String hang = sc.nextLine();
        int count=0;
        for (int i = 0; i < lstTraSuas.size(); i++) {
            if(lstTraSuas.get(i).getHang().equalsIgnoreCase(hang)){
                lstTraSuas.get(i).inThongTin();
                count++;//nếu tìm thấy thì tăng count lên 1 đơn vị0
            }
        }
        if(count ==0){
            System.out.println("Không tìm thấy!!");
        }
    }
    //cách 2:
    public void timKiemTheoHang2(){
        System.out.println("Mời nhập hãng cần tìm: ");
        String hang = sc.nextLine();
        ArrayList<TraSua> list= new ArrayList<>();
        for (int i = 0; i < lstTraSuas.size(); i++) {
            if(lstTraSuas.get(i).getHang().equalsIgnoreCase(hang)){
                list.add(lstTraSuas.get(i));
                //nếu tìm thấy thì thêm đối tượng vào list mới
            }
        }
        if(list.isEmpty()){//list.size() ==0 <=> list trống
            System.out.println("Không tìm thấy!!");
        }else{
            System.out.println("Đã tìm thấy");
            for (TraSua ts : list) {
                ts.inThongTin();
            }
        }
    }
    //5. Sửa thông tin giá của đối tượng theo id
    public void suaThongTin(){
        System.out.println("Mời nhập id cần tìm để sửa:");
        int id= Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lstTraSuas.size(); i++) {
           if( id == lstTraSuas.get(i).getId()){
                lstTraSuas.get(i).inThongTin();
                System.out.println("Mời nhập giá cần sửa: ");
                double gia= Double.parseDouble(sc.nextLine());
                lstTraSuas.get(i).setGia(gia);//cập nhật giá
                lstTraSuas.get(i).inThongTin();
                return;
           }
        }
        System.out.println("Không tìm thấy!!!");
    }
    //8. Xóa đối tượng theo id
    public void xoa(){
        System.out.println("Mời nhập id cần tìm để xóa:");
        int id= Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lstTraSuas.size(); i++) {
           if( id == lstTraSuas.get(i).getId()){
                lstTraSuas.remove(i);
                System.out.println("Danh sách sau khi xóa:");
                xuat();
                return;
           }
        }
        System.out.println("Không tìm thấy!!!");
    }
    //9. Sắp xếp danh sách tăng dần theo số lượng
    public void sapXep(){
        //import java.util.Collections;
        //Comparator<TraSua>): đặt con trỏ chuột giữa > và ) 
        //=> sử dụng tổ hợp phím ctrl cách 
        //=> tự động override lại compare()
        //cách 1:
        Collections.sort(lstTraSuas, new Comparator<TraSua>() {
            @Override
            public int compare(TraSua o1, TraSua o2) {
                //Sắp xếp danh sách tăng dần theo số lượng
                //return Integer.compare(o1.getSoLuong(), o2.getSoLuong());
                //Sắp xếp danh sách giảm dần theo số lượng
                //return Integer.compare(o2.getSoLuong(), o1.getSoLuong());
                //Sắp xếp danh sách tăng dần theo tên hãng: a-z
                return o1.getHang().compareTo(o2.getHang());
                
            }
        });
        
        //cách 2: sử dụng lambda expression
        //Collections.sort(lstTraSuas, (TraSua o1, TraSua o2) -> Integer.compare(o1.getSoLuong(), o2.getSoLuong()));
        //đảo ngược lại list
        //Collections.reverse(lstTraSuas);
        xuat();
    }
}
