package cn.yjw.day10.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("迪丽热巴");
        student1.setAge(20);
        System.out.println("姓名: " + student1.getName() + " 年龄: " + student1.getAge());
        System.out.println("=====================");

        Student student2 = new Student("古力娜扎",22);
        System.out.println("姓名: " + student2.getName() + " 年龄: " + student2.getAge());
        student2.setName("大咪咪");
        System.out.println("姓名: " + student2.getName() + " 年龄: " + student2.getAge());


    }
}
