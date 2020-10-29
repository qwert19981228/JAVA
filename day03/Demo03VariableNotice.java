public class Demo03VariableNotice {
    public static void main(String[] args){
        int num1 = 10; // 创建了一个新的变量,名叫num1
//        int num1 = 20; // 又创建了另一个新的变量,名字叫num1,错误!
        int num2 = 20;

        int num3;
        num3 = 30;

        int num4; // 定义了一个变量,但是没有进行赋值
        // 直接使用打印输出就是错误的

        // System.out.println(num5); // 在创建变量之前,不能使用这个变量
        int num5 = 500;
        System.out.println(num5);

        {
            int num6 = 60;
            System.out.println(num6);
        }
//        int num6; // 可以在作用域外重新赋值
//        System.out.println(num6); // 已经超出了大括号的范围,超出了作用域,变量不能再使用了

        // 同时创建了三个全都是int类型的变量
        int a,b,c;
        // 各自分别赋值
        a = 30;
        b = 20;
        c = 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // 同时创建了三个int变量 , 并且同时各自赋值
        int x = 100, y = 200, z = 300;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}