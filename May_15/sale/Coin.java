package club.banyuan.sale;

public enum Coin {
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10);
    private int coinFaceValue;

    Coin(int coinFaceValue) {
        this.coinFaceValue = coinFaceValue;
    }

    public  int getCoinFaceValue() {
        return coinFaceValue;
    }
}
