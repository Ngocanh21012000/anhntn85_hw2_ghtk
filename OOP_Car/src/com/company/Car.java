package com.company;

import java.util.Scanner;

public class Car {
    public String name;
    public String company;
    public int amount;
    public  int speed;
    public Outfit outfit;

    public void nhap(Scanner scanner){
        System.out.println("Nhập vào thông tin của xe: ");
        System.out.print("hãng xe: ");
        this.company=scanner.nextLine();
        System.out.print("tên xe: ");
        this.name= scanner.nextLine();
        System.out.print("Số lương xe : ");
        this.amount= Main.nhapInt("Số lượng ", scanner);
        System.out.print("Tốc độ: ");
        this.speed = Main.nhapInt("Tốc độ",scanner);

    }

    public void run(){
        System.out.println("Xe "+name +" chạy với tốc độ "+speed+"  km/h");

    }
    public  void comment(){
        outfit.rate("DI cho đánh giá  xe");

    }


}
