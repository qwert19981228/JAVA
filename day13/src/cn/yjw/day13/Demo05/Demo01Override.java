package cn.yjw.day13.Demo05;

/*
* 方法覆盖重写的注意事项:
* 1.必须保证父子类之间方法的名称相同,参数列表也相同
* @override:写在方法前面, 用来检测是不是有效的正确覆盖重写
*
* 2.子类方法的返回值必须[ 小于等于 ]父类方法的返回值范围
* 小扩展提示:java.lang.Object类是所有类的公共最高父类(祖宗类),java.lang.String是Object的子类
*
* 3.子类方法的权限必须[ 大于等于 ]父类方法的权限修饰符
* 小扩展提示:public > protected > (default) > private
* 备注:(default)不是关键字 , 而是什么都不写 , 留空
* */

public class Demo01Override {

}
