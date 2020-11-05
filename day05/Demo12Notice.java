public class Demo12Notice {
    public static void main(String[] args) {
        // 右侧确实是一个int数字, 但是没有超过左侧的范围, 就是正确的
        // int --> byte , 不是自动类型转换
        byte num1 = /*(byte)*/30; // 右侧没有超过左侧的范围
        System.out.println(num1);

//        byte num2 = 128; // 右侧超过了左侧的范围
        // int --> char , 没有超过范围
        // 编译器将会自动补上一个隐含的(char)
        char zifu = /*(char)*/ 65;
        System.out.println(zifu);
    }
}