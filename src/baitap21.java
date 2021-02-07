import java.nio.file.LinkPermission;
import java.util.Scanner;

public class baitap21 {
    //ví dụ 1: viết chương trình tính n! nhập vào từ bàn phím bằng đệ quy
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("nhập số nguyên n cần tính giai thừa: ");
        var n = input.nextInt();

        System.out.println(factorial(n));
    }

    public static long factorial(int a) {
        if (a <= 2) {      //điều kiện dừng
            return a;
        } else {
            return factorial(a - 1) * a;
        }
    }





    //ví dụ 2: viết chương trình tìm số Fibonacci bằng đệ quy biết F0 = 0
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập vào một số nguyên n để tính Fn: ");
//        var n = input.nextInt();
//
//        System.out.println("kết quả: " + fibo(n));
//    }
//    public static long fibo(int a) {
//        if (0 <= a && a < 2) {      //điều kiện dừng
//            return a;
//        } else {
//            return fibo(a - 2) + fibo(a - 1);
//        }
//    }







    //ví dụ 3: viết chương trình tính tổng các chữ số của một số nguyên dương bằng đệ quy
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập số nguyên dương: ");
//        var n = input.nextInt();
//
//        System.out.println(sum(n));
//    }
//    public static int sum(int a) {
//        if (a < 10) {      //điều kiện dừng
//            return a;
//        } else {
//           return a % 10 + sum(a / 10);
//        }
//    }





    //ví dụ 4: viết chương trình in ra đảo ngược các chữ số của một số nguyên bằng đệ quy
    //bài này không return được nên phải dùng void và Alt Enter khởi tạo phương thức void
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập vào số nguyên n: ");
//        var n = input.nextInt();
//
//        reVert(n);
//    }
//
//    private static void reVert(int n) {
//        if (n > 0) {  //điều kiện dừng
//            System.out.print(n % 10);
//            reVert(n / 10);
//        }
//    }





    //ví dụ 5: viết chương trình đếm số các chữ số của một số nguyên dương n:
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập số nguyên n: ");
//        var n = input.nextInt();
//
//        System.out.println(count(n));
//
//    }
//    public static int count(int n) {
//        if (n < 10) {   //điều kiện dừng
//            return 1;
//        } else {
//            return 1 + count(n / 10);
//        }
//    }





    //ví dụ 6: viết chương trình tìm chữ số đầu tiên của một số nguyên dương bằng đệ quy
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập vào số nguyên dương n: ");
//        var n = input.nextInt();
//
//        System.out.println("kết quả: " + firstNumber(n));
//    }
//
//    private static int firstNumber(int n) {
//        if (n < 10) {    //điều kiện dừng
//            return n;
//        } else {
//            return firstNumber(n / 10);
//        }
//    }





    //ví dụ 7: viết chương trình in ra các kí tự theo thứ tự ngược lại bằng đệ quy
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập một chuỗi kí tự: ");
//        var str = input.nextLine();
//
//        reVert(str);
//        System.out.println(reVert(str));
//    }
//
//    private static String reVert(String str) {
//        if (str.length() == 0) {   //điều kiện dừng
//            return str;
//        } else {
//            return str.charAt(str.length() - 1) + str;
//        }
//    }
    //XEM LẠI






    //ví dụ 8: viết chương trình tìm UCLN của hai số nguyên dương bằng đệ quy
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập số thứ nhất: ");
//        var a = input.nextInt();
//        System.out.println("nhập số thứ hai: ");
//        var b = input.nextInt();
//
//        System.out.println(UCLN(a, b));
//    }
//
//    private static int UCLN(int a, int b) {
//        if (a == b) {  //điều kiện dừng
//            return a;
//        } else if (a > b){
//            return UCLN(a - b, b);
//        } else {
//            return UCLN(b - a, a);
//        }
//    }








    //ví dụ 9: viết ct tính tổng từ 1 đến n bằng đệ quy
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập số ngyên n: ");
//        var n = input.nextInt();
//
//        System.out.println(add(n));
//    }
//    public static long add(int a) {
//        if (a < 2) {
//            return 1;
//        } else {
//            return add(a - 1) + a;
//        }
//    }







    //ví dụ 10: viết chương trình tính tổng 1 + 1/2 + 1/3 + 1/4 + ... + 1/n bằng đệ quy với n nguyên dương
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập số nguyên n: ");
//        var n = input.nextInt();
//        if (n != 0) {
//            System.out.println("kết quả: "+ add(n));
//        } else {
//            System.out.println("nhập lại n nguyên khác 0: ");
//        }
//
//    }
//    public static double add(int n) {
//        if (n == 1) {
//            return 1;
//        } else {
//            return (1.0 / n) + add((n - 1));
//        }
//    }
}
