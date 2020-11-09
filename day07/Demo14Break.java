public class Demo14Break{
    public static void main(String[] args) {
        for (int i = 1;i <= 10;i++){
            // 如果希望从第四次开始,后续全都不要了,就要打断循环
            if (i == 4){ //如果当前是第四次
                break; // 那么就打断整个循环
            }
            System.out.println("Hello" + i);
        }
    }
}