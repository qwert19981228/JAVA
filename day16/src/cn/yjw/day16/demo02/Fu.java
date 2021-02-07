package cn.yjw.day16.demo02;

public class Fu {
    int num = 10;
    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
    }

    public void method(){
        System.out.println("父类方法");
    }

    public void methodFu(){
        System.out.println("父类特有的方法");
    }
}
