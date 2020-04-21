

1.请思考验证当float类型变量中保存了超出了int所能表示的范围的数字，将这个变量强制转换为int数据类型后，int数据类型变量中保存的值是多少

`public class Demo01 {`
    `public static void main(String[] args) {`
        `float float1 = (int)9999999999.99999;`
        `System.out.println(float1);`
    `}`
`}`
`结果：2.14748365E9`

2.编写示例证明||会出现短路而|是不会短路的   

```
public class Demo02 {
    public static void main(String[] args) {
        int i1 = 1;
        System.out.println((i1 > 0) || (i1 / 0) == 0);
    }
}
编译通过，结果为true
public class Demo03 {
    public static void main(String[] args) {
        int i1 = 1;
        System.out.println((i1 > 0) | (i1 / 0) == 0);
    }
}
编译通过，结果报错
```

