package demo07;

import java.util.Random;

public class Practice01 {
    public static void main(String[] args) {
        Practice01 p = new Practice01();
        System.out.println("生成的随机数为：" + p.randomInt(-10, 10));
    }

    public int randomInt(int from, int to) {
        int num = Math.abs(to - from);
        Random r = new Random();
        if (from > to) {
            System.out.println("输入错误！");
            return 0;
        } else{
            int s = r.nextInt(num + 1 ) + from;
            return s;
        }
    }
}
