public class Demo02DataType{
    public static void main(String[] args){
        // 左边是int类型, 右边是long类型 , 不一样
        // long --> int , 不是从小到大
        // 不能发生自动类型转换
        // 格式: 范围小的类型 范围小的变量名 = (范围小的类型) 原本范围的大的数据
        int num =(int) 100L;
        System.out.println(num); 
    }
}