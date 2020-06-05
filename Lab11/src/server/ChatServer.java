package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;

import static util.ChatUtil.THREAD_POOL;

public class ChatServer {

    private final int serverPort;
    private final Set<ClientHandker> clients = new CopyOnWriteArraySet<>();
    private static final Executors

    public ChatServer(int serverPort){
        this.serverPort = serverPort;
    }

    @Override
    public void run(){
        try{
            ServerSocket serverSocket = new ServerSocket(serverPort);
            System.out.println("Chat server is listening on port " + serverPort);
            while(true){
                System.out.println("Server ready to accept the client connection...");
                Socket client = serverSocket.accept();
                System.out.println("Accepted connection from " + client);
                ClientHandker handler = new ClientHandker();
                clients.add(handler);
                THREAD_POOL.execute;

                }
        }catch (IOException e){
            e.printStackTrace();
        }
        }
    }
}
