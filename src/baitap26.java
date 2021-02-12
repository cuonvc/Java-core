import java.net.http.HttpConnectTimeoutException;
import java.util.Arrays;
import java.util.Scanner;

public class baitap26 {

    //ví dụ: vẽ HCN bằng các dấu * lưu vào mảng 2 chiều và lưu ra màn hình
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập chiều cao HCN: ");
//        var h = input.nextInt();
//        System.out.println("Nhập chiều rộng HCN: ");
//        var x = input.nextInt();
//
//        if (h <= 0 || x <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương...");
//        } else {
//            String[][] HCN = new String[h][x];
//
//            fillStarts(HCN);
//            showResult(HCN);
//        }
//    }
//
//    /**
//     * phương thức hiển thị ra màn hình HCN
//     * @param hcn
//     */
//    private static void showResult(String[][] hcn) {
//        for (int i = 0; i <= hcn.length - 1; i++) {
//            for (int j = 0; j <= hcn[i].length - 1; j++) {
//                System.out.print(hcn[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    /**
//     * phương thức điền vào các dấu * tạo HCN
//     * @param hcn mảng chứa các dấu *
//     */
//    private static void fillStarts(String[][] hcn) {
//        for (int i = 0; i <= hcn.length - 1; i++) {
//            for (int j = 0; j <= hcn[i].length - 1; j++) {
//                hcn[i][j] = " * ";
//            }
//        }
//    }







    //ví dụ: tạo mảng zigzac lưu tamg giác số vuông trái dưới
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//
//        if (h <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương...");
//        } else {
//            int[][] triangle = new int[h][];  //hình đc vẽ có h hàng và số phần tử của hàng chưa biết trước nên để trống
//            for (int i = 0; i <= h - 1; i++) {
//                triangle[i] = new int[i + 1];  //dòng thứ i sẽ có i + 1 phần tử
//            }
//            fillNumbers(triangle);
//            showResult(triangle);
//        }
//    }
//
//    /**
//     * phương thức hiển thị ra kết quả
//     * @param triangle
//     */
//    private static void showResult(int[][] triangle) {
//        for (int i = 0; i <= triangle.length - 1; i++) {
//            for (int j = 0; j <= triangle[i].length - 1; j++) {
//                System.out.print(" " + triangle[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    /**
//     * phương thức tính toán điền các số vào các vị trí thích hợp
//     * @param triangle mảng chứa các chữ số
//     */
//    private static void fillNumbers(int[][] triangle) {
//        for (int i = 0; i <= triangle.length - 1; i++) {
//            for (int j = 0; j <= triangle[i].length - 1; j++) {
//                triangle[i][j] = i + j;    //vẽ ra giấy để thấy sẽ thấy quy tắc
//            }
//        }
//    }






    //ví dụ 1: vẽ hình vuông rỗng cạnh m và hai đường chéo bằng các dấu *. lưu vào mảng 2 chiều và hiển thị ra màn hình
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập độ dài cạnh hình vuông: ");
//        var x = input.nextInt();
//
//        if (x <= 0) {
//            System.out.println("Nhập lại số nguyên dương...");
//        } else {
//            String[][] square = new String[x][x];
//            fillStarts(square);
//            showResult(square);
//        }
//    }
//
//    /**
//     * phương thức hiển thị kết quả ra màn hình
//     * @param square mảng chứa các dấu *
//     */
//    private static void showResult(String[][] square) {
//        for (int i = 0; i <= square.length - 1; i++) {
//            for (int j = 0; j <= square.length - 1; j++) {
//                System.out.print(square[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    /**
//     * phương thức điền các dấu * vào các vị trí yêu cầu
//     * @param square mảng chứa các dấu *
//     */
//    private static void fillStarts(String[][] square) {
//        for (int i = 0; i <= square.length - 1; i++) {
//            for (int j = 0; j <= square.length - 1; j++) {
//                if (i == 0 || j == 0 || i == j || i == square.length - 1 || j == square.length - 1 || (i + j) == square.length - 1) {
//                    square[i][j] = " * ";
//                } else {
//                    square[i][j] = "   ";
//                }
//            }
//        }
//    }






    //ví dụ 2: vẽ tam giác vuông đều góc trái trên chiều cao h nhập từ bàn phím
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//
//        if (h <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương: ");
//        } else {
//            String[][] triangle = new String[h][h];
//            fillStars(triangle);
//            showResult(triangle);
//        }
//    }
//
//    /**
//     * phương thức hiển thị kết quả
//     * @param triangle
//     */
//    private static void showResult(String[][] triangle) {
//        for (int i = 0; i <= triangle.length - 1; i++) {
//            for (int j = 0; j <= triangle.length - i - 1; j++) {
//                System.out.print(triangle[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    /**
//     * phương thứ lấp đầy các chỗ cần dấu *
//     * @param triangle mảng chứa các dấu *
//     */
//    private static void fillStars(String[][] triangle) {
//        for (int i = 1; i <= triangle.length; i++) {
//            for (int j = 1; j <= triangle.length - i + 1; j++) {
//                 triangle[i - 1][j - 1] = " * ";
//            }
//        }
//    }






    //ví dụ 3: vẽ tam giác vuông cân góc phải trên với chiều cao nhập từ bàn phím (dùng mảng 2 chiều)
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//
//        if (h <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương...");
//        } else {
//            String[][] triangle = new String[h][h];
//            fillStars(triangle);
//            showResult(triangle);
//        }
//    }
//
//    private static void showResult(String[][] triangle) {
//        for (int i = 0; i <= triangle.length - 1; i++) {
//            for (int j = 0; j <= triangle.length - 1; j++) {
//                System.out.print(triangle[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//
//    private static void fillStars(String[][] triangle) {
//        for (int i = 1; i <= triangle.length; i++) {
//            for (int j = 1; j <= triangle.length; j++) {
//                if (j >= i) {
//                    triangle[i - 1][j - 1] = " * ";
//                } else {
//                    triangle[i - 1][j - 1] = "   ";
//                }
//            }
//        }
//    }






    //ví dụ 4: vẽ tam giác vuông cân góc phải dưới với h nhập từ bàn phím, sử dụng mảng 2 chiều
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập chiều cao tam giác: ");
//        var h = input.nextInt();
//
//        if (h <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương...");
//        } else {
//            String[][] triangle = new String[h][h];
//            fillStars(triangle);
//            showResult(triangle);
//        }
//    }
//
//    private static void showResult(String[][] triangle) {
//        for (int i = 0; i <= triangle.length - 1; i++) {
//            for (int j = 0; j <= triangle.length - 1; j++) {
//                System.out.print(triangle[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    private static void fillStars(String[][] triangle) {
//        for (int i = 1; i <= triangle.length; i++) {
//            for (int j = 1; j <= triangle.length; j++) {
//                if ((i + j) <= triangle.length) {
//                    triangle[i - 1][j - 1] = "   ";
//                } else {
//                    triangle[i - 1][j - 1] = " * ";
//                }
//            }
//        }
//    }





    //ví dụ 5: vẽ tam giác cân đặc với chiều cao h nhập từ bàn phím. sử dụng mảng 2 chiều
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập chiều cao: ");
//        var h = input.nextInt();
//
//        if (h <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương...");
//        } else {
//            String[][] triangle = new String[h][2 * h - 1];
//            fillStars(triangle);
//            showResult(triangle);
//        }
//    }
//
//    private static void showResult(String[][] triangle) {
//        for (int i = 0; i <= triangle.length - 1; i++) {
//            for (int j = 0; j <= triangle.length * 2 - 1 - 1; j++) {
//                System.out.print(triangle[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//
//    private static void fillStars(String[][] triangle) {
//        for (int i = 1; i <= triangle.length; i++) {
//            for (int j = 1; j <= (triangle.length) * 2 - 1; j++) {
//                if (j + i <= triangle.length || j - i >= triangle.length) {
//                    triangle[i - 1][j - 1] = "   ";
//                } else {
//                    triangle[i - 1][j - 1] = " * ";
//                }
//            }
//        }
//    }






    //ví dụ 6: vẽ tam giác cân rỗng chiều cao h nhập từ bàn phím. sử dụng mảng 2 chiều
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập chiều cao: ");
//        var h =input.nextInt();
//
//        if (h <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương..");
//        } else {
//            String[][] triangle = new String[h][2 * h - 1];
//            fillStars(triangle);
//            showResult(triangle);
//        }
//    }
//
//    private static void showResult(String[][] triangle) {
//        for (int i = 0; i <= triangle.length - 1; i++) {
//            for (int j = 0; j <= 2 * triangle.length - 2; j++) {
//                System.out.print(triangle[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    private static void fillStars(String[][] triangle) {
//        for (int i = 1; i <= triangle.length; i++) {
//            for (int j = 1; j <= 2 * triangle.length - 1; j++) {
//                if (j + i - 1 == triangle.length || j - i + 1 == triangle.length || i == triangle.length) {
//                    triangle[i - 1][j - 1] = " * ";
//                } else {
//                    triangle[i - 1][j - 1] = "   ";
//                }
//            }
//        }
//    }






    //ví dụ 7: vẽ tam giác số đối xứng với chiều cao h nhập từ bàn phím. sử dụng mảng 2 chiều
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập chiều cao: ");
//        var h = input.nextInt();
//
//        if (h <= 0) {
//            System.out.println("Nhập lại giá trị nguyên dương...");
//        } else {
//            String[][] triangle = new String[h][2 * h - 1];
//            fillNumbers(triangle);
//            showResult(triangle);
//        }
//    }
//
//    private static void showResult(String[][] triangle) {
//        for (int i = 0; i <= triangle.length - 1; i++) {
//            for (int j = 0; j <= 2 * triangle.length - 2; j++) {
//                System.out.print(triangle[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    private static void fillNumbers(String[][] triangle) {
//        for (int i = 1; i <= triangle.length; i++) {
//            for (int j = 1; j <= 2 * triangle.length - 1; j++) {
//                if (j + i > triangle.length && j - i < triangle.length) {
//                    triangle[i - 1][j - 1] = " " + (i - Math.abs(triangle.length - j)) + " ";
//                } else {
//                    triangle[i - 1][j - 1] = "   ";
//                }
//            }
//        }
//    }






    //ví dụ 8: nhập vào ma trận cấp m x n. sắp xếp các phần tử trên từng hàng của ma trận theo thứ tự tăng dần
    //từ trái qua phải. hiển thị kết quả ra màn hình
//    public static void main(String[] args) {
//        var matrix = getMatrix();
//        editMatrix(matrix);
//        showMatrix(matrix);
//    }
//
//    /**
//     * phương thức sắp xếp các phần tử theo thứ tự tăng dần từ trái qua phải
//     * Vì mỗi hàng trong mảng 2 chiều này là mảng 1 chiều nên có thể dùng Arrays.sort để sắp xếp
//     * @param matrix
//     */
//    private static void editMatrix(int[][] matrix) {
//        for (int i = 0; i <= matrix.length - 1; i++) {
//            Arrays.sort(matrix[i]);
//        }
//    }
//
//    /**
//     * phương thức hiển thị ma trận cấp m x n
//     * @param matrix mảng 2 chiều chứa các phần tử của ma trận
//     */
//    private static void showMatrix(int[][] matrix) {
//        for (int i = 0; i <= matrix.length - 1; i++) {
//            for (int j = 0; j <= matrix[i].length - 1; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    /**
//     * phương thức nhập vào các thành phần của ma trận
//     */
//    private static int[][] getMatrix() {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập kích cỡ ma trận: ");
//        var m = input.nextInt();
//        var n = input.nextInt();
//
//        var matrix = new int[m][n];
//        for (int i = 0; i <= m - 1; i++) {
//            for (int j = 0; j <= n - 1; j++) {
//                System.out.print("matrix[" + (i + 1) + "][" + (j + 1) + "] = ");
//                matrix[i ][j] = input.nextInt();
//            }
//        }
//        return matrix;
//    }







    //ví dụ 9: nhập vào hai ma trận cùng cấp m x n. tính tổng hai ma trận và hiển thị kết quả ra màn hình
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập kích cỡ của hai ma trận cùng cấp: ");
        var m = input.nextInt();
        var n = input.nextInt();

        var matrixA = new int[m][n];
        var matrixB = new int[m][n];

        System.out.println("Nhập các phần tử của ma trận thứ nhất: ");
        fillMatrixA(matrixA, input);
        System.out.println("Nhập các phần tử của ma trận thứ hai: ");
        fillMatrixB(matrixB, input);

        var matrixSum = addMatrix(matrixA, matrixB);

        System.out.println("Ma trận A là: ");
        onScreenMatrix(matrixA);
        System.out.println("Ma trận B là: ");
        onScreenMatrix(matrixB);
        System.out.println("Ma trận tổng là: ");
        onScreenMatrix(matrixSum);
    }

    /**
     * phương thức hiển thị ra ma trận A, ma trận B, và ma trận tổng
     * @param matrix đại diện cho matrixA, matrixB, matrixSum
     */
    private static void onScreenMatrix(int[][] matrix) {
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[i].length - 1; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    /**
     * phương thức tính tổng hai ma trận cùng cấp
     * @param matrixA mảng chứa các phần tử ma trận A
     * @param matrixB mảng chứa các phần tử ma trận B
     * @return trả về ma trận tổng cùng cấp với A và B
     */
    private static int[][] addMatrix(int[][] matrixA, int[][] matrixB) {
        int[][] sum = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i <= matrixA.length - 1; i++) {
            for (int j = 0; j <= matrixA[i].length - 1; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return sum;
    }

    /**
     * phương thức nhập vào các phần tử của ma trận thứ hai
     * @param matrixB mảng chứa các thành phần của ma trận thứu hai
     * @param input đối tượng của scanner
     */
    private static void fillMatrixB(int[][] matrixB, Scanner input) {
        for (int i = 0; i <= matrixB.length - 1; i++) {
            for (int j = 0; j <= matrixB[i].length - 1; j++) {
                System.out.print("Matrix[" + (i + 1) + "][" + (j + 1) + "] = ");
                matrixB[i][j] = input.nextInt();
            }
        }
    }

    /**
     * phương thức nhập vào các phần tử của ma trận thứ nhất
     * @param matrixA mảng chứa các phần tử đầu tiên
     * @param input đối tượng Scanner
     */
    private static void fillMatrixA(int[][] matrixA, Scanner input) {
        for (int i = 0; i <= matrixA.length - 1; i++) {
            for (int j = 0; j <= matrixA[i].length - 1; j++) {
                System.out.print("Matrix[" + (i + 1) + "][" + (j + 1) + "] = ");
                matrixA[i][j] = input.nextInt();
            }
        }
    }





    //ví dụ 10: viết chương trình vẽ ma trận cấp m x n bằng các số 0 và 1 đan xen nhau. in kết quả ra màn hình.
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Nhập kích cỡ ma trận: ");
//        var m = input.nextInt();
//        var n = input.nextInt();
//    }
}
