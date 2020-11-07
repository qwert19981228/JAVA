// 题目: 使用三元运算符和标准的if-else语句分别实现:取两个数字当中的最大值
public class Demo06MaxNUM{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // 首先使用三元运算符
//        int max = a > b ? a : b;
        int max;
        if (a > b){
            max = a;
        }else {
            max = b;
        }
        System.out.println(max);
    }
}