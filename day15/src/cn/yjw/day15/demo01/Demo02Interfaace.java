package cn.yjw.day15.demo01;

public class Demo02Interfaace {
    public static void main(String[] args) {
        // 创建了实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs(); // 调用抽象方法, 实际运行的是右侧实现类

        // 调用默认方法 , 如果实现类没有, 会向上找接口
        a.methodDefault();

        System.out.println("===========================");
        
        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodDefault();
        b.methodAbs();
    }
}
