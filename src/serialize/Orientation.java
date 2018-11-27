package serialize;

import java.io.Serializable;

public class Orientation implements Serializable{

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Orientation objOri = (Orientation) obj;
		if(objOri.value ==this.value){
			return true;
		}
		return false;
	}

	public static final Orientation HORIZONTAL = new Orientation(1);
	public static final Orientation VERTICAL = new Orientation(2);
	
	private int value;
	
	public Orientation(int value) {
		this.value = value;
	}

	
}
