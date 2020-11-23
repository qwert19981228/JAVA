package cn.yjw.day10.demo02;

/*
* 定义一个类 , 用来模拟"手机"事物
* 属性:品牌 , 价格 , 颜色
* 行为:打电话 , 发短信
*
* */
public class Phone {
    // 成员变量
    String brand; // 品牌
    double price; // 价格
    String color; // 颜色

    // 成员方法
    public void call(String who){
        System.out.println("给" + who + "打电话");
    }
    public void setMessage(){
        System.out.println("群发短信");
    }
}
