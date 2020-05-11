package club.banyuan.map;

public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        System.out.println(map.isEmpty());
        System.out.println(map.put(1,11));
        System.out.println(map.put(2,22));
        System.out.println(map.put(3,33));
        System.out.println(map.put(4,44));
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue(44));
        System.out.println(map.remove(1));
        System.out.println(map.size());



    }
}
