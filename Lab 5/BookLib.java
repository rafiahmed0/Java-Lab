class LibraryBook {
    String title;
    String author;
    int id;

    LibraryBook(String t, String a, int i) {
        this.title = t;
        this.author = a;
        this.id = i;
    }

    void show() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
    }
}

public class BookLib {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Megh Boleche Jabo Jabo", "Humayun Ahmed", 1);
        LibraryBook b2 = new LibraryBook("Opekkha", "Humayun Ahmed", 2);

        b1.show();
        System.out.println();
        b2.show();
    }
}