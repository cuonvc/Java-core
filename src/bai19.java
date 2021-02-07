public class bai19 {
    //ví dụ 1: viết phương thức nạp chồng tính tổng hai số, các kiểu cần hỗ trợ là int, long, float, double
    public static void main(String[] args) {

        System.out.println(add(2, 3)); //kiểu int
        System.out.println(add(12345, 6789)); //in ra kiểu long
        System.out.println(add(3.25f, 1.25f)); //in ra kiểu float
        System.out.println(add(3.25, 1.25));  //in ra kiểu double
        //LƯU Ý: nếu 2 tham số mà khác kiểu thì nó sẽ ưu tiên ra kết quả kiểu rộng hơn
        //vd:
        System.out.println(add(3.25f, 1.25));
        //cái này két quả sẽ là kiểu double
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }


    //ví dụ 2: viết phương thức tìm max trong ba số, các kiểu cần hỗ trợ là int, float, long, double
//    public static void main(String[] args) {
//
//        System.out.println("giá trị max của 1; 2; 3 là: " + max(1, 2, 3)); //kiểu int
//        System.out.println("gia trị max cảu 3.2; 4.5, 1.5 là: " + max(3.2f, 4.5f, 1.5f));  //kiểu float
//        System.out.println("giá trị max của 123; 456; 789 là: " + max(123, 456, 789));  //kiểu long
//        System.out.println("giá trị max của 1.4; 3.2; 5.6 là: " + max(1.4, 3.2, 5.6));  //kiểu double
//    }
//
//    public static int max(int a, int b, int c) {
//        var max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        return max;
//    }
//
//    public static long max(long a, long b, long c) {
//        var max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        return max;
//    }
//    public static float max(float a, float b, float c) {
//        var max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        return max;
//    }
//
//    public static double max(double a, double b, double c) {
//        var max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        return max;
//    }
}
