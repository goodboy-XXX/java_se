package club.banyuan.practice01;

public class Staff {
    StaffMember[] staffList;

    //设置工作人员名单
    public Staff() {
        staffList = new StaffMember[8];
        staffList[0] = new Executive("张三", "玄武", "13312345678", "123-45-6789", 2423.07);
        staffList[1] = new Employee("李四", "仙林", "13888888888", "987-65-4321", 1246.15);
        staffList[2] = new Employee("王五", "鼓楼", "13777777777", "010-20-3040", 1169.23);
        staffList[3] = new Hourly("赵六", "河西", "13555555555", "958-47-3625", 10.55);
        staffList[4] = new Volunteer("小强", "江宁", "15111111111");
        staffList[5] = new Volunteer("小明", "栖霞", "13999999999");
        staffList[6] = new Commission("小红","北京","13322222222","999-11-1234",6.25,0.2);
        staffList[7] = new Commission("小蓝","上海","13311111111","999-22-5555",9.75,0.15);
        ((Executive) staffList[0]).awardBonus(500.00);
        ((Hourly) staffList[3]).addHours(40);
        ((Hourly) staffList[6]).addHours(35);
        ((Commission) staffList[6]).addSales(400);
        ((Hourly) staffList[7]).addHours(40);
        ((Commission) staffList[7]).addSales(950);
    }

    // 支付所有员工工资。
    public void payday() {
        double amount;

        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);
            amount = staffList[count].pay(); // 多态
            if (amount == 0.0) {
                System.out.println("鼓励!");
            } else {
                System.out.println("支付: " + amount);
            }
            System.out.println("-----------------------------------");
        }
    }
}
