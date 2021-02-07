import java.util.Scanner;
public class bai17 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("nhâp chiều rộng HCN");
        var x = input.nextInt();
        System.out.println("nhập chiều cao HCN");
        var h = input.nextInt();
        if (x > 0 && h > 0) {
            for (int i = 1;
                 i <= h;
                 i++) {
                for (int j = 1; j <= x; j++) {
                    System.out.print(" * ");
                }
                System.out.println("          ");
            }
        } else {
            System.out.println("! vui lòng nhập giá trị dương.");
        }
    }
}
