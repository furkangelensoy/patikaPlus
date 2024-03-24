import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Books created from Book Class.
        Book book1 = new Book("Life After Life", 560, "Kate Atkinson    ", "14.03.2013");
        Book book2 = new Book("Sapiens      ", 464, "Yuval Noah Harari", "01.01.2011");
        Book book3 = new Book("Normal People", 304, "Sally Rooney       ", "28.08.2018");
        Book book4 = new Book("The Green Road", 305, "Anne Enright      ", "01.01.2015");
        Book book5 = new Book("Human Chain  ", 96, "Seamus Heaney   ", "02.09.2010");
        //Ordering according to name of books.
        TreeSet<Book> bookOrderName = new TreeSet<>(new nameComparator());
        bookOrderName.add(book1);
        bookOrderName.add(book2);
        bookOrderName.add(book3);
        bookOrderName.add(book4);
        bookOrderName.add(book5);
        System.out.println("| Book name |\t\t| Pages |\t\t| Author |\t\t\t\t  | Release Date |");
        System.out.println();
        for (Book b : bookOrderName) {
            System.out.println(b.getName() + "\t------\t" + b.getNumberOfPages() + "\t------\t"
                    + b.getAuthorName() + "\t------\t " + b.getReleaseDate());
        }

        //Ordering according to page number of books.
        System.out.println();
        System.out.println("================== ORDERING WITH PAGE NUMBER (from small to big) ==================");
        System.out.println();
        TreeSet<Book> bookOrderPage = new TreeSet<>(new pageComparator());
        bookOrderPage.add(book1);
        bookOrderPage.add(book2);
        bookOrderPage.add(book3);
        bookOrderPage.add(book4);
        bookOrderPage.add(book5);

        for (Book b : bookOrderPage) {
            System.out.println(b.getName() + "\t------\t" + b.getNumberOfPages() + "\t------\t"
                    + b.getAuthorName() + "\t------\t " + b.getReleaseDate());
        }


    }
}