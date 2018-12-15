import javafx.util.Builder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.swing.text.AbstractDocument;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.StringWriter;
import java.util.EventListener;

public class Create_Xml {
    public static void main(String[] args) {

        try {


            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();
            Element root = document.createElement("language");
            root.setAttribute("cat","it");

            Element lan1 = document.createElement("lan");
            lan1.setAttribute("id","1");

            Element name1 = document.createElement("name");
            name1.setTextContent("java");
            Element name2 = document.createElement("ide");
            name2.setTextContent("eclips");

            lan1.appendChild(name1);
            lan1.appendChild(name2);
            root.appendChild(lan1);
            document.appendChild(root);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(document),new StreamResult(new File("1.xml")));
            System.out.println(writer.toString());

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }
}
