package socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketTest {

	public static void main(String[] args) throws Exception {
		try(Socket s = new Socket("time-A.timefreq.bldrdoc.gov",13)){
			InetAddress[] address = InetAddress.getAllByName("time-A.timefreq.bldrdoc.gov");
			for (int i = 0; i < address.length; i++) {
				System.out.println(address[i]);
			}
			
			InputStream inStream = s.getInputStream();
			Scanner in = new Scanner(inStream);
			while (in.hasNext()) {
				String line = (String) in.nextLine();
				System.out.println(line);
				
			}
		}

	}

}
