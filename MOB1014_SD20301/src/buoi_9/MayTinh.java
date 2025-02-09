/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_9;

/**
 *
 * @author Huyen
 */
/*
Tạo class MayTinh gồm các thuộc tính
 * - ma: string
 * - hang: string
 * - namSX: int
 * - gia: int
 * - trangThai: int (1- mới, 2- cũ)

*/
public class MayTinh {
    //1. private tât cả thuộc tính
    private String ma;
    private String hang;
    private int namSX;
    private int gia;
    private int trangThai;
    //2. Constructor
    //ctrl cách enter x2 lần
    public MayTinh() {
    }

    public MayTinh(String ma, String hang, int namSX, int gia, int trangThai) {
        this.ma = ma;
        this.hang = hang;
        this.namSX = namSX;
        this.gia = gia;
        this.trangThai = trangThai;
    }
    //3. Getter & Setter
    // Insert code=> Getter and Setter => Select All=> Generate
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    //4. Phương thức in thông tin => toString

    @Override
    public String toString() {
        return "MayTinh{" + "ma=" + ma + ", hang=" + hang 
                + ", namSX=" + namSX + ", gia=" + gia 
                + ", trangThai=" + getValueTrangThai() + '}';
    }
    public void inThongTin(){
        System.out.println(toString());
    }
    public String getValueTrangThai(){
        if(trangThai == 1){
            return "Mới";
        }else if( trangThai == 2){
            return "Cũ";
        }
        return null;
    }
}
