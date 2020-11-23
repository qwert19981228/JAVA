package cn.yjw.day10.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println(two.brand);
    }
    public static Phone getPhone(){
        Phone phone = new Phone();
        phone.price = 79879.0;
        phone.color = "屎黄色";
        phone.brand = "苹果";
        return phone;
    }
}
