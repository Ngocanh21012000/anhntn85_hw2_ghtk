package com.company;

import java.util.Scanner;

public class Main {
    public  static  int nhapInt(String tieuDe, Scanner scanner){
        int result = -1;
        boolean nhaplai = false;
        while (result < 0) {
            try {
                if(nhaplai) System.out.println("Nhập lại:" +tieuDe+ "là số nguyên");
                result = scanner.nextInt();
                scanner.nextLine();
                nhaplai = true;

            }catch (Exception e){
                scanner.nextLine();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuNhap = 1;
        while (menuNhap != 0) {
            System.out.println("--------------Menu------------------");
            System.out.println("Nhập 1 : để nhập xe qua sử dụng");
            System.out.println("Nhập 2 : để nhâp siêu xe");
            System.out.println("Nhập 0 : để thoát");
            menuNhap = nhapInt("Nhap mneu", scanner);
            if (menuNhap == 1) {
                UsedCar usedCar = new UsedCar();
                usedCar.nhap(scanner);
                usedCar.run();
                usedCar.rate("bình thường");

            } else if (menuNhap == 2) {
                SuperCar superCar = new SuperCar();
                superCar.nhap(scanner);
                superCar.run();
                superCar.rate("tốt");

            } else
                System.exit(0);
        }




    }
}
