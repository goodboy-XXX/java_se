### 写出以下程序的输出结果

#### 1. 以下代码能否通过编译，为什么
```
class Outer{
 public static void main(String[] args){
  new Inner(); 
 } 
 class Inner { 
  Inner() {} 
 }  
}
//报错，内部类必须通过对象调用
```
#### 2. 以下代码能否通过编译，为什么
```
static class Outer{
 public static void main(String[] args){
 //
 }
 private class Inner{
  Inner() {} 
 }
}
//编译通过，内部类的访问权限修饰符可以为public / protected/(default)/private
```

#### 3.
```
class Outer {
 String s1 = "Java";
 String s2 = "2";

 public static void main(String[] args) { 
  Outer outer = new Outer();  
 }
 Outer() { 
  Inner inner = new Inner();  
 }
 class Inner {
  String s1 = "Certification";
  String s2 = "Exam";
        
  Inner() {
   System.out.println(Outer.this.s1);	//Java
   System.out.println(this.s1);			//Certification
   System.out.println(s2);				//Exam
  }
 }
}
```
#### 4. 以下代码能否通过编译，为什么
```
class A
{
    class B
    {
        static void methodB()
        {
            System.out.println("Method B");
        }
    }
}
//编译报错，成员内部类里不能有静态方法
```
#### 5.
```
class OuterInnerStatic {
 static String s1 = "Java"; 
 static String s2 = "2";
 public static void main(String[] args) { 
  Inner inner = new Inner();  
}

 static class Inner {
  String s1 = "Certification";
  String s2 = "Exam";
  Inner() {
   System.out.println(OuterInnerStatic.s1);	//Java
   System.out.println(this.s1);				//Certification
   System.out.println(s2);					//Exam
  }
 }
}

```
#### 6.
```
class X
{
    static int x = 3131;
     
    static class Y
    {
        static int y = x++;//x运算后自加
         
        static class Z
        {
            static int z = y++;//y运算后自加
        }
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println(X.x);	//3131
         
        System.out.println(X.Y.y);	//3131
         
        System.out.println(X.Y.Z.z);//3231
    }
}
```

#### 7. 在下面的示例中，如何访问"XYZ"类的"i"字段？
```
class ABC
{
    class XYZ
    {
        int i = 111;
    }
}
//ABC.XYZ.i
```

#### 8. 运行以下程序时，它是否在控制台上打印“SUCCESS”？
```
class A
{
    {
        new B();
    }
     
    static class B
    {
        {
            new A().new C();	//内部类C类的对象
        }
    }
     
    class C
    {
        {
            System.out.println("SUCCESS");
        }
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        new A();	//执行A类代码块中的new B()，通过new B()执行静态B类中的代码块
    }
}
//可以打印SUCCESS
```

#### 9. 以下代码能否通过编译，为什么
```
class A
{
    String s = "AAA";
     
    void methodA()
    {
        System.out.println(s);
    }
     
    static class B
    {
        void methodB()
        {
            methodA();	//报错，静态内部类中不能访问非静态类的方法
        }
    }
}
```

#### 10.
```
abstract class A
{
    {
        System.out.println(1);
    }
     
    static
    {
        System.out.println(2);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new A() { };		//2  1
    }
}

```
#### 11.
```
class A
{
    static String s = "AAA";
     
    class B
    {
        String s = "BBB";
         
        void methodB()
        {
            System.out.println(s);
        }
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new A();
         
        System.out.println(a.s);	//AAA
         
        A.B b = a.new B();
         
        System.out.println(b.s);	//BBB
         
        b.methodB();				//BBB
    }
}
```

#### 12. 以下代码能否通过编译，为什么
```
class A
{
    void methodOne()
    {
        class B
        {
            void methodTwo()
            {
                System.out.println("Method Two");
            }
        }
    }
     
    void methodThree()
    {
        new B().methodTwo();
    }
}
//报错，局部内部类不可以被外部类的方法调用
```

#### 13
```
class X
{
    {
        System.out.println(1);
    }
     
    static
    {
        System.out.println(2);
    }
     
    public X()
    {
        new Y();
    }
     
    static class Y
    {
        {
            System.out.println(3);
        }
         
        static
        {
            System.out.println(4);
        }
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        X x = new X();		// 2143
         
        X.Y y = new X.Y();	//3
    }
}
```

#### 14. 以下代码能否通过编译，为什么
```
class A
{
    class B
    {
        {
            System.out.println(1);
        }
         
        static
        {
            System.out.println(2);
            // 报错，非静态内部类不允许定义静态代码块
        }
    }
}
```

#### 15.
```
class ABC
{
    int i = 10101;
     
    {
        i--;	//运算后变为10100
    }
     
    public ABC()
    {
        --i;	//10099
    }
     
    class XYZ
    {
        int i = this.i;	//0
         
        {
            i++;	//1
        }
         
        public XYZ() 
        {
            ++i;	//2
        }
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        ABC abc = new ABC();
         
        System.out.println(abc.i);	//10099
         
        ABC.XYZ xyz = abc.new XYZ();
         
        System.out.println(xyz.i);	//2
         
        ABC.XYZ xyz1 = new ABC().new XYZ();	
         //新建匿名ABC对象
        System.out.println(xyz1.i);	//2
    }
}
```
#### 16.
```
class P
{
    String s = "PPP";
     
    {
        System.out.println(s);
    }
     
    String methodP()
    {
        class Q
        {
            String s = P.this.s+"QQQ";
             
            {
                System.out.println(s);
            }
        }
         
        return new Q().s+s;
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        P p = new P();		//PPP
         
        System.out.println(p.methodP());//PPPQQQ 	PPPQQQPPP
    }
}

```

#### 17. 

```
class A
{
    void methodA1(int i)
    {
        System.out.println(i+++i);
    }
     
    void methodA2(int i)
    {
        System.out.println(--i-i--);
    }
}
 
class B
{
    A a = new A()
    {
        void methodA1(int i)
        {
            System.out.println(++i+i++);
        }
         
        void methodA2(int i)
        {
            System.out.println(i---i);
        }
    };
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new A();
         
        a.methodA1(10);
        //21
        a.methodA2(10);
        // 0
        B b = new B();
         
        b.a.methodA1(10);
        // 22
        b.a.methodA2(10);
        // 1
    }
}

```

#### 18. 以下代码能否通过编译，为什么
```
class One
{
    void methodOne()
    {
        public class Two
        {
             
        }
    }
}
//报错，局部内部类前不允许加访问权限修饰符
```


#### 19.

```
class One
{
    {
        System.out.println("ONE");
    }
     
    class Two
    {
        {
            System.out.println("TWO");
        }
    }
     
    static
    {
        System.out.println("THREE");
    }
     
    static class Three
    {
        {
            System.out.println("FOUR");
        }
         
        static
        {
            System.out.println("FIVE");
        }
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        One one = new One();		
        //THREE	ONE    
        One.Two two = one.new Two();
        //TWO
        One.Three three = new One.Three();
        //报错，无法识别new One
    }
}
```

#### 20. 以下代码能否通过编译，为什么
```
class A
{
    class B extends A
    {
        class C extends B
        {
            class D extends C
            {
                 
            }
        }
    }
}
//编译通过
```

#### 21.
```
abstract class X
{
    static String s1 = "STATIC";
     
    String s2 = "NON-STATIC";
     
    abstract void methodX(); 
     
    static abstract class Y
    {
        String s1 = "NON-STATIC";
         
        static String s2 = "STATIC";
         
        abstract void methodY();
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        new X() 
        {   
            void methodX()
            {
                System.out.println(s1+" "+s2);
            }
        }.methodX();
        //STATIC	NON-STATIC
        new X.Y() 
        {   
            void methodY() 
            {
                System.out.println(s1+" "+s2);
            }
        }.methodY();
        //NON-STATIC	STATIC
    }
}
```

#### 22. 在下面的示例中，如何访问“内部类”的“i”字段？
```
class OuterClass
{
    static class InnerClass
    {
        int i;
    }
}
//OuterClass.InnerClass.i
```

#### 23.
```
class X
{   
    static
    {
        class Y
        {   
            {
                System.out.println(1);
            }
        }
    }
     
    {
        class Y
        {
            {
                System.out.println(2);
            }
        }
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        new X();
    }
}
//2	1
```

#### 24.
```
class A
{   
    abstract class B
    {
        abstract void method();
    }
     
    {
        new B()
        {
             
            @Override
            void method()
            {
                System.out.println("BBB");
            }
        }.method();
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        new A();
        //BBB
    }
}
```

#### 25.
```
class X
{   
    void methodX()
    {
        class Y
        {
            static void methodY()
            {
                 
            }
        }
    }
}
//报错，非静态局部内部类中不可以定义静态方法
```

#### 26. 如何在class A以外的其他类中实例化 class B
```
class A
{
    void methodA()
    {
        class B
        {
             
        }
    }
}
//?
```

#### 27.
```
public class Outer 
{ 
	public static int temp1 = 1; 
	private static int temp2 = 2; 
	public int temp3 = 3; 
	private int temp4 = 4; 
	
	public static class Inner 
	{ 
		private static int temp5 = 5; 
		
		private static int getSum() 
		{ 
			return (temp1 + temp2 + temp3 + temp4 + temp5); 
			//报错，静态方法不能调用非静态成员变量
		} 
	} 
	
	public static void main(String[] args) 
	{ 
		Outer.Inner obj = new Outer.Inner(); 
		System.out.println(obj.getSum()); 
	} 
	
} 

```

#### 28.
```
public class Outer  
{ 
        private static int data = 10; 
        private static int LocalClass() 
        { 
            class Inner 
            { 
                public int data = 20; 
                private int getData() 
                { 
                    return data; 
                } 
            }; 
            Inner inner = new Inner(); 
            return inner.getData(); 
        } 

        public static void main(String[] args) 
        { 
            System.out.println(data * LocalClass()); 
            //200
        } 
} 

```

#### 29.
```
interface Anonymous 
{ 
	public int getValue(); 
} 
public class Outer 
{ 
	private int data = 15; 
	public static void main(String[] args) 
	{ 
		Anonymous inner = new Anonymous() 
				{ 
					int data = 5; 
					public int getValue() 
					{ 
						return data; 
					} 
					public int getData() 
					{ 
						return data; 
					} 
				}; 
		Outer outer = new Outer(); 
		System.out.println(inner.getValue() + inner.getData() + outer.data); 
		//25
	} 
} 

```

#### 30.
```
public class Outer 
{ 
    private int data = 10; 
      
    class Inner 
    { 
        private int data = 20; 
        private int getData() 
        { 
            return data; 
        } 
        public void main(String[] args) 
        { 
            Inner inner = new Inner(); 
            System.out.println(inner.getData()); 
            //20
              
        } 
    } 
    private int getData() 
    { 
        return data; 
    } 
    public static void main(String[] args) 
    { 
        Outer outer = new Outer(); 
        Outer.Inner inner = outer.new Inner(); 
        System.out.printf("%d", outer.getData()); 
        //10
        inner.main(args);
        //20
    } 
} 
```

#### 31.
```
interface OuterInterface 
{ 
    public void InnerMethod(); 
    public interface InnerInterface 
    { 
        public void InnerMethod(); 
    } 
} 
public class Outer implements OuterInterface.InnerInterface, OuterInterface 
{ 
    public void InnerMethod() 
    { 
        System.out.println(100); 
    } 
      
      
    public static void main(String[] args) 
    { 
        Outer obj = new Outer(); 
        obj.InnerMethod(); 
        //100
    } 
} 
```
