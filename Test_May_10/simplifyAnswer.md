一：

1-5 ： BCDAB

6-10：ACDAB

11-15：DADAB

二：

1.AclassAclass

Bclass

2.2

3.4=5

4.2

5.Child methodB

三：

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

