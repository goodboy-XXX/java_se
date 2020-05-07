package club.banyuan.practice01;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public void addSales(double totalSales){
        this.totalSales = totalSales;
    }
    @Override
    public double pay() {
        double payment = super.pay() + totalSales * commissionRate;
        addSales(0);
        return payment;
    }


    @Override
    public String toString(){
        String result = super.toString();
        result += "\n总销售额为:" + totalSales;
        return result;
    }
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

}
