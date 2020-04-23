package club.banyuan.animal;

public class Cat {

    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void bark() {
        System.out.println(name + ": 喵..");
    }

}
