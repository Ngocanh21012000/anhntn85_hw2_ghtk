package com.company;

import java.util.Scanner;

public class UsedCar extends Car implements Outfit{
    public float price;
    @Override
    public void rate (String quality) {
        System.out.println("Chất lượng xe: " + quality);
    }

    @Override
    public void nhap(Scanner scanner) {
        System.out.print("nhập vào thông tin xe đã qua sử dụng");
        super.nhap(scanner);
        System.out.print("Gia xe : ");
        this.price = scanner.nextFloat();
    }
}
