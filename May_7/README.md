### 以下程序的输出结果是
#### 1.
```
interface A
{
    void myMethod();
}
 
class B
{
    public void myMethod()
    {
        System.out.println("My Method");
    }
}
 
class C extends B implements A
{
     
}
 
class MainClass
{
    public static void main(String[] args) 
    {
        A a = new C();
         
        a.myMethod();			//My Method
    }
}
```
#### 2.
```
interface A 
{ 
    void myMethod(); 
    void getInfo(); 
} 
  
abstract class B implements A 
{ 
    void getData() 
    { 
        System.out.println("B"); 
    } 
} 
  
public class Test extends B 
{ 
    public void myMethod() 
    { 
        System.out.println("myMethod"); 
    } 
    public void getInfo() 
    { 
        System.out.println("getInfo"); 
    } 
      
    public static void main(String[] args) 
    { 
        B obj = new Test(); 
        obj.getInfo(); 		//getInfo
    } 
}
```
#### 3.
```
interface A
{
    int i = 111;
}
 
class B implements A 
{
    void methodB()
    {
        i = 222;		//报错，接口中的变量默认被public static final 修饰
    }
```

#### 4.以下内容是否编译通过，如果不能请指出错误原因
```
class A
{
    //Class A
}
 
interface B extends A		//报错，接口不能继承类
{
    //Interface B extending Class A
}
```
#### 5.
```
interface P
{
    String p = "PPPP";
     
    String methodP();
}
 
interface Q extends P
{
    String q = "QQQQ";
     
    String methodQ();
}
 
class R implements P, Q
{
    public String methodP()
    {
        return q+p;
    }
     
    public String methodQ()
    {
        return p+q;
    }
}
 
public class MainClass 
{
    public static void main(String[] args)
    {
        R r = new R();
         
        System.out.println(r.methodP());	//QQQQPPPP
         
        System.out.println(r.methodQ());	//PPPPQQQQ
    }
}
```
#### 6.
```
class A implements B
{   
    public int methodB(int i)
    {
        return i =+ i * i;
    }
}
 
interface B
{
    int methodB(int i);
}
 
public class MainClass 
{
    public static void main(String[] args)
    {
        B b = new A();
         
        System.out.println(b.methodB(2));		//9
    }
}
```

####  7.以下内容是否编译通过，如果不能请指出错误原因
```
interface A
{
    {
        System.out.println("Interface A");
    }
     
    static
    {
        System.out.println("Interface A");
    }
}
//报错，接口中不能有代码块和静态代码块，接口没有构造方法
```
####  8.以下内容是否编译通过，如果不能请指出错误原因
```
interface ABC
{
	public void methodOne();
	
	public void methodTwo();
}

interface PQR extends ABC
{
	public void methodOne();
	
	public void methodTwo();
}
//编译通过，子类接口重写了父类接口的抽象方法
```
#### 9.
```
interface ABC
{
	void methodOne();
}

interface PQR extends ABC
{	
	void methodTwo();
}

abstract class XYZ implements PQR
{
	public void methodOne()
	{
		methodTwo();
	}
}

class MNO extends XYZ
{
	public void methodTwo()
	{
		methodOne();
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		ABC abc = new MNO();
		
		abc.methodOne();		//编译通过，XYZ类重写了methodOne方法，MNO类重写了methodTwo方法
	}
}
```
#### 10.
```
interface X
{
    char c = 'A';
     
    char methodX();
}
 
class Y implements X
{
    {
        System.out.println(c);
    }
     
    public char methodX()
    {
        char c = this.c;
         
        return ++c;
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        Y y = new Y();		//A
         
        System.out.println(y.methodX());	//B
         
        System.out.println(y.c);		//A
         
        System.out.println(X.c);		//A
    }
}
```

#### 12.以下内容是否编译通过，如果不能请指出错误原因
```
interface A
{
    void methodA();
}
 
class B implements A
{
    public void methodA()
    {
        interface C
        {
            int i = 123;
        }
    }
}
//？？？？？
```
#### 13.
```
interface One
{
    String s = "FINAL";
     
    String methodONE();
}
 
interface Two
{
    String methodONE();
}
 
abstract class Three
{
    String s = "NOT FINAL";
     
    public abstract String methodONE();
}
 
class Four extends Three implements One, Two
{
    public String methodONE()
    {
        String s = super.s + One.s;
         
        return s;
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        Four four = new Four();
         
        System.out.println(four.methodONE());	//NOT FINALFINAL
         
        One one = four;
         
        System.out.println(one.s);		//FINAL
    }
}

```
#### 14.
```
interface X
{
    void method();
}
 
class Y
{
    public void method()
    {
        System.out.println("CLASS Y");
    }
}
 
class Z extends Y implements X
{
     
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        X x = new Z();
         
        x.method();		//CLASS Y
    }
}
```
#### 15.
```
interface A
{
    int methodA();
}
 
interface B
{
    int methodB();
}
 
interface C
{
    int methodC();
}
 
class D implements A, B, C
{
    int i = 999+111;		//i = 1110
     
    public int methodA()
    {
        i =+ i / i;			//(1111)/(1111) = 1
         
        return i;
    }
     
    public int methodB()
    {
        i =- i * i;
         
        return i;
    }
     
    public int methodC()
    {
        i = ++i - --i;
         
        return i;
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        D d = new D();
         
        System.out.println(d.i);		//1110
         
        System.out.println(d.methodA());//1
         
        System.out.println(d.methodB());//0
         
        System.out.println(d.methodC());//1
    }
}
```
#### 16.
```
interface One
{
    int i = 222;
     
    interface OneTwo
    {
        int i = One.i+One.i;
         
        interface OneTwoThree
        {
            int i = OneTwo.i + OneTwo.i;
        }
    }
}
//????
```
#### 17.
```
interface A
{
	String A = "AAA";
	
	String methodA();
}

interface B
{
	String B = "BBB";
	
	String methodB();
}

class C implements A, B
{
	public String methodA()
	{
		return A+B;
	}
	
	public String methodB()
	{
		return B+A;
	}
}

class D extends C implements A, B
{
	String D = "DDD";
	
	public String methodA()
	{
		return D+methodB();
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		C c = new C();
		
		System.out.println(c.methodA());//AAABBB
		
		System.out.println(c.methodB());//BBBAAA
		
		c = new D();
		
		System.out.println(c.methodA());//DDDBBBAAA
		
		System.out.println(c.methodB());//BBBAAA
	}
}
```

#### 18.
```
interface X
{
    void methodX();
}
 
interface Y extends X
{
    void methodY();
}
 
class Z implements Y
{
    public void methodY()
    {
        System.out.println("Method Y");//报错，没有重写抽象方法methodX
    }
}
```
#### 19.
```
abstract class A
{
    abstract void myMethod(Number N);
}
 
interface B
{
    abstract void myMethod(Object O);
}
 
class C extends A implements B
{
    void myMethod(Number N) 
    {
        System.out.println("Number");
    }
     
    public void myMethod(Object O)
    {
        System.out.println("Object");
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new C();
         
        a.myMethod(new Integer(121));//Number
         
        B b = new C();
         
        b.myMethod(new Integer(121));//Object
         
        C c = new C();
         
        c.myMethod(new Integer(121));//Number
    }
}
```

#### 20.
```
class A { }
 
class B extends A { }
 
class C extends B { }
 
interface ABC
{
    void method(A a);
}
 
interface PQR
{
    void method(B b);
}
 
class M implements ABC, PQR
{   
    public void method(A a)
    {
        System.out.println(2);
    }
     
    public void method(B b) 
    {
        System.out.println(3);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        M m = new M();
         
        m.method(new A());//2
         
        m.method(new B());//3
         
        m.method(new C());//3 多态
    }
}
```