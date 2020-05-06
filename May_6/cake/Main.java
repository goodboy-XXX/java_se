package club.banyuan.cake;

public class Main {
    public static void main(String[] args) {
        System.out.println("所有蛋糕的总价为：" + totalPrice());
        System.out.println("ReadyMakeCake的总价为：" + readyMakeCakeTotalPrice(createCake()) + "  总数量为："
                + readyMakeCakeTotalNum(createCake()));
        print(createCake());
    }

    public static Cake[] createCake() {
        Cake[] cakes = new Cake[10];
        cakes[0] = new OrderCake(1, 10.0, 2);
        cakes[1] = new OrderCake(2, 20.0, 3);
        cakes[2] = new OrderCake(3, 11.0, 1);
        cakes[3] = new OrderCake(4, 10.5, 12);
        cakes[4] = new OrderCake(5, 1.0, 21);
        cakes[5] = new ReadyMakeCake(6, 13.5, 10);
        cakes[6] = new ReadyMakeCake(7, 20.5, 5);
        cakes[7] = new ReadyMakeCake(8, 100.0, 7);
        cakes[8] = new ReadyMakeCake(9, 80.0, 11);
        cakes[9] = new ReadyMakeCake(10, 40.0, 9);
        return cakes;
    }

    //计算所有蛋糕总价
    public static double totalPrice() {
        return orderCakeTotalPrice(createCake()) + readyMakeCakeTotalPrice(createCake());
    }

    public static double orderCakeTotalPrice(Cake[] cakes) {
        double num = 0.0;
        for (int i = 0; i < 5; i++) {
            num += cakes[i].calcPrice();
        }
        return num;
    }

    //计算ReadyMakeCake蛋糕总价
    public static double readyMakeCakeTotalPrice(Cake[] cakes) {
        double totalPrice = 0;
        for (int i = 6; i < cakes.length; i++) {
            totalPrice += cakes[i].calcPrice();
        }
        return totalPrice;
    }

    //计算ReadyMakeCake蛋糕总数
    public static int readyMakeCakeTotalNum(Cake[] cakes) {
        int totalNum = 0;
        for (int i = 0; i < cakes.length; i++) {
            if (cakes[i] instanceof OrderCake) {
                continue;
            }
            totalNum += ((ReadyMakeCake) cakes[i]).getQuantity();
        }
        return totalNum;
    }

    //显示最高价格出售的蛋糕信息
    public static void print(Cake[] cakes) {
        int maxIndex = 0;
        for (int i = 0; i < cakes.length; i++) {
            if (cakes[i].calcPrice() > cakes[maxIndex].calcPrice()) {
                maxIndex = i;
            }
        }
        if (maxIndex > 5) {
            System.out.println("最高价出售的蛋糕信息为：");
            System.out.println("id为：" + cakes[maxIndex].id);
            System.out.println("价格为：" + cakes[maxIndex].price);
            System.out.println("数量为：" + ((ReadyMakeCake) cakes[maxIndex]).getQuantity());
        } else {
            System.out.println("最高价出售的蛋糕信息为：");
            System.out.println("id为：" + cakes[maxIndex].id);
            System.out.println("价格为：" + cakes[maxIndex].price);
            System.out.println("重量为：" + ((OrderCake) cakes[maxIndex]).getWeightInKG());
        }
    }
}

