package employee;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        controller();
    }

    public static void menu() {
        System.out.println("-----------------MENU--------------------");
        System.out.println("1. Nhap thong tin");
        System.out.println("2. Nhap thong tin");
        System.out.println("3. Nhap thong tin");
        System.out.println("4. Nhap thong tin");
        System.out.println("5. Nhap thong tin");
        System.out.println("6. Nhap thong tin");
        System.out.println("7. Nhap thong tin");
        System.out.println("8. Nhap thong tin");
        System.out.println("9. Nhap thong tin");
        System.out.println("moi ban chon : ");
    }

    public static void controller() {
        ListEmployee listEmployee = new ListEmployee();
        Scanner scanner = new Scanner(System.in);
        String check;
        do {


            menu();
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    listEmployee.nhapThongTin();
                    break;
                case 2:
                    listEmployee.xuatThongTin();
                    break;
                case 3:
                    System.out.println("nhap luong can tim : ");
                    double luong = scanner.nextDouble();
                    listEmployee.timNhanVien(luong);
                    break;
                case 4:
                    listEmployee.sortEmployeeBySalary();
                    break;
                case 5: listEmployee.sortEmployeeByName();
                break;
                default:
                    throw new IllegalStateException("Unexpected value: " + chon);
            }
            System.out.println("co muon thoat khong Y/N");
            scanner.nextLine();
            check = scanner.nextLine();
        } while (check.equals("y"));
    }
}
