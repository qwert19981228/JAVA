package cn.yjw.day16.demo03;

/*
* 向上转型一定是安全的, 没有问题的, 正确的, 但是也有一个弊端
* 对象一旦向上转型为父类, 那么就无法调用子类原本特有的内容
* 解决方案: 用对象的向下转型还原
* */
public class Demo01Main {
    public static void main(String[] args) {
        // 对象的向上转型, 就是: 父类引用指向子类对象
        Animal animal = new Cat();

        animal.eat();
    }
}
