/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_13;

/**
 *
 * @author Huyen
 */
//
public class TraSua {

    //id– int, hang–String, gia– double– , size- int (1-M, 2-L), 
    //soLuong-int, hanSuDung-boolean (true-Còn hạn, false- hết hạn)
    private int id;
    private String hang;
    private double gia;
    private int size;
    private int soLuong;
    private boolean hanSuDung;

    public TraSua() {
    }

    public TraSua(int id, String hang, double gia, int size, int soLuong, boolean hanSuDung) {
        this.id = id;
        this.hang = hang;
        this.gia = gia;
        this.size = size;
        this.soLuong = soLuong;
        this.hanSuDung = hanSuDung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public boolean isHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(boolean hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    @Override
    public String toString() {
        return "TraSua{" + "id=" + id + ", hang=" + hang + ", gia=" + gia
                + ", size=" + getValueSize() + ", soLuong=" + soLuong
                + ", hanSuDung=" + getValueHSD() + '}';
    }

    public void inThongTin() {
        System.out.println(toString());
    }

    public String getValueSize() {
        if (size == 1) {
            return "M";
        } else if (size == 2) {
            return "L";
        }
        return null;
    }

    public String getValueHSD() {
        return hanSuDung ? "Còn hạn" : "Hết hạn";
    }
}
