public class Demo08Operator{
    public static void main(String[] args) {
        System.out.println(10 > 5);       // true
        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 < num2);  // true
        System.out.println(num2 >= 100);  // false
        System.out.println(num2 <= 100);  // true
        System.out.println(num2 <= 12);   // true
        System.out.println("===================");

        System.out.println(10 == 10);     // true
        System.out.println(20 != 25);     // true
        System.out.println(20 != 20);     // false

        int x = 2;
//        System.out.println(1 < x < 3); //错误写法! 编译报错! 不能连着写
    }
}