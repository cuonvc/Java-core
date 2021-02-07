import javax.swing.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class baitap18 {
    //ví dụ 1: viết phương thức hiển thị chuỗi theo thứ tự ngược lại
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("nhập vào chuỗi kí tự: ");
        var str = input.nextLine();
        //bắt đầu gọi phương thức
        ShowRevert(str);
    }
    //hiển thị phương thức
    private static void ShowRevert(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }



    //ví dụ 2: viết phương thức kiểm tra xem n có phải số thuận nghịch (số đẹp) hay không
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập một số nguyên n lớn: ");
//        var n = input.nextInt();
//        //bắt đầu gọi phương thức
//        var result = Revert(n);
//        //kết luận:
//        //cách 1:
//        System.out.println(result? n + " là số thuận nghịch" : n + " là số không thuận nghịch");
//        //cách 2:
//        Showketqua(result, n);
//    } //dấu móc này là chung cho cả 2 cách
//
//    private static void Showketqua(boolean result, int n) {
//        if (result) {
//            System.out.println(n + " là số thuận nghịch");
//        } else {
//            System.out.println(n + " là số không thuận nghịch");
//        }
//    }
//
//
//    private static boolean Revert(int n) {
//        var dao = 0;
//        var m = n;
//        while (m > 0) {
//            dao = dao * 10 + m % 10;
//            m /= 10;
//        }
//        return dao == n;
//    }



    //ví dụ 3:viết phương thức tìm giá trị nhỏ nhất trong ba số thực
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập vào số thứ nhất: ");
//        var a = input.nextDouble();
//        System.out.println("nhập số thứ hai: ");
//        var b = input.nextDouble();
//        System.out.println("nhập số thứ ba: ");
//        var c = input.nextDouble();
//
//        //gọi phương thức ra
//        var minValue = min(a, b, c);
//        //hiển thị kết quả
//        System.out.println("giá trị nhỏ nhất là: " + minValue);
//
//    }
//
//    private static double min(double a, double b, double c) {
//        double min = a;  //giả sử cho min = a
//        if (min > b) {
//            min = b;
//        }
//        if (min > c) {
//            min = c;
//        }
//        return min;   //trả về kết quả là giá trị min
//    }



    //ví dụ 4: viết phương thức hiển thị số lớn nhất trong ba số thực
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập số thứ nhất: ");
//        var a = input.nextDouble();
//        System.out.println("nhập số thứ hai: ");
//        var b = input.nextDouble();
//        System.out.println("nhập số thứ ba: ");
//        var c = input.nextDouble();
//
//        //gọi ra phương thức
//        var MaxValue = max(a, b, c);
//        //hiển thị ra kết quả
//        System.out.println("giá trị max là: " + MaxValue);
//    }
//
//    private static double max(double a, double b, double c) {
//        double max = a; //ví dụ max = a
//        if (max < b) {
//            max = b;
//        }
//        if (max < c) {
//            max = c;
//        }
//        return max;  //trả về kết quả là giá tị max
//    }




    //ví dụ 5: viết phương thức tìm trung bình cộng của 3 số thực
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập số thứ nhất: ");
//        var a = input.nextInt();
//        System.out.println("nhập số thứ hai: ");
//        var b = input.nextInt();
//        System.out.println("nhập số thứ ba: ");
//        var c = input.nextInt();
//
//        //gọi ra phương thức tìm trung bình cộng
//        var avg = average(a, b, c);
//        //hiển thị ra kết quả
//        System.out.println("trung bình cộng của " + a + ", " + b + ", " + c + " là: " + avg);
//    }
//
//    private static double average(int a, int b, int c) {
//
//        return (1.0 * (a + b + c)) / 3;   //trả về kết quả trung bình
//    }




    //ví dụ 6: viết phương thức hiển thị ra chữ số đầu tiên của một số
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập một số: ");
//        var n = input.nextInt();
//
//        //gọi ra phương thức
//        first(n);
//    }
//    private static void first(int n) {
//        while (n >= 10) {
//            n /= 10;
//        }
//        //hiển thị ra kết quả
//        System.out.println("kết quả: " + n);
//    }




    //ví dụ 7: viết phương thức tính tổng các chữ số của một số nguyên dương
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập một số nguyên dương: ");
//        var n = input.nextInt();
//
//        //gọi ra phương thức
//        var sum = sumDigits(n);
//        //hiển thị kết quả
//        System.out.println("kết quả: " + sum);
//    }
//
//    private static int sumDigits(int n) {
//        var sum = 0;
//        while (n > 0) {
//            sum += n % 10;
//            n /= 10;
//        }
//        return sum;
//    }




    //ví dụ 8: viết phương thức tìm ƯCLN của 2 số nguyên dương
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập số thứ nhất: ");
//        var a = input.nextInt();
//        System.out.println("nhập số thứ hai: ");
//        var b = input.nextInt();
//
//        //gọi ra phương thức
//        grea(a, b);
//    }
//
//    private static void grea(int a, int b) {
//        System.out.print("ƯCLN của " + a + " và " + b + " là: ");
//        if (a > b) {
//            a -= b;
//        } else {
//            b -= a;
//        }
//        System.out.println(a);
//    }





    //ví dụ 9: viết phương thức đếm số từ của một câu nhập vào từ bàn phím
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập câu bạn cần đếm: ");
//        var str = input.nextLine();
//        str = str.trim();
//        str = str.replaceAll("\\s+", " ");
//
//        //gọi ra phương thức
//        countW(str);
//        //in ra kết quả
//        System.out.println("số từ là: " + countW(str));
//    }
//
//    private static int countW(String str) {
//        int count = 0;
//        if (!str.isEmpty()) {
//            count++;
//        }
//            for (int i = 0; i <= str.length() - 1; i++) {
//                if (str.charAt(i) == ' ') {
//                    count++;
//                }
//        }
//        return count;
//    }





    //ví dụ 10: viết phương thức đếm số các kí tự là nguyên âm trong một câu tiếng anh nhập vào từ bàn phím
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập một câu bất kì: ");
//        var str = input.nextLine();
//        str = str.toLowerCase();
//        //gọi ra phương thức
//        countW(str);
//        //kết quả:
//        System.out.println("số nguyên âm là: " + countW(str));
//    }
//
//    private static int countW(String str) {
//        int count = 0;
//        for (int i = 0; i <= str.length() - 1; i++) {
//            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' ||
//                    str.charAt(i) == 'i' || str.charAt(i) == 'u') {
//                count++;
//            }
//        }
//        return count;
//    }




    //ví dụ 11: viết phương thức vẽ hình vuông rỗng và hai đường chéo
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập độ dài cạnh: ");
//        var x = input.nextInt();
//
//        //gọi ra phương thức
//        length(x);
//    }
//
//    private static void length(int x) {
//        for (int i = 1; i <= x; i++) {
//            for (int j = 1; j <= x; j++) {
//                if (i == 1 || j == 1 || i == j || (x + 1) == (i + j) || i == x || j == x) {
//                    System.out.print(" * ");
//                } else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }
//    }





    //ví dụ 12: viết phương thức vẽ tam giác cân vuông góc trên trái
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//
//        //gọi ra phương thức
//        height(h);
//    }
//
//    private static void height(int h) {
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = h; j >= i; j--) {
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("nhập lại chiều cao lớn hơn 0...");
//        }
//    }




    //ví dụ 13: viết phương thức vẽ tam giác cân vuông trên góc phải
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//
//        //gọi ra phương thức
//        height(h);
//    }
//
//    private static void height(int h) {
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= h; j++) {
//                    if (j < i) {
//                        System.out.print("   ");
//                    } else {
//                        System.out.print(" * ");
//                    }
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("nhập lại giá trị dương...");
//        }
//    }





    //ví dụ 14: viết phương thức vẽ tam giác cân vuông góc phải dưới
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//
//        //gọi ra phương thức
//        height(h);
//    }
//
//    private static void height(int h) {
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= h; j++) {
//                    if ((i + j) <= h) {
//                        System.out.print("   ");
//                    } else {
//                        System.out.print(" * ");
//                    }
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("nhập lại giá trị dương...");
//        }
//    }





    //ví dụ 15: viết phương thức vẽ hình tam giác cân đặc chiều cao h
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//
//        //gọi ra phương thức
//        height(h);
//    }
//
//    private static void height(int h) {
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= 2*h - 1; j++) {
//                    if (i + j < h + 1 || j - i > h - 1) {
//                        System.out.print("   ");
//                    } else {
//                        System.out.print(" * ");
//                    }
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("nhập lại giá trị dương...");
//        }
//    }





    //ví dụ 16: viết phương thức vẽ tam giác cân rỗng
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//
//        //gọi ra phương thức
//        height(h);
//    }
//
//    private static void height(int h) {
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= 2*h - 1; j++) {
//                    if (h == i || i + j == h + 1 || h - 1 == j - i) {
//                        System.out.print(" * ");
//                    } else {
//                        System.out.print("   ");
//                    }
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("nhập lại giá trị dương...");
//        }
//    }





    //ví dụ 17: viết phương thức vẽ tam giác đối xứng số
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//
//        //gọi ra phương thức
//        height(h);
//    }
//
//    private static void height(int h) {
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= 2*h - 1; j++) {
//                    if (j < h - i + 1 || j > h + i - 1) {
//                        System.out.print("   ");
//                    } else {
//                        System.out.print(" " + (i - Math.abs(h - j)) + " ");
//                    }
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("nhập lại giá trị dương...");
//        }
//    }





    //ví dụ 18: nhập hai số a < b. viết phương thức liệt kê tất cả các số chính phương trong đoạn [a, b]
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập số thứ nhất: ");
//        var a = input.nextInt();
//        System.out.println("nhập số thứ hai: ");
//        var b = input.nextInt();
//
//        //gọi ra phương thức
//        squarenumber(a, b);
//    }
//
//    private static void squarenumber(int a, int b) {
//        var firstNumber = (int) Math.ceil(Math.sqrt(a));
//        var lastNumber = (int) Math.floor(Math.sqrt(b));
//        //kết quả:
//        for (int i = firstNumber; i <= lastNumber; i++) {
//            System.out.println(i * i);
//        }
//    }







    //ví dụ 19: viết chương trình liệt kê các số có 6 chữ số thỏa mãn
    /*
    a, là số nguyên tố
    b, tổng các chữ số là số nguyên tố
    c, từng chữ số trong số đó là số nguyên tố
     */
//    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 100000; i <= 999999; i++) {
//            if (isPrime(i) && isSumprime(i) && isDigitprime(i)) {
//                System.out.print(i + ", ");
//                count ++;
//                if (count % 10 == 0) {
//                    count = 0;
//                    System.out.println();
//                }
//            }
//        }
//    }
//
//    //isDigitprime: kiểm tra từng chữ số trong số n
//    private static boolean isDigitprime(int n) {
//        while (n > 0) {
//            if (!isPrime(n % 10)) {
//                return false;
//            }
//            n /= 10;
//        }
//        return true;
//    }
//    //isSumprime: kiểm tra tổng các chữ số
//    private static boolean isSumprime(int n) {
//        var sum = 0;
//        while (n > 0) {
//            sum += n % 10;
//            n /= 10;
//        }
//        return isPrime(sum);
//    }
//
//
//    //isPrime: kiểm tra số n có phải là số nguyên tố
//    private static boolean isPrime(int n) {
//       if (n < 2) {
//           return false;
//       }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }


    //ví dụ 20: viết chương trình liệt kê ra các số thuận ngịch có 7 chữ số thỏa mãn
    /*
    a, là số thuận ngịch
    b, chứa chữ số 8
    c, tổng các chữu số không chia hết cho 9
     */
//    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 1000000; i <= 9999999; i++) {
//            if (isprime(i) && isContain8(i) & isDivby9(i)) {
//                System.out.print(i + ", ");
//                count ++;
//                if (count % 10 == 0) {
//                    count = 0;
//                    System.out.println();
//                }
//            }
//        }
//    }
//
//    private static boolean isDivby9(int n) {
//        int sum = 0;
//        while (n > 0) {
//            if (sum % 9 == 0) {
//                sum += n % 10;
//                return true;
//            }
//            n /= 10;
//        }
//        return false;
//    }
//
//    //iscontain8: ktra chứa chữ số 8
//    private static boolean isContain8(int n) {
//        while (n > 0) {
//            if (n % 10 == 8) {
//                return true;
//            }
//            n /= 10;
//        }
//        return false;
//    }
//
//    //isprime: ktra là số thuận nghịch
//    private static boolean isprime(int n) {
//        var dao = 0;
//        var m = n;
//        while (m > 0) {
//            dao = dao * 10 + m % 10;
//            m /= 10;
//        }
//        return dao == n;
//    }
}
