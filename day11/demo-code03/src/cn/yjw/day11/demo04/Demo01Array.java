package cn.yjw.day11.demo04;

/*
* 题目: 定义一个数组 , 用来存储3个Person对象
*
* 数组有一个缺点 , 一旦创建 , 程序运行期间长度不可发生改变
* */

public class Demo01Array {
    public static void main(String[] args) {
        // 首先创建一个长度为3的数组 , 里面用来存放Person类型的对象
        Person[] array = new Person[3];

        Person person1 = new Person("迪丽热巴",12);
        Person person2 = new Person("古力娜扎",20);
        Person person3 = new Person("马尔扎哈",198);

        // 将one当中的地址值赋值到数组的0号元素位置
        array[0] = person1;
        array[1] = person2;
        array[2] = person3;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[1].getName());
    }
}
