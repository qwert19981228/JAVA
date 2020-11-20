package cn.yjw.day09.demo03;

/*
* 如何获取数组的长度,格式: 数组名称.length
* 将会得到一个int数字 , 代表数组的长度
*
* 数组一旦创建 , 程序运行期间 , 长度不可改变
*  */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = new int[]{ 12,234,3456,123,234,345,3456,456,456,231,234,2,2,3,4,5,578,49,9,3,234,9,45 };
        int len = arrayB.length;
        System.out.println("arrayB数组的长度是: " + len);
        System.out.println("=======================");

        int[] arrayC = new int[3];
        System.out.println(arrayC);
        arrayC = new int[5];
        System.out.println(arrayC); // 内存地址发生改变
    }
}
