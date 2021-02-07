package cn.yjw.day16.demo03;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃SHIT");
    }

    public void watchHouse(){
        System.out.println("狗看家");
    }
}
