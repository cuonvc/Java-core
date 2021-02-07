import java.util.Scanner;

public class bai18 {

    //ví dụ 1: kiểm tra xem một số có phải là số nguyên tố hay không
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("nhập vào một giá trị nguyên: ");
        var n = input.nextInt();
        var result = isprime(n)? "là số nguyên tố" : "không là số nguyên tố";  //toán tử 3 ngôi
        System.out.println(result);

    }
    //document cũng là một dạng comment nhưng là kiểu comment có xương sườn. tạo documet bằng cách /** và enter (phần màu xanh)

    /**
     * phương thức kiểm tra xem 1 số có phải là số nguyên tố hay không
     * @param n là giá trị cần kiểm tra
     * @return là kết quả đánh giá. true nếu là số nguyên tố và ngược lại false ko là số nguyên tố
     */
    public static boolean isprime (int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    //ví dụ 2: kiểm tra xem số nhập vào có phải số đẹp hay không
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập vào số nguyên n: ");
//        var n = input.nextInt();
//        var result = isRevert(n);  //ở dòng này, kích chuột vào sau dấu đóng ngoặc tròn và ấn Alt Enter rồi chọn vào dòng màu xanh create...
//        //kết luận: cái kết luận này viết sau cùng
//           //cách kết luận 1:
//        //System.out.println(result? + n + " là số đẹp" : n + " không là số đẹp");
//           //cách kết luận 2: tự gọi phương thức, cách làm giống dòng 39
//        showresult (n, result);
//
//    }
//
//    private static void showresult(int n, boolean result) {
//        if (result) {
//            System.out.println(n + " là số đẹp");
//        } else {
//            System.out.println(n + " không là số đẹp");
//        }
//    }
//
//
//    private static boolean isRevert(int n) {
//        var rev = 0;
//        var m = n;
//        while (m > 0) {
//            rev = rev * 10 + m % 10;
//            m /= 10;
//        }
//        return rev == n;
//    }
}
