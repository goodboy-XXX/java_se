package demo03;

public class ObjectDemo {
    public static Elephant creatrElephant(int heightInCm) {
//        System.out.println("创建一个大象，高度" + heightInCm + "CM");
        Elephant elephant = new Elephant();
        elephant.heightInCM = heightInCm;
        return elephant;
    }
    public static Fridge createFridge(int heightInCM){
//        System.out.println("创建一个冰箱，高度" + heightInCM + "CM");
        Fridge fridge = new Fridge();
        fridge.heightInCM = heightInCM;
        return fridge;
    }
    public static void putInElephant(Elephant elephant,Fridge fridge){
//        System.out.println("把" + elephant.heightInCM + "CM高的大象装进" + fridge.heightInCM + "的冰箱");
        if(elephant.heightInCM < fridge.heightInCM){
            fridge.store(elephant);
            System.out.println("冰箱里的大象高度是" + fridge.storage.heightInCM);
        }
        else{
            System.out.println("冰箱装不下！");
        }
    }
    public static Lion createLion(int heightInCM){
//        System.out.println("创建一个狮子,高" + heightInCM + "CM");
        Lion lion = new Lion();
        lion.heightInCM = heightInCM;
        return lion;
    }

    public static void main(String[] args) {
        Elephant elephant = creatrElephant(300);
        Fridge fridge = createFridge(500);
        Lion lion = createLion(400);
        putInElephant(elephant,fridge);
        putInElephant(elephant,fridge); // 判断冰箱里是否放入大象
        fridge.store(lion);
//        fridge.remove();
    }
}
