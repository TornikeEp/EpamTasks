package xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxHandler extends DefaultHandler {

    private List<Book> books;
    private StringBuilder stringBuilder;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("Book")) {
            String id = attributes.getValue("id");
            Book book = new Book();
            book.setId(Integer.valueOf(id));
            if (books == null) {
                books = new ArrayList<>();
            }
            books.add(book);
        }
        stringBuilder = new StringBuilder();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "year":
                getLastBook().setYear(Integer.parseInt(stringBuilder.toString()));
                break;
            case "genre":
                getLastBook().setGenre(stringBuilder.toString());
                break;
            case "name":
                getLastBook().setName(stringBuilder.toString());
                break;
            default:
                break;
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        stringBuilder.append(new String(ch, start, length));
    }

    private Book getLastBook() {
        int index = books.size() - 1;
        return books.get(index);
    }

    public List<Book> getBooks() {
        return books;
    }
}
