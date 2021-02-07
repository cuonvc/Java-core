import java.util.Arrays;
import java.util.Scanner;

public class bai25 {
    //Ví dụ 1: cho sẵn một mảng numbers, tìm vị trí của giá trị x cần tìm
    public static void main(String[] args) {
        int[] numbers = {9, 8, 5, 2, 3, 1, 0, 4, 7, 8, 9, 100, 7 };
        System.out.println("Mảng gốc ban đầu là: ");
        showNumbers(numbers);

        System.out.println("Nhập giá trị cần tìm: ");
        var x = new Scanner(System.in).nextInt();
        var index = indexSearch(numbers, x);
        var result = index == -1 ? "Không tồn tại giá trị cần tìm..." : "Giá trị cần tìm nằm ở vị trí số " + (index + 1);
        System.out.println(result);
    }

    /**
     * phương thức tìm kiếm giá trị yêu cầu
     * @param numbers mảng đã cho
     * @param x giá trị cần tìm
     * @return trả về giá trị cần tìm
     *
     * ở phương thức tìm kiếm giá trị này, nếu bài chỉ yêu cầu xem giá trị cần tìm có nằm trong mảng này hay ko thì nên trả về kiểu boolean và return về true false
     * còn nếu bài yêu cầu tìm vị trí chính xác của giá trị cần tìm thì nên trả về kiểu int như vd này và return về số
     */
    private static int indexSearch(int[] numbers, int x) {
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] == x) {
                return i;
            }
        }
        return -1;  // trả về -1 tức là ko tồn tại giá trị cần tìm
    }

    /**
     * phương thức hiển thị mảng đã cho để tiện so sánh
     * @param numbers
     */
    private static void showNumbers(int[] numbers) {
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }






    //CÁCH 2: dùng phương thức có sẵn trong thư viện (lưu ý là nếu dùng phương thức có sẵn thì phải sắp xếp
    //trước khi tìm kiếm để đảm bảo đc chính xác hơn )
//    public static void main(String[] args) {
//        int[] numbers = {9, 8, 5, 2, 3, 1, 0, 4, 7, 8, 9, 100, 7};
//        Arrays.sort(numbers);  //xắp xếp các phần tử trước khi tìm vị trí
//        System.out.println("Mảng gốc ban đầu: ");
//        showArray(numbers);
//        System.out.println("Nhập giá trị cần tìm: ");
//        var x = new Scanner(System.in).nextInt();
//        int index = Arrays.binarySearch(numbers, x);  //đây là tìm kiếm trong cả mảng
//        //int index = Arrays.binarySearch(numbers, 3, 10, x);  //đây là tìm kiếm trong một đoạn của mảng
//        var result = index < 0 ? "Không tồn tại x"
//                : "Tìm thấy x tại vị trí " + (index + 1);
//        System.out.println(result);
//    }

//    /**
//     * phương thức sử dụng để tìm kiếm tuyến tính xem x có
//     * xuất hiện trong mảng numbers hay không
//     *
//     * @param numbers là mảng gốc cần tìm
//     * @param x       là biến chứa giá trị cần tìm
//     * @return giá trị khác -1 nếu tìm thấy x và ngược lại
//     */
//    private static int linearSearch(int[] numbers, int x) {
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == x) { // nếu tìm thấy
//                return i; // trả về chỉ số i
//            }
//        }
//        return -1; // mặc định không tìm thấy
//    }

//    /**
//     * phương thức hiển thị các phần tử của mảng nguyên
//     *
//     * @param numbers mảng chứa dữ liệu cần hiển thị
//     */
//    private static void showArray(int[] numbers) {
//        System.out.println("Các phần tử của mảng là: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println(); // in xuống dòng
//    }
}
