package club.banyuan.list;


public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list.add(1));
        System.out.println(list.add(2));
        System.out.println(list.add(3));
        System.out.println(list.set(0,33));
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.isEmpty());
        System.out.println(list.remove(1));
        System.out.println(list.remove((Integer)33));
        list.clear();
        System.out.println(list.isEmpty());

    }
}
