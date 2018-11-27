package xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParse {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		File f = new File("D:\\workspace\\test1\\src\\books.xml");
		Document document = builder.parse(f);
		Element root = document.getDocumentElement();
		System.out.println(root.getTagName());
		NodeList childNodes = root.getChildNodes();
		System.out.println(childNodes.getLength());
		for (int i = 0; i < childNodes.getLength(); i++) {
			Node child = childNodes.item(i);
			if(child instanceof Element){
				Element childElement = (Element)child;
				System.out.println(childElement.getTagName());
			}
		}
	}
}
