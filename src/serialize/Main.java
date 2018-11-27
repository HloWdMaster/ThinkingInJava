package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		Orientation original = Orientation.HORIZONTAL;
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d://test//Orientation.dat"));
		out.writeObject(original);
		out.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://test//Orientation.dat"));
		Orientation saved = (Orientation) ois.readObject();
		
		System.out.println(saved.equals(Orientation.HORIZONTAL));
			
		
	}

}
