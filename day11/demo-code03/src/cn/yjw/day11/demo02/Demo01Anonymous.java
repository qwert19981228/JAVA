package cn.yjw.day11.demo02;
/*
* 匿名对象就是只有右边的对象, 没有左边的名字和赋值运算符
* new 类名称();
*
* 注意事项: 匿名对象只能使用唯一的一次, 下次再用不得不再创建一个对象
* 使用建议: 如果确定有一个对象只需要使用唯一的一次, 就可以用匿名对象
* */
public class Demo01Anonymous {
    public static void main(String[] args) {
        // 左边的person1就是对象的名字
        Person person1 = new Person();
        person1.name = "高圆圆";
        person1.showName();
        System.out.println("==============");

        // 匿名对象
        new Person().name = "赵又廷";
        new Person().showName(); // 我叫 , null
    }
}
