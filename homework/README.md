### 以下程序的输出结果是
要加上注释说明程序运行结果的原因。题目先自己想答案，然后运行代码查看结果和自己想的是否一致，然后记录注释
#### 例. 
```
class A 
{ 
	public A(String s) 
	{ 
		System.out.print("A"); 
	} 
} 

public class B extends A 
{ 
    // 编译报错，因为类A中没有无参构造方法，子类构造方法中没有显式调用父类的构造方法
	public B(String s) 
	{ 
		System.out.print("B"); 
	} 
	public static void main(String[] args) 
	{ 
		new B("C"); 
		System.out.println(" "); 
	} 
} 
```

#### 1. 

```
class Base {
    public void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends Base {
    public void show() {
       System.out.println("Derived::show() called");
    }
}
  
public class Main {
    public static void main(String[] args) {
        Base b = new Derived();;
        b.show();//创建Derived 对象，则调用Derived里重载的show()方法
        //输出：Derived::show() called
    }
}
```

#### 2.
```
class A
{
    int i = 10;
}
 
class B extends A
{
    int i = 20;
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new B();//父类引用指向子类对象
 
        System.out.println(a.i);//输出：10  
    }
}
```

#### 3.
```
class A
{
    {
        System.out.println(1);
    }
    //代码块在默认生成的无参构造方法中执行
}
 
class B extends A
{
    {
    //默认调用父类无参构造方法，super();
        System.out.println(2);
    }
}
 
class C extends B
{
    {
    ////默认调用父类无参构造方法，super();
        System.out.println(3);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        C c = new C()；
        //输出：
        	1
        	2
        	3
    }
}
```

#### 4.
```
class A
{
    public A()
    {
        System.out.println("Class A Constructor");
    }
}
 
class B extends A
{
    public B()
    {
    //默认生成super()
        System.out.println("Class B Constructor");
    }
}
 
class C extends B
{
    public C()
    {
     //默认生成super()
        System.out.println("Class C Constructor");
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        C c = new C();
    }
    //输出:
    	Class A Constructor
    	Class B Constructor
    	Class C Constructor
}
```

#### 5. 

```
class X
{
    public X(int i)
    {
        System.out.println(1);
    }
}
 
class Y extends X
{
    public Y()         //报错，默认生成super();但是父类重载了1个有参构造方法，不再自动生成无参构造方法
    {
        System.out.println(2);
    }
}
```
#### 6. 
```
public class A
{
    public A()
    {
        System.out.println(1);
 
        super();//报错，用super关键字必须放在方法的第一个语句；
 
        System.out.println(2);
    }
}
```
#### 7. 
```
public class A
{
    public A(int i)
    {
 
    }
}
 
class B extends A
{
 //报错，父类不默认生成无参构造方法了
}
```
#### 8. 
```
public class A
{
    public A()
    {
        super();
 
        this(10);//报错，this关键字必须放在方法的第一个语句
    }
 
    public A(int i)
    {
        System.out.println(i);
    }
}
```

#### 9. 

```
class M
{
    int i;
 
    public M(int i)
    {
        this.i = i--;//i运算后自减 this.i = i;
    }
}
 
class N extends M
{
    public N(int i)
    {
        super(++i);//i运算前自加
 
        System.out.println(i);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        N n = new N(26);//输出：27
    }
}
```
#### 10. 
```
class M
{
    int i = 51;
 
    public M(int j)
    {
        System.out.println(i);//输出成员变量i
 
        this.i = j * 10;
    }
}
 
class N extends M
{
    public N(int j)
    {
        super(j);
 
        System.out.println(i);//输出j * 10
 
        this.i = j * 20;
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        N n = new N(26);
 
        System.out.println(n.i);//输出 j * 20
        //输出：
        	51
        	260
        	520
    }
}
```
#### 11. 
```
class X
{
    private int m = 48;
}
 
class Y extends X
{
    void methodOfY()
    {
        System.out.println(m);//输出48 子类的成员方法可以调用父类的私有成员变量
    }
}
```
#### 12. 
```
class X
{
    int m = 1111;
 
    {
        m = m++;//m = 1111
 
        System.out.println(m);
    }
}
 
class Y extends X
{
    {
        System.out.println(methodOfY());
    }
 
    int methodOfY()
    {
        return m-- + --m;//m运算后自减，m--为1111，此时m自减变为1110，--m运算前自减，--m值为1109
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        Y y = new Y();
        //输出：
        1111 （父类无参构造方法生成的值）
        2220 （子类无参构造方法生成的值）
    }
}
```

#### 13. 
```
class A
{
	void A()
	{
		System.out.println(1);
	}
}

class B extends A
{
	void B()
	{
		A();//子类成员方法里调用父类成员方法
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		new B().B();//输出：1
	}
}
```
#### 14. 
```
class A
{
	int i = 1212;
}

class B extends A
{
	A a;

	public B(A a)
	{
		this.a = a;
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		A a = new A();

		B b = new B(a);

		System.out.println(a.i);//1212

		System.out.println(b.i);//1212  从B类中向上找变量i的值

		System.out.println(b.a.i);//1212  b对象下的a属性下的i值

		b.a.i = 2121;//父类变量i值改为2121

		System.out.println("--------");

		System.out.println(a.i);//2121

		System.out.println(b.i);//1212  子类中i值没有改变
	}
}
```

#### 15. 

```
class A
{
	int methodOfA(int i)
	{
		i /= 10;

		return i;
	}
}

class B extends A
{
	int methodOfB(int i)
	{
		i *= 20;

		return methodOfA(i);//返回methodOfA（2000）
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		B b = new B();

		System.out.println(b.methodOfB(100));  //200
	}
}
```

#### 16. 
```
class One
{
	int x = 2121;
}

class Two
{
	int x = 1212;
	
	{
		System.out.println(x);//1212  子类父类成员变量同名的话，从调用处开始向上找
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		Two two = new Two();
	}
}
```
