package club.banyuan.practice02;

public class Country implements Measurable{
    // TODO: 实现 Measurable 接口. getMeasure() 返回国家的人口总数. 提供构造方法，让DataSetTester运行正常

    private int population;

    public Country(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public double getMeasure() {
        return getPopulation();
    }


}
