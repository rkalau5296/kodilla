import java.util.*;
import java.lang.*;

class Book {

    String title;
    String author;

    public Book (String title, String author){
        this.title = title;
        this.author = author;

    }
    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        return (title.equals(book.getTitle()))&&
                (author.equals(book.getAuthor()));
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }
    @Override
    public String toString(){
        return title + " " + author;
    }

}
class ReaderProcessing{

    public Reader getElementFromHashMap( HashMap<Book, Reader> booksAndReaders){ return booksAndReaders.get(new Book("title"+1250,"some book "+1250)); }

    void measuringTimeDisplayingElementFromHashMap (HashMap<Book, Reader> booksAndReaders) {
        long begin = System.nanoTime();
        getElementFromHashMap(booksAndReaders);
        long end = System.nanoTime();
        System.out.println("Displaying hashMap element has taken: " + (end - begin) + "ms");
    }
    void measuringTimeRemovingElementFromHashMap(HashMap<Book, Reader> booksAndReaders){
        long begin = System.nanoTime();
        booksAndReaders.remove(new Book("title"+1250, "author"+1250));
        long end = System.nanoTime();
        System.out.println("Removing hashMap element has taken: " + (end - begin) + "ms");
    }
    void measuringTimePuttingElementFromHashMap(HashMap<Book, Reader> booksAndReaders){
        long begin = System.nanoTime();
        booksAndReaders.put(new Book("title"+10, "author"+10), new Reader("firstName" + 10,"lastName" + 10 ));
        long end = System.nanoTime();
        System.out.println("Removing hashMap element has taken: " + (end - begin) + "ms");
    }
}
class BookProcessing {

    LinkedList<Book> books;

    public BookProcessing (LinkedList<Book> books){

        this.books = books;
    }

    public Book getFirstElement( LinkedList<Book> books){ return books.getFirst(); }
    public Book getLastElement (LinkedList<Book> books) { return books.getLast(); }

    void measuringTimeRemovingFirstElement(LinkedList<Book> books){
        Book bookToRemove = getFirstElement(books);
        long begin = System.nanoTime();
        books.remove(bookToRemove);
        long end = System.nanoTime();
        System.out.println("Removing first element has taken: " + (end - begin) + "ms");
    }
    void measuringTimeRemovingLastElement(LinkedList<Book> books){
        Book bookToRemove = getLastElement(books);
        long begin = System.nanoTime();
        books.remove(bookToRemove);
        long end = System.nanoTime();
        System.out.println("Removing last element has taken: " + (end - begin) + "ms");
    }
    void measuringTimeAddingFirstElement(LinkedList<Book> books){
        Book bookToAdd = getFirstElement(books);
        long begin = System.nanoTime();
        books.add(bookToAdd);
        long end = System.nanoTime();
        System.out.println("Adding first element has taken: " + (end - begin) + "ms");
    }
    void measuringTimeAddingLastElement(LinkedList<Book> books){
        Book bookToAdd = getLastElement(books);
        long begin = System.nanoTime();
        books.add(bookToAdd);
        long end = System.nanoTime();
        System.out.println("Adding last element has taken: " + (end - begin) + "ms");
    }
    void measuringTimeDisplayingFirstElement(LinkedList<Book> books){
        long begin = System.nanoTime();
        getFirstElement(books);
        long end = System.nanoTime();
        System.out.println("Displaying first element has taken: " + (end - begin) + "ms");
    }
    void measuringTimeDisplayingLastElement(LinkedList<Book> books){
        long begin = System.nanoTime();
        getLastElement(books);
        long end = System.nanoTime();
        System.out.println("Displaying last element has taken: " + (end - begin) + "ms");
    }
}

class CreateLinkedList{

    LinkedList<Book> createLinkedListBooks() {

        LinkedList<Book> books = new LinkedList<>();
        for (int i = 0; i < 45010; i++)
            books.add(new Book("author" + i, "some book " + i));
        return books;
    }
}

class Reader{

    String firstName;
    String lastName;

    public Reader (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public boolean equals(Object o) {
        Reader reader = (Reader) o;
        return (firstName.equals(reader.getFirstName()))&&
                (lastName.equals(reader.getLastName()));
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    @Override
    public String toString(){
        return firstName + " " + lastName;
    }
}

class CreateHashMapList{

    HashMap<Book, Reader> createHashMapListBooks() {

        HashMap<Book, Reader> booksAndReaders = new HashMap<>();
        for (int i = 0; i < 45010; i++)
            booksAndReaders.put(new Book("title"+i, "author"+i), new Reader("firstName" + i,"lastName" + i));
        return booksAndReaders;
    }
}
class Kodilla
{
    public static void main (String[] args) throws java.lang.Exception
    {
        CreateLinkedList createLinkedList = new CreateLinkedList();
        LinkedList<Book> booksLinkedList = createLinkedList.createLinkedListBooks();

        BookProcessing bookProcessing = new BookProcessing(booksLinkedList);
        bookProcessing.measuringTimeAddingFirstElement(booksLinkedList);
        bookProcessing.measuringTimeAddingLastElement(booksLinkedList);
        bookProcessing.measuringTimeRemovingFirstElement(booksLinkedList);
        bookProcessing.measuringTimeRemovingLastElement(booksLinkedList);
        bookProcessing.measuringTimeDisplayingFirstElement(booksLinkedList);
        bookProcessing.measuringTimeDisplayingLastElement(booksLinkedList);

        CreateHashMapList createHashMapList = new CreateHashMapList();
        HashMap<Book, Reader> booksHashMap = createHashMapList.createHashMapListBooks();

        ReaderProcessing readerProcessing = new ReaderProcessing();
        readerProcessing.measuringTimeDisplayingElementFromHashMap(booksHashMap);
        readerProcessing.measuringTimeRemovingElementFromHashMap(booksHashMap);
        readerProcessing.measuringTimePuttingElementFromHashMap(booksHashMap);

    }
}

