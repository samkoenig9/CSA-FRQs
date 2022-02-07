public class frq9 {
    private String title;
    private String author;

    public frq9(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String printBookInfo() {
        return title + ", written by " + author;
    }

    public static void main(String[] args) {
        frq9 book1 = new frq9("Frankenstein", "Mary Shelley");
        System.out.println(book1.printBookInfo());
    }
}