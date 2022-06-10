package com.company;

import java.util.Scanner;

public class SuperCar extends Car implements Outfit {

    private float maLuc;

    @Override
    public void rate (String quality) {
        System.out.println("chất lượng xe: "+quality);
    }

    @Override
    public void nhap(Scanner scanner) {

        System.out.println("nhập thông tin siêu xe:");
        super.nhap(scanner);
        System.out.print("Mã lực:");
        this.maLuc = scanner.nextFloat();

    }

    @Override
    public void run() {
        System.out.println("Xe "+name +" chạy với tốc độ "+speed+"  km/h và " + maLuc + " mã lực");
    }
}
