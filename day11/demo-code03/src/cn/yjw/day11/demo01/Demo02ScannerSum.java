package cn.yjw.day11.demo01;

/*
* 题目: 键盘输入两个int数字 , 并且求出和值
*
* */


import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数字:");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字:");
        int b = scanner.nextInt();

        int result = a + b;
        System.out.println("结果是: " + result);
    }
}
