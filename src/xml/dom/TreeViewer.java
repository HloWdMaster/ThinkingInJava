package xml.dom;

import java.awt.EventQueue;

public class TreeViewer {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){

			@Override
			public void run() {
				new DomTreeFrame();
			}});
	}

}
