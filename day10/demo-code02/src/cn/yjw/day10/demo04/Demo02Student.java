package cn.yjw.day10.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("============");
        Student student2 = new Student("赵丽颖",80);
        System.out.println("姓名: " + student2.getName() + " 年龄: " + student2.getAge());
        // 如果需要改变对象当中的成员变量数据内容 , 仍然还需要使用setXxx方法
        student2.setAge(21);
        System.out.println("姓名: " + student2.getName() + " 年龄: " + student2.getAge());
    }
}
