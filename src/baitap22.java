import java.util.Scanner;

public class baitap22 {
    //bài tập mẫu 1: nhập vào danh sách n người bạn và lưu vào mảng, hiển thị ra những người có tên dài nhất
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("nhập số lượng người bạn của bạn: ");
        var n = input.nextInt();

        if (n < 0) {
            System.out.println("nhập lại giá trị nguyên dương...");
        } else {
            var friends = getFriends(n, input);  //gọi ra phương thức mảng để nhập vào danh sách các ngời bạn
            var maxLength = friendMaxLength(friends);   //gọi ra phương thức tìm độ dài lớn nhất trong các tên
            showResult(friends, maxLength);
        }
    }

    /**
     * phương thức in ra màn hình những người có tên dài nhất và bằng nhau
     * @param friends những người có tên dài nhất và bằng nhau đã được liệt kê
     * @param maxLeng độ dài của những người đc in ra
     */
    private static void showResult(String[] friends, int maxLeng) {
        System.out.println("danh sách những người có tênd dài nhất là: ");
        for (var name: friends) {
            if (name.length() == maxLeng) {
                System.out.print(name + "; ");
            }
        }
    }


    /**
     * phương thức tìm ra những cái tên có độ dài dài nhất
     * @param friends tên của những người có độ dài dài nhất và bằng nhau
     * @return chọn ra những người đã liệt kê bên trên
     */
    private static int friendMaxLength(String[] friends) {
        var max = 0;
        for (int i = 0; i <= friends.length - 1; i++) {
            if (friends[i].length() > max) {
                max = friends[i].length();
            }
        }
        return max;
    }

    /**
     * phương thức yêu cầu tạo ra mảng và nhập vào danh sách từng người bạn
     * @param n số người bạn
     * @param input cho phép người dùng nhập tên từng người vào mảng
     * @return danh sách tên của từng người trong mảng
     */
    private static String[] getFriends(int n, Scanner input) {
        var friend = new String[n];  //khai báo mảng
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Nhập tên người thứ " + (i + 1));
            friend[i] = input.next();
        }
        return friend;
    }


    //bài tập mẫu 2: cho mảng nguyên n phần tử nhập vào từ bàn phím. liệt kê tất cả các số nguyên tố trong mảng này
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập vào số phần tử: ");
//        var n = input.nextInt();
//
//        if (n <= 0) {
//            System.out.println("nhập lại giá trị nguyên dương...");
//        } else {
//            var numbers = getNUmbers(n, input);
//            var findIsPrime = isPrime(n);
//            showResult(numbers);
//        }
//    }
//    /**
//     * phương thức hiển thị ra các số là số nguyên tố trong mảng
//     * @param numbers các số được nhập vào
//     */
//    private static void showResult(int[] numbers) {
//        System.out.println("kết quả: ");
//        //method1: fori
//        for (int i= 0; i <= numbers.length - 1; i++) {
//            if (isPrime(numbers[i])) {
//                System.out.print(numbers[i] + "; ");
//            }
//        }
//        //method2: foreach //hiển thị với foreach: cách này chỉ áp dụng khi muốn duyệt một đoạn nào đó trong mảng, còn fori là để
//        //    //duyệt full cả mảng từ đầu đến cuối, như bài này thì nên dùng fori
//        for (var result: numbers) {
//            if (isPrime(result)) {
//                System.out.print(result + "; ");
//            }
//        }
//    }
//    /**
//     * phương thức tìm ra các số nguyen tố có trong mảng
//     * @param n các số có trong mảng number
//     * @return
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
//    /**
//     * phương thức cho người dùng nhập vào mảng từng số
//     * @param n số lượng số cần nhập
//     * @param input đầu vào cho phép người dùng nhập
//     * @return mảng gồm danh sách những số đã nhập
//     */
//    private static int[] getNUmbers(int n, Scanner input) {
//        var number = new int[n];  //khi báo mảng
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.println("nhập vào số thứ " + (i + 1));
//            number[i] = input.nextInt();
//        }
//        return number;
//    }


    //ví dụ 1: nhập vào một mảng số nguyên n gồm phần tử và tính tổng tất cả các số nguyên trong mảng đó
    //tóm tắt 3 bước:
    // B1: viết phương thức cho phép người dùng nhập sữ liệu từ bàn phím
    // B2: viết phương thức tính tổng các số đó
    //B3: viết phương thức in ra kết quả
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập vào số lượng phần tử cần tính: ");
//        var n = input.nextInt();
//
//        if (n <= 0) {
//            System.out.println("vui lòng nhập giá trị nguyên dương...");
//        } else {
//            var numbers = getNumbers(n, input);
//            var sum = add(numbers);
//            shownumbers(numbers);
//            //hiển thị kết quả
//            System.out.println("= " + sum);
//        }
//    }
//
//    /**
//     * phương thức hiển thị ra các số hạng
//     * @param numbers
//     */
//    private static void shownumbers(int[] numbers) {
//        System.out.print("Tổng của ");
//        for (int i = 0; i <= numbers.length - 1; i++) {
//
//            System.out.print(numbers[i] + " ");
//        }
//    }
//
//    /**
//     * phương thức tính tổng
//     * @param numbers
//     * @return
//     */
//    private static long add(int[] numbers) {
//        var sum = 0;
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            sum += numbers[i];
//        }
//        return sum;
//    }
//
//    /**
//     * phương thức cho phép người dùng nhập dữ liệu từ bàn phím
//     * @param n
//     * @param input
//     * @return
//     */
//    private static int[] getNumbers(int n, Scanner input) {
//        var numbers = new int[n];
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.println("Nhập số thứ " + (i + 1));
//            numbers[i] = input.nextInt();
//        }
//        return numbers;
//    }


    //ví dụ 2: Nhập n số lượng số nguyên tố đầu tiên rồi lưu vào mảng sau đó hiển thị kết quả ra màn hình
    //tóm lại là tìm n số nguyên tố đầu tiên với n nhập từ bàn phím

    // bước 1: phương thức kiểm tra xem một số bất kì có phải nguyên tố hay không
    // bước 2: phương thức tìm n số nguyên tố đầu tiên
    // bước 3: phương thức hiển thị ra n số nguyên tố đầu tiên

//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập vào số lượng số nguyên tố đầu tiên: ");
//        var n = input.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương...");
//        } else {
//            var primeNUmbres = firstNumbers(n);
//            showResult(primeNUmbres);
//        }
//    }
//
//    /**
//     * phương thức hiển thị ra các số nguyên tố đầu
//     * @param primeNUmbres
//     */
//    private static void showResult(int[] primeNUmbres) {
//        System.out.println("kết quả: ");
//        for (int i = 0; i <= primeNUmbres.length - 1; i++) {
//            System.out.print(primeNUmbres[i] + "; ");
//        }
//    }
//
//    /**
//     * phương thức tìm ra những số nguyên tố đầu tiên
//     * @param n
//     * @return
//     */
//    public static int[] firstNumbers(int n) {
//        var prime = new int[n];
//        var count = 0;
//        var i = 2;
//        while (count < n) {
//            if (isPrime(i)) {
//                prime[count] = i;
//                count ++;
//            }
//            i++;
//        }
//        return prime;
//    }
//
//    /**
//     * phương thức kiểm tra số nguyên tố
//     * @param a
//     * @return
//     */
//    public static boolean isPrime(int a) {
//        if (a < 2) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(a); i++) {
//            if (a % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }






    //ví dụ 3: nhập vào một mảng nguyên n phần tử và kiểm tra xem mảng đó có đối xứng hay không.
    //mảng đối xứng là mảng thỏa mãn a[i] = a[length - 1 - i]
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập vào số phần tử của mảng: ");
//        var n = input.nextInt();
//
//        if (n <= 0) {
//            System.out.println("nhập lại giá trị nguyên dương...");
//        } else {
//            var numbers = getNumbers(n, input);
//            var checknumbers = revert(numbers) ? "Có đối xứng !" : "Không đối xứng !";
//            //hiển thị kết quả
//            System.out.println(checknumbers);
//        }
//    }
//
//    /**
//     * phương thức kiểm tra tính đối xứng
//     * @param numbers chỉ cần kiểm tra từ 0 đến length/2
//     * @return
//     */
//    private static boolean revert(int[] numbers) {
//        for (int i = 0; i <= numbers.length / 2; i++) {
//            if (numbers[i] != numbers[numbers.length - 1 - i]) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    /**
//     * phương thức nhập vào các phần tử của mảng
//     * @param n
//     * @param input
//     * @return
//     */
//    private static int[] getNumbers(int n, Scanner input) {
//        var number = new int[n];
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.println("Nhập số thứ " + (i + 1));
//            number[i] = input.nextInt();
//        }
//        return number;
//    }







    //ví dụ 4: nhập vào chuỗi kí tự gồm các từ cách nhau bởi một vài khoảng trắng. tách các từ trong chuỗi ra
    //và lưu vào mảng, hiển thị ra màn hình chỉ số và giá trị của từ.
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập chuỗi kí tự: ");
//        var str = input.nextLine();
//        str = str.trim();
//        String[] words = str.split("\\s+");
//        System.out.println("kết quả: ");
//        for (int i = 0; i <= words.length - 1; i++) {
//            System.out.println(i + " - " + words[i]);
//        }
//    }






    //ví dụ 5: nhập vào môi chuỗi kí tự, tách các từ trong chuỗi ra và in ra theo thứ tự ngược lại
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập vào chuỗi kí tự: ");
//        var str = input.nextLine();
//        //str = str.trim();
//        String[] words = str.split("\\s+");
//        System.out.println("kết quả in ra chuỗi ngược là: ");
//        for (int i = words.length - 1; i >= 0; i--) {
//            System.out.print(words[i] + " ");
//        }
//    }






    //ví dụ 6: nhập vào danh sách những người bạn của bạn cách nhau bằng dấu cách, liệt kê ra những người có tên ngắn nhất
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập tên những người bạn cách nhau bởi dấu cách: ");
//        var str = input.nextLine();
//        str = str.trim();
//        String[] friends = str.split("\\s+");
//
//        var findMinFriends = minFriends(friends);
//        showResult(friends, findMinFriends);
//    }
//
//    /**
//     * phương thức hiển thị ra kết quả người có tên ngắn nhất
//     * @param friends danh sách các tên ngắn nhất
//     * @param findMinFriends độ dài của tên nắn nhất
//     */
//    private static void showResult(String[] friends, int findMinFriends) {
//        System.out.println("kết quả: ");
//        for (var name : friends) {
//            if (name.length() == findMinFriends) {
//                System.out.println(name);
//            }
//        }
//    }
//
//    /**
//     * phương thức tìm ra tên ngắn nhất
//     * @param friends danh sách các tên
//     * @return một giá trị nguyên
//     */
//    private static int minFriends(String[] friends) {
//        var min = friends[0].length();
//        for (int i = 0; i <= friends.length - 1; i++) {
//            if (friends[i].length() < min) {
//                min = friends[i].length();
//            }
//        }
//        return min;
//    }






    //ví dụ 7: nhập vào danh sách đầu điểm trung bình của n sinh viên ở hệ 4. viết chương trình phân
    //loại sinh viên dựa trên các tiêu chí
    /*
    trượt: TB < 2.0
    yếu  : TB < 2.5
    kém  : TB < 3.0
    khá  : TB < 3.2
    giỏi : TB < 3.6
    xuất sắc: TB <= 4.0
     */
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập số sinh viên: ");
//        var n = input.nextInt();
//
//        var scores = getScore(n, input);
//        showResult(scores);
//    }
//
//    /**
//     * phương thức hiển thị kết quả
//     * @param scores số điểm mà sinh viên nhận được
//     */
//    private static void showResult(float[] scores) {
//        System.out.println("kết quả: ");
//        for (int i = 0; i <= scores.length - 1; i++) {
//            System.out.println("Sinh viên thứ " + (i + 1) + ": " + classify(scores[i]));
//        }
//    }
//
//
//    /**
//     * phương thức nhập vào điểm trung bình của từng học sinh
//     * @param n số học sinh
//     * @param input đầu vào
//     * @return điểm của n sinh viên
//     */
//    private static float[] getScore(int n, Scanner input) {
//         var score = new float[n];
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.print("Điểm của sinh viên thứ " + (i + 1) + ": ");
//            score[i] = input.nextFloat();
//        }
//        return score;
//    }
//
//    /**
//     * phương thức phân chia đầu điểm từng học sinh
//     */
//    public static String classify(float score) {
//        if (score < 2.0 && score >= 0) {
//            return "Trượt";
//        } else if (score >= 2.0 && score < 2.5) {
//            return "Yếu";
//        } else if (score >= 2.5 && score < 3.0) {
//            return "Trung Bình";
//        } else if (score >= 3.0 && score < 3.2) {
//            return "Khá";
//        } else if (score >= 3.2 && score < 3.6) {
//            return "Giỏi";
//        } else if (score >= 3.6 && score <= 4.0){
//            return "Xuất Sắc";
//        } else {
//            return "lỗi cú pháp, nhập lại điểm trong khoảng [0, 4]";
//        }
//    }







    //ví dụ 8 (làm lại) : nhập vào n số nguyên dương, phân tích từng số ra các thừa số nguyên tố. ví dụ 28 = 2 * 2 * 7.nếu âm thì báo lỗi
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập số phần tử cần phân tích: ");
//        var n = input.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Nhập lại số nguyên dương");
//        } else {
//            var numbers = getNumbers(n, input);
//            showResult(numbers);
//        }
//    }
//
//    /**
//     * phương thức hiển thị ra kết quả
//     * @param numbers
//     */
//    private static void showResult(int[] numbers) {
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            System.out.println(isPrimes(numbers[i]));
//        }
//    }
//
//    /**
//     * phương thức phân tích các phần tử của mảng thành tích các số nguyên tố
//     */
//    public static String isPrimes(int numbers) {
//        String result = numbers + " = ";
//        int i = 2;
//        while (numbers >  1) {
//            if (numbers % i == 0) {
//                result += i;
//                if (numbers != i) {
//                    result += "*";
//                }
//                numbers /= i;
//            } else {
//                i++;
//            }
//        }
//        return result;
//    }
//
//    /**
//     * phương thức nhập vào các phần tử của mảng
//     * @param n số phần tử của mảng
//     * @param input nhập vào
//     * @return các phần tử của mảng
//     */
//    private static int[] getNumbers(int n, Scanner input) {
//        var number = new int[n];
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.print("Nhập số thứ " + (i + 1) + ": ");
//            number[i] = input.nextInt();
//        }
//        return number;
//    }





    //ví dụ 9: nhập vào các phần tử của một mảng là số thực là điểm trung bình của một lớp sih viên ở hệ 10
    //tính điểm trung bình của cả lớp
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Số học sinh trong lớp là: ");
//        var n = input. nextInt();
//
//        if (n <= 0) {
//            System.out.println("nhập lại giá trị nguyên dương...");
//        } else {
//            var avgGrades = getAvgGrade(n, input);
//            var avg = avgGradesAll(avgGrades);
//
//            //hiển thị kết quả ra màn hình
//            System.out.println("Kết quả: " + avg);
//        }
//    }
//    /**
//     * phương thức tính điểm trung bình của n học sinh
//     */
//    private static float avgGradesAll(float[] avgGrades) {
//        float sum = 0;
//        for (int i = 0; i <= avgGrades.length - 1; i++) {
//            sum += avgGrades[i];
//        }
//        return sum / avgGrades.length;
//    }
//
//    /**
//     * phương thức nhập vào điểm của các sinh viên
//     * @param n
//     * @param input
//     * @return
//     */
//    private static float[] getAvgGrade(int n, Scanner input) {
//        var avgGrade = new float[n];
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.println("Điểm sinh viên thứ " + (i + 1));
//            avgGrade[i] = input.nextFloat();
//        }
//        return avgGrade;
//    }





    /*
    ví dụ 10: nhập vào ngày công của nhân viên một công ty. số ngày công không vượt quá 30 và được phép lẻ 0.5 ngày
    lương cứng một ngày công là 330k, phụ cấp 33k một công hoàn chỉnh. nếu số công lớn hơn 25 thì đc bonus mỗi công 50k
    kể từ công thứ 25. tính và hiển thị thông tin chi tiết về số công, tổng lương cứng, tổng phụ cấp, tổng bonus và
    tổng được nhận của danh sách gồm n công nhân
     */
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Sô lượng công nhân là: ");
//        var n = input.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương...");
//        } else {
//            var workDays = getWorkDay(n, input);
//            showResult(workDays);
//        }
//    }
//
//    /**
//     * phương thức tính toán và hiển thị kết quả
//     * @param workDays số công của từng công nhân
//     */
//    private static void showResult(float[] workDays) {
//        System.out.printf("%-5s%-10s%-15s%-10s%-10s%-12s\n", "STT", "Số Công", "Lương Cứng", "Trợ Cấp", "Bonus", "Tổng");
//        for (int i = 0; i <= workDays.length - 1; i++) {
//            var standerd = 330 * workDays[i];   //lương cứng
//            var support = 33 * (int) workDays[i];  //trợ cấp
//            var bonusDay = (workDays[i] - 25 >= 0) ? (workDays[i] - 24) : 0;  //nếu số ngày >= 25 thì bonusday = work[i] - 24, còn ko thì bonusday = 0
//            var moneyBonus = bonusDay * 50;   //tiền bonus tính theo số ngày >= 25day
//            var sum = (standerd + support + moneyBonus);
//
//            System.out.printf("%-5d%-10.2f%-15.2f%-10d%-10.2f%-12.2f\n", (i + 1), workDays[i], standerd, support, moneyBonus, sum);
//        }
//    }
//
//    /**
//     * phương thức nhập vào số liệu của từng công nhân
//     * @param n số lượng công nhân
//     * @param input đầu vào
//     * @return danh sách tất cả công nhân
//     */
//    private static float[] getWorkDay(int n, Scanner input) {
//        var data = new float[n];
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.print("Số công của NV thứ " + (i + 1) + ": ");
//            data[i] = input.nextFloat();
//        }
//        return data;
//    }
}




