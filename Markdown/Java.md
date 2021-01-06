[TOC]

# Java

## 计算机基础知识

### 二进制

计算机中全部采用二进制数表示 , 它只包含0 , 1两个数 , 逢二进一 , 每一个0或者每一个1 , 叫做一个 `bit` (比特位)

### 十进制转换为二进制

十进制除以二 , 取余数 , 从下至上

### 二进制转换为十进制

右对齐 相乘 , 得数相加



## 字节

字节是我们常见的计算机中最小存储单元 . 计算机获取任何的数据都是以字节的形势存储

8个`bit`(二进制位) 0000-0000 表示为1个字节 , 写成 `1byte` 或者 `1B`

`8bit` = `1Byte`

`1024B` = `1KB`

`1024KB` = `1MB`

`1024MB` = `1GB`

`1024GB` = `1TB`

`1024TB` = `1PB`

`1024PB` = `1EB`

`1024EB` = `1ZB`



## CMD

启动									: `Win + R` , 输入`cmd`回车

切换盘符							: 盘符名称 : 

进入文件夹						: `cd` 文件夹名称

进入多级文件夹				: `cd` 文件夹1 \ 文件夹2 \ 文件夹3 ....

返回上一级						: `cd` . .

直接回根路径					:  `cd` \ 

查看当前内容					: `dir`

清屏									: `els`

退出									: `exit`



## 跨平台性

JVM( Java Virtual Machine ) : Java虚拟机 , 简称JVM

是运行所有Java程序的假想机 , 是Java程序的运行环境 , 是Java最具吸引力的特性之一

Java的虚拟机本身不具备跨平台功能的 , 每个操作系统下都有不同版本的虚拟机



## JRE和JDK

JRE( Java Runtime Environment ) : 是Java程序的运行时环境 , 包含JVM和运行时所需要的核心类库

JDK( Java Development Kit ) : 是Java程序开发工具包 , 包含JRE和开发人员使用的工具



## HelloWorld

Java程序开发三步骤 : 编写 , 编译 , 运行

Java源程序 --- > 编译器 --- > 生成Java字节码文件( .class ) --- > JVM运行

```java
public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello, World!!!");
	}
}
```



## 注释

```java
// 单行注释
/* 多行注释 */
```



## 单词解释

`public class` 后面代表一个类的名称 , 类是`Java`当中所有源代码的基本组织单位

类名称要和所在文件的名称完全一样 , 大小写也要完全一样

`main`方法是万年不变的固定方法 , 是程序的起点

 `System out println( );` 为打印输出语句

```java
public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello, World!!!");
	}
}
```



## 关键字

特点 : 

1.  完全小写的字母
2.  编辑器有特殊颜色



## 标识符

在程序中 , 自定义内容的名称

命名规则 :

- 硬性要求 : 
  1. 必须使用英文字母 , 数字 , $美元符号 和 _ (下划线)
  2. 不能以数字开头
  3. 不能是关键字
- 软性要求 : 
  1. 类名 : 首字母大写 , 后面每个单词首字母大写
  2. 变量名 : 首字母小写 , 后面每个单词首字母大写
  3. 方法名 : 同变量名



## 常量

### 定义

定义 : 在程序运行期间 , 固定不变的量

### 分类

分类 : 

1. 字符串变量 : 凡是用双引号引起来的部分 , 叫做字符串常量

   ```
   例如 : "abc" , "Hello" , "123"
   ```

2. 整数常量 : 直接写上的数字 , 没有小数点

   ```
   例如 : 100 , 200 , 0 , -250
   ```

3. 浮点数常量 : 直接写上的数字 , 有小数点

   ```
   例如 : 2.5 , -3.14 , 0.0
   ```

4. 字符常量 : 凡是用单引号引起来的单个字符

   ```
   例如 : 'A' , 'b' , '9' ,'中'
   ```

5. 布尔常量 : 只两种取值 , `true` , `false`

6. 空常量 : `null` . 代表没有任何数据



## 数据类型

### 基本数据类型

基本数据类型 : 整数型 , 浮点型 , 字符型 , 布尔型

### 引用数据类型

引用数据类型 : 字符串 , 数组 , 类 , 接口 , `lambda`

| 整数型 | 浮点型 | 字符型 | 布尔型 |
| :----: | :----: | :----: | :----: |
| `byte` | `float` | `char` | `boolean` |
| `short` | `double` |  |  |
| `int` |  |  |  |
| `long` |  |  |  |

### 取值范围

|   数据类型   |  关键字   | 内存占用 |       取值范围       |
| :----------: | :-------: | :------: | :------------------: |
|    字节型    |  `byte`   | 1个字节  |       -128~127       |
|    短整型    |  `short`  | 2个字节  |     -32768~32767     |
|     整型     |   `int`   | 4个字节  |     -2^31~2^31-1     |
|    长整型    |  `long`   | 8个字节  |     -2^63~2^63-1     |
| 单精度浮点数 |  `float`  | 4个字节  |  1.4013E~3.4028E+38  |
| 双精度浮点数 | `double`  | 8个字节  | 4.9E-324~1.7977E+308 |
|    字符型    |  `char`   | 2个字节  |       0~65535        |
|   布尔类型   | `boolean` | 1个字节  |      true\false      |

### 注意事项

注意事项 : 

1. 字符串不是基本类型而是引用类型
2. 浮点型可能只是一个近似值 , 并非精确的值
3. 数据范围与字节数不一定相关 , 例如`float`数据范围比`long`更加广泛 , 但是`float`是4字节 , `long`是8字节
4. 浮点数当中默认类型是`double` , 如果一定要使用`float`类型 , 需要后缀`F `, 如果是整数 , 默认为`int`类型 , 如果一定要使用`long`类型 , 需要加上一个后缀`L`

```java
public class Demo01Const{
    public static void main(String[] args){
        // 字符串常量
        System.out.println("ABC");
        System.out.println(""); // 字符串两个引号中间的内容为空
        System.out.println("XYZ");
        // 整数常量
        System.out.println(30);
        System.out.println(-500);
        // 小数常量
        System.out.println(3.14);
        System.out.println(-2.5);
        // 字符常量
        System.out.println('A');
        System.out.println('6');
        // System.out.println('');	// 两个引号中间必须有且仅有一个字符 , 没有不行
        // System.out.println('AB');// 两个单引号中间必须有且仅有一个字符 , 没有不行
        // 布尔常量
        System.out.println(true);
        System.out.println(false);
        // 空常量. 空常量不能直接用来打印输出
        // System.out.println(null); 
    }
}
```



## 变量

### 定义

定义 : 程序运行期间 , 内容可以发生改变的量

### 格式

创建一个变量并且使用的**格式** :

```
数据类型 变量名称 ;	// 创建了一个变量
变量名称 = 数据值 ; // 赋值 , 将右边的数据值 , 赋值交给左边的变量
```

一步到位的**格式** : 

```
数据类型 变量名称 = 数据值; // 在创建一个变量的同时 , 立刻放入指定的数据值
```

### 注意事项

注意事项 :

1. 如果创建多个变量 , 那么变量之间的名称不可以重复

2. 对于`float`和`long`类型来说 , 字母后缀F和L不要丢掉

3. 如果使用`byte`或者`short`类型的变量 , 那么右侧的数据值不能超过左侧类型的范围

4. 没有进行赋值的变量 , 不能直接使用 ; 一定要赋值以后 , 才能使用

5. 变量使用不能超过作用域的范围

   [**作用域**] : 从定义变量的一行开始 , 一直到直接所属的大括号结束为止

6. 可以通过一个语句来创建多个变量 , 但是一般情况下不推荐这么写

```java
public class Demo02Variable{
    public static void main(String[] args){
        // 创建一个变量
        // 格式 : 数据类型 变量名称;
        int num1;
        // 向变量当中存入一个数值
        // 格式 : 变量名称 = 数据值;
        num1 = 10;
        // 当打印输出变量名称的时候 , 显示出来的是变量的内容
        System.out.println(num1);
        // 改变变量当中本来的数字 , 变成新的数字
        num1 = 20;
        System.out.println(num1);
       
        // 使用一步到位的格式来定义变量
        // 格式 : 数据类型 变量名称 = 数据值;
        int num2 = 25;
        System.out.println(num2);
        
        num2 = 35;
        System.out.println(num2);
        System.out.println("============");
        
        byte num3 = 40; // 注意: 右侧数值的范围不能超过左侧数据类型的取值范围
        System.out.println(num3);
        
        // byte num4 = 400; // 右侧超出了byte数据范围 , 错误!
    
        short num5 = 50;
        System.out.println(num5);
        
        long num6 = 3000000000L;
        System.out.println(num6);
        
        float num7 = 2.5F;
        System.out.println(num7);
        
        double num8 = 1.3;
        System.out.println(num8);
        
        char zifu1 = 'A';
        System.out.println(zifu1);
        
        zifu1 = '中';
        System.out.println(zifu1);
        
        boolean var1 = true;
        System.out.println(var1);
        
        var1 = false;
        System.out.println(var1);
        
        // 将一个变量的数据内容 , 赋值交给另一个变量
        // 右侧的变量名称var1已经存在 , 里面装的是false布尔值
        // 将右侧变量里面的false值 , 向左交给var2变量进行存储
        boolean var2 = var1;
        System.out.println(var2);
        
    }
}
```





## 数据类型转换

### 定义

当数据不一样的时候 , 将会发生数据类型转换

### 自动类型转换

自动类型转换(隐式):

1. 特点: 代码不需要进行特殊处理 , 自动完成
2. 规则: 数据范围从小到大

### 强制类型转换

强制了类型转换(显示):

1. 特点: 代码需要进行特殊的格式处理 , 不能自动完成
2. 格式: 范围小的类型 范围小的变量名 = (范围小的类型)  原本范围大的数据;

### 注意事项

注意事项:

1. 强制类型转换一般不推荐使用 , 因为可能发生精度损失 , 数据溢出
2. byte/short/char这三种类型都可以发生数学运算 , 例如加法"+"
3. byte/short/char这三种类型在运算的时候 , 都会被首先提升成为`int`类型 , 然后再计算
4. `boolean`类型不能发生数据类型转换
5. 对于byte/short/char三种类型来说 , 如果右侧赋值的数值没有超过范围 , 那么`javac`编译器将会自动隐含地为我们补上一个(byte)(short)(char)
   - 如果没有超过左侧的范围 , 编译器补上强转
   - 如果右侧超过了左侧的范围. 那么编译器直接报错
   - 在给变量进行赋值的时候 , 如果右侧的表达式当中全都是常量 , 没有任何变量 , 那么编译器`javac`将会直接将若干个常量表达式计算得到结果 .
   - 一旦表达式中有变量参与 , 那么将不能进行这种优化了

```java
// 自动类型转换
public class Demo01DataType{
    public static void main(String[] args){
        System.out.println(1024); // 这就是一个整数 , 默认就是int类型
        System.out.println(3.14); // 这就是一个浮点数 , 默认就是double类型
        
        // 左边是long类型 , 右边是默认的int类型 , 左右不一样
        // 一个等号代表赋值 , 将右侧的int常量 , 交给左侧的long变量进行存储
        // int --> long , 符合了数据范围从小到大的要求
        // 这一行代码发生了自动类型转换
        long num1 = 100;
        System.out.println(num1);
        
        // 左边是double类型 , 右边是float类型 , 左右不一样
        // float --> double , 符合从小到大的规则
        // 也发生了自动类型转换
        double num2 = 2.5F;
        System.out.println(num2);
        
        // 左边是float类型 , 右边是long类型 , 左右不一样
        // long --> float , 范围是float更大一些 , 符合从小到大的规则
        // 也发生了自动类型转换
        float num3 = 30L;
        System.out.println(num3);
    }
}
// 强制类型转换
public class Demo02DataType{
    public static void main(String[] args){
        // 左边是int类型 , 右边是long类型 , 不一样
        // long --> int , 不是从小到大
        // 不能发生自动类型转换
        // 格式: 范围小的类型 范围小的变量名 = (范围小的类型) 原本范围的大的数据
        int num = (int)100L;
        System.out.println(num);
        
        // long强制转换为int类型 数据溢出
        int num2 = (int) 60000000000L;
        System.out.println(num2); // 1705032704
    
        // double --> int 强制类型转换 精度损失
        int num3 = (int) 3.99;
        System.out.println(num3); // 3 , 这并不是四舍五入 , 所有小数位都会被舍弃掉
        
        char zifu1 = 'A'; // 这是一个字符型变量 , 里面是大写字母A
        System.out.println(zifu1 + 1); // 66 , 也就是大写字母A被当作65进行处理
        // 计算机的底层会用一个数字(二进制)来代表字符A , 就是65
        // 一旦char类型进行了数学运算 , 那么字符就会按照一定的规则翻译成一个数字
        
        byte num4 = 40; // 注意! 右侧的数值大小不能超过左侧的类型转换
        byte num5 = 50;
        // byte + byte --> int + int --> int
        int result1 = num4 + num5;
        System.out.println(result1);
        
        short num6 = 60;
        // byte + short --> int + int --> int
        // int 强制转换为short: 注意必须保证逻辑上真实大小本来就没有超过short范围 , 否则会发生数据溢出
        short result2 = (short) (num4 + num6);
        System.out.println(result2);
    }
}
// Notice1
public class Demo12Notice{
    public static void main(String[] args){
        // 右侧确实是一个int数字 , 但是没有超过左侧的范围 , 就是正确的
        // int --> byte , 不是自动类型转换
        byte num1 = /*(byte)*/ 30; // 右侧没有超过左侧的范围
        System.out.println(num1);
        
        // byte num2 = 128; // 右侧超过了左侧的范围
        // int --> char , 没有超过范围
        // 编译器将会自动补上一个隐含的(char)
        char zifu = /*(char)*/ 65;
        System.out.println(zifu);
    }
}
// Notice2
public class Demo13Notice{
    public static void main(String[] args){
        short num1 = 10; // 正确写法 , 右侧没有超过左侧的范围
        
        short a = 5;
        short b = 8;
        // short + short --> int + int --> int
        // short result = a + b; // 错误写法!左侧需要int类型
        // 右侧不用变量 , 而是采用常量 , 而且只有两个常量 , 没有其他
        short result = 5 + 8;
        System.out.println(result);
    }
}
```

### ASCII 码

48 : '0'

65 : 'A'

97 : 'a'

```java
// char类型转换
public class Demo03DataTypeChar{
    public static void main(String[] args){
        char zifu1 = '1';
        System.out.println(zifu1 + 0);
        
        char zifu2 = 'A'; // 其实底层保存的是65数字
        
        char zifu3 = 'a';
        // 左侧是int类型 , 右边是char类型
        // char --> int , 确实是从小到大
        // 发生了自动类型转换
        
        int num = zifu3;
        System.out.println(num);
        
        char zifu4 = '中';
        System.out.println(zifu4 + 0);
    }
}
// 变量赋值
public class Demo03VariableNotice{
    public static void main(String[] args){
        int num1 = 10; // 创建了一个新的变量 , 名叫num1
        // int num1 = 20; // 又创建了另一个新的变量, 名字叫num1 , 错误!
        int num2 = 20;
        
        int num3;
        num3 = 30;
        
        int num4; // 定义了一个变量 , 但是没有进行赋值
        // 直接使用打印输出是错误的
        
        // System.out.println(num5); // 在创建变量之前 , 不能使用这个变量
        int num5 = 500;
        System.out.println(num5);
        
        
        {
            int num6 = 60;
            System.out.println(num6);
        }
        // int num6; // 可以在作用域外重新赋值
        // System.out.println(num6); // 已经超出了大括号的范围 , 超出了作用域,变量不能再使用了
        
        // 同时创建了三个全都是int类型的变量
        int a,b,c;
        // 各自分别赋值
        a = 30;
        b = 20;
        c = 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        // 同时创建了三个int变量,并且同时各自赋值
        int x =  100, y = 200 , z = 300;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
```





## 运算

运算符 : 进行特点操作的符号 . 例如 : +

表达式 : 用运算符连起来的式子叫做表达式

### 四则运算

#### 四则运算符

- 加 : +
- 减 : -
- 乘 : *
- 除 : /
- 取模(取余数) : %

首先取得表达式的结果 , 然后再打印输出这个结果

被除数 / 除数 = 商 .... 余数

对于一个整数的表达式来说 , 除法用的是整除 , 整数除以整数结果仍然是整数 . 只看商 , 不看余数 . 只有对于整数的除法来说 , 取模运算符才有余数的意义

#### 注意事项

注意事项 : 一旦运算中有不同类型的数据 , 那么结果将会是数类型范围大的那种

```java
// 四则运算
public class Demo04Operator{
    public static void main(String[] args){
        // 两个常量之间可以进行数学运算
        System.out.println(20+30);
        
        // 两个变量之间也可以进行数学运算
        int a = 20;
        int b = 30;
        System.out.println(a - b); // -10
        
        // 变量和常量之间可以混合使用
        System.out.println(a * 10); // 200
        
        int x = 10;
        int y = 3;
        
        int result1 = x / y;
        System.out.println(result1); // 3
        
        int result2 = x % y;
        System.out.println(result2); // 余数 , 模 , 1
        
        // int + double --> double + double --> double
        double result3 = x + 2.5;
        System.out.println(result3); // 12.5
    }
}

// 字符串类型 拼接 的基本使用
public class Demo05Plus{
    public static void main(String[] args){
        // 字符串类型的变量基本使用
        // 数据类型 变量名称 = 数据值;
        String str1 = "Hello";
        System.out.println(str1);
        
        System.out.println("Hello" + "World");
        
        String str2 = "Java";
        // String + int --> String
        System.out.println(str2 + 20); // Java20
        
        // 优先级问题
        System.out.println(str2 + 20 + 30); // Java2030
        System.out.println(str2 + (20 + 30));
    }
}
```



### 自增自减

#### 自增自减运算符

自增运算符 : ++

自减运算符 : - -

#### 基本含义

基本含义 : 让一个变量涨涨一个数字1 , 或者让一个变量降一个数字1

#### 使用格式

使用格式 : 写在变量名称之前 , 或者写在变量名称之后 . 例如 : ++`num` , 也可以 `num`++

#### 使用方式

使用方式 : 

1. 单独使用 : 不和其他任何操作混合 , 自己独立成文一个步骤
2. 混合使用 : 和其他操作混合 , 例如与赋值混合 , 或者与打印操作混合等

#### 使用区别

使用区别 : 

1. 在单独使用的时候 , 前 ++ 和 后 ++ 没有任何区别 , 也就是 : ++`num`; 和 `num`++; 是完全一样的
2. 在混合的时候 , 有重大区别.
   1. 如果是[前++] , 那么变量[立刻马上+1] , 然后拿着结果进行使用
   2. 如果是[后++] , 那么首先使用变量本来的数值 , 然后再让变量 +1

#### 注意事项

注意事项 : 只有变量才能使用自增 , 自减运算符 , 常量不可发生改变 , 所以不能用

```java
// 自增自减运算符
public class Demo06Operator{
    public static void main(String[] args){
        int num1 = 10;
        System.out.println(num1); // 10
        ++num1; // 单独使用 , 前++
        System.out.println(num1); // 11
        num1++; // 单独使用 , 后++
        System.out.println(num1); // 12
        System.out.println("=========");
        
        // 与打印操作混合的时候
        int num2 = 20;
        // 混合使用 , 前++ , 变量立刻马上变成21 , 然后打印结果21
        System.out.println(++num2); // 21
        System.out.println(num2); 	// 21
        System.out.println("=========");
        
        int num3 = 30;
        // 混合使用 , 后++ , 首先使用变量本来的30 , 然后再让变量+1得到31
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println("=========");
        
        // 和赋值操作混合
        int num4 = 40;
        // 混合使用 , 前-- , 变量立刻马上-1变成39 , 然后将结果39交给result1变量
        int result1 = --num4;
        System.out.println(result1); // 39
        System.out.println(num4); //39
        System.out.println("=========");
        
        int num5 = 50;
        // 混合使用 , 后-- , 首先把本来的数字50交给result2 , 然后我自己再-1变成49
        int result2 = num5--;
        System.out.println(result2); //50
        System.out.println(num5); //49
        System.out.println("=========");
        
        int x = 10;
        int y = 20;
        // 11 + 20 = 31
        int result3 = ++x + y--;
        System.out.println(result3); // 31
        System.out.println(x); // 11
        System.out.println(y); // 19
        
        // 30; // 错误写法! 常量不可以使用++或者--
    }
}
```



### 赋值运算符

#### 基本赋值运算符

基本赋值运算符 : 就是一个等号 "=" , 代表将右侧的数据交给左侧的变量 

- `int a = 30;`

#### 复合赋值运算符

复合赋值运算符 : 

- +=	a += 3	相当于	a = a+3
- -=     b -= 4     相当于    b = b-3
- *=    c *= 5     相当于    c = c`*`5
- /=     d /= 6    相当于     d = d/6
- %=   e %= 7   相当于     e = e%7

#### 注意事项

注意事项 : 

1. 只有变量才能使用赋值运算符 , 常量不能进行赋值
2. 复合赋值运算符其中隐含了一个强制类型转换

```java
// 赋值运算符
public class Demo07Operator{
    public static void main(String[] args){
        int a = 10;
        // 按照公式进行翻译 : a = a + 5
        // a = 10 + 5;
        // a = 15;
        // a本来是10 , 现在重新赋值得到15
        a += 5;
        System.out.println(a); // 15
        
        int x = 10;
        // x = x % 3;
        // x = 10 % 3;
        // x = 1;
        // x本来就是10 , 现在重新赋值得到1
        x %= 3;
        System.out.println(x); // 1
        // 50 = 30; // 常量不能进行赋值 , 不能写在赋值运算符的左边 , 错误写法!
        
        byte num = 30;
        // num = num + 5;
        // num = byte + int;
        // num = int + int;
        // num = int
        // num = (byte) int
        num += 5;
        System.out.println(num); //35
    }
}
```



### 比较运算符

- 大于 : >
- 小于 : <
- 大于等于 : >=
- 小于等于 : <=
- 相等 : ==  两个等号连写相等 , 一个等号代表的是赋值
- 不相等 : !=

注意事项 : 

1. 比较运算符的结果一定是一个`boolean`值 , 成立就是true , 不成立就是false
2. 如果进行判断 , 不能连着写 . 数学当中的写法 , 例如 : 1<x<3 , 程序当中[不允许]这种写法

```java
// 比较运算符
public class Demo08Operator{
    public static void main(String[] args){
        System.out.println(10 > 5); // true
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 < num2); // true
        System.out.println(num2 >= 100); // false
        System.out.println(num2 <= 100); // true
        System.out.println(num2 <= 12);  // false
        System.out.println(num2 <= 20);  // true
        System.out.println("=================");
        
        System.out.println(10 == 10);  // true
        System.out.println(20 != 25);  // true
        System.out.println(20 != 20);  // false
        
        int x = 2;
        // System.out.println(1<x<3); // 错误写法! 编译报错! 不能连着写
        
    }
}
```



### 逻辑运算符

- 与(并且)    &&    全都是true , 才是true ; 否则都是false
- 或(或者)    ||     只要是有一个是true , 就是true ; 全都是false , 才是false
- 非(取反)    !        本来是true , 变成false ; 本是false , 变成true

与"&&" , 或"||" , 具有短路效果 : 如果根据左边已经可以判断得到最终结果 , 那么右边的代码将不再执行 , 从而节省一定的性能

注意事项 :

1. 逻辑运算符只能用于`boolean`值
2. 与 , 或需要左右各自有一个`boolean`值 , 但是取反只要有唯一的一个`boolean`值即可
3. 与 , 或两种运算符 , 如果有多个条件 , 可以连续写
   - 两个条件 : 条件A && 条件B
   - 多个条件 : 条件A && 条件B && 条件C
   - TIPS :
     - 对于 1<x<3的情况 , 应该拆成两个部分 , 然后使用与运算符连接起来

```java
// 逻辑运算符
public class Demo09Logic{
    public static void  main(String[] args){
        System.out.println(true && false); // false
        // true && true --> true
        System.out.println(3 < 4 && 10 > 5); // true
        System.out.println("==============");
        
        System.out.println(true || fasle); // true
        System.out.println(true || true); // true
        System.out.println(fasle || fasle); // fasle
        System.out.println("==============");
        
        System.out.println(true); // true
        System.out.println(!true); // fasle
        System.out.println("==============");
        
        int a = 10;
        // false && ...
        System.out.println(3 > 4 && ++a < 100); // false
        System.out.println(a); // 10
        
        int b = 20;
        // true || ...
        System.out.println(3 < 4 || ++b < 100); // true
        System.out.println(b);
    }
}
```



### 三元运算符

#### 定义

- 一元运算符 : 只需要一个数据就可以进行操作的运算符 . 例如 : 取反! , 自增++ , 自减--
- 二元运算符 : 需要两个数据才可以进行操作的运算符 . 例如 : 加法+ , 减法-
- 三元运算符 : 需要三个数据才可以进行操作的运算符

#### 格式

格式 : 数据类型 变量名称 = 条件判断 ? 表达式A : 表达式B

#### 流程

流程 : 

- 首先判断条件是否成立
  - 如果成立为true , 那么将表达式A的值赋给左侧的变量
  - 如果成立为false , 那么将表达式B的值赋给左侧的变量
- 二者选其一

#### 注意事项

注意事项 : 

1. 必须同时保证表达式A和表达式B都符合左侧数据类型的要求
2. 三元运算符的结果必须被使用

```java
// 三元运算符
public class Demo100perator{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        // 数据类型 变量名称 = 条件判断 ? 表达式A : 表达式B;
        // 判断 a > b 是否成立 , 如果成立将a的值赋值给max;如果不成立将b的值赋给max,二者选其一
        int max = a > b ? a : b;
        System.out.println("最大值: " + max);
        // int result = 2 > 4 ? 2.5 : 10; // 错误写法
        System.out.println(a > b ? a : b);
        // a > b ? a : b; // 错误写法!
    }
}
```



## 方法

### 格式

定义一个方法的格式:

```java
public static void 方法名称(){
    方法体
}
```

### 命名规则

方法名称的命名规则和变量一样 , 使用小驼峰

方法体 : 也就是大括号当中可以包含任意条语句

### 注意事项

注意事项 : 

1. 方法定义的先后顺序无所谓
2. 方法的定义不能产生嵌套包含关系
3. 方法定义好之后 , 不会执行的 . 如果想执行 , 一定进行方法的[调用]

### 调用

调用方法的格式 : 方法名称();

```java
// 方法
public class Demo11Method{
    public static void main(String[] args){
        farmer();
        seller();
        cook();
        me();
    }
    // 农民
    public static void farmer(){
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("施肥");
        System.out.println("除虫");
        System.out.println("收割");
        System.out.println("卖货");
        System.out.println("===========");
    }
    // 商贩
    public static void seller(){
        System.out.println("运输");
        System.out.println("标价");
        System.out.println("吆喝");
        System.out.println("卖货");
        System.out.println("===========");
    }
    // 厨师
    public static void cook(){
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
        System.out.println("===========");
    }
    // 我
    public static void me(){
        System.out.println("吃");
    }
}
```



## 流程

### 顺序结构

开始 ---> 步骤1 ---> 步骤2 ---> 步骤3 ---> 结束

```java
// 顺序结构
public class Demo01Sequence{
    public static void main(String[] args){
        System.out.println("今天天气不错");
        System.out.println("挺风和日丽的");
        System.out.println("我们下午没课");
        System.out.println("这的确挺美的");
    }
}
```

### 判断语句

1. ```java
   if (关系表达式) {
       语句体;
   }
   ```

   ![]()

2. ```
   
   ```

   
