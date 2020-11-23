package cn.yjw.day10.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.brand); // null
        System.out.println(phone.color); // null
        System.out.println(phone.price); // double
        System.out.println("=========");

        phone.brand = "魅族";
        phone.color = "玫瑰金";
        phone.price = 3699.0;
        System.out.println(phone.price);
        System.out.println(phone.color);
        System.out.println(phone.brand);
        System.out.println("=========");

        phone.call("乔布斯");
        phone.setMessage();

    }
}
