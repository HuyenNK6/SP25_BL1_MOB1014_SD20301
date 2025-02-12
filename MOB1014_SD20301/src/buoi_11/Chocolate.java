/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_11;

/**
 *
 * @author Huyen
 */
public class Chocolate {
    //1. private thuộc tính: id, ten, hang, gia, khoiLuong
    private int id;
    private String ten;
    private String hang;
    private int gia;
    private double khoiLuong;
    //2. Constructor 

    public Chocolate() {
    }
    public Chocolate(int id, String ten, String hang, int gia, double khoiLuong) {
        this.id = id;
        this.ten = ten;
        this.hang = hang;
        this.gia = gia;
        this.khoiLuong = khoiLuong;
    }
    
    //3. Getter Setter
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    //4. inThongTin()

    @Override
    public String toString() {
        return "Chocolate{" + "id=" + id + ", ten=" + ten + ", hang=" + hang + ", gia=" + gia + ", khoiLuong=" + khoiLuong + '}';
    }
    public void inThongTin(){
        System.out.println(toString());
    }
}
