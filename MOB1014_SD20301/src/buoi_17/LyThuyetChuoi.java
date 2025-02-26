/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_17;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class LyThuyetChuoi {

    /*
         * 1. Khai báo chuỗi
         * String s= "...";
         * 
         * 2. Lấy chiều dài chuỗi: str.Length: lấy chiều dài chuỗi
         *
         * 3. So sánh 2 chuỗi
         * Cách 1: sử dụng Equals (có phân biệt chữ hoa và thường khi so sánh)
         * Cách 2: sử dụng EqualsIgnoreCase (không phân biệt chữ hoa và thường khi so sánh)
         *
         * 4. Kiểm tra đầu chuỗi và cuối chuỗi có tồn tại chuỗi cần tìm hay không?
         * Str1.StartsWith & Str1.EndsWith là 2 hàm kiểm tra xem đầu chuỗi hoặc cuối chuỗi có tồn tại ký tự hoặc chuỗi ký tự cần tìm hay không?
         *
         * 5. Kiểm tra sự tồn tại của chuỗi này trong chuỗi khác
         * Str1.Contains(Str2) :Kiểm tra trong chuỗi Str1 có chuỗi Str2 hay không?
         *
         * 6. Tìm vị trí hiển thị của chuỗi
         * Str1.IndexOf("chuỗi"): Vị trí xuất hiện đầu tiên của ký tự "chuỗi" trong Str1.
            Trả về -1 nếu trong Str1 không có ký tự "chuỗi".
         * 7. Tìm vị trí xuất hiện cuối cùng của chuỗi
            Str1.LastIndexOf("chuỗi"): Vị trí xuất hiện cuối cùng của ký tự "chuỗi" trong Str1.
            Trả về -1 nếu trong Str1 không có ký tự "chuỗi".
         * 8.Kiểm tra xem chuỗi 1 có bắt bầu bằng ký tự trong chuỗi 2 không.
            Str1.StartsWith(Str2):Kiểm tra xem chuỗi Str1 có bắt đầu bằng chuỗi Str2 không?
         * 9. Thay thế chuỗi
            Str = Str.Replace(",","."):Thay thế dấu ',' thành dấu '.' trong chuỗi Str.
            Str = Str.Replace("xử lý","hàm chuỗi"):Thay thế chuỗi 'xử lý' thành chuỗi ''hàm chuỗi' trong chuỗi Str
            Thay thế chuỗi đầu tiên được tim thấy và tùy chỉnh số lượng thay thế của chuỗi.
         * 10. Cắt chuỗi con
            Str1 = Str.SubString(4):Tạo chuỗi con từ chuỗi Str bắt đầu từ vị trí 4 đến hết
            Str1 = Str.Substring(0,8): Cắt chuỗi từ vị trí đầu tiên(vị trí 0) đến vị trí số 8, kết quả là 'hàm xử'
         * 11. Tách chuỗi .Split (Chuyển từ chuỗi string sang mảng Array)
            string str="các hàm xử lý chuỗi, xử lý chuỗi trong java";
            string[] arrListStr = str.Split(',');//tách trong chuỗi str trên khi gặp ký tự ','
            kết quả arrListStr[0]='các hàm xử lý chuỗi' và arrListStr[1]='xử lý chuỗi trong c#'
        * 12. Chuyển từ mảng Array sang chuỗi String với String.Join
            Hàm string.join giúp convert chuyển từ mảng array sang chuỗi.
            string[] Array= new string[] { "xử lý", "chuỗi trong", "c#" };
            string str = string.Join(", ", Array);
        * 13. Chuyển chữ hoa sang chữ thường và ngược lại
            Str1 = Str.toLowerCase() :Chuyển chuỗi sang chữ thường
            Str1 = Str.toUpperCase() Chuyển chuỗi sang chữ hoa
        * 14. Cắt hết khoảng trắng ở đầu và cuối.
            Str = Str.Trim() Cắt hết khoảng trắng ở đầu và cuối chuỗi
           
        * 15. Xóa chuỗi
            Str1.Remove(2): Xóa chuỗi Str1 từ vị trí 2 đến hết.
            Str.Remove(4,9) : Xóa 1 chuỗi con trong Str1 có chiều dài là 6. Từ vị trí 4 đến vị trí 9
        * 16. Cắt/Xóa ký tự đặc biệt hay bất kỳ ở đầu và cuối chuỗi.
            Key serch: xóa ký tự cuối cùng hay đầu chuỗi hay bất kỳ trong c#
            Xóa ký tự đặc biệt hay chỉ định bất kỳ ở đầu chuỗi:
            TrimStart(KyTuCanXoa)
            Hàm xóa đầu chuỗi những ký tự hoặc chuỗi ký tự được truyền vào.
            Có thể xóa được cả mảng ký tự cần xóa với
            KyTuCanXoa: là 1 ký tự hoặc 1 mảng ký tự cần xóa
            string MyString = "-Xử lý chuỗi C#";
            string NewString = MyString.TrimStart('-');
            Xóa ký tự đặc biệt hay chỉ định bất kỳ ở cuối chuỗi:
            TrimEnd(KyTuCanXoa)
            Hàm xóa cuối chuỗi những ký tự hoặc chuỗi ký tự được truyền vào.
            Có thể xóa được cả mảng ký tự cần xóa với
            KyTuCanXoa: là 1 ký tự hoặc 1 mảng ký tự cần xóa
     */
 /* REGEX
         * REGEX hoặc Regular Expression 
           hay tiếng Việt được gọi là Biểu thức chính quy, 
         * là một cấu trúc rất mạnh để mô tả một chuỗi theo cách thống nhất chung.

         * 1. Các lớp ký tự Regex
            Regex	Mô tả
            [...]	trả về một ký tự phù hợp
            [abc]	a, b, hoặc c
            [^abc]	Bất kỳ ký tự nào ngoại trừ a, b, hoặc c
            [a-zA-Z]	ký tự chữ a tới z hoặc A tới Z
            [0-9]	ký tự số 0 tới 9
     */
 /* 2. Số lượng ký tự trong Regex
         * Regex	Mô tả	Pattern	Ví dụ
            X?	X xảy ra một hoặc không lần	hellos?	hello, hellos, helloss
            X+	X xảy ra một hoặc nhiều lần	Version \w-\w+	Version A-b1_1
            X*	X xảy ra không hoặc nhiều lần	A*B*C*	AAACC
            X{n}	X chỉ xảy ra n lần	\d{4}	2018, 20189, 201
            X{n,}	X xảy ra n hoặc nhiều lần	\d{4,}	2018, 20189, 201
            X{n,m}	X xảy ra ít nhất n lần nhưng nhỏ hơn m lần	\d{2,3}	2018, 201
     */

 /*3. Ký tự đặc biệt trong Regex
         * Regex	Mô tả
            .	Bất kỳ ký tự nào
            ^	Có 2 cách sử dụng.
                1. Đánh dấu bắt đầu của một dòng, một chuỗi.
                2. Nếuu sử dụng trong dấu [...] thì nó có nghĩa là phủ định.
            $	Đánh dấu Kết thúc của một dòng
            \d	Bất kỳ chữ số nào, viết tắt của [0-9]
            \D	Bất kỳ ký tự nào không phải chữ số, viết tắt của [^0-9]
            \s	Bất kỳ ký tự trống nào (như dấu cách, tab, xuống dòng, ...), viết tắt của [\t\n\x0B\f\r]
            \S	Bất kỳ ký tự trống nào không phải ký tự trống, viết tắt của [^\s]
            \w	Bất kỳ ký tự chữ nào (chữ cái và chữ số) và dấu gạch dưới, viết tắt của [a-zA-Z_0-9]
            \W	Bất kỳ ký tự nào không phải chữ cái và chữ số, viết tắt của [^\w]
            \b	Ranh giới của một từ
            \B	Không phải ranh giới của một từ
         
        \\, \., \$, \^ | đại diện "\", ".", "$", "^"
        
     */
    public static void main(String[] args) {
        //xuLyChuoi();
        //họ và tên chỉ đc chứa ký tự chữ a-zA-Z & dấu cách
        //+ xảy ra 1 hoặc nhiều lần
        //cách 1: ^[a-zA-Z ]+$: đưa luôn dấu cách
        //cách 2:^[a-zA-Z\\s]+$: sử dụng \\s
        String hoVaTen = kiemTraDauVao("ho va ten", "^[a-zA-Z\\s]+$");
        System.out.println("Ho va ten: " + hoVaTen);
        //tuổi chỉ được chứa ký tự số 0-9
        String tuoi = kiemTraDauVao("tuoi", "^[0-9]+$");
        System.out.println("Tuoi: " + tuoi);
        //sdt: bắt đầu là số 0 và có độ dài là 10 số
        String sdt = kiemTraDauVao("SĐT", "^0[1-9][0-9]{8}$");
        System.out.println("SĐT: " + sdt);
        //check MSV: có 2 ký tự đầu là PH, 5 ký tự sau là số
        //check CCCD: có 12 số
        //check Năm sinh: có 4 số
    }

    public static String kiemTraDauVao(String msg, String pattern) {
        Scanner sc = new Scanner(System.in);
        String input;
        //kiểm tra input có hợp lệ hay ko? => sai yêu cầu nhập lại
        do {
            System.out.println("Moi nhap " + msg + ": ");
            input = sc.nextLine();
        } while (!input.matches(pattern));
        return input;
    }

    public static void xuLyChuoi() {
        String hoVaTen = "Nguyen Khanh Huyen";
        System.out.println("Lower case: " + hoVaTen.toLowerCase());
        System.out.println("Upper case: " + hoVaTen.toUpperCase());
        String diaChi = "      Ha Noi     ";
        System.out.println("Dia chi: " + diaChi.trim() + ", Viet Nam");
        String sdt = "0987654321";
        if (sdt.startsWith("0")) {//endsWith tương tự
            System.out.println("SDT bat dau bang so 0");
        }
        if (hoVaTen.toLowerCase().contains("nguyen")) {
            System.out.println("Ten chua tu Nguyen");
        }
        //substring , join về tự thao tác

    }
}
