package cn.yjw.day16.demo03;


/*
* 如何才能知道一个父类引用的对象, 本来是什么子类?
* 格式:
* 对象 instanceof 类名称
* 这将会得到一个boolean值结果, 也就是判断前面的对象能不能当作后面类型的实例
* */
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();  // 本来的创建时候是一只猫
        animal.eat();

        // 如果希望用子类特有方法, 需要向下转型
        // 判断一下父类引用animal本来是不是dog
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        giveMeAPet(new Dog());
    }

    public static void giveMeAPet(Animal animal){
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
