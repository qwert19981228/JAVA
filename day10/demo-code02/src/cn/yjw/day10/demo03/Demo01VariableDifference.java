package cn.yjw.day10.demo03;
/*
*
* 局部变量 和 成员变量
* 1. 定义的位置不一样 [重点]
* 局部变量: 在方法的内部
* 成员变量: 在方法的外部 , 直接写在类当中
* */
public class Demo01VariableDifference {

    String name; // 成员变量

    public void methodA(){
        int num = 20; // 局部变量
        System.out.println(num);
        System.out.println(name);
    }

    public void methodB(int param){ // 方法的参数就是局部变量
        // 参数在方法调用的时候 , 必然会被赋值的
        System.out.println(param);
        int age; // 局部变量
//        System.out.println(age);  // 没赋值不能用
//        System.out.println(num);   // 错误写法 !
        System.out.println(name);
    }
}
