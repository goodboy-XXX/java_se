package tcpvms;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class VMSServer {

    private static final String SERVICE_PASSWORD = "1110";
    private  String[] name = {"A", "B", "C", "D", "E"};
    private  int[] num = {4, 1, 10, 6, 3};
    private  int[] price = {10, 6, 5, 8, 7};
    private  String[] status = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]"};
    private  String goodsName = "=";
    private  int totalSaleMoney = 0;
    private  int insertMoney = 0;
    private static OutputStream outputStream;
    private static InputStream inputStream;
    private static Socket socket;
    private static boolean flag = true;
    private static VMSServer vmsServer;


    public static void main(String[] args) throws IOException{

        vmsServer = new VMSServer();
        ServerSocket serverSocket = new ServerSocket(8888);
        socket = serverSocket.accept();
        inputStream = socket.getInputStream();
        outputStream = socket.getOutputStream();
        vmsServer.show();
        printOption();
        while(flag){
            if(inputStream.available()!=0){
                byte[] bytes = new byte[1024];
                int len;
                while ((len = inputStream.read(bytes)) != -1){
                    String s = new String(bytes, 0, len);
                    if ("0".equals(s)){
                        System.exit(0);
                    }

                    System.out.println(s);
                }
            }

        }

        //TODO:菜单的其他功能选项，1，2，3，4，9选项的方法

        serverSocket.close();
        socket.close();
    }
    public static void printOption() throws IOException {
        outputStream.write("what would you want to do ? \n".getBytes());
        outputStream.write("1.Read product information\n".getBytes());
        outputStream.write("2.Insert coin\n".getBytes());
        outputStream.write("3. Press product button\n".getBytes());
        outputStream.write("4.Press return button\n".getBytes());
        outputStream.write("9.Open service menu (code required)\n".getBytes());
        outputStream.write("0.quit\n".getBytes());
    }
    //展示商品
        public void show() throws IOException {

        //判断商品状态是否售罄以及是否可以购买
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < name.length; i++) {
            if (num[i] == 0) {
                status[i] = "[X]";
            } else if (price[i] <= insertMoney) {
                status[i] = "[O]";
            } else {
                status[i] = "[ ]";
            }
        }
        sb.append("*---------------------------*\n" +
                  "|     Vending   Machine     |\n" +
                  "*---------------------------*\n" +
                  "|  ");
        for (String s : name) {
            sb.append(s).append("    ");
        }
        sb.append("|\n|  ");
        for (int i : price) {
            if (i >= 10){
                sb.append("$").append(i).append("  ");
            }else{
                sb.append("$ ").append(i).append("  ");
            }
        }
        sb.append("|\n|  ");
        for (String str : status) {
            sb.append(str).append("  ");
        }
        sb.append("|\n*---------------------------*\n");


        if (insertMoney >= 10) {
            sb.append("|                     [$").append(insertMoney).append("] |\n");
        } else {
            sb.append("|                     [$ ").append(insertMoney).append("] |\n");
        }
        sb.append("|                           |\n|           [=").append(goodsName).append("=]           |\n");
        sb.append("*---------------------------*");

        outputStream.write(sb.toString().getBytes());
    }

}
