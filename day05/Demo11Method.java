public class Demo11Method{
    public static void main(String[] args) {
        farmer(); // 调用农民方法
        seller(); // 调用商贩方法
        cook();   // 调用厨师方法
        me();     // 调用我方法
    }
    // 农民
    public static void farmer(){
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("施肥");
        System.out.println("除虫");
        System.out.println("收割");
        System.out.println("卖给小商贩");
        System.out.println("===============");
    }
    // 商贩
    public static void seller(){
        System.out.println("运输到农贸市场");
        System.out.println("抬高价格");
        System.out.println("吆喝");
        System.out.println("卖给厨子");
        System.out.println("===============");
    }
    // 厨师
    public static void cook(){
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
        System.out.println("===============");
    }
    // 我
    public static void me(){
        System.out.println("吃");
    }
}