package club.banyuan.practice;

public class Rectangle extends Shape{

    private int length;
    private int wide;

    public Rectangle(int length, int wide) {
        this.length = length;
        this.wide = wide;
    }

    @Override
    public String getShapeName(){
        return "矩形";
    }

    @Override
    public double area(){
        return length * wide;
    }

    @Override
    public double perimeter(){
        return 2 * (length + wide);
    }
}
