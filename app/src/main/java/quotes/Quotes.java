package quotes;

public class Quotes {
    //Declare variables
    private String author;
    private String text;

    //Constructor
    public Quotes(String author, String text){
        this.author = author;
        this.text = text;
    }
    public Quotes(){}

    @Override
    public String toString() {
        return "Quotes{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    //Getter:
    public String getAuthor() {
        return author;
    }
    public String getText() {
        return text;
    }

    //Setter:
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }
}
