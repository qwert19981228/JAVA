public class Demo15Continue{
    public static void main(String[] args) {
        for (int i = 1;i<=10;i++){
            if (i == 4){
                continue;// 那么跳过当前次循环 , 马上开始下一次
            }
            System.out.println(i+"层到了");
        }
    }
}
