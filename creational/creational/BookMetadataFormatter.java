package creational;

public interface BookMetadataFormatter {
    BookMetadataFormatter reset();
    BookMetadataFormatter append(Book b);

    BookMetadataFormatter getBookMetadataFormatter();
    String getMetadataString();
}
