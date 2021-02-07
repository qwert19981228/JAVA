package cn.yjw.day16.demo02;

/*
* 在多态的代码中, 成员方法的访问规则是
*   看new的是谁, 就优先用谁, 没有则向上找
* 口诀: 编译看左边, 运行看右边
*
* 对比一下:
* 成员变量: 编译看左边, 运行还看左边
* 成员方法: 编译看左边, 运行看右边
* */
public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
    }
}
