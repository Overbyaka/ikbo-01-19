package practice1;

public class Book {
    private String name;
    private String author;
    private String color;
    private String story;

    public Book(String name, String author, String color, String story) {
        this.name = name;
        this.author = author;
        this.color = color;
        this.story = story;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getColor() {
        return color;
    }

    public String getStory() {
        return story;
    }

    public void writeStory(String s){
        story+=s;
    }

    public String toString() {
        return "Название книги: " + getName() + "\nАвтор книги: " + getAuthor() + "\nЦвет обложки книги: " + getColor() + "\nИстория: " + getStory();
    }
}
