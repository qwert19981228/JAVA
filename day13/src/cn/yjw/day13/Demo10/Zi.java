package cn.yjw.day13.Demo10;

public class Zi extends Fu{
    int num = 20;

    @Override
    public void method() {
        super.method();
        System.out.println("子类方法");
    }

    public void showNum(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
