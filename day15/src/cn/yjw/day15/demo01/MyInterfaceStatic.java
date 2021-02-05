package cn.yjw.day15.demo01;

/*
* 从Java8开始, 接口当中允许定义静态方法
* 格式:
* public static 返回值类型 方法名称(参数列表){
*   方法体
* }
* 就是将abstract或者default换成static即可, 带上方法体
*
* 注意: 不能通过接口实现类的对象来调用接口当中的静态方法
* 正确用法:通过接口名称, 直接调用其中的静态方法
* 格式:
* 接口名称.静态方法名(参数);
* */
public interface MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("这是接口的静态方法!");
    }
}
