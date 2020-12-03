package cn.yjw.day11.demo01;

/*
* 题目: 键盘输入三个int数字 , 然后求出其中的最大值
* */

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数字: ");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字: ");
        int b = scanner.nextInt();
        System.out.println("请输入第三个数字: ");
        int c = scanner.nextInt();

        // 首先得到前两个数字当中的最大值
        int temp = Math.max(a, b);
        int max = Math.max(temp, c);
        System.out.println("最大值为: " + max);
    }
}
