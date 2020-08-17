package netty.part1.chapter1.bio;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Ranin
 * @version Id: BIOServer.java, v 0.1 2020/8/17 14:38 Ranin Exp $$
 */
@Slf4j
public class BIOServer {
    private final static int PORT = 8080;

    public static void main(String[] args) {
        ServerSocket server = null;

        try {
            server = new ServerSocket(PORT);
            log.info("BIO服务器开始监听:{}端口",PORT);
            Socket socket = null;
            while (true) {
                socket = server.accept();


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}