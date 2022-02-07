public class frq9_sub extends frq9 {
    private String illustrator;

    public frq9_sub(String title, String author, String illustrator) {
        super(title, author);
        this.illustrator = illustrator;
    }

    public String printBookInfo() {
        return super.printBookInfo() + " and illustrated by " + illustrator;
    }

    public static void main(String[] args) {
        frq9 book1 = new frq9("Frankenstein", "Mary Shelley");
        frq9 book2 = new frq9_sub("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        System.out.println(book1.printBookInfo());
        System.out.println(book2.printBookInfo());
    }
}
