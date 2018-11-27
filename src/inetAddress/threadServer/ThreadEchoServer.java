package inetAddress.threadServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadEchoServer {

	public static void main(String[] args) {
		
		try {
			int i = 1;
			ServerSocket ss = new ServerSocket(8189);
			while(true){
				Socket incoming = ss.accept();
				System.out.println("Spawing"+i);
				Runnable handler = new ThreadEchoHandler(incoming);
				Thread t = new Thread(handler);
				t.start();
				i++;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
