package server;

import java.io.*;
import java.net.Socket;

public class ClientHandker implements Runnable{

    private final Socket client;
    private final ChatServer chatServer;
    private BufferedReader br;
    private PrintWriter pw;

    public ClientHandker(Socket client, ChatServer chatServer) {
        this.client = client;
        this.chatServer = chatServer;
        try{
            InputStream is = client.getInputStream();
            br = new BufferedReader(new InputStreamReader(is));
            OutputStream os - client.getOutputStream();
            pw = new PrintWriter(os);
        }catch (IOException e){
            e.printStackTrace();
        }


        @Override
        public void run(){
            try{
                handleClient();
            }catch (IOException e){
                System.out.println("Error in client handler: "e.getMessage());
            }
        }

        
    }
}

