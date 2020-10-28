public class Demo02Variable{
    public static void main(String[] args){
        // 创建一个变量
        // 格式: 数据类型 变量名称;
        int num1;
        // 向变量当中存入一个数据
        // 格式: 变量名称 = 数据值;
        num1 = 10;
        // 当打印输出变量名称的时候,显示出来的是变量的内容
        System.out.println(num1);

        // 改变变量当中本来的数字,变成新的数字
        num1 = 20;
        System.out.println(num1);

        // 使用一步到位的格式来定义变量
        // 格式: 数据类型 变量名称 = 数据值;
        int num2 = 25;
        System.out.println(num2);

        num2 = 35;
        System.out.println(num2);
        System.out.println("=============");

        byte num3 = 30; // 注意: 右侧数值的范围不能超过左侧数据类型的取值范围
        System.out.println(num3);

        byte num4 = 400
    }
}