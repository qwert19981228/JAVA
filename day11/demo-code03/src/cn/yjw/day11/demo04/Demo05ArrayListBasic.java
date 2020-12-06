package cn.yjw.day11.demo04;

import java.util.ArrayList;
/*
* 如果希望向集合ArrayList当中存储基本类型数据, 必须使用基本类型对应的包装类
*
* 基本类型           包装类(引用类型, 包装类都位于java.lang包下)
* byte              Byte
* short             Short
* int               Integer [特殊]
* long              Long
* float             Float
* double            Double
* char              Character
* boolean           Boolean
*
* 从JDK 1.5+开始, 支持自动装箱, 自动拆箱
* 自动装箱: 基本类型 --> 包装类型
* 自动拆箱: 包装类型 --> 基本类型
* */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listS = new ArrayList<>();
        // 错误写法! 泛型只能是引用类型 , 不能是基本类型
//        ArrayList<int> listI = new ArrayList<int>();

        ArrayList<Integer> listI = new ArrayList<>();
        listI.add(100);
        listI.add(200);
        System.out.println(listI);

        int num = listI.get(1);
        System.out.println("第一号元素是: " + num);
    }
}