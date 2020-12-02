package cn.yjw.day10.demo03;
/*
* 对于基本类型当中的boolean值 , Getter方法一定要写成isXxx的形式 , 而setXxx规则不变
* */
public class Student {
    private String name; // 姓名
    private int age;
    private boolean male;

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return male;
    }
}
