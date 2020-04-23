package demo03;

public class Fridge {
    int heightInCM;
    Elephant storage;
    Lion l;

    public void store(Elephant elephant) {
        if (storage != null) {
            System.out.println("冰箱已经满了！");
        } else {
            storage = elephant;

        }
    }

    public void store(Lion lion) {
        if (l != null) {
            System.out.println("冰箱已经满了!");
        } else {
            l = lion;
        }
    }

    public Elephant remove() {
        System.out.println("把大象从冰箱里取出来");
        storage = null;
        Elephant elephant = ObjectDemo.creatrElephant(300);
        storage = elephant;
        elephant = null;
        return storage;
    }
}

