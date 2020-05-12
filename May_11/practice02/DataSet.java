package club.banyuan.practice02;

public class DataSet {
    // TODO: 定义private 实例变量
    private double sum;
    private double count;
    Object maximum;
    Measurer measurer;

    public DataSet() {
        sum = 0;
        count = 0;
        maximum = null;
    }

    public DataSet(Measurer aMeasurer) {
        sum = 0;
        count = 0;
        maximum = null;
        measurer = aMeasurer;
    }

    // TODO： 重载方法，使得Contry统计 DataSetTester 运行成功
    public void add(Object x) {
        sum = sum + measurer.measure(x);
        if (count == 0 || measurer.measure(maximum) < measurer.measure(x)) {
            maximum = x;
        }
        count++;
    }

    public void add(Measurable x){
        sum = sum + x.getMeasure();
        if (count == 0 || measurer.measure(maximum) < measurer.measure(x)) {
            maximum = x;
        }
        count++;
    }

    public double getAverage() {
        // TODO: Check divide by zero. Compute the average value.
        if (count == 0){
            return 0;
        }else{
            return sum / count;
        }
    }

    public Object getMaximum() {
        return maximum;
    }
}
