package cn.yjw.day10.demo03;

public class Demo04Student {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("鹿晗");
        student.setAge(20);
        student.setMale(true);

        System.out.println("姓名: " + student.getName());
        System.out.println("年龄: " + student.getAge());
        System.out.println("是不是爷们: " + student.isMale());
    }
}
