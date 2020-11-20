package cn.yjw.day09.demo01;

/*
* 使用动态初始化数组的时候 , 其中的元素将会自动拥有一个默认值 . 规则如下:
* 如果是整数类型, 那么默认为0
* 如果是浮点类型, 那么默认为0.0
* 如果是字符类型, 那么默认为'\u0000'
* 如果是布尔类型, 那么默认为false
* 如果是引用类型, 那么默认为null
* */

public class Demo05ArrayUse {
    public static void main(String[] args) {
        // 动态初始化一个数组
        int[] array = new int[3];

        System.out.println(array); // 内存地址
        System.out.println(array[1]); // 默认值


        array[1] = 132;            // 赋值
        System.out.println(array[1]);
    }
}
