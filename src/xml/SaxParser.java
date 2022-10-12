package xml;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class SaxParser implements Parsable {

    private static final String FILENAME = "src/xml/library.txt";

    public static void main(String[] args) {
        SaxParser saxParser = new SaxParser();
        saxParser.parse();
    }

    @Override
    public void parse() {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            SaxHandler handler = new SaxHandler();
            saxParser.parse(new File(FILENAME), handler);
            List<Book> books = handler.getBooks();
            for (Book book : books)
                System.out.println(book);
        } catch (ParserConfigurationException |
                 IOException | org.xml.sax.SAXException e) {
            System.out.println(e);
        }
    }
}
