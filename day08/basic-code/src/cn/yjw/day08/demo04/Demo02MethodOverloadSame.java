package cn.yjw.day08.demo04;
/*题目要求:
* 比较两个数据是否相等
* 参数类型分别为两个byte类型 , 两个short类型 , 两个int类型 , 两个long类型
* 并在main方法中进行测试*/
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {

        System.out.println(isSame((byte) 12,(byte) 34));
        System.out.println(isSame((short)12,(short) 34));
        System.out.println(isSame(12,34));
        System.out.println(isSame(12L,34L));

    }
    public static boolean isSame(byte a , byte b){
        System.out.println("执行byte");
        boolean same;
        same = a == b;
        return same;
    }

    public static boolean isSame(short a , short b){
        System.out.println("执行short");
        boolean same;
        same = a == b;
        return same;
    }

    public static boolean isSame(int a , int b){
        System.out.println("执行int");
        boolean same;
        same = a == b;
        return same;
    }

    public static boolean isSame(long a , long b){
        System.out.println("执行long");
        boolean same;
        same = a == b;
        return same;
    }
}
