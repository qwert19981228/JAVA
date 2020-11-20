package cn.yjw.day09.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5,15,30,20,10000,-20,-30};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("最大值: "+ max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("最小值: "+ min);
    }
}
