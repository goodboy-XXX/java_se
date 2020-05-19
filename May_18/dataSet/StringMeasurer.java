package club.banyuan.may18;

public class StringMeasurer implements Measurer<String>{
    @Override
    public double measure(String anObject) {
        if (anObject == null) {
            return 0;
        }
        return anObject.length();
    }
}
