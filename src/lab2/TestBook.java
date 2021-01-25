package lab2;

public class TestBook {

    public static void main(String[] args)
    {
        Book myBook = new Book("William Anderson", "Wow! Hello!", 1995, "comedy",
                125);
        System.out.println(myBook);
        myBook.setAmountOfPages(345);
        myBook.setTitle("Wow! Bye!");
        System.out.println(myBook);
    }
}
