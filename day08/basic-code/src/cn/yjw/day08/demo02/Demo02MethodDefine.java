package cn.yjw.day08.demo02;
/*
方法其实就是若干语句的功能集合:
方法好比是一个工厂
*/
public class Demo02MethodDefine {
    public static void main(String[] args) {
        // 打印调用
        System.out.println(sum(10,20));
    }
    public static int sum(int a,int b){
        int result = a+b;
        return result;
    }
}
