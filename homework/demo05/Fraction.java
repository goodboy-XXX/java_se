package demo05;

public class Fraction {
    int up = 7, down = 4;

    public static void main(String[] args) {
        Fraction fra = new Fraction();
        fra.print();
        System.out.println(fra.toDouble());
    }

    public double toDouble() {
        return (double) up / down;
    }

    public Fraction plus(Fraction r) {
        Fraction fra = new Fraction();
        fra.down = down * r.down;
        fra.up = up * r.down + down * r.up;
        return fra;
    }

    public Fraction multiply(Fraction r) {
        r.up = up * r.up;
        r.down = down * r.down;
        return r;
    }

    public void print() {
        if (up % down == 0) {
            System.out.println(up / down);
        } else {
            int min = 1;
            for (int i = 2; i < down; i++) {
                if ((up % i == 0) && (down % i == 0)) {
                    min = i;
                }
            }
            System.out.println(up / min + "/" + down / min);
        }
    }
}
