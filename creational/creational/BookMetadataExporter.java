package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    private BookMetadataFormatter bookMetadataFormatter;


    public void export(PrintStream stream){
        // Please implement this method. You may create additional methods as you see fit.
        try {
            bookMetadataFormatter = getBookMetadataFormatter();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(Book book:this.books){
            bookMetadataFormatter.append(book);
        }
        String BookMetadata = bookMetadataFormatter.getMetadataString();

        stream.println(BookMetadata);


    }

    public abstract BookMetadataFormatter getBookMetadataFormatter() throws ParserConfigurationException, IOException;
}
