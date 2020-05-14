package club.banyuan.cal;

public class IllegalInputException extends Exception{
    private String exceptionType;

    public IllegalInputException(){

    }

    public IllegalInputException(String exceptionType){
        super(exceptionType);
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }
}
