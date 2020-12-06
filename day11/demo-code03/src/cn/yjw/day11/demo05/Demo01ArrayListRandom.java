package cn.yjw.day11.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
* 题目: 生成6个1~33之间的随机整数, 添加到集合, 并遍历集合
* */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(33) + 1;
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
