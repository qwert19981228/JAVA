package cn.yjw.day10.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "迪丽热巴";
//        person.age = 18;
        person.setAge(20);
        person.show();
    }
}
