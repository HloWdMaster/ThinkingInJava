package holding;

import java.util.ArrayList;

public class ApplesAndOrangesWithoutGenerics {
	
	
	public static void main(String[] args) {
		ArrayList apples = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		apples.add(new Orange());
	}

}

class Apple{
	private static long counter = 0;
	private long id = counter ++;
	
	public long id() {
		return id;
	}
}

class Orange{}

