package cn.yjw.day16.demo02;

public class Zi extends Fu{
    int num = 20;

    @Override
    public void show() {

        System.out.println(num);
        System.out.println(super.num);

    }

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    public void methodZi(){
        System.out.println("子类特有的方法");
    }
}
