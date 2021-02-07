import java.nio.file.LinkPermission;
import java.util.Scanner;

public class baitap19 {

    //ví dụ 1: viết phương thức nạp chồng thực hiện chức năng tính tích hai số. các kiểu cần hỗ trợ là:
    //int, long, float, double
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("nhập vào số thứ nhất kiểu int: ");
        var iNumber1 = input.nextInt();
        System.out.println("nhập vào số thứ hai kiểu int: ");
        var iNumber2 = input.nextInt();
        System.out.println("kết quả của " + iNumber1 + " nhân " + iNumber2 + " là: " + prod(iNumber1, iNumber2));
        System.out.println("==============================================");
        System.out.println("nhập vào số thứ nhất kiểu long: ");
        var lNumber1 = input.nextLong();
        System.out.println("nhập vào số thứ hai kiểu long: ");
        var lNumber2 = input.nextLong();
        System.out.println("kết quả của " + lNumber1 + " nhân " + lNumber2 + " là: " + prod(lNumber1, lNumber2));
        System.out.println("===============================================");
        System.out.println("nhập vào số thứ nhất kiẻu float: ");
        var fNumber1 = input.nextFloat();
        System.out.println("nhập vào số thứ hai kiểu float: ");
        var fNumber2 = input.nextFloat();
        System.out.println("kết quả của " + fNumber1 + " nhân " + fNumber2 + " là: " + prod(fNumber1, fNumber2));
        System.out.println("================================================");
        System.out.println("nhập vào số thứ nhất kiểu double: ");
        var dNumber1 = input.nextDouble();
        System.out.println("nhập vào số thứ hai kiểu double: ");
        var dNUmber2 = input.nextDouble();
        System.out.println("kết quả của " + dNumber1 + " nhân " + dNUmber2 + " là: " + prod(dNumber1, dNUmber2));
    }

    public static int prod(int a, int b) {
        return a * b;
    }

    public static long prod(long a, long b) {
        return a * b;
    }

    public static float prod(float a, float b) {
        return a * b;
    }

    public static double prod(double a, double b) {
        return a * b;
    }





    //ví dụ 2: viết phương thức nạp chồng tính trung bình cộng của hai số nhập từ bàn phím, các kiểu cần hôc trợ là:
    //int, long, float, double
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//
//        System.out.println("nhập hai số a và b kiểu int: ");
//        var iNumber1 = input.nextInt();
//        var iNumber2 = input.nextInt();
//        System.out.println("kết quả trung bình cộng của " + iNumber1 + " và " + iNumber2 + " là: "
//                + average(iNumber1, iNumber2));
//
//        System.out.println("nhập hai số a và b kiểu long: ");
//        var lNumber1 = input.nextLong();
//        var lNumber2 = input.nextLong();
//        System.out.println("kết quả trung bình cộng của " + lNumber1 + " và " + lNumber2 + " là: "
//                + average(lNumber1, lNumber2));
//
//        System.out.println("nhập hai số a và b kiểu float: ");
//        var fNumber1 = input.nextFloat();
//        var fNumber2 = input.nextFloat();
//        System.out.println("kết quả trung bình cộng của " + fNumber1 + " và " + fNumber2 + " là: "
//                + average(fNumber1, fNumber2));
//
//        System.out.println("nhập hai số a và b kiểu double: ");
//        var dNumber1 = input.nextDouble();
//        var dNumber2 = input.nextDouble();
//        System.out.println("kết quả trung bình cộng của " + dNumber1 + " và " + dNumber2 + " là: "
//                + average(dNumber1, dNumber2));
//    }
//
//    public static double average(int a, int b) {  //kiểu số nguyên cần ép sang kiểu số thực để có kq chính xác
//        return (a + b) * 1.0 / 2;
//    }
//    public static double average(long a, long b) {   //kiểu số nguyên cần ép sang kiểu số thực để có kq chính xác
//        return (a + b) * 1.0 / 2;
//    }
//
//    public static  float average(float a, float b) {
//        return (a + b) / 2;
//    }
//
//    public static double average(double a, double b) {
//        return (a + b) / 2;
//    }






    //ví dụ 3: viết phương thức nạp chồng tìm min trong 3 số nhập từ bàn phím. các kiểu cần hỗ trợ là:
    // int, long, float, double
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập ba số kiểu int: ");
//        var iNumber1 = input.nextInt();
//        var iNumber2 = input.nextInt();
//        var iNumber3 = input.nextInt();
//        System.out.println("kết quả là: " + numberMin(iNumber1, iNumber2, iNumber3));
//
//        System.out.println("nhập ba số kiểu long: ");
//        var lNumber1 = input.nextLong();
//        var lNumber2 = input.nextLong();
//        var lNumber3 = input.nextLong();
//        System.out.println("kết quả là: " + numberMin(lNumber1, lNumber2, lNumber3));
//
//        System.out.println("nhập ba số kiểu float: ");
//        var fNumber1 = input.nextFloat();
//        var fNumber2 = input.nextFloat();
//        var fNumber3 = input.nextFloat();
//        System.out.println("kết quả là: " + numberMin(fNumber1, fNumber2, fNumber3));
//
//        System.out.println("nhập ba số kiểu double: ");
//        var dNumber1 = input.nextDouble();
//        var dNumber2 = input.nextDouble();
//        var dNumber3 = input.nextDouble();
//        System.out.println("kết quả là: " + numberMin(dNumber1, dNumber2, dNumber3));
//
//    }
//
//    public static int numberMin(int a, int b, int c) {
//        var min = a;
//        if (b < min) {
//            return min = b;
//        }
//        if (c < min) {
//            return min = c;
//        }
//        return min;
//    }
//
//    public static long numberMin(long a, long b, long c) {
//        var min = a;
//        if (b < min) {
//            return min = b;
//        }
//        if (c < min) {
//            return min = c;
//        }
//        return min;
//    }
//
//    public static float numberMin(float a, float b, float c) {
//        var min = a;
//        if (b < min) {
//            return min = b;
//        }
//        if (c < min) {
//            return min = c;
//        }
//        return min;
//    }
//
//    public static double numberMin(double a, double b, double c) {
//        var min = a;
//        if (b < min) {
//            return min = b;
//        }
//        if (c < min) {
//            return min = c;
//        }
//        return min;
//    }





    //ví dụ 4: Viết phương thức tìm max (t tự bài trên )
    //ví dụ 5: viết phương thức nạp chồng tìm tổng của 2 số nhập vào từ bàn phím, các kiểu nhập vào là:
    /*
    string
    string, in
    string, float
    string, long
    string, double
    string, int, int, int
    string, long, long, long
    string, float, float, float
    string, double, double, double
     */
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//
//        System.out.println("nhập vào hai số nguyên: ");
//        var iNumber1 = input.nextLong();
//        var iNumber2 = input.nextLong();
//        //gọi ra phương thức có một tham số
//        showResult ("kết quả của " + iNumber1 + " và " + iNumber2 + " là: " + (iNumber1 + iNumber2));
//        //gọi ra phương thức có hai tham số
//        showResult("kết quả của " + iNumber1 + " và " + iNumber2 + " là: ", (iNumber1 + iNumber2));
//        //gọi ra phương thức có 4 tham số
//        showResult("kết quả của: ", iNumber1, iNumber2, (iNumber1 + iNumber2));
//
//        System.out.println("nhập vào hai số thực: ");
//        var dNumber1 = input.nextDouble();
//        var dNumber2 = input.nextDouble();
//        //gọi ra phương thức có một tham số
//        showResult ("kết quả của " + dNumber1 + " và " + dNumber2 + " là: " + (dNumber1 + dNumber2));
//        //gọi ra phương thức có hai tham số
//        showResult ("kết quả của " + dNumber1 + " và " + dNumber2 + " là: ", (dNumber1 + dNumber2));
//        //gọi ra phương thức chứa 4 tham số
//        showResult ("kết quả của: ", dNumber1, dNumber2, (dNumber1 + dNumber2));
//
//
//    }
//
//    //a, phương thức nhận vào một tham số là string
//    private static void showResult(String result) {
//        System.out.println(result);
//    }
//
//    //b, phương thức nhận vào một tham số kiểu string và một tham số kiểu int
//    private static void showResult(String ketqua, int result) {
//        System.out.println(ketqua + result);
//    }
//
//    //c, phương thức nhập vào một tham số kiểu string và một tham số kiểu float
//    private static void showResult(String ketqua, float result) {
//        System.out.println(ketqua + result);
//    }
//
//    //d, phương thức nhận vào một tham số kiểu string và một tham số kiểu long
//    private static void showResult(String ketqua, long result) {
//        System.out.println(ketqua + result);
//    }
//
//    //e, phương thức nhập vào một tham số kiểu string và một tham số kiểu double
//    private static void showResult(String ketqua, double result) {
//        System.out.println(ketqua + result);
//    }
//
//    //f, phương thức nhập vào một tham số kiểu string và 3 tham số kiểu int
//    private static void showResult(String ketqua, int result1, int result2, int result) {
//        System.out.println(ketqua  + result1 + " + " + result2 + " = " + result);
//    }
//
//    //g, phương thức nhập vào một tham số kiểu string và ba tham số kiểu long
//    private static void showResult(String ketqua, long result1, long result2, long result) {
//        System.out.println(ketqua + result1 + " + " + result2 + " = " + result);
//    }
//
//    //h, phương thức nhập vào một tham số kiểu string và 3 tham số kiểu double
//    private static void showResult(String ketqua, float result1, float result2, float result) {
//        System.out.println(ketqua + result1 + " + " + result2 + " là: " + result);
//    }
//
//    //i, phương thức nhập vào một tham số kiểu string và 3 tham số kiểu double
//    private static void showResult(String ketqua, double result1, double result2, double result) {
//        System.out.println(ketqua + result1 + " + " + result2 + " là: " + result);
//    }





    //ví dụ 6: viết phương thức nạp chồng vẽ hình vuông và HCN bằng các dấu * ra màn hình. trong đó:
    /*
    a, phương thức mặc định không tham số vẽ hình vuông kích thước 5*5
    b, phương thức nhận 1 tham số kiểu nguyên vẽ hình vuông kích thước cho trong tham số
    c, phương thức nhận 2 tham số kiểu nguyên sẽ vẽ HCN kích thước cao*rộng cho trong tham số
     */
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//
//        canh();
//
//        System.out.println("nhập độ dài cạnh hình vuông: ");
//        var x = input.nextInt();
//        canhlong(x);
//
//        System.out.println("nhập độ dài HCN: ");
//        var a = input.nextInt();
//        System.out.println("nhập chiều cao HCN: ");
//        var h =input.nextInt();
//        sodo(a, h);
//    }
//
//    //c, vẽ HCN kích thước nhập từ bàn phím bằng hai tham số int
//    private static void sodo(int a, int h) {
//        for (int i = 1; i <= h; i++) {
//            for (int j = 1; j <= a; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//
//
//    //b, vẽ hình vuông kích thước nhập từ bàn phím bằng một tham số int
//    private static void canhlong(int x) {
//        for (int i = 1; i <= x; i++) {
//            for (int j = 1; j <= x; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//
//
//    //a, vẽ hình vuông 5*5 ko dùng tham số
//    private static void canh() {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }






    //ví dụ 7: viết phương thức nạp chồng đếm số kí tự của chuỗi đầu vào, các kiểu gồm:
    /*
    a, phương thức nhận vào là một số kiểu int
    b, phương thức nhận vào là một số kiểu long
    c, phương thức nhận vào là một kiểu string
     */
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập vào số nguyên kiểu int: ");
//        var n = input.nextInt();
//        System.out.println("số kí tự là: " + number(n));
//
//        System.out.println("nhập vào một số nguyên kiểu long: ");
//        var x = input.nextLong();
//        System.out.println("số kí tự là: " + number(x));
//
////        System.out.println("nhập vào chuỗi kí tự kiểu string: ");
////        var str = input.next();
////        System.out.println("số kí tự là: " + number(str));
//        System.out.println("Nhập chuỗi kí tự: ");
//        var str = input.nextLine();
//        System.out.println("Số kí tự có trong \"" + str + "\": "
//                + length(str));
//    }
//
//    public static int length(String str) {
//        return str.length();
//    }
//
//    private static int number(long x) {
//        var count = 0;
//        while (x > 0) {
//            x /= 10;
//            count ++;
//        }
//        return count;
//    }
//
//    private static int number(int n) {
//        var count = 0;
//        while (n > 0) {
//            n /= 10;
//            count ++;
//        }
//        return count;
//    }
    //false...







    //ví dụ 8: viết phương thức nạp chồng vẽ hình tam giác cân ra màn hình, các biến thể gồm
    /*
    a, phương thức không tham số vẽ hình tam giác cân đặc chiều cao bằng 5
    b, phương thức nhận tham số là một kí tự sẽ vẽ tam giác cân đặc chiều cao h=5 bằng các kí tự nhận được
    c, phương thức nhận vào một giá trị int và một kí tự sẽ vẽ tam giác cân chiều cao cho trong tham số int bằng kí tự trong tham số char
     */

}
