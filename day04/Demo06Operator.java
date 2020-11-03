public class Demo06Operator{
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1); // 10
        ++num1; // 单独使用, 前++
        System.out.println(num1); // 11
        num1++; // 单独使用, 后++
        System.out.println(num1); // 12
        System.out.println("====================");

        // 与打印操作混合的时候
        int num2 = 20;
        // 混合使用, 先++ , 变量立刻马上变成21 , 然后打印结果21
        System.out.println(++num2); // 21
        System.out.println(num2);   // 21
        System.out.println("====================");

        int num3 = 30;
        // 混合使用 , 后++ , 首先使用变量本来的30 , 然后再让变量+1得到31
        System.out.println(num3++); // 30
        System.out.println(num3);   // 31
        System.out.println("====================");

        // 和赋值操作混合
        int num4 = 40;
        // 混合使用 . 前--, 变量立刻马上-1变成39 , 然后将结果39交给result1变量
        int result1 = --num4;
        System.out.println(result1);  // 39
        System.out.println(num4);     // 39
        System.out.println("====================");

        int num5 = 50;
        // 混合使用 , 后--, 首先把本来的数字50交给result2, 然后我自己再-1变成49
        int result2 = num5--;
        System.out.println(result2); // 50
        System.out.println(num5);    // 49
        System.out.println("====================");

        int x = 10;
        int y = 20;
        // 11 + 20 = 31
        int result3 = ++x + y--;
        System.out.println(result3);  // 31
        System.out.println(x);        // 11
        System.out.println(y);        // 19

        // 30++; // 错误写法! 常量不可以使用++或者--
    }
}