import java.util.Scanner;

public class baitap15 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        //BÀI 1: vẽ hình vuông rỗng và 2 đường chéo
        System.out.println("nhập kích thước hình vuông: ");
        var x = input.nextInt();
        if (x > 0) {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (i == 1 || j == 1 || i == x || j == x || i == j || (i + j) == x + 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("nhập lại giá trị dương: ");
        }

        //BÀI 2: vẽ tam giác vuông góc trái trên với chiều cao h nhập từ bàn phím
        //CÁCH 1:
//        System.out.println("nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = h; j >= i; j--) {
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("nhập lại giá trị dương...");
//        }
        //CÁCH 2:
//        System.out.println("nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= h - i + 1; j++) {
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("nhập lại giá trị dương...");
//        }


        //BÀI 3: vẽ tam giác vuông góc phải trên với chiều cao được nhập từ bàn phím
        //cách 1: dùng phương pháp tọa độ Oij (trục tung là i, tức số hàng. trục hoành là j, tức số cột)
//        System.out.println("nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= h; j++) {
//                    if (j >= i) {
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



        //BÀI 4: vẽ tam giác vuông góc phải dưới với chiều cao nhập từ bàn phím
//        System.out.println("nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= h; j++) {
//                    if (j > h - i) {
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


        //BÀI 5: vẽ tam giác cân đặc
//        System.out.println("nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= (2 * h) - 1; j++) {
//                    if (j < h - i + 1 || j > h + i - 1) {
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



        //BÀI 6: vẽ tam giác cân rỗng với chiều cao h nhập từ bàn phím
//        System.out.println("nhập chiều cao: ");
//        var h = input.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= (2 * h) - 1; j++) {
//                    if (j == h - i + 1 || j == h + i - 1 || i == h) {
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




        //BÀI 7: vẽ tam giác bằng các số đối xứng nhau qua chiều cao nhập từ bàn phím
//        System.out.println("nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= (2 * h) - 1; j++) {
//                    if (j >= h - i + 1 && j <= h + i - 1) {
//                        System.out.print(" " + (i - Math.abs(h - j)) + " ");
//                    } else {
//                        System.out.print("   ");
//                    }
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("nhập lại giá trị dương...");
//        }





        //BÀI 8: nhập vào hai số nguyên dương a < b. liệt kê tất cả các số chính phương trong đoạn [a; b]
        //note: số chính phương là số là kết quả của các phép bình phương số nguyên (1; 4; 9; 16; 25; 36; 49; ... )
//        System.out.println("nhập số thứ nhất: ");
//        var a = input.nextInt();
//        System.out.println("nhập số thứ hai: ");
//        var b = input.nextInt();
//        //tìm ra hai số đầu và cuối tạo lên số chính phương
//        var first = (int) Math.ceil(Math.sqrt(a));
//        var last = (int) Math.floor(Math.sqrt(b));
//        //hiển thị hai số số ra cho dễ hình dung
//        System.out.println(first);
//        System.out.println(last);
//        //kết quả:
//        System.out.println("tập các số cần tìm là: ");
//        for (int i = first; i <= last; i++) {
//            System.out.println(i * i);
//        }






        //BÀI 9: nhập vào số tự nhiên n từ 2-9. liệt kê các số thuận nghịch có n chữ số, ví dụ 123454321

        //chưa hiểu thì để học song bài debug rồi quay lại
    }
}
