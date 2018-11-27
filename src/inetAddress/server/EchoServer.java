package inetAddress.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

	public static void main(String[] args) throws IOException {
		try(ServerSocket ss = new ServerSocket(8189)){
			try(Socket incoming = ss.accept()){
				InputStream inStream = incoming.getInputStream();
				OutputStream outStream = incoming.getOutputStream();
				try(Scanner scanner = new Scanner(inStream)){
					PrintWriter out = new PrintWriter(outStream,true);
					out.println("Hello! press BYE to exit...");
					boolean done = false;	//
					while(!done && scanner.hasNextLine()){
						String line = scanner.nextLine();
						out.println("Echo:"+line);
						if(line.trim().equals("BYE")){
							done = true;
						}
					}
				}
			}
			
		}
		
	}

}
