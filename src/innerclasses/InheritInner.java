package innerclasses;

/**
 * 继承内部类
 * @author 163
 *
 */
public class InheritInner extends WithInner.Inner{
	
	InheritInner(WithInner wi) {
		wi.super();
	}
	
	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
	}
}

class WithInner{
	class Inner{
		Inner(){
			System.out.println("Inner()");
		}
	}
	class Inner2{
		Inner2(int aa){
			System.out.println(aa);
		}
	}
}

