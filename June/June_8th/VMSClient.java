package tcpvms;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class VMSClient {
    private static OutputStream outputStream;
    private static InputStream inputStream;
    private static Socket socket;

    public static void main(String[] args) throws IOException, InterruptedException {

        socket = new Socket("127.0.0.1", 8888);
        outputStream = socket.getOutputStream();
        inputStream = socket.getInputStream();
        print();
        sendMsg();
        socket.close();

    }

    public static void print() {
        new Thread(() -> {
            byte[] bytes = new byte[1024];
            int len = 0;
            try {
                if (inputStream.available() != 0) {
                    while ((len = inputStream.read(bytes)) != -1) {
                        System.out.println(new String(bytes, 0, len));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public static void sendMsg() throws IOException {
        while(true){
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            outputStream.write(s.getBytes());
            outputStream.flush();
        }
    }

}
