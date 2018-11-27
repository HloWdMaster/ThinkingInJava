package inetAddress;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class HalfShutdown {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 8189);
			Scanner in = new Scanner(s.getInputStream());
			PrintWriter out = new PrintWriter(s.getOutputStream());
			out.println("...");
			out.flush();
			s.shutdownOutput();
			
			
			while (in.hasNextLine()) {
				System.out.println(in.nextLine());
			}
			s.close();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
