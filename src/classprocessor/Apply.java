package classprocessor;

import java.util.Arrays;

public class Apply {
	
	public static void process(Processor p,Object s){
		System.out.println("Using processor  "+p.name());
		System.out.println(p.process(s));
	}
	
	public static String s = "Disagreement with beliefs is by definition incoorrect ";
	
	public static void main(String[] args) {
		process(new UpCase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
}


class Processor{
	public String name(){
		return getClass().getSimpleName();
	}
	
	Object process(Object input){
		return input;
	}
}

class Downcase extends Processor{
	String process(Object input){
		return ((String)input).toLowerCase();
	}
}

class UpCase extends Processor{
	@Override
	String process(Object input) {
		// TODO Auto-generated method stub
		return ((String)input).toUpperCase();
	}
}

class Splitter extends Processor{

	@Override
	String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
	
}


