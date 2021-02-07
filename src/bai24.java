import java.util.Arrays;

public class bai24 {
    public static void main(String[] args) {
        // mảng gốc ban đầu
        int[] numbers = {9, 8, 5, 2, 3, 1, 0, 4, 7, 8, 9, 100, 7};
        System.out.println("Mảng gốc ban đầu: ");
        showArray(numbers);
        // sắp xếp:
        //bubleSort(numbers);  //sắp xếp kiểu tự mình viết thuật toán
        //Arrays.sort(numbers);  //sắp xếp kiểu chọn lấy thuật toán có sẵn là Array.sort thì ko cần gọi phương thức như kiểu trên
        //chỉ cần gõ Arrays.sort là nó sẽ hiện ra một loạt các kiểu xắp xếp khác nhau
        Arrays.sort(numbers, 0, 10); //đây cũng là kiểu có sẵn. kiểu này là chạt lấy một đoạn chứ ko chạy hết cả mảng
        // từ 3 đến 10 tức là nó chỉ xắp xếp các số từ số thứ 4 đến thứ 10, còn 3 số đầu với 3 số cuối giữ nguyên
        System.out.println("Mảng sau khi sắp xếp: ");
        showArray(numbers);
    }


//    private static void bubleSort(int[] numbers) {
//        for (int i = 0; i <= numbers.length - 2; i++) {
//            for (int j = numbers.length - 1; j > i; j--) {
//                if (numbers[j] < numbers[j - 1]) {
//                    int x = numbers[j];
//                    numbers[j] = numbers[j - 1];
//                    numbers[j - 1] = x;
//                }
//            }
//        }
//    }

    /**
     * phương thức hiển thị ra các phần tử mảng nguyên theo thứ tự yêu cầu
     * @param numbers
     */
    private static void showArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // in xuống dòng
    }
}
