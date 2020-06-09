package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class practice{

    public static void main(String[] args) {

        printInfo(0);

    }

    public static void printInfo(Object object){

        //获取所有成员变量名并排序打印
//        Class<?> aClass = object.getClass();
//        Field[] declaredFields = aClass.getDeclaredFields();
        Field[] declaredFields = object.getClass().getDeclaredFields();
        Arrays.sort(declaredFields, Comparator.comparing(o -> o.getName().toLowerCase()));
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        //获取所有方法名称并排序打印
        Method[] declaredMethods1 = object.getClass().getDeclaredMethods();
        Arrays.sort(declaredMethods1, Comparator.comparing(o -> o.getName().toLowerCase()));
        for (Method method : declaredMethods1) {
            System.out.println(method);
        }
       /* Method[] declaredMethods = aClass.getDeclaredMethods();
        Arrays.sort(declaredMethods, Comparator.comparing(o -> o.getName().toLowerCase()));
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }*/

    }
}
