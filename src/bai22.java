import java.util.Scanner;

public class bai22 {
    //ví dụ về cách khai báo mảng và coppy mảng
//    public static void main(String[] args) {
//        String[] brands = new String[] {"Apple", "Huawei", "Samsung", "Nokia"};
//        var other = Arrays.copyOf(brands, 4);
//        other[3] = "Xiaomi";
//        System.out.println(brands[3]);
//        System.out.println(other[3]);
//    }


    //ví dụ về Foreach. khi nào thì dùng for, khi nào thì dùng foreach ??
//    public static void main(String[] args) {
//        String[] brands = new String[] { "Apple", "Huawei", "Samsung", "Nokia"};
//        for (int i = 0; i <= brands.length - 1; i++) {
//            System.out.println(brands[i]);
//            System.out.println(brands[i] + "abcxyz"); //đây là sự khác biệt về sự thay đổi giá trị trong mảng
//            //điều mà fori làm được còn foreach thì không
//        }
//        //kết luận: vòng fori thường có thể dùng để thay đổi giá trị của từng phần tử trong mảng
//        //và dùng khi nếu muốn chạy chỉ một đoạn của mảng chứ ko chạy hết
//
//        for (var item: brands ) {
//            System.out.println(item);
//        }
//        //kết luận: còn vòng lặp foreach dùng khi ta chỉ cần nó chạy hét ừ đầu đén cuối mảng chứ ko cần biết chạy từ đâu đến đâu như fori
//        //còn nữa là foreach không thể thay đổi được các giá trị trong mảng như fori
//    }

    //ví dụ 1: nhập vào danh sách n người bạn và lưu vào mảng. hiển thị ra người có tên dài nhát
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("nhập số lượng người bạn của bạn: ");
        var n = input.nextInt();

        if (n < 0) {
            System.out.println("vui lòng nhập số lượng là một số nguyên dương...");
        } else {
            var friends = getFriends(n, input); // khai báo phương thức(kiểu mảng) hiển thị ra yêu cầu nhập từng tên của từng người trong mảng
            var maxLength = findMaxLength(friends);  // khai báo phương thức tìm ra những thằng có tên dài nhất và bằng nhau
            showResult(friends, maxLength);  // khi báo phương thức hiển thị ra màn hình kết quả những người có tên dài nhất
        }
    }



    /**
     * phương thức hiển thị ra tên của những người dài nhất
     * @param friends danh sách những người có tên dài nhất
     * @param maxLength độ dài tên cảu người có tên dài nhất
     */
    private static void showResult(String[] friends, int maxLength) {
        System.out.println("những bạn có tên dài nhất là: ");
        for (var name: friends) {
            if (name.length() == maxLength) {
                System.out.print(name + "; ");
            }
        }
    }

    /**
     * phương thức tìm ra những thằng có tên dài nhất và bằng nhau
     * @param friends danh sách tên của những người tên dài nhất
     * @return độ dài lớn nhất tìm được
     */
    private static int findMaxLength(String[] friends) {
        var max = 0;
        for (int i = 0; i <= friends.length - 1; i++) {
            if (friends[i].length() > max) {
                max = friends[i].length();
            }
        }
        return max;
    }

    /**
     * phương thức hiển thị ra yêu cầu lần lượt nhập tên các người bạn
     * @param n số lượng người cần nhập
     * @param input đối tượng của lớp Scanner
     * @return nhận vào tên của các người bạn (mảng là danh sách đó)
     */
    private static String[] getFriends(int n, Scanner input) {   //gọi ra phương thức nhưng đây là phương thức kiểu mảng
        var friend = new String[n];  //khai báo mảng
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("nhập tên người bạn thứ " + (i + 1) + ":");
            friend[i] = input.next();
        }
        return friend;
    }













    //ví dụ 2: Cho mảng nguyên n > 0 phần tử nhập vào từ bàn phím. Liệt kê các số nguyên tố trong mảng này.
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập số giá trị cần kiểm tra: ");
//        var n = input.nextInt();
//        if (n <= 0) {
//            System.out.println("nhập lại giá trị nguyên dương...");
//        } else {
//            var numbers = getNUmbers(n, input);
//            var findIsPrime = isPrime(n);
//            showResult(numbers);
//        }
//    }
//
//    /**
//     * phương thức hiển thị ra danh sách các số nguyên tố
//     * @param numbers mảng chứa những số đó
//     */
//    private static void showResult(int[] numbers) {
//        System.out.println("danh sách các số nguyên tố có trong mảng là: ");
//        for (int i = 0; i < numbers.length; i++) {
//            if (isPrime(numbers[i])) {
//                System.out.print(numbers[i] + "; ");
//            }
//        }
//    }
//
//    /**
//     * phuogw thức tìm ra các số nguyên tố trong mảng numbers
//     * @param n các số có trong mảng numbers
//     * @return trả về giá trị của những số nguyên tố
//     */
//    private static boolean isPrime(int n) {
//        if (n < 2) {
//            return false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if (n % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }
//    }
//
//    /**
//     * phương thức gọi ra danh sách những số cần nhập vào mảng numbers
//     * @param n tất cả các số mà ta nhập
//     * @param input đầu vào
//     * @return
//     */
//    private static int[] getNUmbers(int n, Scanner input) {
//       var number = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("nhâp số thứ " + (i + 1));
//            number[i] = input.nextInt();
//        }
//        return number;
//    }


}
