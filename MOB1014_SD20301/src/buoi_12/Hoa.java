/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_12;

/**
 *
 * @author Huyen
 */
public class Hoa {
    //1. id, tên, màu sắc, giá, số lượng
    private int id;
    private String ten;
    private String mauSac;
    private double gia;
    private int soLuong;

    public Hoa() {
    }

    public Hoa(int id, String ten, String mauSac, double gia, int soLuong) {
        this.id = id;
        this.ten = ten;
        this.mauSac = mauSac;
        this.gia = gia;
        this.soLuong = soLuong;
    }

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

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "Hoa{" + "id=" + id + ", ten=" + ten + ", mauSac=" + mauSac + ", gia=" + gia + ", soLuong=" + soLuong + '}';
    }
    
    public void inThongTin(){
        System.out.println(toString());
    }
}
