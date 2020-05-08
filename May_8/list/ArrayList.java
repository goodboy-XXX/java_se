package club.banyuan.list;

public class ArrayList implements List {
    private Object[] arrayList = new Object[10];

    @Override
    public Object set(int index, Object element) {
        if (arrayList.length <= index) {
            System.out.println("索引越界");
            return null;
        }
        Object object = arrayList[index];
        arrayList[index] = element;
        return object;
    }

    @Override
    public Object get(int index) {
        return arrayList[index];
    }

    @Override
    public void clear() {
        arrayList = null;
    }

    @Override
    public Object remove(int index) {
        if (index >= arrayList.length) {
            return null;
        }
        return arrayList[index];
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(Object o) {
        if (arrayList[arrayList.length - 1] != null) {
            increaseArrayListLength();
        }
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] == null) {
                arrayList[i] = o;
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        if (arrayList == null) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] != null) {
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    public void increaseArrayListLength() {
        Object[] objects = new Object[arrayList.length + 10];
        for (int i = 0; i < arrayList.length; i++) {
            objects[i] = arrayList[i];
        }
        arrayList = objects;
    }
}
