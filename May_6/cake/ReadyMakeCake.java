package club.banyuan.cake;

public class ReadyMakeCake extends Cake{

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public ReadyMakeCake(int n, double r, int quantity) {
        super(n, r);
        this.quantity = quantity;
    }

    @Override
    public double calcPrice() {
        return quantity * price;
    }
}
