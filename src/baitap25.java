import java.util.Arrays;
import java.util.Scanner;

public class baitap25 {
    //ví dụ 1: viết chương trình nhập vào một mảng các số nguyên và một giá trị x. tìm xem x có xuất huện trong mảng không
    //CÁCH 1: tự viết phương thức
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Số phần tử của mảng: ");
        var n = input.nextInt();
        if (n < 0) {
            System.out.println("Nhập lại giá trị nguyên dương...");
        } else {
            var numbers = getNumbers(n, input);

            System.out.println("Danh sách các phần tử trong mảng là: ");
            showList(numbers);

            System.out.println("Giá trị cần tìm là: ");
            var x = input.nextInt();

            var index = getIndex(numbers, x);

            var result = false ?  "Không tồn tại !" : "Có tồn tại";
            System.out.println(result);

        }
    }

    /**
     * phương thức hiển thị các phần tử trong mảng để tiện so sánh
     * @param numbers mảng chứa các phàn tử
     */
    private static void showList(int[] numbers) {
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    /**
     * phương thức tìm kiếm giá trị yêu cầu trả về true hoặc false
     * @param numbers tất cả các giá trị trong mảng
     * @param x giá trị cần tìm
     * @return trả về giá trị cần tìm
     */
    private static boolean getIndex(int[] numbers, int x) {
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] == x) {
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức nhập vào các phần tử của mảng numbers
     * @param n số phần tử
     * @param input đối tượng của Scanner
     * @return trả về giá trị các thành phần của mảng
     */
    private static int[] getNumbers(int n, Scanner input) {
        var number = new int[n];
        for (int i = 0; i <= number.length - 1; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            number[i] = input.nextInt();
            if (number[i] < 0) {
                System.out.println("Nhập lại phần tử thứ " + (i + 1));
                i--;
            }
        }
        return number;
    }

    //CÁCH 2: dùng phương thức có sẵn trong thư viện   ( ĐỂ ĐÓ XEM LẠI )
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Số phần tử của mảng: ");
//        var n = input.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương...");
//        } else {
//            var numbers = getNumbers(n, input);
//
//            System.out.println("Danh sách các phần tử: ");
//            showList(numbers);
//
//            System.out.println("Nhập giá trị cần tìm: ");
//            int x = input.nextInt();
//
//            Arrays.sort(numbers); //sắp xếp các phần tử trước khi cho vào lệnh tìm kiếm phần tử ở bên dưới
//            int index = Arrays.binarySearch(numbers, x);   //gọi ra lệnh tìm kiếm có sẵn trong thư viện
//
//            var result = index = -1 ? "Không tồn tại" : "Có tồn tại";
//
//        }
//    }
//
//
////    /**
////     * phương thức tìm kiếm giá trị yêu cầu trả về true hoặc false
////     * @param numbers tất cả các giá trị trong mảng
////     * @param x giá trị cần tìm
////     * @return trả về giá trị cần tìm
////     */
////    private static boolean getIndex(int[] numbers, int x) {
////        for (int i = 0; i <= numbers.length - 1; i++) {
////            if (numbers[i] == x) {
////                return true;
////            }
////        }
////        return false;
////    }
//
//    /**
//     * phương thức hiển thị ra danh sách các thành phần của mảng
//     * @param numbers mảng chứa các giá trị
//     */
//    private static void showList(int[] numbers) {
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            System.out.print(numbers[i] + "; ");
//        }
//        System.out.println();
//    }
//
//    /**
//     * phương thức nhập vào các phần tử của mảng
//     * @param n số lượng các phần tử
//     * @param input đối tượng của Scanner
//     * @return trả vè danh sách các giá trị của mảng
//     */
//    private static int[] getNumbers(int n, Scanner input) {
//        var number = new int[n];
//        for (int i = 0; i <= number.length - 1; i++) {
//            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
//            number[i] = input.nextInt();
//        }
//        return number;
//    }






    //ví dụ 2: viết chương trình nhập vào một mảng các số nguyên và giá trị x. đếm số lần xuất hiện của x trong mảng

//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Số các phần tử là: ");
//        var n = input.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Nhập lại số nguyên dương n...");
//        } else {
//            var numbers = getNumbers(n, input);
//
//            System.out.println("Danh sách các phần tử trong mảng: ");
//            showList(numbers);
//
//            System.out.println("Nhập giá trị cần tìm: ");
//            var x = input.nextInt();
//
//            var index = reseach(numbers, x);
//
//            System.out.println("Giá trị " + x + " xuất hiện " + index + " lần !");
//        }
//    }
//
//    /**
//     * phương thức xác định giá trị cần tìm và đếm số lần xuất hiện của nó
//     * @param numbers mảng giá trị
//     * @param x giá trị cần tìm
//     * @return trả về số lần xuất hiện của x trong mảng
//     */
//    private static int reseach(int[] numbers, int x) {
//        var count = 0;
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            if (numbers[i] == x) {
//                count ++;
//            }
//        }
//        return count;
//    }
//
//    /**
//     * phương thức hiển thị các phần tử trong mảng
//     * @param numbers danh sách chứa các phần tử
//     */
//    private static void showList(int[] numbers) {
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            System.out.print(numbers[i] + "; ");
//        }
//        System.out.println();
//    }
//
//    /**
//     * phương thức nhập vào các số nguyên của mảng
//     * @param n số phần tử
//     * @param input đối tượng của Scanner
//     * @return trả về giá trị của từng phần tử
//     */
//    private static int[] getNumbers(int n, Scanner input) {
//        var number = new int[n];
//        for (int i = 0; i <= number.length - 1; i++) {
//            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
//            number[i] = input.nextInt();
//        }
//        return number;
//    }






    //ví dụ 3: viết chương trình nhập vào mảng các số nguyên và một giá trị x, nhập thêm 2 giá trị a < b. tìm xem
    // x có xuất hiện trong đoạn [a,b] hay không. nếu có thì bao nhiêu lần
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Số phần tử của mảng là: ");
//        var n = input.nextInt();
//
//        if (n < 2) {
//            System.out.println("Nhập lại giá trị lớn hơn 2...");
//        } else {
//            var numbers = getNumbers(n, input);
//
//            System.out.println("Danh sách các phần tử: ");
//            showList(numbers);
//
//            System.out.println("Nhập khoảng giá trị cần xác định: ");
//            System.out.print("Giá trị đầu - số thứ: ");
//            int a = input.nextInt();
//            System.out.print("Giá trị cuối - số thứ: ");
//            int b = input.nextInt();
//            if (a >= b) {
//                System.out.println("Vui lòng chọn trong khoảng xác đinh...");
//            }
//                System.out.println("Nhập giá trị cần tìm: ");
//                int x = input.nextInt();
//
//                var index = findIndex(a, b, numbers, x);
//
//                System.out.println("Trong đoạn [" + a + ", " + b + "] giá trị " + x + " xuất hiện " + index + " lần");
//
//        }
//    }
//
//    /**
//     * phương thức tìm ra giá trị cần tìm và đếm số lần xuất hiện
//     * @param a đầu
//     * @param b cuối
//     * @return trả về số lần xuất hiện giá trị đó
//     */
//    private static int findIndex(int a, int b, int[] numbers, int x) {
//        var count = 0;
//        for (int i = a; i <= b; i++) {
//            if (numbers[i] == x && i >= 0 && i < numbers.length - 1) {
//                count ++;
//            }
//        }
//        return count;
//    }
//
//    /**
//     * phương thức hiển thị ra các phần tử của mảng
//     * @param numbers
//     */
//    private static void showList(int[] numbers) {
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            System.out.print(numbers[i] + "; ");
//        }
//        System.out.println();
//    }
//
//    /**
//     * phương thức nhập vào các phần tử
//     * @param n số phân tử
//     * @param input đối tượng của Scanner
//     * @return trả về giá trị từng phần tử
//     */
//    private static int[] getNumbers(int n, Scanner input) {
//        var number = new int[n];
//        for (int i = 0; i <= number.length - 1; i++) {
//            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
//            number[i] = input.nextInt();
//            if (number[i] < 0) {
//                System.out.println("Nhập lại phần tử thứ " + (i + 1));
//                i--;
//            }
//        }
//        return number;
//    }







    //ví dụ 4: viết chương tình sắp xếp mảng chứa điểm trung bình hệ 10 của n sinh viên bằng thuật toán quicksort
    //sau đó tìm kiếm bằng thuật toán binarySearch xem có tồn tại sinh viên nào có điểm bằng x hay không, với x nhập từ bàn phím
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.print("Số sinh viên là: ");
//        var n = input.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương...");
//        } else {
//            var AVG = getAVG(n, input);
//
//            System.out.println("Danh sách điểm các sinh viên là: ");
//            showList(AVG);
//
//            System.out.println("Nhập giá trị cần kiểm tra: ");
//            float x = input.nextFloat();
//
//            Arrays.sort(AVG); //sắp xếp thứ tự tăng dần
//            var index = Arrays.binarySearch(AVG, x);   //tìm ra phần tử cần xác định
//
//            if (index < 0) {
//                System.out.println("Không có sinh viên nào có điểm bằng " + x);
//            } else {
//                System.out.println("Có ít nhất sinh viên có điểm bằng " + x);
//            }
//        }
//    }
//
//    /**
//     * phương thức liệt kê ra các phần tử
//     * @param avg danh sách các phần tử
//     */
//    private static void showList(float[] avg) {
//        for (int i = 0; i <= avg.length - 1; i++) {
//            System.out.print(avg[i] + "; ");
//        }
//        System.out.println();
//    }
//
//    /**
//     * phương thức nhập vào các phần tử của mảng
//     * @param n số phần tử của mảng
//     * @param input đối tượng của Scanner
//     * @return trả về danh sách các phần tử
//     */
//    private static float[] getAVG(int n, Scanner input) {
//        var number = new float[n];
//        for (int i = 0; i <= number.length - 1; i++) {
//            System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
//            number[i] = input.nextFloat();
//        }
//        return number;
//    }







    //ví dụ 5: viết ct thực hiện các công việc sau với một mảng n phần tử các số nguyên
     /*
     a, nửa đầu của mảng theo thứ tự tăng dần
     b, nửa sau của mảng theo thứ tự giảm dần
     c, hiển thị mảng trước và sau khi sắp xếp
     d, kiểm tra mảng sau sắp xếp xem có đối xứng hay không. mảng đối xứng nếu với mọi i từ 0 đến n - 1, a[i] = a[n - 1 - i]
      */
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Số phần tử của mảng: ");
//        var n = input.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Nhập lại số nguyên dương...");
//        } else {
//            var numbers = getNumbers(n, input);
//            Arrays.sort(numbers, 0, numbers.length / 2);  //sắp xếp nửa đầu của mảng theo thứ tự tăng dần
//            editNumbers(numbers);  //gọi ra phương thức sắp xếp các phần tử nửa cuối của mảng theo thứ tự giảm dần
//
//            System.out.println("Sau khi sắp xếp");
//            showResult(numbers);
//
//            checkSymmetry(numbers);  //xét tính đối xứng của các phần tử trong mảng sau khi sắp xếp
//
//            if (checkSymmetry(numbers)) {
//                System.out.println("Có đối xứng");
//            } else {
//                System.out.println("Không đối xứng");
//            }
//        }
//    }
//
//    /**
//     * phương thức xét tính đối xứng của các phần tử
//     * @param numbers
//     * @return
//     */
//    private static boolean checkSymmetry(int[] numbers) {
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            if (numbers[i] != numbers[numbers.length - 1 - i]) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    /**
//     * phương thức hiển thị danh sách các phần tử của mảng khi đã được sắp xếp
//     * @param numbers mảng chứa các phần tử
//     */
//    private static void showResult(int[] numbers) {
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            System.out.print(numbers[i] + "; ");
//        }
//        System.out.println();
//    }
//
//    /**
//     * phương thức sắp xếp các phần tử nửa cuối của mảng theo thứ tự giảm dần
//     * @param numbers mảng các phần tử
//     */
//    private static void editNumbers(int[] numbers) {
//        for (int i = numbers.length / 2; i <= numbers.length - 1; i++) {
//            for (int j = numbers.length - 1; j > i; j--) {
//                if (numbers[j] > numbers[j - 1]) {
//                    var x = numbers[j];
//                    numbers[j] = numbers[j - 1];
//                    numbers[j - 1] = x;
//                }
//            }
//        }
//    }
//
//    /**
//     * phương thức nhập vào các phần tử của mảng
//     * @param n số phần tử
//     * @param input đối tượng của Scanner
//     * @return trả về giá trị của các phần tử trong mảng
//     */
//    private static int[] getNumbers(int n, Scanner input) {
//        var number = new int[n];
//        for (int i = 0; i <= number.length - 1; i++) {
//            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
//            number[i] = input.nextInt();
//        }
//        return number;
//    }






    //ví dụ 6: nhập vào danh sách tên sinh viên trong một lớp. tìm xem với mỗi tên có bao nhiêu sinh viên trùng tên
    /* -----------------------------------XEM LẠI-------------------------------------
    b1: nhập số sv
    b2: đếm số lần lặp tên của từng sinh viên
    b3: hiển thị số lần lặp tên của từng sinh viên
     */
//
}
