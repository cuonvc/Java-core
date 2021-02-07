import java.awt.*;
import java.io.BufferedReader;
import java.net.SocketTimeoutException;
import java.util.Locale;
import java.util.Scanner;

public class baitap14 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
//       //BÀI 1: nhập vào số nguyên dương và in ra các ước của nó (dùng while)
        System.out.println("nhập vào số nguyên dương cần tính");
        var n = input.nextInt();
        var i = 1;
        while (n >= i) {
           if (n % i == 0) {
               System.out.println(i);
           }
           i++;
        }



        //BÀI 2: nhập vào hai số a và b, tìm UCLN và BCNN của a và b
//        System.out.println("nhập số thứ nhất");
//        var a = input.nextInt();
//        System.out.println("nhập số thứ hai");
//        var b = input.nextInt();
//        var prod = a*b;
//        while (a != b) {
//            if (a > b) {
//                a -= b;
//            } else {
//                b -= a;
//                }
//            }
//        System.out.println("UCLN là: " + a);
//        System.out.println("BCNN là: " + (prod / a));


        //BÀI 3: nhập vào số nguyên dương n. tính tổng các chữ số có trong n
//        System.out.println("nhập số nguyên dương n : ");
//        var n = input.nextInt();
//        var sum = 0;
//        while (n > 0) {
//            sum += (n % 10); //lần lượt lấy số cuối của dãy số
//            n /= 10; //vứt số vừa mới lấy đi
//        }
//        System.out.println(sum);


        //BÀI 4: nhập vào chuỗi kí tự và in ngược lại
        //CÁCH 1: dùng for
//        System.out.println("nhập chuỗi str: ");
//        var str = input.nextLine();
//        for (int i = str.length() - 1; i >= 0 ; i--) {
//            System.out.print(str.charAt(i));
//        }
//        //CÁCH 2: dùng while
//        System.out.println("nhập chuỗi str: ");
//        var str = input.nextLine();
//        int i = str.length() - 1;
//        while (i >= 0) {
//            System.out.print(str.charAt(i));
//            i--;
//        }


        //BÀI 5: viết ct tính tổng tất cả các giá tị nhập vào từ bàn phím. ấn 0 đê kết thúc và hiên thị kết quả
//       var sum = 0;
//       var n = 1;
//       while (n != 0) {
//           System.out.println("nhập giá trị cần tính, ấn 0 để hiển thị kết quả: ");
//           n = input.nextInt();
//           sum += n;
//       }
//        System.out.println(sum);


        //BÀI 6: viết ct giải và biện luận pt bậc 2
//        double a = 0;
//        double b;
//        double c;
//        while (a == 0) {
//            System.out.println("vui lòng nhập hệ số thứ nhất khác 0 !");
//            a = input.nextDouble();
//        }
//        System.out.println("nhập hệ số thứ hai: ");
//        b = input.nextDouble();
//        System.out.println("nhập hệ số thứ ba: ");
//        c = input.nextDouble();
//        double delta = (b * b) - (4 * a * c);
//        if (delta < 0) {
//            System.out.println("phương tình vô nghiệm...");
//        } else if (delta == 0) {
//            var x = (-b) / (2 * a);
//            System.out.println("phương trình có nghiệm kép x = " + x);
//        } else {
//            var x1 = (-b + (Math.sqrt(delta))) / (2 * a);
//            var x2 = (-b - (Math.sqrt(delta))) / (2 * a);
//            System.out.println("phương trình có hai nghiệm phân biệt " + "\nx1 = " + x1 + "\nx2 = " + x2);
//        }


        //BÀI 7: nhập vào số nguyên dương. tính tổng 1 + 1/4 + 1/9 + ... + 1/(n^2)
        //CÁCH 1: dùng for
//        System.out.println("nhập vào số nguyên dương n: ");
//        var n = input.nextInt();
//        var sum = 0.0;
//        for (int i = 1; i <= n; i++) {
//            sum += (1.0/(i * i));
//        }
//        System.out.println(sum);
//        //CÁCH 2: dùng while
//        System.out.println("nhập giá trị nguyên n: ");
//        var n = input.nextInt();
//        var i = 1;
//        var sum = 0.0;
//        while (n >= i) {
//            sum += 1.0 / (i * i);
//            i++;
//        }
//        System.out.println(sum);


        //BÀI 8: nhập vào số nguyên n. in ra chữ số đầu tiên của số đó
        //CÁCH 1: coi cái đó là một chuỗi string và dùng if else. cách này áp dụng cho cả chữ cái chứ ko riêng gì số
//        System.out.println("nhập số: ");
//        var str = input.nextLine();
//        if (str.length() == 1) {
//            System.out.println(str);
//        } else if (str.length() > 1){
//            System.out.println(str.charAt(0));
//        } else {
//            System.out.println("lỗi. nhập lại...");
//        }

//        //CÁCH 2: dùng while.  cách này chỉ áp dụng được cho số.
//        System.out.println("nhập số nguyên n: ");
//        var n = input.nextInt();
//        while (n >= 10) {
//            n /= 10;
//        }
//        System.out.println(n);


        //BÀI 9: nhập vào số nguyên n và tính tổng của số đầu và cuối
//        System.out.println("nhập số nguyên n: ");
//        var n = input.nextInt();
//        var last = n % 10;
//        while (n > 10) {
//            n /= 10;
//        }
//        System.out.println("tổng đầu và cuối là: " + (last + n));


        //BÀI 10: nhập vào một số và đếm xem số đó có bao nhiêu chữ số
//        System.out.println("nhập vào số nguyên n: ");
//        var n = input.nextInt();
//        var count = 0;
//        while (n > 0) {
//            n /= 10;
//            count++;
//        }
//        System.out.println("số chữ số là: " + count);


        //BÀI 11: nhập vào một số nguyên là tháng thuộc [1-12]. sử dụng swich và do-while để phân loại các mùa trong năm
        //biết mùa xuân (1-3), mùa hạ (2-6), mùa thu (7-9), mùa đông (10-12)
//        var month = 0;
//        do {
//            System.out.println("================================================================");
//            System.out.println("nhập tháng cần tra cứu: ");
//            month = input.nextInt();
//            switch (month) {
//                case 0:
//                    System.out.println("kết thúc chương trình...");
//                    break;
//                case 1:
//                case 2:
//                case 3:
//                    System.out.println("tháng " + month + " là mùa xuân");
//                    break;
//                case 4:
//                case 5:
//                case 6:
//                    System.out.println("tháng " + month + " là mùa hạ");
//                    break;
//                case 7:
//                case 8:
//                case 9:
//                    System.out.println("tháng " + month + " là mùa thu");
//                    break;
//                case 10:
//                case 11:
//                case 12:
//                    System.out.println("tháng " + month + " là mùa đông");
//                    break;
//                default:
//                    System.out.println("vui lòng nhập giá trị từ 1-12 hoặc ấn 0 để thoát");
//                    break;
//            }
//        } while (month != 0);


        //BÀI 12: các con giáp được đánh số từ 1-12 lần lượt là: Tí, Sửu, Dần, Mão, Thìn, Tị, Ngọ, Mùi, Thân, Dậu, Tuất, Hợi. viết ct sử dụng Swich và do-while nhập vào từ 1-12 tìm ra con giáp tương ứng
        //tương tự bài trên
//        var month = 0;
//        do {
//            System.out.println("=====================================================");
//            System.out.println("nhập giá trị từ 1-12, nhập 0 để thoát: ");
//            month = input.nextInt();
//            switch (month) {
//                case 0:
//                    System.out.println("kết thúc ct.");
//                    break;
//                case 1:
//                    System.out.println("con tí");
//                    break;
//                case 2:
//                    System.out.println("con sửu");
//                    break;
//                case 3:
//                    System.out.println("con dần");
//                    break;
//                case 4:
//                    System.out.println("con mão");
//                    break;
//                case 5:
//                    System.out.println("con thìn");
//                    break;
//                case 6:
//                    System.out.println("con tị");
//                    break;
//                case 7:
//                    System.out.println("con ngọ");
//                    break;
//                case 8:
//                    System.out.println("con mùi");
//                    break;
//                case 9:
//                    System.out.println("con thân");
//                    break;
//                case 10:
//                    System.out.println("con dậu");
//                    break;
//                case 11:
//                    System.out.println("con tuất");
//                    break;
//                case 12:
//                    System.out.println("con hợi");
//                    break;
//                default:
//                    System.out.println("giá trị không hợp lệ...nhập lại: ");
//                    break;
//            }
//        } while (month != 0);




        //BÀI 13: viết chương trình tra cứu cung hoàng đạo
//       var choice = 0;
//       while (true) {
//           System.out.println("======================================================");
//           System.out.println("nhập 0 để thoát. nhập số bất kì để tiếp tục");
//           choice = input.nextInt();
//           if (choice == 0) {
//               System.out.println("chương trình kết thúc !");
//               break;
//           }
//           System.out.println("nhập ngày sinh: ");
//           var day = input.nextInt();
//           System.out.println("nhập tháng sinh: ");
//           var month = input.nextInt();
//           var zodiac = "";
//           switch (month) {
//               case 1:
//                   if (day <= 19 && day >= 1) {
//                       zodiac = "Ma Kết";
//                   } else if (day <= 31 && day >= 20){
//                       zodiac = "Bảo Bình";
//                   } else {
//                       System.out.println("ngày tháng không họp lệ.");
//                   }
//                   break;
//               case 2:
//                   if (day >= 1 && day <= 18) {
//                       zodiac = "Bảo Bình";
//                   } else if (day >= 19 && day <= 29) {
//                       zodiac = "Song Ngư";
//                   } else {
//                       System.out.println("ngày tháng không hợp lệ.");
//                   }
//                   break;
//               case 3:
//                   if (day >= 1 && day <= 20) {
//                       zodiac = "Song Ngư";
//                   } else if (day >= 21 && day <= 31) {
//                       zodiac = "Bạch Dương";
//                   } else {
//                       System.out.println("ngày tháng không họp lệ.");
//                   }
//                   break;
//               case 4:
//                   if (day >= 1 && day <= 20) {
//                       zodiac = "Bạch Dương";
//                   } else if (day >= 21 && day <= 30) {
//                       zodiac = "Kim Ngưu";
//                   } else {
//                       System.out.println("ngày tháng không hợp lệ");
//                   }
//                   break;
//               case 5:
//                   if (day >= 1 && day <= 20) {
//                       zodiac = "Kim Ngưu";
//                   } else if (day >= 21 && day <= 31) {
//                       zodiac = "Song Tử";
//                   } else {
//                       System.out.println("ngày tháng không hợp lệ.");
//                   }
//                   break;
//               case 6:
//                   if (day >= 1 && day <= 21) {
//                       zodiac = "Song Tử";
//                   } else if (day >= 22 && day <= 30) {
//                       zodiac = "Cự Giải";
//                   } else {
//                       System.out.println("ngày tháng không hợp lệ.");
//                   }
//                   break;
//               case 7:
//                   if (day <= 22 && day >= 1) {
//                       zodiac = "Cự Giải";
//                   } else if (day <= 31 && day >= 23){
//                       zodiac = "Sư Tử";
//                   } else {
//                       System.out.println("ngày tháng không họp lệ.");
//                   }
//                   break;
//               case 8:
//                   if (day >= 1 && day <= 22) {
//                       zodiac = "Sư tử";
//                   } else if (day >= 23 && day <= 31) {
//                       zodiac = "Xử Nữ";
//                   } else {
//                       System.out.println("ngày tháng không hợp lệ.");
//                   }
//                   break;
//               case 9:
//                   if (day >= 1 && day <= 22) {
//                       zodiac = "Xử Nữ";
//                   } else if (day >= 23 && day <= 30) {
//                       zodiac = "Thiên Bình";
//                   } else {
//                       System.out.println("ngày tháng không họp lệ.");
//                   }
//                   break;
//               case 10:
//                   if (day >= 1 && day <= 23) {
//                       zodiac = "Thiên Bình";
//                   } else if (day >= 24 && day <= 31) {
//                       zodiac = "Bọ Cạp";
//                   } else {
//                       System.out.println("ngày tháng không hợp lệ");
//                   }
//                   break;
//               case 11:
//                   if (day >= 1 && day <= 22) {
//                       zodiac = "Bọ Cạp";
//                   } else if (day >= 23 && day <= 30) {
//                       zodiac = "Nhân Mã";
//                   } else {
//                       System.out.println("ngày tháng không hợp lệ.");
//                   }
//                   break;
//               case 12:
//                   if (day >= 1 && day <= 21) {
//                       zodiac = "Nhân Mã";
//                   } else if (day >= 22 && day <= 31) {
//                       zodiac = "Ma Kết";
//                   } else {
//                       System.out.println("ngày tháng không hợp lệ.");
//                   }
//                   break;
//               default:
//                   System.out.println("ngày tháng không hợp lệ...nhập lại !");
//                   break;
//           }
//           if (!zodiac.isEmpty()) {
//               System.out.println(day + "/" + month + " là cung " + zodiac);
//           }
//
//       }







       //BÀI 14: viết ct cho phép người dùng nhập tên thứ bằng tiếng việt sau đó chuyển sang tiếng anh tương ứng (chỉ nhập bằng in hoa hoặc in thường, không lẫn lộn).
        //chương trình cần đưa ra yêu cầu lựa chọn cho người dùng. chọn 0 để kết thúc. chọn khác 0 để tiếp tục và thực hiện tiếp chương tình
//        var choice = 0;
//        while (true) {
//            System.out.println("nhập số bất kì để tiếp tục, nhập 0 đẻ kt ct. ");
//            choice = input.nextInt();
//            //input.nextLine();
//            if (choice == 0) {
//                System.out.println("kết thúc chương trình: ");
//                break;
//            }
//            System.out.println("nhập ngày trong tuần: ");
//            input.nextLine();  //dòng này có tác dụng để ngăn việc nhảy dòng khi chưa kịp nhâp tên thứ.
//            var day = input.nextLine();
//            day = day.toLowerCase();  // viết thường toàn bộ chuỗi khi mình nhập vào
//            day = day.trim();  //loại bỏ các dấu cách thừa khi mình nhập vào
//            switch (day) {
//                case "thứ hai" :
//                    System.out.println("MONDAY");
//                    break;
//                case "thứ ba" :
//                    System.out.println("TUESDAY");
//                    break;
//                case "thứ tư" :
//                    System.out.println("WEDNESDAY");
//                    break;
//                case "thứ năm" :
//                    System.out.println("THURSDAY");
//                    break;
//                case "thứ sáu" :
//                    System.out.println("FRIDAY");
//                    break;
//                case "thứ bảy" :
//                    System.out.println("SATURDAY");
//                    break;
//                case "chủ nhật" :
//                    System.out.println("SUNDAY");
//                    break;
//                default:
//                    System.out.println("ngày không hợp lệ...");
//                    break;
//            }
//        }
//
    }
}
