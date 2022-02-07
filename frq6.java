import java.util.ArrayList;
import java.util.Scanner;


class frq6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userWord;
        String userWord2;

        System.out.println("Enter any word [x2]");
        userWord = myObj.nextLine();
        userWord2 = myObj.nextLine();

        ArrayList<String> list = new ArrayList<String>();

        list.add(userWord);
        list.add(userWord2);
        list.add("Sam");
        list.add("Word");
        list.add("Running");
        list.add("Talking");
        list.add("Doing");
        list.add("Making");

        for (String word : list) {
            if (word.contains("ing")) {
                System.out.println("Words ending with -ing: " + word);
            }
            
        }
    }
}
