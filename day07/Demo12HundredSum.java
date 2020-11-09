/*
    题目:求出1-100之间的偶数和
*/
public class Demo12HundredSum{
    public static void main(String[] args) {
       wsh();
       fsh();
       dwsh();
    }
    // while循环求偶数和
    public static void wsh(){
        // 初始化数值
        int i = 1,sum = 0;
        // 循环开始
        while (i <= 100){
            // 偶数判断
            if (i % 2 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println("while结果是:"+ sum);
    }
    // for循环求偶数和
    public static void fsh(){
        int sum = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("for结果是:"+sum);
    }
    // do...while循环求偶数和
    public static void dwsh(){
        int i = 1,sum = 0;
        do {
            if (i % 2 == 0){
                sum += i;
            }
            i++;
        }while (i <= 100);
        System.out.println("do...while结果是:"+sum);
    }
}