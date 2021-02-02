package cn.yjw.day12.demo03;

public class Student {
    private String name; // 姓名
    private int age; // 年龄
    static String room; // 所在教室

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
