package club.banyuan.weekday;

public enum Weekday {

    MONDAY("星期一",false),
    TUESDAY("星期二",false),
    WEDNESDAY("星期三",false),
    THURSDAY("星期四",false),
    FRIDAY("星期五",false),
    SATURDAY("星期六",true),
    SUNDAY("星期日",true);

    private final String weekDayName;
    private final boolean isHoliday;

    Weekday(String weekDayName,boolean isHoliday){
        this.weekDayName = weekDayName;
        this.isHoliday = isHoliday;
    }

    boolean isWeekDay() {
        return !isHoliday();
    }

    boolean isHoliday() {
        return (this.weekDayName.equals("星期六")) || (this.weekDayName.equals("星期日"));
    }

    @Override
    public String toString(){
        return weekDayName;
    }
}
