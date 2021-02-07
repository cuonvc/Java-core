import java.util.Arrays;
import java.util.Scanner;

public class baitap24 {

    //ví dụ 1: viết chương trình cho phép nhập vào một mảng các số nguyên sau đó sắp xếp chúng theo thứ tự tăng dần
    //hiển thị ra mảng cả trước và sau khi xếp
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào lượng số nguyên cần sắp xếp: ");
        var n = input.nextInt();

            var numbers = getNumbers(n, input);
            System.out.println("Mảng ban đầu: ");
            showNumbers(numbers);
            Arrays.sort(numbers);
            System.out.println("Mảng sau khi sắp xếp: ");
            showNumbers(numbers);
    }

    /**
     * phương thức hiển thị ra nguyên gốc mảng ban đầu chưa qua chỉnh sửa
     */
    private static void showNumbers(int[] numbers) {
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    /**
     * phương thức nhập vào các phần tử của mảng
     * @param n
     * @param input
     * @return
     */
    private static int[] getNumbers(int n, Scanner input) {
        var number = new int[n];
        for (int i = 0; i <= n -1; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            number[i] = input.nextInt();
        }
        return number;
    }





    //ví dụ 2: viết chương trình nhập vào mảng chứa điểm trung bình của n sinh viên và sắp xếp theo thứ tự giảm dần
    //hiển thị ra mảng trước và sau khi sắp xếp

    //CÁCH 1: sắp xếp bằng hàm có sẵn nhưng chỉ theo thứ tự tăng dần
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Số sinh viên: ");
//        var n = input.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương...");
//        } else {
//            var numbers = getNumbers(n,input);
//            //hiển thị ra danh sách khi chưa sắp xếp
//            System.out.println("Danh sách điểm khi chưa sắp xếp: ");
//            showNumbers(n, numbers);
//            //sắp xếp lại và hiển thị ra
//            Arrays.sort(numbers);
//            System.out.println("Danh sách điểm thi sau khi sắp xếp: ");
//            showNumbers(n, numbers);
//        }
//    }
//
//    /**
//     * phương thức hiển thị ra các phần tử của mảng cả trước và sau khi sắp xếp
//     * @param n số phần tử của mảng
//     * @param numbers danh sách các phần tử
//     */
//    private static void showNumbers(int n, float[] numbers) {
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//    }
//
//    /**
//     * phương thức nhập vào điểm của từng Sv
//     * @param n số sinh viên
//     * @param input đối tượng của Scanner
//     * @return trả về danh sách điểm của các học sinh
//     */
//    private static float[] getNumbers(int n, Scanner input) {
//        var number = new float[n];
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.println("Điểm của sinh viên thứ " + (i + 1));
//            number[i] = input.nextFloat();
//        }
//        return number;
//    }

    //CÁCH 2: tự viết hàm sắp xếp giảm dần
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Số sinh viên: ");
//        var n = input.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương...");
//        } else {
//            var numbers = getNumbers(n, input);
//            //hiển thị danh sách khi chưa sắp xếp
//            System.out.println("Danh sách điểm khi chưa sắp xếp: ");
//            showResult(numbers);
//            //tự gọi ra và viết phương thức sắp xếp
//            edit(numbers);
//            //hiên thị ra danh sách khi đã được sắp xếp
//            System.out.println("Danh sách điểm thi khi được sắp xếp: ");
//            showResult(numbers);
//
//        }
//    }
//
//    /**
//     * phương thức sắp xếp lại thứ tự điểm từ cao đến thấp
//     * @param numbers danh sách điểm
//     */
//    private static void edit(float[] numbers) {
//        for (int i = 0; i <= numbers.length - 2; i++) {
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
//     * phương thức hiển thị ra danh sách điểm khi chưa sắp xếp và đã sắp xếp
//     * @param numbers danh sách điểm
//     */
//    private static void showResult(float[] numbers) {
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//    }
//
//    /**
//     * phương thức nhập vào điểm của từng Sv
//     * @param n số sinh viên
//     * @param input đối tượng của Scanner
//     * @return trả về danh sách điểm của các sinh viên
//     */
//    private static float[] getNumbers(int n, Scanner input) {
//        var number = new float[n];
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.print("Điểm của sinh viên thứ " + (i + 1) + ": ");
//            number[i] = input.nextFloat();
//            if (number[i] < 0 || number[i] > 10) {
//                System.out.println("Nhập lại điểm của sinh viên thứ " + (i + 1));
//                i--;
//            }
//        }
//        return number;
//    }






    //ví dụ 3: viết chương trình sắp xếp mảng nguyên n phần tử theo thứ tự tăng dần. tìm giá trị lớn thứ hai và
    //liệt kê ra tất cả các vị trí của giá trị này trong mảng
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập số phần tử của mảng: ");
//        var n = input.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương: ");
//        } else {
//            var numbers = getNumbers(n, input);
//            //hiển thị ra mảng khi chưa edit
//            System.out.println("Mảng khi chưa sắp xếp: ");
//            showList(numbers);
//            //sắp xếp lại mảng thoe thứ tự tăng dần
//            Arrays.sort(numbers);
//            //hiển thị ra danh sách sau khi edit
//            System.out.println("Mảng sau khi sắp xếp: ");
//            showList(numbers);
//
//            //gọi ra phương thức tìm giá trị max2
//            int max2 = findMax2(numbers);
//            //gọi ra phương thức hiển thị max2
//            showMax2(max2, numbers);
//
//        }
//    }
//
//    /**
//     * phương thức hiển thị ra giá các trị lớn thứ hai và chỉ số của chúng
//     * @param max2 giá trị lớn thứ hai
//     * @param numbers số phần tử trong mảng
//     */
//    private static void showMax2(int max2, int[] numbers) {
//        System.out.println("Giá trị lớn thứ 2 trong mảng là: " + max2);
//        System.out.print("Chỉ số của nó là: ");
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            if (numbers[i] == max2) {
//                System.out.print(i + 1);
//            }
//        }
//    }
//
//
//    /**
//     * phương thức tìm giá trị lớn thứ hai nếu có
//     * @param numbers mảng chứa các phần tử số
//     * @return giá trị max thứ 2 hoặc giá trị max nhất
//     */
//    private static int findMax2(int[] numbers) {
//        int max1 = numbers[numbers.length - 1];  //max1 = giá trị cuối của mảng vì các phần tử cảu mảng đó đã đc sắp xếp tăng dần nên giá trị cuói sẽ là lớn nhất
//        //bắt đầu tìm max2
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            if (numbers[i] != max1) {
//                return numbers[i];
//            }
//        }
//        return max1;  //nếu numbers[i] = max1 thì in trả về max 1
//    }
//
//    /**
//     * phương thức hiển thị ra danh sách các phần tử của mảng trước và sau khi sắp xếp
//     * @param numbers danh sách chứa các phần tử
//     */
//    private static void showList(int[] numbers) {
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            System.out.print(numbers[i] +  " ");
//        }
//        System.out.println();
//    }
//
//    /**
//     * phương thức nhập vào các thành phần của mảng
//     * @param n số phần tử
//     * @param input đối tượng của Scanner
//     * @return danh sách các phần tử của mảng
//     */
//    private static int[] getNumbers(int n, Scanner input) {
//        var number = new int[n];
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
//            number[i] = input.nextInt();
//            if (number[i] < 0 ) {
//                System.out.println("Nhập lại phần tử thứ " + (i + 1));
//                i--;
//            }
//        }
//        return number;
//    }







    //ví dụ 4: viết phương thức nhập vào mảng gồm n phần tử theo thứ tự giảm dần. tìm giá trị nhỏ thứ hai
    //rồi liệt kê ra vị trí của các phần tử này
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Số phần tử của mảng là: ");
//        var n = input.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương...");
//        } else {
//            var numbers = getNumbers(n, input);
//            System.out.println("Danh sách các phần tử khi chưa sắp xếp: ");
//            showList(numbers);
//
//            editReduct(numbers);   //gọi phương thức sắp xếp giảm dần
//
//            System.out.println("Danh sách các phần tử theo thứ tự giảm dần: ");
//            showList(numbers);
//
//            int min2 = findMin2(numbers);  //gọi ra phương thức tìm giá trị min2
//
//
//            showMin2(numbers, min2);  //gọi ra phương thức hiển thị giá trị min2 và các vị trí của nó
//
//        }
//    }
//
//    /**
//     * phương thức hiển thị ra giá trị min thứ hai và các vị trí của nó
//     * @param numbers danh sách các thành phần của mảng
//     * @param min2 giá trị min thứ hai cần tìm
//     */
//    private static void showMin2(int[] numbers, int min2) {
//        System.out.println("Giá trị min thứ hai của mảng là: " + min2);
//        System.out.print("Các vị trí của giá trị min thứ hai là: ");
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            if (min2 == numbers[i]) {
//                System.out.println((i + 1) + " ");
//            }
//        }
//    }
//
//    /**
//     * phương thức tìm giá trị min thứ hai và các vị trí của nó
//     * @param numbers danh sách các phần tử của phương thức
//     * @return trả về giá trị min thứ hai
//     */
//    private static int findMin2(int[] numbers) {
//        int min1 = numbers[numbers.length - 1];   //sau khi sắp xếp ở phương thức bên trên thì giá trị nhỏ nhất sẽ nằm cuối của mảng
//        for (int i = numbers.length - 1; i > 0; i--) {
//            if (numbers[i] != min1) {
//                return numbers[i];
//            }
//        }
//        return min1;
//    }
//
//    /**
//     * phương thức sắp xếp lại các thành phần của mảng theo thư tự giảm dần
//     * @param numbers
//     */
//    private static void editReduct(int[] numbers) {
//        for (int i = 0; i <= numbers.length - 2; i++) {
//            for (int j = numbers.length - 1; j > i ; j--) {
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
//     * phương thức hiển thị ra danh sách các phần tử của mảng khi chưa và đã sắp xếp
//     * @param numbers danh sách các thành phần của mảng
//     */
//    private static void showList(int[] numbers) {
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//    }
//
//    /**
//     * phương thức nhập vào các phần tử trong mảng
//     * @param n số phần tử
//     * @param input đối tượng của Scanner
//     * @return trả về giá danh sách các phần tử
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





    //ví dụ 5: viết chương trình thực hiện các công việc sau với một mảng n phần tử các số nguyên:
    /*
    - nửa đầu của mảng sắp xếp theo thứ tự tăng dần
    - nửa sau của mảng sắp xếp theo thứ tự giảm dần
    - hiển thị mảng trước và sau khi sắp xếp
     */
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Số phần tử của mảng: ");
//        var n = input.nextInt();
//
//        if (n % 2 != 0) {
//            System.out.println("Nhập lại một số chẵn: ");
//        } else {
//            var numbers = getNumbers(n, input);
//
//            /**
//             * đây là nửa đầu
//             */
//            System.out.println("Danh sách nửa phần tử đầu của mảng khi chưa sắp xếp là: ");
//            firstHalf(numbers);  //gọi ra phương thức hiển thị nửa đầu của mảng
//            //xem lại
//            Arrays.sort(numbers, 0, numbers.length / 2);  //vì đây là tăng dần nên có thể dùng đến phương thức có sẵn
//            System.out.println("Danh sách nửa phần tử đầu  khi đã sắp xếp tăng dần là: ");
//            firstHalf(numbers);
//
//            /**
//             * đây là nửa sau
//             */
//            System.out.println("Danh sách nửa phần tử cuối của mảng khi chưa sắp xếp là: ");
//            lastHaft(numbers);
//            edit(numbers);  //gọi ra phương thức sắp xếp nửa các phần tử cuối thoe chiều giảm dần
//            System.out.println("Danh sách nữa phần tử cuối khi đã sắp xếp giảm dần là: ");
//            lastHaft(numbers);
//        }
//    }
//
//    /**
//     * phương thức sắp xếp lại nửa số phần tử sau của mảng theo thứ tự giảm dần
//     * @param numbers
//     * @return
//     */
//    private static void edit(int[] numbers) {
//        for (int i = numbers.length / 2; i <= numbers.length - 1; i++) {
//            for (int j = numbers.length - 1; j > i; j--) {
//                if (numbers[j] > numbers[j - 1]) {
//                    int x = numbers[j];
//                    numbers[j] = numbers[j - 1];
//                    numbers[j - 1] = x;
//                }
//            }
//        }
//    }
//
//    /**
//     * phương thức hiển thị ra nửa sau của mảng cả trước và sau khi sắp xếp
//     * @param lNumbers
//     */
//    private static void lastHaft(int[] lNumbers) {
//        for (int i = lNumbers.length / 2; i <= lNumbers.length - 1; i++) {
//            System.out.print(lNumbers[i] + " ");
//        }
//        System.out.println();
//    }
//
//    /**
//     * phương thức hiển thị ra một nửa đầu của mảng trước khi sắp xếp
//     * @param fNumbers nửa đầu phần tử của mảng
//     */
//    private static void firstHalf(int[] fNumbers) {
//        for (int i = 0; i <= (fNumbers.length / 2) - 1 ; i++) {
//            System.out.print(fNumbers[i] + " ");
//        }
//        System.out.println();
//    }
//
//    /**
//     * phương thức nhập vào các phần tử của mảng
//     * @param n số phần tử
//     * @param input đối tượng của Scanner
//     * @return trả về danh sách các phần tử
//     */
//    private static int[] getNumbers(int n, Scanner input) {
//        var number = new int[n];
//        for (int i = 0; i <= number.length - 1; i++) {
//            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
//            number[i] = input.nextInt();
//            if (number[i] <= 0) {
//                System.out.println("Nhập lại phần tử thứ " + (i + 1) + ": ");
//            }
//        }
//        return number;
//    }





    //ví dụ 6: viết chương trình tách các từ của một chuỗi kí tự và sắp xếp danh sách theo thứ tự từ a-z
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập chuỗi kí tự: ");
//        var str = input.nextLine();
//        str = str.trim();
//        var words = str.split("\\s+");  //tách các từ riêng lẻ
//        //hiển thị các từ khi chưa sắp xếp
//        System.out.println("Chuỗi khi chưa sắp xếp: ");
//        showWords(words);
//        edit(words);
//        System.out.println("Chuỗi khi đã sắp xếp: ");
//        showWords(words);
//
//    }
//
//    /**
//     * phương thức sắp xếp lại các từ trong chuỗi theo thứ tự alpha be
//     * @param words danh sách các từ trong mảng
//     * @return trả về danh sách các từ theo thứ tự alb
//     */
//    private static void edit(String[] words) {
//        for (int i = 0; i <= words.length - 2; i++) {
//            for (int j = words.length - 1; j > i; j--) {
//                if (words[j].compareTo(words[j - 1]) < 0) {    //str1.CompareTo(str2) tức là so sánh chuỗi 1 và chuỗi 2
//                    var s = words[j];
//                    words[j] = words[j - 1];
//                    words[j - 1] = s;
//                }
//            }
//        }
//    }
//
//    /**
//     * phương thức hiển thị danh sách các từ khi chưa sắp xếp
//     * @param words danh sách các từ
//     */
//    private static void showWords(String[] words) {
//        for (var w: words) {
//            System.out.print(w + " ");
//        }
//        System.out.println();
//    }







    //ví dụ 7: viết chương trình tách các từ của một chuỗi kí tự sau đó sắp xếp chúng theo thứ tự từ z-a
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập chuỗi kí tự: ");
//        var str = input.nextLine();
//        str = str.trim();
//        var words = str.split("\\s+");
//
//        System.out.println("Chuỗi khi chưa sắp xếp: ");
//        showWords(words);
//
//        edit(words);   //sắp xếp các từ theo thứ tự z-a
//
//        System.out.println("Chuỗi khi đã sắp xếp: ");
//        showWords(words);
//    }
//
//    /**
//     * phương thức sắp xếp các từ trong chuỗi
//     * @param words danh sách các từ trong chuỗi
//     * @return trả về chuỗi các từ
//     */
//    private static void edit(String[] words) {
//        for (int i = 0; i <= words.length - 2; i++) {
//            for (int j = words.length - 1; j > i; j--) {
//                if (words[j].compareTo(words[j - 1]) > 0) {
//                    var w = words[j];
//                    words[j] = words[j - 1];
//                    words[j - 1] = w;
//                }
//            }
//        }
//    }
//
//    /**
//     * phương thức hiển thị ra chuỗi khi chưa sắp xếp và đã sắp xếp
//     * @param words dánh sách các từ
//     * @return trả về chuỗi các từ
//     */
//    private static void showWords(String[] words) {
//        for (var w: words) {
//            System.out.print(w + " ");
//        }
//        System.out.println();
//    }
}
