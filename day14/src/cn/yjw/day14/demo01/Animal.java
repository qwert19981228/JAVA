package cn.yjw.day14.demo01;

/*
* 抽象方法:就是加上abstract关键字 , 然后去掉大括号, 直接分号结束
* 抽象类:抽象方法所在的类, 必须是抽象类才行, 在class之前写上abstract即可
* */
public abstract class Animal {

    // 这是一个抽象方法 , 代表吃东西, 但是具体吃什么不确定
    public abstract void eat();

    // 这是普通的成员方法
    public void normalMethod(){
        
    }
}
