package io.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author Ranin
 * @version Id: BioThread.java, v 0.1 2020/4/28 18:11 Ranin Exp $$
 */
public class BioThread implements Runnable {
    private Socket socket;

    public BioThread(Socket socket){
        this.socket = socket;
    }

    public void run() {
        BufferedReader reader = null;
        PrintWriter writer = null;

        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}