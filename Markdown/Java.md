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
   // 格式
   if (关系表达式) {
       语句体;
   }
// 例子
   public class Demo02IF{
    public static void main(String[] args){
           System.out.println("今天天气不错 , 正在压马路 .... 突然发现一个快乐的地方:网吧");
           int age = 16;
           if(age >= 18){
               System.out.println("进入网吧 , 开始high!");
               System.out.println("遇到了一群猪队友");
               System.out.println("感觉不爽 , 结账走人");
           }
           System.out.println("回家吃饭")
       }
   }
   ```
   
   ![](E:\JAVA\Markdown\if 表达式1.png)
   
2. ```java
   // 标准if ... else 语句
   if (关系表达式) {
    语句体1;
   } else{
       语句体2;
   }
   // 例子
   public class Demo03IFElse{
       public static void main(String[] args){
           int num = 13;
           if (num % 2 == 0){ // 如果除以二能够余数为0
               System.out.println("偶数")
           } else {
               System.out.println("奇数")
           }
       }
   }
   ```
   
   ![](E:\JAVA\Markdown\if else表达式2.png)
   
3. ```java
   // 复合if ... elseif ... else 语句
   if (判断条件1) {
       执行语句1;
   } else if (判断条件2){
       执行语句2;
   } else {
       执行语句n+1;
   }
   // 例子1
   // x 和 y的关系满足如下:
   // 如果x >= 3 , 那么y = 2x + 1;
   // 如果-1 < x < 3 , 那么y = 2x;
   // 如果x <= -1 , 那么y = 2x - 1;
   public class Demo04IfElseExt{
       public static void main(String[] args){
        int x = 10;
           int y;
           if (x >= 3) {
               y = 2*x + 1;
           }else if(-1 < x && x < 3){
               y = 2*x;
           }else{
               y = 2*x - 1; 
           }
       }
       System.out.println("结果是: " + y);
   }
   // 例子2
   // 分数
   public class Demo05IfElsePractise{
       public static void main(String[] args){
           int score = 120;
           if (score >= 90 && score <= 100){
               System.out.println("优秀");
           }else if(score >= 80 && score <= 90){
               System.out.println("好");
           }else if(score >= 70 && score <= 60){
               System.out.println("良");
           }else if(score >= 60 && score <= 50){
               System.out.println("及格")
           }else if(score >= 0 && score <= 60){
               System.out.println("不及格")
           }else{
               System.out.println("数据错误")
           }
       }
   }
   ```
   
   ```java
   // 题目: 使用三元运算符和标准的if-else语句分别实现:取两个数字当中的最大值
   public class Demo06MaxNum{
       public static void main(String[] args){
           int a = 10;
           int b = 20;
           // 三元运算符
           int max = a > b ? a : b;
           // if-else 表达式
           if (a > b){
               max = a;
           }else {
               max = b;
           }
           System.out.println(max);
       }
   }
   ```
   
   

### 选择语句

```java
// 表达式
switch(表达式){
    case 常量值1:
        语句体1;
        break;
    case 常量值2:
        语句体2;
        break;
        ...
    default:
        语句体n+1;
        break;
}
// 例子
public class Demo07Switch{
    public static void main(String[] args){
        int num = 1123;
        switch (num){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
            	break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("数据错误");
                break;
        }
    }
}
```

![](E:\JAVA\Markdown\switch表达式.png)

#### 注意事项

switch语句使用的注意事项:

1. 多个`case` 后面的数值不可以重复
2. switch后面小括号当中只能是下列数据类型
   - 基本数据类型 : byte/short/char/int
   - 引用数据类型 : String字符串 , enum枚举
3. switch语句格式可以很灵活 : 前后顺序可以颠倒 , 且break语句可省略 , "匹配哪一个case就从哪一个位置向下执行 , 直到遇到了break或者整体结束为止"

```java
// switch使用注意
public class Demo08SwitchNotice{
    public static void main(String[] args){
        int num = 1;
        switch(num){
            case 1:
                System.out.println("AAA");
                break;
            // case 1:
            //     System.out.println("BBB");
            //     break;
            default:
                System.out.println("CCC");
                break;
        }
    }
}
```





## 循环

### 组成

循环结构的基本组成部分 , 一般可以分为四个部分:

1. 初始化语句 : 在循环开始最初执行 , 而且只做唯一一次
2. 条件判断 : 如果成立 , 则循环继续 ; 如果不成立 , 则循环退出
3. 循环体 : 重复要做的事情内容 , 若干行语句
4. 步进语句 : 每次循环之后都要进行的扫尾工作

### for循环

```java
// 格式
for (初始化表达式①; 布尔表达式②; 步进表达式④){
    循环体③;
}
```

#### 执行流程

执行流程 :

顺序 : ①②③④ > ②③④ > ②③④ > .... ②不满足为止

①负责完成循环变量初始化

②负责判断是否满足循环条件 , 不满足则跳出循环

③具体执行的语句

④循环后循环条件所涉及变量的变化情况                

```java
// 例子
public class Demo09For{
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            System.out.println("我错啦!原谅我吧")
        }
        System.out.println("程序停止");
    } 
}
```

### while循环

```java
// 标准格式:
while (条件判断){
    循环体;
}
// 扩展语句:
初始化语句;
while (条件判断){
    循环体;
    步进语句;
}
```

#### 执行流程

执行流程:

执行顺序: ①②③④ > ②③④ > ②③④ ... ②不满足为止

①负责完成循环变量初始化

②负责判断是否满足循环条件 , 不满足则跳出循环

③具体执行的语句

④循环后 , 循环变量的变化情况

```java
// 例子
public class Demo10While{
    public static void main(String[] args){
        int i = 1;
        while (i <= 100){
            System.out.println("我错啦!原谅我吧"+i);
            i++;
        }
    }
}
```

### do-while循环

```java
// 格式
do {
    循环体;
}while (条件判断);
// 扩展格式
初始化语句;
do{
    循环体;
    步进语句;
}while (条件判断);

// 例子
public class Demo11DoWhile{
    public static void main(String[] args){
        int i = 1;
        do {
            System.out.println("原谅你啦!地上怪凉的"+i);
            i++;
        } while (i <= 100);
    }
}
```

### 三种循环的区别

区别 : 

1. 如果条件判断从来没有满足过 , 那么for循环和while循环将会执行0次 , 但是do-while循环会执行至少一次
2. for循环的变量在小括号中定义, 只有循环内部才可以使用 . while循环和do-while循环初始化语句本来就在外面 , 所以出来循环之后还可以使用

```java
// 题目 : 求出1-100之间的偶数和
public class Demo12HunderdSum{
    public static void main(String[] args){
        wsh();
        fsh();
        dwsh();
    }
    
    // while循环求偶数和
    public static void wsh(){
        // 初始化数值
        int i = 1, sum = 0;
        // 循环开始
        while(i <= 100){
            // 偶数判断
            if(i % 2 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println("while结果是:" + sum);
    }
    
    // for循环求偶数和
    public static void fsh(){
        int sum = 0;
        for (int i = 1; i <= 100 ; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("for结果是:" + sum);
    }
    
    //do-while循环求偶数和
    public static void dwsh(){
        int sum = 0, i = 1;
        do{
            if (i % 2 == 0){
                sum += i;
            }
            i++;
        } while (i <= 100);
        System.out.println("do-while结果是: " + sum); 
    }
}

// 区别
public class Demo13LoopDifference{
    public static void main(String[] args){
        for (int i = 1;i<=0;i++){
            System.out.println("hello");
        }
        // System.out.println(i); // 这一行是错误写法!因为变量i定义在for循环小括号内 , 只有for循环自己才能用
        System.out.println("===========");
        
        int i = 1;
        do{
            System.out.println("world");
            i++;
        }while(i < 0);
        // 现在已经超出了do-while循环的范围 , 我们仍然可以使用变量i
        System.out.println(i);
    }
}
```

### break关键字

#### 用法

用法: 

1. 可以用在switch语句当中 , 一旦执行 , 整个switch语句立刻结束
2. 还可以用在循环语句当中 , 一旦执行 , 整个循环语句立刻结束 , 打断循环 . 凡是次数确定的场景多用for循环;否则多用while循环

```java
// break
public class Demo14Break{
    public static void main(String[] args){
        for (int i = 1;i <= 10;i++){
            // 如果希望从第四次开始 , 后续全都不要了 , 就要打断循环
            if (i == 4){  // 如果当前是第四次
                break;  // 那么就打断整个循环
            }
            System.out.println("hello" + i)
        }
    }
}
```

### continue关键字

#### 用法

用法 : 

另一种循环控制语句是continue关键字

一旦执行 , 立刻跳过当前次循环剩余内容 , 马上开始下一次循环

```java
// continue
public class Demo15Continue{
    public static void main(String[] args){
        for (int i = 1; i <= 10;i++){
            if (i == 4){
                continue; // 那么跳过当前次循环 , 马上开始下一次
            }
            System.out.println(i + "层到了")
        }
    }
}
```

### 死循环

#### 定义

定义 : 永远停不下来的循环

#### 格式

```java
while (true){
	循环体;
}
// 死循环后面无法跟代码
```

```java
// 死循环
public class Demo16DeadLoop{
    public static void main(String[] args){
        while (true){
            System.out.println("Study Java");
        }
    }
}
```

### 嵌套循环

#### 定义

定义 : 一个循环的循环体是另一个循环 , 比如for循环里面还有一个for循环 , 就是嵌套循环

总共的循环次数 = 外循环 * 内循环次数

```java
// 嵌套循环输出时间
public class Demo17LoopHourAndMinute{
    public static void main(String[] args){
        // 外层控制小时
        for (int hour = 0;hour < 24;hour++){
            // 控制分钟
            for (int minute = 0;minute < 60;minute++){
                for (int second = 0;second < 60;second++){
                   System.out.println(hour+"时"+minute+"分"+second+"秒");
                }
            }
        }
    }
}
```





## IDEA常用快捷键

- Alt + Enter				  	   导入包 , 自动修正代码
- Ctrl + Y                               删除光标所在行
- Ctrl + D                              复制光标所在行 , 插入光标位置下面
- Ctrl + Alt + L                      格式化代码
- Ctrl + /                               单行注释
- Ctrl + Shift + /                   选中代码注释 , 多行注释
- Alt + Ins                             自动生成代码 , toString , get , set 等方法
- Alt + Shift + 上下箭头      移动当前代码行

```java
public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello,World!!!");
        System.out.println("Hello,World!!!");
        /*System.out.println("Hello,World!!!");*/
    }
}
```



## 方法

### 定义

#### 方法

定义 : 方法其实就是若干语句的集合

#### 参数

定义 : 就是进入方法的数据

#### 返回值

定义 : 就是从方法中出来的数据

### 格式

```java
// 定义方法的完整格式
修饰符 返回值类型 方法名称 (参数类型 参数名称 , ... ){
    方法体;
    return 返回值;
}
```

- 修饰符 : 现阶段的固定用法 , public  static
- 返回值类型 : 也就是方法最终产生的数据结果是什么类型
- 方法名称 : 方法的名字 , 规则和变量一样 , 小驼峰式
- 参数类型 : 进入方法的数据是什么类型
- 参数名称 : 进入方法的数据对应的变量名称
  - PS : 参数如果有多个 , 使用逗号进行分隔
- 方法体 : 方法需要做的事情 , 若干行代码
- return : 两个作用 , 第一停止当前方法 , 第二将后面的返回值还给调用处
- 返回值 : 也就是方法执行后最终产生的数据结果

注意事项 :

return 后面的返回值 , 必须和方法名称前面"返回值类型"保持对应

```java
// 例子
public class Demo01Method{
    public static void main(String[] args){
        printMethod();
    }
    public static void printMethod(){
        for (int j = 0; j < 5; j++){
            System.out.println("*");
        }
        System.out.println();
    }
}
```

### 方法的调用

#### 三种调用方式

方式 : 

1. 单独调用 : 方法名称(参数);
2. 打印调用 : System.out.println(方法名称 (参数));
3. 赋值调用 : 数据类型 变量名称 = 方法名称 (参数);

注意 :

此前学习的方法 , 返回值类型为void , 这个方法只能够单独调用 , 不能进行打印调用或者赋值调用

```java
// 方法的调用
/*
方法其实就是若干语句的功能集合:
方法好比是一个工厂
*/
public class Demo02MethodDefine{
    public static void main(String[] args){
        // 打印调用
        System.out.println(sum(10,20));
        // 赋值调用
        int s = sum(20,30);
        System.out.println(s);
    }
    public static int sum(int a , int b){
        int result = a+b;
        return result;
    }
}
```

![](E:\JAVA\Markdown\方法的调用流程图解.png)

### 方法的参数

#### 有无参数的比较

- 有参数 : 小括号当中有内容 , 当一个方法需要一些数据条件 , 才能完成任务的时候 , 就是有参数
- 无参数 : 小括号当中留空 , 一个方法不需要任何数据条件 , 自己就能独立完成任务 , 就是无参数

```java
// 有无参数
public class Demo03MethodParam{
    public static void main(String[] args){
        method1(13,15);
        method2();
    }
    public static void method1(int a , int b){
        int result = a * b;
        System.out.println("结果是: " + result);
    }
    public static method2(){
        for (int i = 0; i < 10;i++){
            System.out.println("hello,world" + i);
        }
    }
}
```

### 方法的返回值

#### 有无返回值注意事项

注意事项 : 

对于有返回值的方法 , 可以使用单独调用 , 打印调用或者赋值调用

但是对于无返回值的的方法 , 只能使用单独调用 , 不能使用打印调用或者赋值调用

![](E:\JAVA\Markdown\有无返回值的对比流程图.png)

```java
// 有无返回值
public class Demo04MethodReturn{
    public static void main(String[] args){
        // 我是main方法 , 我来调用你
        // 我调用你 , 你来帮我计算一下 , 算完了之后 , 把结果告诉我的num变量
        int num = getsum(10,23);
        System.out.println("返回值是 : " + num);
        System.out.println("===============");
        
        printsum(10,20);
        System.out.println("===============");
        
        System.out.println(getsum(2,3)); // 正确写法
        getsum(4,5); // 正确写法 , 但是返回值
        System.out.println("===============");
        
        // 对于void没有返回值的方法 , 只能单独 , 不能打印或者赋值
//        System.out.println(printsum(2,3));
//        System.out.println(void);

//        int num2 = printsum(10,20); // 错误写法
//        int num3 = void;
//        void num4 = void;
    }
    // 我是一个方法 , 我负责两个字相加
    // 我有返回值int , 谁调用我 , 我就把计算结果告诉谁
    public static int getsum(int a,int b){
        int result = a + b;
        return result;
    }
    // 我是一个方法 , 我负责两个数字相加
    // 我没有返回值 , 不会把结果告诉任何人 , 而是我自己进行打印输出
    public static void printsum(int a, int b){
        int result = a + b;
        System.out.println("结果是: " + result);
    }
}
```

### 方法例题

```java
// 题目1: 定义一个方法 , 用来判断两个数字是否相同
public class Demo01MethodSame {
    public static void main(String[] args){
        System.out.println(isSame(10,20));
        System.out.println(isSame(10,10));
    }
    
    /*
    	三要素 : 
    		返回值类型: boolean
    		方法名称: isSame
    		参数列表: int a , int b
    */
    public static boolean isSame(int a,int b){
//        boolean same;
//        if (a == b){
//            same = true;
//        }else{
//            same = false;
//        }
//        same = a == b ? true : false;
//        boolean same = a == b;
//        return same;
        return a == b;
    }
}
```

```java
// 题目2: 定义一个方法 , 用来求出1~100之间所有数字的和值
public class Demo02MethodSum{
    public static void main(String[] args){
        System.out.println("结果是: " + getSum());
    }
    /*三要素:
    	返回值: 有返回值 , 计算结果是一个int数字
    	方法名称: getSum
    	参数列表: 数据范围已定 , 不需要告诉任何条件 , 无参数
    */
    public static int getSum(){
        int sum = 0;
        for(int i = 1;i <= 100;i++){
            sum += i;
        }
        return sum;
    }
}
```

```java
// 题目3: 定义一个方法 , 用来打印指定次数的HelloWorld
public class Demo03MethodPrint{
    public static void main(String[] args){
        printCount(10);
    }
    /*
    三要素 :
    返回值类型: 只是进行一大堆打印操作而已 , 没有计算 , 也没有结果要告诉调用处
    方法名称: printCount
    参数列表: 到底要打印多少次?必须告诉我 , 次数int
    */
    public static void printCount(int num){
        for(int i = 0;i < num;i++){
            System.out.println("HelloWorld!" + (i + 1));
        }
    }
}
```

### 注意事项

使用方法的时候 , 注意事项:

1. 方法应该定义在类当中 , 但是不能在方法当中再定义方法 , 不能嵌套
2. 方法定义的前后顺序无所谓
3. 方法定义之后不会执行 , 如果希望执行 , 一定要调用 , 单独调用 \ 赋值调用 \ 打印调用
4. 如果方法有返回值 , 那么必须写上"return 返回值;" , 不能没有
5. return后面的返回值数据 , 必须和方法的返回值类型 , 对应起来
6. 对于一个void没有返回值的方法 , 不能写return后面的返回值 , 只能写return自己
7. 对于方法当中最后一行的return可以省略不写
8. 一个方法当中可以有多个return语句 , 但是必须保证同时只有一个会被执行到 , 两个return不能连写

```java
// notice
public class DemoMethodNotice{
    public static void main(String[] args){
        System.out.println(method1());
        method2();
        System.out.println(getMax(123,134))
    }
    public static int method1(){
        return 10;
    }
    public static void method2(){
        System.out.println("1111");
        System.out.println("2222");
        return;
//        return 10;   错误的写法! 方法没有返回值 , return后面就不能写返回值
    }
    public static int getMax(int a , int b){
        return Math.max(a , b);
    }
}
```

### 方法重载

#### 定义

定义 : 

对于功能类似的方法来说 , 因为参数列表不一样

方法的重载(overload) , 多个方法的名称一样 , 但是参数列表不一样

好处 : 只需要记住一个方法名称 , 就可以变现类似的多个功能

#### 关联

方法重载与下列因素相关

1. 参数个数不同
2. 参数类型不同
3. 参数多类型顺序不同

方法重载与下列因素无关

1. 与参数的名称无关
2. 与方法的返回值无关

```java
// 方法的重载
public class Demo01MethodOverload{
    public static void main(String[] args){
     	System.out.println(sum(1,2));
        System.out.println(sum(1,4,5));
        System.out.println(sum(1,5,7,9));
    }
    public static int sum(int a , double b){
        return (int) (a + b);
    }
    public static int sum(double a , int b){
        return (int) (a + b);
    }
    public static int sum(double a , double b){
        return (int) (a + b);
    }
    public static int sum(int a , int b){
        System.out.println("有两个参数的方法执行")
        return a + b;
    }
    public static int sum(int a , int b , int c){
        System.out.println("有三个参数的方法执行")
        return a + b + c;
    }
    public static int sum(int a , int b , int c , int d){
        System.out.println("有四个参数的方法执行")
        return a + b + c + d;
    }
}
// 题目要求: 比较两个数据是否相等 , 参数类型分别为两个byte类型 , 两个short类型 , 两个int类型 , 两个long类型
public class Demo02MethodOverloadSame{
    public static void main(String[] args){
        System.out.println(isSame((byte) 12 , (byte) 34));
        System.out.println(isSame((short) 12 , (short) 34));
        System.out.println(isSame(12 , 34));
        System.out.println(isSame(12L , 34L));
    }
    public static boolean isSame(byte a , byte b){
        System.out.println("执行byte");
        return a == b;
    }
    public static boolean isSame(short a , short b){
        System.out.println("执行short");
        return a == b;
    }
        public static boolean isSame(int a , int b){
        System.out.println("执行int");
        return a == b;
    }
        public static boolean isSame(long a , long b){
        System.out.println("执行long");
        return a == b;
    }
}
// 在调用输出语句的时候 , println方法其实就是进行了多种数据类型的重载形式
public class Demo04OverloadPrint {
    public static void main(String[] args) {
        myPrint(2);
    }
    public static void myPrint(byte num){
        System.out.println(num);
    }
    public static void myPrint(short num){
        System.out.println(num);
    }
    public static void myPrint(int num){
        System.out.println(num);
    }
    public static void myPrint(long num){
        System.out.println(num);
    }
    public static void myPrint(float num){
        System.out.println(num);
    }
    public static void myPrint(double num){
        System.out.println(num);
    }
    public static void myPrint(char zifu){
        System.out.println(zifu);
    }
    public static void myPrint(boolean iss){
        System.out.println(iss);
    }
    public static void myPrint(String str){
        System.out.println(str);
    }
}
```



## 数组

### 定义

定义 : 是一种容器 , 可以同时存放多个数值

### 特点

特点 : 

1. 数组是一种引用数据类型
2. 数组当中的多个数据 , 类型必须统一
3. 数组的长度在程序运行期间不可改变

### 数组的初始化

数组的初始化 : 在内存当中创建一个数组 , 并且向其中赋予一些默认值

两种常见的初始化方式 : 

1. 动态初始化(指定长度)
2. 静态初始化(指定内容)

#### 动态初始化

动态初始化数组的格式 :

数据类型[] 数组名称 = new 数组类型[数组长度] ;

解析含义 :

- 左侧数据类型 : 也就是数组当中保存的数据 , 全都是统一的什么类型
- 左侧的中括号 : 代表我是一个数值
- 左侧的数据名称 : 给数组取一个名字
- 右侧的new : 代表创建数组的动作
- 右侧的数据类型 : 必须和左边的数据类型保持一致
- 右侧中括号的长度 : 也就是数组当中 , 到底可以保存多少个数据 , 是一个int数字

```java
public class Demo01Array {
    public static void main(String[] args){
        // 创建一个数组 , 里面可以存放300个int数据
        // 格式 : 数据类型[] 数据名称 = new 数据类型[数组长度];
        int[] arrayA = new int[300];
        
        // 创建一个数组 , 能存放10个double类型的数据
        double[] arrayB = new double[10];
        
        // 创建一个数组 , 能存放5个字符串
        String[] arrayC = new String[5];
    }
}
```



#### 静态初始化

静态初始化基本格式 : 

数据类型[] 数据名称 = new 数据类型[]{元素1 , 元素2 , 元素3 , ... }

省略格式 : 数据类型[] 数据名称 = {元素1 , 元素2 , 元素3 , ... }

注意事项 : 

1. 虽然静态初始化没有直接告诉长度 , 但根据大括号里面的元素具体内容 , 也可以自动推算出来长度
2. 静态初始化标准格式可以拆分出两个步骤
3. 动态初始化也可以拆分出两个步骤
4. 静态初始化一旦使用省略格式 , 就不能拆分出两个步骤了

使用建议 :

如果不确定数组当中的具体内容 , 用动态初始化 , 否则 , 已经确定了具体内容 , 用静态初始化

```java
// 标准格式
public class Demo02Array{
    public static void main(String[] args){
        // 直接创建一个数组 , 里面装的全都是int数字 , 具体为 5 15 25
        int[] arrayA = new int[]{5 , 15 ,25};
        
        // 创建一个数组 , 用来装字符串: "Hello" , "World" , "Java"
        String[] arrayB = new String[]{"Hello" , "World" , "Java"};
    }
}

// 省略格式
public class Demo03Array{
    public static void main(String[] args){
        // 省略格式的静态初始化
        int[] arrayA = {10 , 20 ,30};
        
        // 静态初始化的标准格式 , 可以拆分成为两个步骤
        int[] arrayB;
        arrayB = new int[]{10 , 20 ,30};
        
        // 动态初始化也可以拆分成为两个步骤
        int[] arrayC;
        arrayC = new int[3];
        
        // 静态初始化的省略格式 , 不能拆分成为两个步骤
//        int[] arrayD;                 // 错误写法
//        arrayD = { 10 , 20 ,30};
    }
}
```



### 索引与内存地址

直接打印数组名称 , 得到的是数组对应的 : 内存地址哈希值

访问数组元素的格式 : 数组名称[ 索引值 ]

索引值 : 就是一个int 数字 , 代表数组当中元素的编号

[ 注意 ] : 索引值从0开始 , 一直到"数组的长度-1为止"

```java
public class Demo04ArrayUse {
    public static void main(String[] args){
        // 静态初始化的省略格式
        int[] array = {10 , 20 ,30};
        System.out.println(array); // [I@6d03e736
        
        // 直接打印数组当中的元素
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        
        // 也可以将数组当中的某一个单个元素 , 赋值交给变量
        int num = array[1];
        System.out.println(num);
    }
}
```



### 默认值

使用动态初始化数组的时候 , 其中一个元素将会自动拥有一个默认值 . 

规则如下 : 

- 如果是整数类型 , 那么默认为0
- 如果是浮点类型 , 那么默认为0.0
- 如果是字符类型 , 那么默认为'\u0000'
- 如果是布尔类型 , 那么默认为false
- 如果是引用类型 , 那么默认为null

```java
public class Demo05ArrayUse{
    public static void main(String[] args){
        // 动态初始化一个数组
        int[] array = new int[3];
        
        System.out.println(array); // 内存地址
        System.out.println(array[1]); // 默认值
        
        array[1] = 132; // 赋值
        System.out.println(array[1]);
    }
}
```



### 赋值

数据名称[ 索引值 ] = 值 ;

```java
public class Demo03ArraySame {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA);      // 地址值
        System.out.println(arrayA[0]);   // 0
        System.out.println(arrayA[1]);   // 0
        System.out.println(arrayA[2]);   // 0
        System.out.println("==========");

        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);      // 地址值
        System.out.println(arrayA[0]);   // 0
        System.out.println(arrayA[1]);   // 10
        System.out.println(arrayA[2]);   // 20
        System.out.println("==========");

        // 将arrayA数组的地址值 赋给arrayB数组
        int[] arrayB = arrayA;
        System.out.println(arrayB);      // 地址值
        System.out.println(arrayB[0]);   // 0
        System.out.println(arrayB[1]);   // 10
        System.out.println(arrayB[2]);   // 20
        System.out.println("==========");

        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB);      // 地址值
        System.out.println(arrayB[0]);   // 0
        System.out.println(arrayB[1]);   // 100
        System.out.println(arrayB[2]);   // 200
        System.out.println(arrayA[2]);   // 200
        System.out.println("==========");

    }
}

```



### Java中的内存划分

内存划分 : 

1. 栈 : 存放的都是方法中的局部变量 , 方法的运行一定要在栈当中
2. 堆 : 凡是new出来的东西 , 都在堆当中
3. 方法区 : 存储 .class 相关信息 , 包含方法的信息
4. 本地方法栈 : 与操作系统相关
5. 寄存器 : 与CPU相关

![](E:\JAVA\Markdown\Java中的内存划分.png)

#### 一个数组的内存图

![](E:\JAVA\Markdown\一个数组的内存图.png)

#### 两个数组的内存图

![](E:\JAVA\Markdown\两个数组的内存图.png)

#### 两个引用指向同一个数组

![](E:\JAVA\Markdown\两个引用指向同一个数组.png)



### 索引

 数组的索引编号从0开始 , 一直到"数组的长度为-1"为止

#### 数组索引越界异常

如果访问数组元素的时候 , 索引编号并不存在 , 那么将会发生数组索引越界异常

`ArrayIndexOutOfBoundsException`

- 原因 : 索引编号写错了
- 解决 : 修改成为存在的正确索引编导

```java
public class Demo01ArrayIndex{
    public static void main(String[] args){
		int[] array = new int[]{15 , 25 , 35};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        // System.out.println(array[3]);
    }
}
```

#### 空指针异常

所有的引用类型变量 , 都可以赋值为一个null值 , 但是代表其中什么都没有

数组必须进行new初始化才能使用其中的元素

如果只是赋值了一个null , 没有进行new创建

那么将会发生空指针异常 `NullPointerException`