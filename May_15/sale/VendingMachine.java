package club.banyuan.sale;

import java.util.Scanner;

public class VendingMachine {

    private static final String SERVICE_PASSWORD = "1110";
    private static final int MAX_INPUT_PASSWORD_NUM = 5;
    private String[] name = {"A", "B", "C", "D", "E"};
    private int[] num = {4, 1, 10, 6, 3};
    private int[] price = {10, 6, 5, 8, 7};
    private String[] status = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]"};
    private String goodsName = "=";
    private int totalSaleMoney = 0;
    private int insertMoney = 0;
    private int inputPasswordNum = 0;

    //显示页面
    public void show() {
        //判断商品状态是否售罄以及是否可以购买
        for (int i = 0; i < name.length; i++) {
            if (num[i] == 0) {
                status[i] = "[X]";
            } else if (price[i] <= insertMoney) {
                status[i] = "[O]";
            } else {
                status[i] = "[ ]";
            }
        }
        System.out.println("*---------------------------*");
        System.out.println("|     Vending   Machine     |");
        System.out.println("*---------------------------*");
        System.out.print("|  ");
        for (String s : name) {
            System.out.print(s + "    ");
        }
        System.out.println("|");
        System.out.print("|  ");
        for (int i : price) {
            if (i >= 0 && i <= 9) {
                //价格小于10显示美元符号加空格
                System.out.print("$ " + i + "  ");
            } else {
                System.out.print("$" + i + "  ");
            }
        }
        System.out.println("|");
        System.out.print("|  ");
        for (String str : status) {
            System.out.print(str + "  ");
        }
        System.out.print("|");
        System.out.println(" ");
        System.out.println("*---------------------------*");
        if (insertMoney >= 10) {
            System.out.println("|                     [$" + insertMoney + "] |");
        } else {
            System.out.println("|                     [$ " + insertMoney + "] |");
        }
        System.out.println("|                           |");
        System.out.println("|           [=" + goodsName + "=]           |");
        System.out.println("*---------------------------*");
        print();
    }

    //菜单选项
    public void print() {
        System.out.println("What would you like to do :");
        System.out.println("1.Read product information");
        System.out.println("2.Insert coin");
        System.out.println("3. Press product button");
        System.out.println("4. Press return button");
        System.out.println("9. Open service menu (code required)");
        System.out.println("0. Quit");
        System.out.println("Your choice :");
        Scanner scanner = new Scanner(System.in);
        String scanString = scanner.next();
        //判断输入
        while (!("1".equals(scanString)) && !("2".equals(scanString))
                && !("3".equals(scanString)) && !("4".equals(scanString))
                && !("9".equals(scanString)) && !("0".equals(scanString))) {
            System.out.println("Invalid choice!");
            print();
//            scanString = scanner.next();
        }
        switch (Integer.parseInt(scanString)) {
            case 1:
                printInformation();
                print();
                break;
            case 2:
                insertCoin();
                show();
                break;
            case 3:
                buyProducts();
                break;
            case 4:
                returnMoney();
                break;
            case 9:
                inputPassword();
                break;
            case 0:
                System.out.println("Thank you for your use!");
                return;
            default:
                break;
        }
    }

    public void printInformation() {
        System.out.println("(1).The displayed products are:");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + ".($" + price[i] + ")");
        }
    }

    public void insertCoin() {
        System.out.println("(2) Which coin would you like to insert?");
        System.out.println("1.$" + Coin.ONE.getCoinFaceValue());
        System.out.println("2.$" + Coin.TWO.getCoinFaceValue());
        System.out.println("3.$" + Coin.FIVE.getCoinFaceValue());
        System.out.println("4.$" + Coin.TEN.getCoinFaceValue());
        System.out.println("0.Go back");
        System.out.println("Your choice:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        while (!("1".equals(str)) && !"2".equals(str) && !"3".equals(str) && !"4".equals(str) && !"0".equals(str)) {
            System.out.println("Invalid choice!");
            insertCoin();
//            str = scanner.next();
        }
        switch (Integer.parseInt(str)) {
            case 1:
                System.out.println("You have inserted $1.");
                insertMoney += Coin.ONE.getCoinFaceValue();
                break;
            case 2:
                System.out.println("You have inserted $2.");
                insertMoney += Coin.TWO.getCoinFaceValue();
                break;
            case 3:
                System.out.println("You have inserted $5.");
                insertMoney += Coin.FIVE.getCoinFaceValue();
                break;
            case 4:
                System.out.println("You have inserted $10.");
                insertMoney += Coin.TEN.getCoinFaceValue();
                break;
            case 0:
                print();
                break;
            default:
                break;
        }

    }

    public void printGoodsName() {
        System.out.println("1.A");
        System.out.println("2.B");
        System.out.println("3.C");
        System.out.println("4.D");
        System.out.println("5.E");
        System.out.println("0.Go back");
        System.out.println("Your choice :");
    }

    public void buyProducts() {
        System.out.println("(3) Which product button would you like to press?");
        printGoodsName();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        while (!string.equals("1") && !string.equals("2") && !string.equals("3") && !string.equals("4") &&
                !string.equals("5") && !string.equals("0")) {
            System.out.println("Invalid choice!");
            buyProducts();
//            string = scanner.next();

        }
        switch (Integer.parseInt(string)) {
            case 1:
                if (status[0].equals("[X]")) {
                    System.out.println("The good is sold out");
                    show();
                } else if (status[0].equals("[ ]")) {
                    System.out.println("Your money is not enough");
                    show();
                } else {
                    totalSaleMoney += price[0];
                    insertMoney -= price[0];
                    goodsName = "A";
                    num[0]--;
                    show();
                }
                break;
            case 2:
                if (status[1].equals("[X]")) {
                    System.out.println("The good is sold out");
                    show();
                } else if (status[1].equals("[ ]")) {
                    System.out.println("Your money is not enough");
                    show();
                } else {
                    totalSaleMoney += price[1];
                    insertMoney -= price[1];
                    goodsName = "B";
                    num[1]--;
                    show();
                }
                break;
            case 3:
                if (status[2].equals("[X]")) {
                    System.out.println("The good is sold out");
                    show();
                } else if (status[2].equals("[ ]")) {
                    System.out.println("Your money is not enough");
                    show();
                } else {
                    totalSaleMoney += price[2];
                    insertMoney -= price[2];
                    goodsName = "C";
                    num[2]--;
                    show();
                }
                break;
            case 4:
                if (status[3].equals("[X]")) {
                    System.out.println("The good is sold out");
                    show();
                } else if (status[3].equals("[ ]")) {
                    System.out.println("Your money is not enough");
                    show();
                } else {
                    totalSaleMoney += price[3];
                    insertMoney -= price[3];
                    goodsName = "D";
                    num[3]--;
                    show();
                }
                break;
            case 5:
                if (status[4].equals("[X]")) {
                    System.out.println("The good is sold out");
                    show();
                } else if (status[4].equals("[ ]")) {
                    System.out.println("Your money is not enough");
                    show();
                } else {
                    totalSaleMoney += price[4];
                    insertMoney -= price[4];
                    goodsName = "E";
                    num[4]--;
                    show();
                }
                break;
            case 0:
                print();
                break;
            default:
                break;
        }
    }

    public void returnMoney() {
        System.out.println("$" + insertMoney + "was return");
        insertMoney = 0;
        show();
    }

    //判断输入密码是否正确
    public void inputPassword() {
        while (inputPasswordNum < MAX_INPUT_PASSWORD_NUM) {
            inputPasswordNum++;
            System.out.println("(9) Opening service menu. Access code is required.");
            System.out.println("Enter access code:");
            Scanner scanner = new Scanner(System.in);
            while (!scanner.next().equals(SERVICE_PASSWORD)) {
                System.out.println("The password is wrong");
                inputPassword();
            }
            serviceMenu();
        }
        System.out.println("Your wrong time is too much");
        print();
    }

    //管理员菜单
    public void serviceMenu() {
        System.out.println("Correct code!");
        System.out.println("(9) What would you like to do?");
        System.out.println(" 1. Inspect machine status");
        System.out.println(" 2. Withdraw all money");
        System.out.println(" 3. Refill product");
        System.out.println(" 4. Change product");
        System.out.println(" 0. Go back");
        System.out.println("Your choice:");
        Scanner scanner = new Scanner(System.in);
        String inputPassword = scanner.next();
        while (!inputPassword.equals("1") && !inputPassword.equals("2") && !inputPassword.equals("3")
                && !inputPassword.equals("4") && !inputPassword.equals("0")) {
            System.out.println("Invalid choice!");
            serviceMenu();
            inputPassword = scanner.next();
        }
        switch (Integer.parseInt(inputPassword)) {
            case 1:
                System.out.println("(9-1) Machine status");
                System.out.println("Amount of revenue : $" + totalSaleMoney);
                System.out.println("Amount of inserted coins: $" + insertMoney);
                for (int i = 0; i < name.length; i++) {
                    System.out.println(name[i] + "($" + price[i] + ") (" + num[i] + "left)");
                }
                serviceMenu();
                break;
            case 2:
                System.out.println("(9-2) All money is being withdrawn.");
                System.out.println("$" + (totalSaleMoney + insertMoney) + "is withdraw");
                totalSaleMoney = 0;
                insertMoney = 0;
                serviceMenu();
                break;
            case 3:
                suppleGoods();
                serviceMenu();
                break;
            case 4:
                changeGoods();
                break;
            case 0:
                print();
                break;
            default:
                break;
        }
    }

    public void suppleGoods() {
        System.out.println("(9-3) Which product would you like to refill?");
        printGoodsName();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        while (!str.equals("0") && !str.equals("1") && !str.equals("2") && !str.equals("3") && !str.equals("4") &&
                !str.equals("5")) {
            System.out.println("Invalid choice!");
            suppleGoods();
            str = scanner.next();
        }
        switch (Integer.parseInt(str)) {
            case 1:
                num[0] = 10;
                System.out.println("You have refilled product" + name[0] + "to full.");
                break;
            case 2:
                num[1] = 10;
                System.out.println("You have refilled product" + name[1] + "to full.");
                break;
            case 3:
                num[2] = 10;
                System.out.println("You have refilled product" + name[2] + "to full.");
                break;
            case 4:
                num[3] = 10;
                System.out.println("You have refilled product" + name[3] + "to full.");
                break;
            case 5:
                num[4] = 10;
                System.out.println("You have refilled product" + name[4] + "to full.");
                break;
            case 0:
                serviceMenu();
                break;
            default:
                break;

        }
    }

    public void changeGoods() {
        printGoodsName();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        while (!string.equals("1") && !string.equals("2") && !string.equals("3") && !string.equals("4")
                && !string.equals("5") && !string.equals("0")) {
            System.out.println("Invalid choice!");
            changeGoods();
            string = scanner.next();
        }
        switch (Integer.parseInt(string)) {
            case 1:
                System.out.println("Input good name:");
                String replaceNameA = scanner.next();
                name[0] = replaceNameA;
                System.out.println("Input good price:");
                int replacePriceA = scanner.nextInt();
                price[0] = replacePriceA;
                num[0] = 10;
                show();
                break;
            case 2:
                System.out.println("Input good name:");
                String replaceNameB = scanner.next();
                name[1] = replaceNameB;
                System.out.println("Input good price:");
                int replacePriceB = scanner.nextInt();
                price[1] = replacePriceB;
                num[1] = 10;
                show();
                break;
            case 3:
                System.out.println("Input good name:");
                String replaceNameC = scanner.next();
                name[2] = replaceNameC;
                System.out.println("Input good price:");
                int replacePriceC = scanner.nextInt();
                price[2] = replacePriceC;
                num[2] = 10;
                show();
                break;
            case 4:
                System.out.println("Input good name:");
                String replaceNameD = scanner.next();
                name[3] = replaceNameD;
                System.out.println("Input good price:");
                int replacePriceD = scanner.nextInt();
                price[3] = replacePriceD;
                num[3] = 10;
                show();
                break;
            case 5:
                System.out.println("Input good name:");
                String replaceNameE = scanner.next();
                name[4] = replaceNameE;
                System.out.println("Input good price:");
                int replacePriceE = scanner.nextInt();
                price[4] = replacePriceE;
                num[4] = 10;
                show();
                break;
            case 0:
                serviceMenu();
                break;
            default:
                break;
        }
    }
}
