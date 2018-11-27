package inetAddress;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressTest {

	/**
	 * 打印域名下的所有IP地址
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				String host = args[i];
				InetAddress[] addresses = InetAddress.getAllByName(host);
				for (InetAddress a : addresses) {
					System.out.println(a);
				}
			}
			
		}else{
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println(localHost);
		}
		
		
	}
}
