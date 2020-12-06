package cn.yjw.day11.demo05;

import java.util.ArrayList;

/*
* 题目: 自定义4个学生对象, 添加到集合 , 并遍历
* */
public class Demo02ArrayListStudent {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("洪七公",20);
        Student student2 = new Student("欧阳锋",21);
        Student student3 = new Student("黄药师",22);
        Student student4 = new Student("段智兴",23);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("姓名: " + student.getName() + " 年龄: " + student.getAge());
        }
    }


}
