package cn.yjw.day10.demo02;

public class Demo02PhoneTwo {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        System.out.println(phone1.brand); // null
        System.out.println(phone1.color); // null
        System.out.println(phone1.price); // double
        System.out.println("=========");

        phone1.brand = "魅族";
        phone1.color = "玫瑰金";
        phone1.price = 3699.0;
        System.out.println(phone1.price);
        System.out.println(phone1.color);
        System.out.println(phone1.brand);
        System.out.println("=========");

        phone1.call("乔布斯");
        phone1.setMessage();

        Phone phone2 = new Phone();
        System.out.println(phone2.brand); // null
        System.out.println(phone2.color); // null
        System.out.println(phone2.price); // double
        System.out.println("=========");

        phone2.brand = "华为";
        phone2.color = "墨绿";
        phone2.price = 4699.0;
        System.out.println(phone2.price);
        System.out.println(phone2.color);
        System.out.println(phone2.brand);
        System.out.println("=========");

        phone2.call("任正非");
        phone2.setMessage();

    }
}
