package cn.yjw.day14.demo03;

/*
* 抽象方法和抽象类的注意事项:
* 1.抽象类不能直接创建对象, 如果创建, 编译无法通过而报错, 只能创建其非抽象子类的对象
* 2.抽象类中, 可以有构造方法, 是供子类创建对象时, 初始化父类使用的
* 3.抽象类中, 不一定包含抽象方法, 但是有抽象方法的类必定是抽象类
* 4.抽象类的子类 ,必须重写抽象父类中所有的抽象方法, 否则,编译无法通过而报错, 除非该子类也是抽象类
* */

public class DemoMain {
    public static void main(String[] args) {
//        Animal animal = new Animal();

        Dog2Ha dog2Ha = new Dog2Ha();
        dog2Ha.sleep();
        dog2Ha.eat();

        DogGolden dogGolden = new DogGolden();
        dogGolden.sleep();
        dogGolden.eat();
    }
}
