一、选择题（**4**分***15**）

\1. 下列选项中关于Java中super关键字的说法错误的是（    B      ）

A. super关键字是在子类对象内部指代其父类对象的引用

B. super关键字不仅可以指代子类的直接父类，还可以指代父类的父类

C. 子类可以通过super关键字调用父类的方法

D. 子类可以通过super关键字调用父类的属性

 

\2. 给定如下Java代码，关于super的用法，以下描述正确的是（    C      ）

class C extends B{

​	public C(){

​		super();

​	}

}

A. 用来调用类B中定义的super()方法

E. 用来调用类C中定义的super()方法

F. 用来调用类B的无参构造方法

G. 用来调用类B中第一个出现的构造方法

 

\3. 下列对Java中的继承描述错误的说法是（     D     ）

A. 子类至少有一个父类

H. 子类可作为另一个子类的父类

I. 子类可以通过this关键字来访问父类的私有属性

J. 子类继承父类的方法访问权限保持不变

 

\4. 下面代码的运行结果是（   A       ）

public class Car {

​	public void run(){

​		System.out.println(“汽车在跑”);

​	}

}

public class Benz extends Car {

​	public void run(){

​		System.out.println(“奔驰在跑”);

​	}

 

​	public static void main(String[] args){

​		Car car = (Car)(new Benz());

​		car.run();

​	}

}	

A. 汽车在跑

K. 奔驰在跑

L. 无法编译

M. 运行时将抛出异常

 

\5. 阅读下面的代码，正确的说法是（    B      ）

class Foo { 

​	int num;

​	Baz comp = new Baz(); 

} 

class Bar { 

​	Boolean flag; 

} 

class Baz extends Foo { 

​	Bar thing = new Bar(); 

​	double limit; 

}

A. Bar是Baz子类

N. Baz是Foo子类

O. Foo是Baz子类

P. Baz是Bar父类

 

\6. 类Test1、Test2定义如下： 

public  class  Test1 {

​	 public  float  aMethod（float a，float b） 

 } 

public  class  Test2  extends  Test1{ 

​	 //TODO

} 

将以下哪种方法插入行TODO位置是不合法的（   A 	）

A. float aMethod(float a, float b){ } 

Q. public int aMethod(int a, int b)

R. public float aMethod(float  p, float q){ } 

S. public int aMethod(int a, int  b)

 

\7. 关于以下程序段，正确的说法是（    C      ）

​	1．  String s1="abc"+"def"; 

​	2．  String s2= new String (s1); 

​	3．  if(s1 == s2)

​	4．     System.out.println("== succeeded");  

​	5．  if (s1.equals(s2)) 

​	6．     System.out.println(".equals()  succeeded"); 

A. 行4与行6都将执行            

T. 行4执行,行6不执行 

U. 行6执行,行4不执行         

V. 行4、行6都不执行 

 

\8. 以下哪项是接口的正确定义？（     D     ）

A. Interface B{  void print(){};}

W. abstract interface B { void print() ;}

X. abstract interface B extends A1,A2{ abstract void print(){  };}  

Y. interface B{ void  print();}

 

\9. class  A extends B，class B extends C,并且在Java源代码中有如下声明：

​	1.   A  a0=new  A();

​	2.   A  a1=new  B();

​	3.   A  a2=new  C();

问以下哪个说法是正确的？（     A     ）

A. 只有第1行能通过编译  

Z. 第1、2行能通过编译，但第3行编译出错 

AA. 第1、2、3行能通过编译，但第2、3行运行时出错 

AB. 第1行、第2行和第3行的声明都是正确的  

 

\10. 编译运行以下程序后，关于输出结果的说明正确的是 （    B      ）

​       public  class   Conditional{

​           public  static  void  main(String  args[ ]){

​          	 int  x=4;

​           System.out.println( "value  is" + ((x>4) ? 99.9:9)); 

​		}

​	}

A．输出结果为：value  is  99.9      

B．输出结果为：value  is  9 

C．输出结果为：value  is  9.0   

D．编译错误 

 

\11. 当试图编译并运行下面程序时会出现什么结果（     D     ）

class A{  

​      public int getNumber(int a){            

​		return a+1;         

​	}     

}  

class B extends A{  

​     public int getNumber(int a, char c){            

​		return a+2;         

​	}  

  	public static void main(String[] args){           

  		B b=new B();  

​        System.out.println(b.getNumber(0));         

  	}       

}    

A. 编译错误 

AC. 运行错误 

AD. 1 

AE. 2 

 

\12. 有如下程序段: 

int a = b = 5;

String s1 = "祝你今天考出好成绩!";

String s2 = s1;

则表达式a == b与s2 == s1的结果分别是（    **A**      ）

A. true与true        

AF. false与true         

AG. true与false      

AH. false与false 

 

\13. 指出下列程序运行的结果（     **D**     ）

public class Example{  

​    String str=new String("good");  

​     char[] ch = {'a','b','c'};  

​     public static void main(String args[]){  

​         Example ex=new Example();  

​         ex.change(ex.str,ex.ch);  

​         System.out.print(ex.str+" and ");

​      Sytem.out.print(ex.ch);

​     }

​    public void change(String str,charch[]){  

​         str="test ok";  

​         ch[0]='g';  

​     }

}

A、 good and abc  

B、 good and gbc  

C、 test ok and abc  

D、 test ok and gbc  

 

\14. 下面是People和Child类的定义和构造方法，每个构造方法都输出编号。在执行new  Child("mike")的时候都有哪些构造方法被顺序调用？请选择输出结果（     A     ）

class People {

​       String name;

​       public People() {  System.out.print(1); }

​       public People(String name) {

​              System.out.print(2);

​              this.name = name;

​       }

}

class Child extends People {

​       People father;

​       public Child(String name) {

​              System.out.print(3);

​              this.name = name;

​              father = new People(name + ":F");

​       }

​       public Child(){ System.out.print(4); }

}  

A. 312      

AI. 32        

AJ. 432    

AK. 132

 

 

\15. 编译运行下面的程序，结果是（     B     ）

public class A{

  public static void main(String args[]){

​		B b=new B();

​		b.test();

}

  void test(){

​	System.out.print("A");

  }

}

class B extends A{

  void test(){

​	super.test();

​	System.out.print("B");

  }

}

A．产生编译错误    			   

B．代码可以编译运行，并输出结果：AB

C．代码可以编译运行，但没有输出     

D．编译没有错误，但会产生运行时异常

 

二、写出下列程序的结果（**5**分***5)**

\1. 该程序的运行结果 

class Aclass {

​	Aclass() {

​		System.out.print("Aclass");

​	}

}

public class Bclass extends Aclass {

​	public Bclass() {

​	  	super();

​		System.out.println("Bclass");

​	}

public static void main(String[] args) {

​	Aclass a = new Aclass();

​	Aclass a1 = new Bclass();

}

//		AclassAclass

//		Bclass

 

\16. 该程序的结果

class Super {

​	public int i=0;

​	public Super(String text){

​		i = 1;

​	}

}

public class Sub extends Super {

​	public Sub(String text){

​		i=2;

​	}

​	public static void main(String[] args) {

​		Sub sub = new Sub("Hello");

​		System.out.println(sub.i);	//2

​	}

}

 

\17. 下列程序,写出结果

public class Super{

​	public int getLength(){

​		return 4;

​	}

}

public class Sub extends Super{

​	public int getLength(){

​		return 5;

​	}

​	public static void main(String[] args){

​		Super sooper = new Super();

​		Sub sub = new Sub();		System.out.println(sooper.getLength()+"="+sub.getLength());

​	}

}

//		4=5

 

\18. 分析下列程序：该程序的结果是

class A{

​	public int getNumber(){

​		return 1;

​	}

}

class B extends A{

​	public int getNumber(){

​		return 2;

​	}

​	public static void main(String args[]){

​		A b = new B();

​		System.out.println(b.getNumber());	//2

​	}

}

 

\19. 该程序的运行结果

class Base {

​    public void method(){

​          System.out.print ("Base method");

​    }

}

class Child extends Base{   

​    public void methodB(){

​          System.out.print ("Child methodB");

​    }

}

class Sample {

​    public static void main(String[] args) {

​          Base base= new Child();

​          base.methodB();	//Child methodB

​    }

}

 

三、设计和实现队列（**15**分**)**

 

设计队列接口用于添加和删除元素。队列依次保存添加到队列的元素，调用删除方法时，删除添加的第一个元素（先进先出，FIFO）。设计带有添加和删除元素（Object）方法的接口Queue。此外，还有一个检查队列是否为空的方法。

设计一个队列接口的实现类（ArrayQueue)，使用数组保存数据。如果数组满了，请创建一个更大（已有容量大小的两倍）的数组，然后将小数组的所有元素复制到新数组中。

 

```

```

```
package club.banyuan.queue;

public interface Queue {
    boolean add(Object object);

    boolean remove();

    boolean isEmpty();
}


public class ArrayQueue implements Queue {

    private static final int ARRAY_LENGTH = 10;
    private Object[] arrays = new Object[ARRAY_LENGTH];
    int size;
    
    @Override
    public boolean add(Object object) {
        if (object == null) {
            return false;
        } else if (arrays[arrays.length - 1] != null) {
            increaseArrayLength();  //判断数组是否存满，存满则扩容
        }
        for (int i = 0; i < arrays.length; i++) {
            //遍历数组，找到第一个null的位置并赋值为object
            if (arrays[i] == null) {    
                arrays[i] = object;
                size++;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove() {
        // 如果数组为空，则没法删除
        if (size == 0) {
            return false;
        } else {
            //从第一个添加开始删除
            arrays[0] = null;
            size--;
            return true;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void increaseArrayLength() {
        //数组扩容，每次扩大两倍
        Object[] objects = new Object[ARRAY_LENGTH * 2];
        //将扩容后的数组赋值
        System.arraycopy(arrays, 0, objects, 0, arrays.length - 1);
        arrays = objects;
    }
}

//测试方法
public class Main {
    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue();
        System.out.println(aq.add(1));
        System.out.println(aq.add(2));
        System.out.println(aq.add(3));
        System.out.println(aq.size);
        System.out.println(!aq.isEmpty());
        System.out.println(aq.remove());
    }
}


```