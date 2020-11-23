package cn.yjw.day10.demo02;

public class Demo04Param {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "魅族";
        one.color = "梦幻独角兽";
        one.price = 3699.0;
        method(one); // 传递进去的参数其实就是地址值
    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);
    }
    
}
