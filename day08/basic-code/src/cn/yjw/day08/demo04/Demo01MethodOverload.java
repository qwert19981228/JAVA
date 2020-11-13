package cn.yjw.day08.demo04;
/*
* 方法的重载与下列因素相关:
* 1.参数的个数不同
* 2.参数类型不同
* 3.参数的多类型顺序不同
*
* 方法重载与下列因素无关:
* 1.与参数的名称无关
* 2.与方法返回值类型无关
* */

public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,4,5));
        System.out.println(sum(1,5,7,9));
    }
    public static int sum(int a , double b){
        return (int) (a + b);
    }
    public static int sum(double a , int b){
        return (int) (a + b);
    }
    public static int sum(double a , double b){
        return (int) (a + b);
    }
    public static int sum(int a , int b){
        System.out.println("有两个参数的方法执行!");
        return a + b;
    }
    public static int sum(int a ,int b , int c){
        System.out.println("有三个参数的方法执行!");
        return a + b + c;
    }
    public static int sum(int a , int b, int c , int d){
        System.out.println("有四个参数的方法执行!");
        return a + b + c + d;
    }
}
