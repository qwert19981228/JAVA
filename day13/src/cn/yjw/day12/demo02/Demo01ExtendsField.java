package cn.yjw.day12.demo02;

/*
* 在父子类的继承关系当中,如果成员变量重名,则创建子类对象时,访问有两种方式:
*
* 直接通过子类对象访问成员变量:
*   等号左边是谁,就优先用谁,没有则向上找
* 间接同通过成员方法访问成员变量:
*   该方法属于谁,就优先用谁,没有则向上找
* */

public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        System.out.println("===========");

        Zi zi = new Zi();
        System.out.println(zi.numZi);
        System.out.println(zi.numFu);
        System.out.println("===========");

        // 等号左边是谁,就优先用谁
        System.out.println(zi.num);
        System.out.println("===========");

        // 这个方法是子类的,优先用子类的,没有再向上找
        zi.methodZi();
        // 这个方法是在父类当中定义的
        zi.methodFu();
    }
}
