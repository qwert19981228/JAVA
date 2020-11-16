package cn.yjw.day08.demo01;

/*
* 省略格式:
* 数据类型[] 数据名称 = { 元素1 , 元素2 , 元素3 , ... };
*
* 注意事项:
* 1.静态初始化没有直接指定长度 , 但是仍然会自动推算得到长度.
* 2.静态初始化标准格式可以拆分成为两个步骤
* 3.动态初始化也可以拆分成为两个步骤
* 4.静态初始化一旦使用省略格式, 就不能拆分成为两个步骤了
*
* 使用建议:
* 如果不确定数组当中的具体内容 , 用动态初始化 , 否则 , 已经确定了具体内容 , 用静态初始化
* */
public class Demo03Array {
    public static void main(String[] args) {
        // 省略格式的静态初始化
        int[] arrayA = { 10,20,30 };

        // 静态初始化的标准格式 , 可以拆分成为两个步骤
        int[] arrayB;
        arrayB = new int[]{ 10,20,30 };

        // 动态初始化也可以拆分成为两个步骤
        int[] arrayC;
        arrayC = new int[100];

        // 静态初始化的省略格式 , 不能拆分成为俩个步骤
//        int[] arrayD;                 // 错误写法
//        arrayD = { 10 , 20 ,30};
    }
}
