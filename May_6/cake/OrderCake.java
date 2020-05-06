package club.banyuan.cake;

public class OrderCake extends Cake {

    private double weightInKG;

    public double getWeightInKG() {
        return weightInKG;
    }

    public OrderCake(int n, double r, double weightInKG) {
        super(n, r);
        this.weightInKG = weightInKG;
    }

    @Override
    public double calcPrice() {
        return weightInKG * price;
    }
}
