1-5：BCBBD
6-10:DCBDD
11-15:DACEB
16-20:DADBB
21-23:AAA
24:报错，静态方法中不能调用非静态成员变量（this）
25：

```
class A{ 
private fifinal String NAME; //NAME没有赋值
private int age; 
public A(String name){ 
name=name; //指向不明确，分不清哪个是方法传进来的参数
} 
} 
public class Test{ 
public static void main(){ 
new A();  //已经定义有参构造方法，不再自动生成无参构造方法
} 
}
```

26：报错，静态方法调用非静态方法
附加题：4