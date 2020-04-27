半圆学社JavaSE测试⼀
姓名：徐明时
⼀、选择题（3分*23） 
1. 下列选项中关于Java中this关键字的说法错误的是（B ）。 
A. this是在对象内部指代对象⾃身的引⽤ 
B. this关键字可以在类中的任何位置使⽤ 
C. this只和特定的对象关联，⽽不和类关联 
D. 同⼀个类的不同对象有不同的this 
2. 能与public void methodA(){ }⽅法形成重载的有（C ）。 
A. private void methodA(){ } 
B. private int methodA(){ return 1;} 
C. public void methodA(int a){ } 
D. public void methodA() throws Exception{ } 
3. 作为Java应⽤程序⼊⼝的main⽅法，其声明格式是（ B
） 
A．public static int main(String args[]) 
B．public static void main(String args[]) 
C．public void main(String args[]) 
D．public int main(String args[]) 
4. 下⾯命令正确的是（B ） 
A．java AppFirst.java B．java AppFirst 
C．java appfifirst.class D．javac AppFirst 
5. 下⾯哪个单词是Java语⾔的关键字（D
） 
A．False B．FOR C．For D．for 
6. 执⾏下⾯程序后，哪个结论是正确的（ D
） 
int a, b, c; 
a=1; b=3; c=(a+b>3 ? ++a : b++); 
A．a的值为2，b的值为3，c的值为1 
B．a的值为2，b的值为4，c的值为2 
C．a的值为2，b的值为4，c的值为1 
D．a的值为2，b的值为3，c的值为2  
7. 设有定义语句“int a[]={66,88,99};”，则以下对此语句的叙述错误的是（C ） 
A．定义了⼀个名为a的⼀维数组 
B．a数组有3个元素 
C．a数组的元素的下标为1～3 
D．数组中的每个元素是整数 
8. 下列类的声明中不合法的是(B ) 
A．class People（）{…} 
B．class 植物{…} 
C．class A{…} 
D．public class 共有类{…} 
9. 在Java中，下⾯对于构造函数的描述正确的是( D
)。 
A. 类必须显式定义构造函数 
B. 构造函数的返回类型是void 
C. 构造函数和类有相同的名称，并且不能带任何参数 
D. ⼀个类可以定义多个构造函数 
10. 下⾯关于类的说法，不正确的是（D ） 
A. 类是同种对象的集合和抽象 
B. 类属于Java语⾔中的引⽤数据类型 
C. 对象是类的实例 
D. 类就是对象 
11. 有⼀个类MyClass，它的构造⽅法声明正确的是（D ） 
A. 
void MyClass(int x) {…} 
B. 
Myclass(int x){...} 
C. 
public MyClass(int x){…} 
D. 
public void MyClass(int x){…} 
12. .为了区分类中重载的同名不同⽅法，要求(A )  
A. 参数的类型或个数不同 
B. 使⽤不同的参数名 
C. 修改访问权限 
D. ⽅法返回值数据类型不同 
13. 研究下⾯的JAVA代码，输出结果将是（ C
）  
public class Test { 
String s = "nba"; 
public void test(String s) { 
System.out.println("s:"+s); 
System.out.println("this.s:"+this.s); 
this.s=s; 
System.out.println("s:"+s); 
System.out.println("this.s:"+this.s); 
} 
public static void main(String[] args) { 
new Test().test("cba"); 
} 
} 
A. s:cba this.s:nba s:cba this.s:nba 
B. s:nba this.s:nba s:nba this.s:nba 
C. s:cba this.s:nba s:cba this.s:cba 
D. s:nba this.s:cba s:cba this.s:cba  
14. 对于任意⼀个类，⽤户所能定义的构造⽅法的个数⾄多为（ E
）。 
A.0个 
B.1个 
C.2个 
D.3个 
E.任意多个 
15. 关于实例⽅法和类⽅法，以下描述正确的是：( B
)  
A. 实例⽅法只能访问实例变量 
B. 类⽅法既可以访问类变量，也可以访问实例变量 
C. 类⽅法只能通过类名来调⽤ 
D. 实例⽅法只能通过对象来调⽤ 
16. while循环和 do while循环的区别是：（ D
） 
A．没有区别，这两个结构任何情况下效果⼀样 
B．while循环⽐ do while循环执⾏效率⾼ 
C．do while循环执⾏次数可能为0 
D．while循环执⾏次数可能为0 
17. 关于 for循环和 while循环的说法哪个正确？（ A
）  
A．while循环先判断后执⾏，for循环先执⾏后判断。 
B．while循环判断条件⼀般是程序结果，for循环的判断条件⼀般是⾮程序结果 
C．两种循环任何时候都不可以替换 
D．两种循环结构中都必须有循环体，循环体不能为空  
18. 下列修饰符中与访问控制⽆关的是 （ D
）  
A．private 
B．public 
C．protected 
D．fifinal 
19. ⽅法内的形参,下⾯说法正确的是：（ B
）  
A．必须定义多个形参 
B．可以没有 
C．⾄少有⼀个 
D．只能是简单变量 
20. 关于对象成员占⽤内存的说法哪个正确？ （ B
） 
A. 同⼀个类的对象共⽤同⼀段内存 
B. 同⼀个类的对象使⽤不同的内存段，但静态成员共享相同的内存空间 
C．对象的⽅法不占⽤内存 
D．以上都不对  
21. 下列说法哪个正确？（ A
）  
A. ⼀个程序可以包含多个源⽂件 
B. ⼀个源⽂件中只能有⼀个类 
C. ⼀个源⽂件中可以有多个公共类 
D. ⼀个源⽂件只能供⼀个程序使⽤  
22. 对于构造⽅法，下列叙述正确的是：( A
) 
A. 构造⽅法的⽅法名必须与类名相同； 
B. 构造⽅法必须⽤void申明返回类型 
C. 构造⽅法可以被程序调⽤ 
D. 若编程⼈员没再类中定义构造⽅法，程序将报错。 
23. 在创建对象时必须（A ） 
A. 先声明对象，然后才能使⽤对象 
B. 先声明对象，为对象分配内存空间，然后才能使⽤对象 
C. 先声明对象，为对象分配内存空间，对对象初始化，然后才能使⽤对象 
D. 上述说法都对  
⼆、写出下列程序的结果（5分*3) 
1. 写出结果 
class A{ 
private String name=“张三”; 
void method(){ 
System.out.println(“名字叫:”+this.name); 
} 
static void info( String name ){ 
this.name=name; 
System.out.println(“名字叫:”+name); 
} 
} 
class B{ 
public static void main(String [ ] args){ 
new A().method(); 
A.info("王五"); 
} 
}
报错，静态方法中不能调用非静态成员变量（this）
2. 找出下⾯有⼏个错误,并且找出原因 
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
3. 写出结果 
class A{ 
private String name=“张三”; 
void method(String name){ 
name=name; 
System.out.println(“名字是:”+name); 
} 
static void method(){ 
method(“还有谁”); 

} 
public static void main(String[] args){ 
A.method(); 
} 
} 
输出：报错，静态方法调用了非静态方法
附加题( 5分 ) 
class A{ 
private static fifinal String ADDRESS="栖霞区下⽔道..."; 
public static int count=1; 
private String password; 
static { 
count++; 
} 
public A(){ 
count++; 
} 
{ 
count++; 
} 
} 
class B{ 
public static void main(String[] args) { 
new A(); 
new A(); 
System.out.println(A.count); 
} 
} 
输出count值 : 4