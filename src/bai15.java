import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        //VÍ DỤ 1: in ra màn hình hình chữ nhật đặc có kích thước đc nhập vào từ bàn phím
        System.out.println("nhâp chiều rộng HCN");
        var x = input.nextInt();
        System.out.println("nhập chiều cao HCN");
        var h = input.nextInt();
        if (x > 0 && h > 0) {
            for (int i = 1; i <= h; i++) {      //fori có tác dụng lặp lại số dòng
                for (int j = 1; j <= x; j++) {   //forj có tác dụng lặp lại số cột
                    System.out.print(" * ");
                }
                System.out.println("          ");
            }
        } else {
            System.out.println("! vui lòng nhập giá trị dương.");
        }

        //VÍ DỤ 2: in ra màn hình hình chữ nhật rỗng có kích thước đc nhập vào từ bàn phím
        //trường hợp 1: nhập chiều rộng trước, chiều cao sau
//        System.out.println("nhập chiều rộng: ");
//        var x = input.nextInt();
//        System.out.println("nhập chiều cao: ");
//        var y = input.nextInt();
//        if (x > 0 && y > 0) {
//            for (int i = 1; i <= y; i++) {
//                for (int j = 1; j <= x; j++) {
//                    if (j == 1 || j == x || i == 1 || i == y) {  //đây là "hoặc" chứ không phải "và" nên nó sẽ thực hiện lệnh mà đúng sớm nhất
//                        //vì vậy muốn thực hiện lặp chiều rộng trước thì phải để j trước i
//                        System.out.print(" * ");  //chỗ này có 3 kí tự " * "
//                    } else {                       //
//                        System.out.print("   ");   //thì bên dưới này cùng phải có 3 kí tự "   "
//                    }
//                }
//                System.out.println("");
//            }
//        } else {
//            System.out.println("!nhập lại giá trị dương.");
//        }
        //trường hợp 2: nhập chiều cao trước chiều rộng sau
//        System.out.println("nhập chiều cao: ");
//        var y = input.nextInt();
//        System.out.println("nhập chiều rộng: ");
//        var x = input.nextInt();
//        if (x > 0 && y > 0) {
//            for (int i = 1; i <= y; i++) {
//                for (int j = 1; j <= x; j++) {
//                    if (j == 1 || j == x || i == 1 || i == y) {
//                        //TH này muốn thực hiện lặp chiều cao trước thì phải để i trước j
//                        System.out.print(" * ");
//                    } else {
//                        System.out.print("   ");
//                    }
//                }
//                System.out.println("");
//            }
//        } else {
//            System.out.println("!nhập lại giá trị dương.");
//        }


        //lưu ý: ở bài 1 thì nhập chiều rộng hay chiều cao trước đều như nhau. còn bài 2 thì phải chia làm 2 TH




        //VÍ DỤ 3: vẽ tam giác vuông góc trái dưới với chiều cao là h
//        System.out.println("nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("nhập lại giá trị dương...");
//        }
    }
}
