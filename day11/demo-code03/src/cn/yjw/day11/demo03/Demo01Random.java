package cn.yjw.day11.demo03;

import java.util.Random;

/*
* Random类用来生产随机数字
*
* 使用:
* 获取一个随机的int数字(范围是int所有范围 , 有正负两种) : int num = r.nextInt();
* 获取一个随机的int数字(参数代表了范围 , 左闭右开区间)  : int num = r.nextInt(1);
* */
public class Demo01Random {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int ran = random.nextInt();
            int num = random.nextInt(11);
            System.out.println("结果是: " + num + " " + ran);
        }
    }
}
