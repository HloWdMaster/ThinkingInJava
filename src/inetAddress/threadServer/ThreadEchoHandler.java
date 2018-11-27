package inetAddress.threadServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ThreadEchoHandler implements Runnable {

	private Socket incoming;

	public ThreadEchoHandler(Socket incoming) {
		this.incoming = incoming;
	}

	@Override
	public void run() {
		try {
			try {
				InputStream inStream = incoming.getInputStream();
				OutputStream outStream = incoming.getOutputStream();
				Scanner in = new Scanner(inStream);
				// 输出
				PrintWriter out = new PrintWriter(outStream, true);
				out.println("Hello! Enter BYE to Exit...");
				boolean done = false;
				while (!done && in.hasNextLine()) {
					String line = in.nextLine();
					out.println("Echo:" + line);
					if (line.trim().equalsIgnoreCase("BYE")) {
						done = true;
					}
				}

			} finally {
				incoming.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
