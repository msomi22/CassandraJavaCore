package test.app.map;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SOAPerser {

	public SOAPerser() {
		
	}
	
	public static void stringToSOAP(String soapString) {
		List<Object> list = null;

		try {  

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbFactory.newDocumentBuilder();

			StringBuilder xmlStringBuilder = new StringBuilder();
			xmlStringBuilder.append(soapString);
			ByteArrayInputStream input =  new ByteArrayInputStream(xmlStringBuilder.toString().getBytes("UTF-8"));
			Document doc = builder.parse(input);
			
			list = new ArrayList<>(); 
			NodeList nList = doc.getElementsByTagName("tns:StatusMessage");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				Element eElement = (Element) nNode;
				String messageCode = eElement .getElementsByTagName("MessageCode").item(0).getTextContent();
				String messageDescription = eElement .getElementsByTagName("MessageDescription").item(0).getTextContent();
				
				System.out.println(messageCode);
				System.out.println(messageDescription);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
