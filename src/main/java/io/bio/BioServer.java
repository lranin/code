package io.bio;

import common.Constant;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Ranin
 * @version Id: BioServer.java, v 0.1 2020/4/28 17:33 Ranin Exp $$
 */
public class BioServer {
    //线程池
    ExecutorService executor = Executors.newFixedThreadPool(Constant.Thread_Pool_Size);

    public void bindPort() throws IOException {
        ServerSocket serverSocket = null;

        try {
             serverSocket = new ServerSocket(8088);
            System.out.println("绑定到8088端口");
            Socket socket;
            while (true) {
                socket = serverSocket.accept();
                Thread thread = new Thread(new Runnable() {
                    public void run() {
                        BufferedReader reader = null;
                    }
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (serverSocket != null) {
                serverSocket.close();
                serverSocket = null;
            }
        }
    }
}