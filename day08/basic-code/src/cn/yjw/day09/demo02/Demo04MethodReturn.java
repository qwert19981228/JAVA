package cn.yjw.day09.demo02;
/*
题目要求:定义一个方法,用来求出两个数字之和.(你帮我算, 算完之后把结果告诉我)
题目变形:定义一个方法,用来打印两个数字之和.(你来计算,算完之后你自己负责显示结果,不用告诉我)
*/

public class Demo04MethodReturn {
    public static void main(String[] args) {
        // 我是main方法 , 我来调用你
        // 我调用你 , 你来帮我计算一下 , 算完了之后 , 把结果告诉我的num变量
        int num = getsum(10,23);
        System.out.println("返回值是 " + num);
        System.out.println("==============");

        printsum(10,20);
        System.out.println("==============");

        System.out.println(getsum(2,3)); // 正确写法
        getsum(4,5); // 正确写法 , 但是返回值没有用到
        System.out.println("==============");

        // 对于void没有返回值的方法 , 只能单独 , 不能打印或者赋值
//        System.out.println(printsum(2,3));
//        System.out.println(void);

//        int num2 = printsum(10,20); // 错误写法
//        int num3 = void;
//        void num4 = void;
    }
    // 我是一个方法 , 我负责两个数字相加
    // 我有返回值int , 谁调用我 , 我就把计算结果告诉谁
    public static int getsum(int a, int b){
        int result = a + b;
        return result;
    }

    // 我是一个方法 , 我负责两个数字相加.
    // 我没有返回值, 不会把结果告诉任何人 , 而是我自己进行打印输出
    public static void printsum(int a , int b){
        int result = a + b;
        System.out.println("结果是: " + result);
    }
}
