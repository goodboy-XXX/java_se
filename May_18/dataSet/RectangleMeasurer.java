package club.banyuan.may18;


public class RectangleMeasurer implements Measurer<Rectangle> {

    @Override
    public double measure(Rectangle anObject) {
        return anObject.width * anObject.height;
    }
}
