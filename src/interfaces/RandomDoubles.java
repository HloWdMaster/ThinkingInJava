package interfaces;

import java.util.Random;

public class RandomDoubles {

	private  static final Random rand = new Random(47);
	
	public double next(){
		return rand.nextDouble();
	}
	
	public static void main(String[] args) {
		RandomDoubles doubles = new RandomDoubles();
		for (int i = 0; i < 7; i++) {
			System.out.println(doubles.next()+" ");
		}
	}
	
	
}
