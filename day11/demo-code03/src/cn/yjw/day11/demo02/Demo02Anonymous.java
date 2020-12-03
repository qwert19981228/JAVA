package cn.yjw.day11.demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        // 普通使用方式
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();

        // 匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是: " + num);

        // 使用一般写法传入参数
//        Scanner scanner = new Scanner(System.in);
//        methodParam(scanner);

        // 使用匿名对象传入参数
//        methodParam(new Scanner(System.in));

        Scanner scanner = methodReturn();
        int num = scanner.nextInt();
        System.out.println("结果是: " + num);
    }

    public static void methodParam(Scanner scanner){
        int num = scanner.nextInt();
        System.out.println("输入的是: " + num);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
