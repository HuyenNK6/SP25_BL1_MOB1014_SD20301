/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_16;

/**
 *
 * @author Huyen
 */
public class GiangVien {
    //maGV, ten, boMon, bacLuong
    private String maGV;
    private String ten;
    private String boMon;
    private int bacLuong;

    public GiangVien() {
    }

    public GiangVien(String maGV, String ten, String boMon, int bacLuong) {
        this.maGV = maGV;
        this.ten = ten;
        this.boMon = boMon;
        this.bacLuong = bacLuong;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getBoMon() {
        return boMon;
    }

    public void setBoMon(String boMon) {
        this.boMon = boMon;
    }

    public int getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(int bacLuong) {
        this.bacLuong = bacLuong;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "maGV=" + maGV + ", ten=" + ten + ", boMon=" + boMon + ", bacLuong=" + bacLuong + '}';
    }
    
    
    public void inThongTin(){
        System.out.println(toString());
    }
}
