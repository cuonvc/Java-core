import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class baitap16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //BÀI 1: nhập vào số nguyên dương n, tìm số thỏa mã là ước nhỏ nhất của n và là số nguyên tố
        System.out.println("nhập vào số nguyên dương: ");
        var n = input.nextInt();
        for (int i = 2; i <= n; i++) {
           boolean isprime = true;   //nếu isprime mà đúng là thì là số nguyên tố và ngược lại
           var a = (int) Math.sqrt(i);  //lấy căn bậc 2 của i và làm tròn đến số nguyên
            for (int j = 2; j <= a; j++) {  //cho j chạy từ 2 đến căn i để xem có số nào mà i chia hết hay không, nếu có thì ko phải nguyên tố
                if (i % j == 0) {
                   isprime = false; //không phải nguyên tố nên break kết thúc vòng lặp forj và nhảy xuống bên dưới
                   break;
                }
            }
            if (isprime && (n % i == 0)) {  //nếu isprime đúng là số nguyên tố và n chia hết cho i thì in ra i đầu tiên và break kết thúc
                System.out.println(i);
                break;
            }
        }

        //BÀI 2: nhập vào số nguyên dương n, tìm số thỏa mã là ước lớn nhất của n và là số nguyên tố
//        System.out.println("nhập số nguyên dương: ");
//        var n = input.nextInt();
//        for (int i = n; i >= 2; i--) {
//            boolean isprime = true;
//            var a = (int) Math.sqrt(i);
//            for (int j = a; j >= 2; j--) {
//                if (i % j == 0) {
//                    isprime = false;
//                    break;
//                }
//            }
//            if (isprime && n % i == 0) {
//                System.out.println(i);
//                break;
//            }
//        }

        //BÀi 3: tìm n nhỏ nhất sao cho tổng S = 1 + 2 + 3 + ... + n >= 500
        //bài này không cần khai báo input
//        int n = 1;
//        int sum = 1;
//        while (true) {
//            sum += n;
//            if (sum >= 500) {
//                System.out.println(n);
//               break;
//            }
//            n++;
//        }


        //BÀI 4: tìm số chính phương đầu tiên chia hết cho k trong đoạn [a, b] với 0 < a < b và k != 0 nhập từ bàn phím
//        System.out.println("nhập đoạn cần tìm: ");
//        var a = input.nextInt();
//        var b = input.nextInt();
//        System.out.println("nhập giá trị k: ");
//        var k =input.nextInt();
//        if (a > 0 && a < b) {
//            var first = (int) Math.ceil(Math.sqrt(a));
//            var last = (int) Math.floor(Math.sqrt(b));
//            for (int i = first; i <= last; i++) {
//                if ((i * i) % k == 0) {
//                    System.out.println("kết quả: " + (i * i));
//                    break;
//                }
//            }
//        } else {
//            System.out.println("sai giá trị...nhập lại !");
//        }


        //BÀI 5: tìm k số thuận nghịch đầu tiên có 5 chữ số mà tổng các chữ số chia hết cho m với m, k là các số tự nhiên dương không quá 1000
        //sau khi học xong bài debug rồi quay lại
        //BÀI 6: viết chương trình đọc vào các số từ bàn phím. việc đọc sẽ dừng lại khi đọc đến số nguyên tố đầu tiên. hiện giá trị nguyên tố này ra màn hình
//        for (; ; ) { //vòng lặp for vô hạn
//            System.out.println("nhập số n: ");
//            var n =input.nextInt();
//            boolean isprime = true;
//            var a = (int) Math.sqrt(n);
//            if (n < 2) {
//                isprime = false;;
//            }
//            //bắt đầu kiểm tra
//            for (int i = 2; i <= a; i++) {
//                if (n % i == 0) {
//                    isprime = false;
//                    break;
//                }
//            }
//            if (isprime) {
//                System.out.println("số cần tìm là: " + n);
//                break;
//            }
//        }
    }
}
