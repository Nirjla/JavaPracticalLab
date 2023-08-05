class Book {
     public int book_id;
     public int pages;

    public Book(int book_id, int pages) {
        this.book_id = book_id;
        this.pages = pages;
    }
}

class FictionBook extends Book {
    public String name;

    public FictionBook(int book_id, int pages, String name) {
        super(book_id, pages);
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Book ID: " + book_id);
        System.out.println("Pages: " + pages);
        System.out.println("Name: " + name);
    }
}

public class FictionBookDemo {
    public static void main(String[] args) {
        FictionBook fictionBookObj = new FictionBook(1234, 250, "The Great Gatsby");
        fictionBookObj.displayInfo();
    }
}
