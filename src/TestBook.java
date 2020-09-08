public class TestBook {
    public static void main(String[] args) {
        Book b = new Book("Harry Potter", "J.K.Rowling", "Blue", "Harry Potter is a pupil of Hogwarts..");
        b.writeStory(" It's a school for mages..");
        System.out.println(b.toString());
    }
}
