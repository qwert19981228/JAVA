public class Demo13LoopDifference{
    public static void main(String[] args) {
        for (int i = 1;i < 0;i++){
            System.out.println("hello");
        }
//        System.out.println(i); // 这一行是错误写法!因为变量i定义在for循环小括号内,只有for循环自己才能用
        System.out.println("=============");

        int i = 1;
        do {
            System.out.println("world");
            i++;
        }while (i<0);
        // 现在已经超出了do-while循环的范围 , 我们仍然可以使用变量i
        System.out.println(i); // 2
    }
}