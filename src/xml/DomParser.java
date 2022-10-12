package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
public class DomParser implements Parsable{

    private static final String FILENAME = "src/xml/library.txt";

    public static void main(String[] args) {
        DomParser domParser = new DomParser();
        domParser.parse();
    }

    @Override
    public void parse(){
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        File inputFile = new File(FILENAME);
        try {
            documentBuilderFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(inputFile);
            document.getDocumentElement().normalize();
            printDocument(document);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e);
        }
    }

    public void printDocument(Document document){
        System.out.println("Root element :" + document.getDocumentElement().getNodeName());
        NodeList nodes = document.getElementsByTagName("book");
        for (int i = 0; i < nodes.getLength(); i++) {
            System.out.println("--");
            Node node = nodes.item(i);
            printNode(node);
        }
    }

    public void printNode(Node node) {
        System.out.println("Element: " + node.getNodeName());
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            System.out.println("Book id = "
                    + element.getAttribute("id"));
            printElement("name", element);
            printElement("year", element);
            printElement("genre", element);
        }
    }

    public void printElement(String tagName, Element element){
        System.out.println(tagName + " "
                + element
                .getElementsByTagName(tagName)
                .item(0)
                .getTextContent());
    }
}
