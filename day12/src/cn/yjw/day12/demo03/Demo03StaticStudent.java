package cn.yjw.day12.demo03;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        // 首先设置一下教室 , 这是静态的东西, 应该通过类名称进行调用
        Student.room = "101教室";

        Student one = new Student("郭靖",20);
        System.out.println("姓名: " + one.getName());
        System.out.println("年龄: " + one.getAge());
        System.out.println("教室: " + Student.room);

        Student two = new Student("黄蓉",20);
        System.out.println("姓名: " + two.getName());
        System.out.println("年龄: " + two.getAge());
        System.out.println("教室: " + Student.room);
    }
}
