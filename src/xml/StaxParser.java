package xml;

import javax.xml.XMLConstants;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StaxParser implements Parsable {

    private static final String FILENAME = "src/xml/library.txt";

    public static void main(String[] args) {
        StaxParser staxParser = new StaxParser();
        staxParser.parse();
    }

    @Override
    public void parse() {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        xmlInputFactory.setProperty(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        xmlInputFactory.setProperty(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
        XMLStreamReader reader;
        try {
            reader = xmlInputFactory.createXMLStreamReader(
                    new FileInputStream(new File(FILENAME)));
            printStream(reader);
        } catch (XMLStreamException | FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public void printStream(XMLStreamReader reader) throws XMLStreamException {
        int eventType;
        while (reader.hasNext()) {
            eventType = reader.next();
            printBookDetails(reader, eventType);
        }
    }

    public void printBookDetails(XMLStreamReader reader, int eventType) throws XMLStreamException {
        if (eventType == XMLEvent.START_ELEMENT) {
            if (reader.getName().getLocalPart().equals("book")) {
                String id = reader.getAttributeValue(null, "id");
                System.out.println("Book id :" + id);
            } else if (reader.getName().getLocalPart().equals("name")
                    || reader.getName().getLocalPart().equals("genre")
                    || reader.getName().getLocalPart().equals("year")) {
                eventType = reader.next();
                if (eventType == XMLEvent.CHARACTERS) {
                    System.out.println(reader.getText());
                }
            }
        }
    }
}

