/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_8;

/**
 *
 * @author Huyen
 */
//lớp Sinh viên
public class SinhVien {
    //1. thuộc tính: MSV, Họ tên, Giới tính, Ngày sinh, Ngành học,Kỳ, Điểm
    //=> private tất cả thuộc tính
    private String MSV;
    private String hoTen;
    private boolean gioiTinh;
    private String ngaySinh;
    private String nganhHoc;
    private int kyHoc;
    private double diem;
    //2. Hàm khởi tạo Constructor
    // Cách 1:(ctrl cách enter) x2 lần
    //Cách 2: Click chuột phải -> Insert Code -> Constructor
    //-> Select None và Select All => Generrate
    
    //Constructor không tham số
    public SinhVien() {
    }
    //Constructor có tham số
    public SinhVien(String MSV, String hoTen, boolean gioiTinh, String ngaySinh, String nganhHoc, int kyHoc, double diem) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.nganhHoc = nganhHoc;
        this.kyHoc = kyHoc;
        this.diem = diem;
    }
    //3. Getter & Setter
    //Click chuột phải => Insert Code -> Getter and Setter -> Sellect All
    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    //4.Phương thức In thông tin
    //toString()
    //Click chuột phải => Insert Code => toString() => Generate

    @Override
    public String toString() {
        return "SinhVien{" + "MSV=" + MSV + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", nganhHoc=" + nganhHoc + ", kyHoc=" + kyHoc + ", diem=" + diem + '}';
    }
    
    public void inThongTin(){
        System.out.println(toString());
    }
    
    
    
    
}
