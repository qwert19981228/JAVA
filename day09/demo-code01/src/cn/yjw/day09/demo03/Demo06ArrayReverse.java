package cn.yjw.day09.demo03;
/*
* 数组元素反转
* */

public class Demo06ArrayReverse {
    public static void main(String[] args) {
        int[] array = {2,3,5,6,7,8,1,2};

        // 遍历数组本来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("===============");

        /*
        * 初始化语句: int min = 0 , max = array.length-1
        * 条件判断: min < max
        * 步进表达式: min++ , max--
        * 循环体:用第三个变量倒手
        * */
        for (int min = 0 ,max = array.length-1;min < max;min++,max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        // 再次打印遍历输出数组后来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
