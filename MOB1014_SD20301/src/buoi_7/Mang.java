/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_7;

/**
 *
 * @author Huyen
 */
public class Mang {
    //main tab
    /*
         * Phần 1: Mảng 1 chiều
         *
         *  1. Định nghĩa: Mảng dùng để lưu trữ nhiều phần tử có cùng kiểu dữ liệu (Biến dùng để lưu trữ 1 giá trị có cùng kiểu dữ liệu).
         *          - Để truy xuất (để lấy giá trị) các phần tử thì cần phải biết chỉ số(index). Index là số nguyên và bắt đầu từ 0 1 2 3....
         *
         *  2. Khai báo 1 mảng trong JAVA:
         *          - Cách 1:
         *              <Kiểu dữ liệu>[] arr<Tên Mảng>; || <Kiểu dữ liệu> arr<Tên Mảng>[];
         *              arr<Tên Mảng> = new <Kiểu dữ liệu>[length];//Khởi tạo mảng có kích thước.
         *          - Cách 2: 
         *              <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[length];
         *
         *          - Cách 3:
         *     <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[] {value1,value2..,valuen};//Khởi tạo mảng kiểu tường minh.
         *
         *     
         *
         *  3. Truy xuất các phần tử trong mảng
         *      - Gán giá trị cho mảng:
         *           <tên mảng>[index] = Giá trị cần gán.
         *   
         *     - Lấy giá trị trong mảng:
         *          <tên mảng>[index] = Giá trị của mảng tại vị trí.
         *      Lưu ý: Để lấy nhiều giá trị trong mảng xuất ra cần sử dụng vòng lòng.
         *
         *  4. Kích thước hoặc độ dài của mảng sử dụng thuộc tính length.
         *      <tên mảng>.length = kích thước mảng có kiểu số nguyên
   */
    public static void main(String[] args) {
        //1. Khai báo & khởi tạo
        int[] arrMSV; //khai báo mảng
        arrMSV = new int[5];//khởi tạo mảng có kích thước = 5
        //2. Gán giá trị
        arrMSV[0]= 111;
        arrMSV[1]= 222;
        arrMSV[2]= 333;
        arrMSV[3]= 444;
        arrMSV[4]= 555;
        //3. Truy xuất giá trị
        //sout + tab
        System.out.println("arrMSV[0] = "+ arrMSV[0]);
        System.out.println("Độ dài mảng= "+ arrMSV.length);
        //4. Duyệt mảng => sử dụng vòng lặp for
        //for + tab
        System.out.println("----Duyệt mảng----");
        for (int i = 0; i < arrMSV.length; i++) {
            System.out.println("arrMSV["+i+"]= "+  arrMSV[i]);
        }
        
        //khai báo & khởi tạo 1 mảng họ tên gồm 5 phần tử-> IN
        //Khởi tạo mảng kiểu tường minh.
        String [] arrHoTen = 
                new String[]{"Hoa","Trang","Ngoc","Anh","Lan"};
        System.out.println("----Mang Ho Ten----");
        for (int i = 0; i < arrHoTen.length; i++) {
            System.out.println("SV thu "+ i +" la: "+ arrHoTen[i]);        
        }
        //for each
        // fore + tab
        for (String hoTen : arrHoTen) {
            System.out.println("Ho ten: "+ hoTen);
        }
        //khai báo & khởi tạo 1 mảng điểm
        int arrDiem[] = new int []{8,5,10,2,9,7};
        //duyệt mảng theo 2 cách
        
        //sắp xếp mảng tăng dần => sử dụng array.sort
    }
}
