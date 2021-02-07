import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class baitap20 {

    //ví dụ 1: nhập vào một số nguyên là tháng của năm (từ 1-12). viết chương trình sử dụng swich để hiển thị các mùa
    //Cách 1: dùng swich kiểu cũ
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("nhập vào một tháng trong năm: ");
        var month = input.nextInt();
        var season = "";

        switch (month) {
            case 1:
            case 2:
            case 3:
                season = "Mùa Xuân";
                break;
            case 4:
            case 5:
            case 6:
                season = "Mùa Hạ";
                break;
            case 7:
            case 8:
            case 9:
                season = "Mùa Thu";
                break;
            case 10:
            case 11:
            case 12:
                season = "Mùa Đông";
                break;
            default:
                System.out.println("không hợp lệ, nhập lại giá trị từ 1-12");

        }
        if (!season.isEmpty()) {
            System.out.println("Tháng " + month + " là " + season);
        }
    }
    //Cách 2: dùng swich kiểu mới
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập vào tháng cần kiểm tra: ");
//        var month = input.nextInt();
//
//        var season = switch (month) {
//            case 1, 2, 3 ->  "Mùa Xuân";
//            case 4, 5, 6 -> "Mùa Hạ";
//            case 7, 8, 9 ->  "Mùa Thu";
//            case 10, 11, 12 -> "Mùa Đông";
//            default -> "Tháng không hợp lệ, nhập lại giá trị từ 1-12...";
//        };
//            System.out.println("Tháng " + month + " là " + season);
//    }
    //Cách 3: dùng swich kiểu mới và dùng thêm phương thức
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập vào tháng từ 1-12: ");
//        var month = input.nextInt();
//
//        System.out.println("Tháng " + month + " là " + season(month));
//    }
//    public static String season(int choice) {
//        return switch (choice) {
//          case 1, 2, 3 -> "Mùa Xuân";
//          case 4, 5, 6 -> "Mùa Hạ";
//          case 7, 8, 9 -> "Mùa Thu";
//          case 10, 11, 12 -> "Mùa Đông";
//            default -> "Giá trị không hợp lệ, nhập lại giá trị từ 1-12...";
//        };
//    }








    //ví dụ 2: giả sử các con giáp được đánh số từ 1-12 theo thứ tự là:
    //tí, sửu, dần, mão, thìn, tị, ngọ, mùi, thân, dậu, tuất, hợi
    //viết ct cho phép nhập vào số từ 1-12 hiển thị ra tên con giáp tương ứng
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập giá trị từ 1-12: ");
//        var month = input.nextInt();
//
//            System.out.println("Tháng " + month + " là con " + result(month));
//
//    }
//    public static String result(int choice) {
//        return switch (choice) {
//          case 1 -> "Tý";
//          case 2 -> "Sửu";
//          case 3 -> "Dần";
//          case 4 -> "Mão";
//          case 5 -> "Thìn";
//          case 6 -> "Tị";
//          case 7 -> "Ngọ";
//          case 8 -> "Mùi";
//          case 9 -> "Thân";
//          case 10 -> "Dậu";
//          case 11 -> "Tuất";
//          case 12 -> "Hợi";
//          default -> "Giá trị không hợp lệ, nhập lại giá trị từ 1-12";
//        };
//    }








    //ví dụ 3: viết ct cho phép người dùng nhập vào ngày tháng sinh để tra cứu cung hoàng đạo
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập ngày sinh: ");
//        var day = input.nextInt();
//        System.out.println("nhập tháng sinh: ");
//        var month = input.nextInt();
//
//        var zodiac = "";
//
//        zodiac = switch (month) {
//            case 1 -> (day <= 19) ? "Ma Kết" : (day >= 20 && day <= 31) ? "Bảo Bình" : "Ngày không hợp lệ";
//            case 2 -> (day <= 18) ? "Bảo Bình" : (day >= 19 && day <= 28) ? "Song Ngư" : "Ngày không hợp lệ";
//            case 3 -> (day <= 20) ? "Song Ngư" : (day >= 21 && day <= 31) ? "Bạch Dương" : "Ngày không hợp lệ";
//            case 4 -> (day <= 20) ? "Bạch Dương" : (day >= 21 && day <= 30) ? "Kim Ngưu" : "Ngày không hợp lệ";
//            case 5 -> (day <= 20) ? "Kim Ngưu" : (day >= 21 && day <= 31) ? "Song Tử" : "Ngày không hợp lệ";
//            case 6 -> (day <= 21) ? "Song Tử" : (day >= 22 && day <= 30) ? "Cự Giải" : "Ngày không hợp lệ";
//            case 7 -> (day <= 22) ? "Cự Giải" : (day >= 23 && day <= 31) ? "SƯ Tử" : "Ngày không hợp lệ";
//            case 8 -> (day <= 22) ? "Sư Tử" : (day >= 23 && day <= 31) ? "Xử Nữ" : "Ngày không hợp lệ";
//            case 9 -> (day <= 22) ? "Xử Nữ" : (day >= 23 && day <= 30) ? "Thiên Bình" : "Ngày không hợp lệ";
//            case 10 -> (day <= 23) ? "Thiên Bình" : (day >= 24 && day <= 31) ? "Bọ Cạp" : "Ngày không hợp lệ";
//            case 11 -> (day <= 22) ? "Bọ Cạp" : (day >= 23 && day <= 30) ? "Nhân Mã" : "Ngày không hợp lệ";
//            case 12 -> (day <= 21) ? "Nhân Mã" : (day >= 22 && day <= 31) ? "Ma Kết" : "Ngày không hợp lệ";
//                default -> "Ngày, tháng không hợp lệ, nhập lại...";
//        };
//        System.out.println(day + "/" + month + " là cung " + zodiac);
//    }







    //ví dụ 4: viết chương trình cho phép người dùng nhập vào tên thứ trong tuần bằng tiếng việt. sau đó hiển thị ra
    //kết quả tiếng anh
    //Cách 1: sử dụng swich truyền thống
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập vào thứ bất kì: ");
//        var dayV = input.nextLine();
//        dayV = dayV.toLowerCase();
//        dayV = dayV.trim();
//        var dayE = "";
//        switch (dayV) {
//            case "thứ hai":
//                dayE = "Monday";
//                break;
//            case "thứ ba":
//                dayE = "Tuesday";
//                break;
//            case "thứ tư":
//                dayE = "Wednesday";
//                break;
//            case "thứ năm":
//                dayE = "Thursday";
//                break;
//            case "thứ sáu":
//                dayE = "Friday";
//                break;
//            case "thứ bảy":
//                dayE = "Saturday";
//                break;
//            case "chủ nhật":
//                dayE = "Sunday";
//                break;
//            default:
//                System.out.println("Thứ không hợp lệ, nhập lại...");
//        }
//        System.out.println(dayV + " là " + dayE);
//    }
    //Cách 2: sử dụnh swich kiểu mới
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        System.out.println("nhập vào ngày thứ trong tuần");
//        var dayV = input.nextLine();
//        dayV = dayV.trim();
//        dayV = dayV.toLowerCase();
//
//
//        String dayE = switch (dayV) {
//            case "thứ hai" -> "Monday";
//            case "thứ ba" -> "Tuesday";
//            case "thứ tư" -> "Wednesday";
//            case "thứ năm" -> "Thursday";
//            case "thứ sáu" -> "Friday";
//            case "thứ bảy" -> "Saturday";
//            case "chủ nhật" -> "Sunday";
//            default -> "ngày thứ không hợp lệ, nhập lại...";
//        };
//        System.out.println(dayV + " là " + dayE);
//    }
}
