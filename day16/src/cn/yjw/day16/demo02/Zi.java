package cn.yjw.day16.demo02;

public class Zi extends Fu{
    int num = 20;

    @Override
    public void show() {

        System.out.println(num);
        System.out.println(super.num);

    }
}
