package club.banyuan.cal;

public class DivideByZeroException extends CalculatorException {
    public DivideByZeroException(){

    }

    public DivideByZeroException(String s){
        super(s);
    }
}
