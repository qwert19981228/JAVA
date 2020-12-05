package cn.yjw.day11.demo03;

import java.util.Random;

/*
* 题目要求:
* 根据int变量n的值 , 来获取随机数字 , 范围是[1,n] , 可以取到1也可以取到n
* */
public class Demo02Random {
    public static void main(String[] args) {
        int num = 5;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int result = random.nextInt(num) + 1;
            System.out.println(result);
        }

    }
}
