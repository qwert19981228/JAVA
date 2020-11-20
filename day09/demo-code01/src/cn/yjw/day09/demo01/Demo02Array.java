package cn.yjw.day09.demo01;
/*
* 静态初始化基本格式:
* 数据类型[] 数组名称 = new 数据类型[]{元素1, 元素2, 元素3, ...}
*
* 注意事项:
*   虽然静态初始化没有直接告诉长度 , 但是根据大括号里面的元素具体内容 ,也可以自动推算出来长度
* */
public class Demo02Array {
    public static void main(String[] args) {
        // 直接创建一个数组 , 里面装的全都是int数字 , 具体为5 ,15 25
        int[] arrayA = new int[]{ 5,15,25 };

        // 创建一个数组 , 用来装字符串: "Hello" , "World" , "Java"
        String[] arrayB = new String[]{ "Hello" , "World" , "Java" };
    }
}
