import java.io.OutputStream;
import java.util.Scanner;

public class bai20 {
    //ví dụ 1: viết chương trình nhập vào thứ tự ngày trong tuần và in ra thứ tương ứng
    //CÁCH 1: cách truyền thống
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("nhập vào một giá trị từ 1-7: ");
        var index = input.nextInt();

        System.out.println(dayOfWeek(index));
    }

    public static String dayOfWeek(int day) {
        var result = "";
        switch (day) {
            case 1:
                result = "Thứ hai";
                break;
            case 2:
                result = "Thứ Ba";
                break;
            case 3:
                result = "Thứ Tư";
                break;
            case 4:
                result = "Thứ Năm";
                break;
            case 5:
                result = "Thứ sáu";
                break;
            case 6:
                result = "Thứ Bảy";
                break;
            case 7:
                result = "Chủ Nhật";
                break;
            default:
                result = "Nhạp lại giá trị từ 1-7...";
                break;

        }
        return result;
    }

    //CÁCH 2: sử dụng swich phiên bản mới
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập giá trị từ 1-7: ");
//        var index = input.nextInt();
//
//        System.out.println(dayOfWeek(index));
//    }
//
//    public static String dayOfWeek(int day) {
//        return switch (day) {
//            case 1 -> "Thứ Hai";
//            case 2 -> "Thứ Ba";
//            case 3 -> "Thứ Tư";
//            case 4 -> "Thứ Năm";
//            case 5 -> "Thứ Sáu";
//            case 6 -> "Thứ Bảy";
//            case 7 -> "Chủ Nhật";
//            default -> "Ngày không hợp lệ...";
//        };
//    }








    //ví dụ 2: làm thử một câu trắc nghiệm
    //CÁCH 1: vẫn là kiểu swich mới và vẫn dùng ->
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Câu hỏi: Logo quả táo cắn dở thuộc hãng công nghệ nào ?");
//        System.out.println("A. Apple" + "\nB. SamSung" + "\nC. Huawei" + "\nD. Nokia");
//        System.out.println("Đáp an của bạn là: ");
//        var choice = input.next().charAt(0);
//        String result = switch (choice) {
//            case 'A', 'a' -> "Đáp án chính xác.";
//            case 'b', 'B', 'c', 'C', 'd', 'D' -> "Sai mất rồi...";
//            default -> "Đáp án không hợp lệ, nhập lại...";
//        };
//        System.out.println(result);
//    }


    //CÁch 1.2: dùng thêm phương thức
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Câu hỏi: Logo quả táo cắn dở thuộc hãng công nghệ nào ?");
//        System.out.println("A. Apple" + "\nB. SamSung" + "\nC. Huawei" + "\nD. Nokia");
//        System.out.println("Đáp an của bạn là: ");
//        var choice = input.next().charAt(0);
//
//        System.out.println(result(choice));
//    }
//    public static String result(int luachon) {
//        return switch (luachon) {
//          case 'a', 'A' -> "Đáp án chính xác !";
//          case 'b', 'B', 'c', 'C', 'd', 'D' -> "Sai Cmnr... :))";
//            default -> "Đáp án không hợp lệ, nhập lại...";
//        };
//    }


    //CÁCH 2: vẫn sử dụng kiểu swich mới nhưng dùng : và yield thay cho ->
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("Câu hỏi: Logo quả táo cắn dở thuộc hãng công nghệ nào ?");
//        System.out.println("A. Apple" + "\nB. SamSung" + "\nC. Huawei" + "\nD. Nokia");
//        System.out.println("Đáp án của bạn là: ");
//        var choice = input.next().charAt(0);
//        String result = switch (choice) {
//            case 'A', 'a': yield "Đáp án chính xác.";
//            case 'b', 'B', 'c', 'C', 'd', 'D': yield "Sai mất rồi...";
//            default: yield "Đáp án không hợp lệ, nhập lại...";
//        };
//        System.out.println(result);
//    }
}
