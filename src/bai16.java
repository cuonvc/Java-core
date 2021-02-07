import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //VD1: tìm giá trị đầu tiên chia hết cho k trong đoạn [a, b]
        System.out.println("nhập vào số đầu và cuối: ");
        var a = input.nextInt();
        var b = input.nextInt();
        System.out.println("nhập giá trị k: ");
        var k = input.nextInt();
        if (k != 0) {
            for (int i = a; i <= b; i++) {
                if (i % k == 0) {
                    System.out.println("số đầu tiên thỏa mãn là: " + i);
                    break;
                }
            }
        } else {
            System.out.println("nhập lại k khác 0...");
        }

        //VD2: liệt kê tất cả các số trong đoạn [a, b] chia hết cho k != 0
        //cách 1: không dùng continue
//        System.out.println("nhập số đầu và cuối: ");
//        var a = input.nextInt();
//        var b = input.nextInt();
//        System.out.println("nhập giá trị k: ");
//        var k = input.nextInt();
//        if (k != 0) {
//            System.out.println("các giá trị i là: ");
//            for (int i = a; i <= b; i++) {
//                if (i % k == 0) {
//                    System.out.print(i + ", ");
//                }
//            }
//        } else {
//            System.out.println("nhập lại giá trị k...");
//        }
        //cách 2: dùng continue
//        System.out.println("nhập số đầu và cuối: ");
//        var a = input.nextInt();
//        var b = input.nextInt();
//        System.out.println("nhập giá trị k: ");
//        var k = input.nextInt();
//        if (k != 0) {
//            System.out.println("các giá trị của i là: ");
//            for (int i = a; i <= b; i++) {
//                if (i % k == 0) {
//                    System.out.print(i + ", ");
//                    continue;
//                }
//            }
//        } else {
//            System.out.println("nhập lại giá trị k...");
//        }

    }
}
