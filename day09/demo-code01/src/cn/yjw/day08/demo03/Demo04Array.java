package cn.yjw.day08.demo03;
/*
* 遍历数组 , 说的就是对数组当中的每一个元素进行逐一处理.默认的处理方式就是打印输出
* */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = new int[]{123,234,345,567,678,789,890};

        // 首先使用原始方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);

        System.out.println("===============");

        // 使用循环 , 次数其实就是数组的长度
        for (int i = 0; i < 6; i++) {
            System.out.println(array[i]);
        }
        System.out.println("===============");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // 数组名称.fori
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
