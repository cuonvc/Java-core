import java.util.Scanner;

public class bai21 {
    //ví dụ 1: tính tổng 1 + 2 + 3 + ... + n bằng phương thức đệ quy
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("nhập vào một số nguyên dương: ");
        var n = input.nextInt();

        System.out.println("kết quả của tổng là: " + add(n));
    }
    public static int add(int n) {
        if (n == 1) {   //lấy khởi tạo n == 1 vì thay n = 1 vào biểu thức ra kết quả là 1
            return 1;
        } else {
            return n + add(n - 1);
        }
    }





    //ví dụ 2: tính giai thừa của một số bằng phương thức đệ quy
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập vào một số nguyên dương: ");
//        var n = input.nextInt();
//
//        System.out.println("kết quả của " + n + "! là: " + result(n) );
//    }
//    public static long result(int n) {  //chọn in ra kiểu long vì đáp án của giai thừa nó tăng rất nhanh nên sẽ ra số cực lớn
//        if (n < 2) {  //chỗ này lấy < 2 vì 0! và 1! đều bằng 1
//            return 1;
//        } else {
//            return n * result(n - 1);
//        }
//    }





    //ví dụ 3: tìm số Fibonacci thứ n. nên thử kết quả với n thuộc [0;90]
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập vào số thứ n cần tính: ");
//        var n = input.nextInt();
//
//        System.out.println("số fibonacci thứ " + n + " là: " + fibo(n));
//    }
//    public static long fibo(int n) {
//        if (n < 2) {
//            return n;
//        } else {
//            return fibo(n - 1) + fibo(n - 2);
//        }
//    }
}
