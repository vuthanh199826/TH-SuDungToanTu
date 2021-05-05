package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float width;
        float height;
        System.out.println("nhap chieu dai");
        width = sc.nextFloat();
        System.out.println("nhap chieu cao");
        height = sc.nextFloat();
        float area = width*height;
        System.out.println(area);
    }
}
