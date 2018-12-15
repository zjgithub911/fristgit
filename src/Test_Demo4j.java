import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Test_Demo4j {
    public static void main(String[] args) {
        try {


            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document parse = builder.parse(new File("languages.xml"));
            Element root = parse.getDocumentElement();
            NodeList list = root.getElementsByTagName("lan");
            for (int i = 0 ; i < list.getLength() ; i++){
                    Element lan = (Element) list.item(i);
                System.out.println("--------");
                System.out.println("id :" + lan.getAttribute("id"));
                System.out.println(lan.getNodeName());
                System.out.println(lan.getAttribute("name"));
                NodeList childNodes = lan.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node item = childNodes.item(j);
                   if ( item instanceof  Element){
                       System.out.println(item.getTextContent());
                   }
                }
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
