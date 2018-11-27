package charset;

import java.nio.charset.Charset;
import java.util.Map;

public class AvaliableCharset {
	public static void main(String[] args) {
		
		System.out.println(new String("字").getBytes().length);
//		Map<String,Charset> charsets = Charset.availableCharsets();
//		for (String name: charsets.keySet()) {
//			System.out.println(charsets.get(name).aliases());
//		}
	}
}
