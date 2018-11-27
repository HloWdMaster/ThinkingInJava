package innerclasses;

import java.util.HashMap;
import java.util.Map;

public class Parsel {

	class Contents{	//内部类
		private int i = 11;
		public int value(){
			return i;
		}
	}
	
	class Destination{
		private String label;

		public Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel(){
			return label;
		}
		
	}
	public void ship(String dest){
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}
	
	private static Map<String,Integer> map = new HashMap<String,Integer>(){
		{
			put("a",1);
			put("a",2);
		}
	};
	
	public static void main(String[] args) {
//		Parsel p = new Parsel(); 
//		p.ship("Tasmania");
		
		Object obj = new String("aaa");
		System.out.println(obj);
		
	}
}
