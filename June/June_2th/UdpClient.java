package socketPractice;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UdpClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(1111);
        while (true) {
            Scanner sc = new Scanner(System.in);
            String next = sc.next();
            byte[] bytes = next.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 10000);
            ds.send(dp);
        }
    }
}
