package finaldemo;

public class Frog extends Amphibian{

	@Override
	public void swim() {
		System.out.println("frog Swim");
	}
	
	public void jump() {
		System.out.println("frog jump");
	}
	public static void main(String[] args) {
		final Frog frog = new Frog();
		Amphibian am = frog;
		am.swim();
		frog.jump();
		
	}

}
