public class Demo07Operator{
    public static void main(String[] args) {
        int a = 10;
        // 按照公式进行翻译: a = a + 5
        // a = 10 + 5;
        // a = 15;
        // a 本来是10,现在重新赋值得到15
        a += 5;
        System.out.println(a); // 15

        int x = 10;
        // x = x % 3;
        // x = 10 % 3;
        // x = 1;
        // x本来就是10,现在重新赋值得到1
        x %= 3;
        System.out.println(x); // 1

        // 50 = 30; // 常量不能进行赋值 , 不能写在赋值运算符的左边. 错误写法!

        byte num = 30;
        // num = num + 5;
        // num = byte + int
        // num = int + int
        // num = int
        // num = (byte) int
        num += 5;
        System.out.println(num); // 35
    }
}