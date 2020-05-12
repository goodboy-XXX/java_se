package club.banyuan.bird;

public class Main {
    public static void show(Bird bird) {
        System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");
    }

    public static void main(String[] args) {

        show(new Bird() {
            //TODO
            String name = "燕子";

            @Override
            public String getName() {
                return this.name;
            }

            @Override
            public int fly(){
                return 1000;
            }
        });
    }
}
