public class Demo13Notice{
    public static void main(String[] args) {
        short num1 = 10; // 正确写法, 右侧没有超过左侧的范围

        short a = 5;
        short b = 8;
        // short + short --> int + int --> int
//        short result = a + b; // 错误写法! 左侧需要int类型
        // 右侧不用变量 , 而是采用常量 , 而且只有两个常量 , 没有其他
        short result = 5 + 8;
        System.out.println(result);
    }
}