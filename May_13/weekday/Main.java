package club.banyuan.weekday;

public class Main {
    public static void main(String[] args) {

        //增强for遍历枚举中的值
        for (Weekday weekday : Weekday.values()) {
            print(weekday);
        }

        Weekday sat = Weekday.SATURDAY;
        System.out.println("sat的序号是枚举中SATURDAY的序号：" + sat.ordinal());
        for (Weekday day : Weekday.values()) {
            System.out.println(day + " " + day.compareTo(sat));
            if (day.compareTo(sat) > 0) {
                System.out.println("这个枚举对象的序号大于sat序号的值");
            } else if (day.compareTo(sat) == 0) {
                System.out.println("这个枚举对象的序号等于sat序号的值");
            } else{
                System.out.println("这个枚举对象的序号小于sat序号的值");
            }
        }
    }


    public static void print(Weekday weekdays) {
        if (weekdays.isHoliday()) {
            System.out.println(weekdays + " 是休息日");
        }
        if (weekdays.isWeekDay()) {
            System.out.println(weekdays + " 是工作日");
        }
    }
}
