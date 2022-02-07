import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        for (;;) {
            System.out.println("Which FRQ would you like to view(Number 2 - 10): ");

            int choice = myObj.nextInt();
            System.out.println("Choice: " + choice);

            if (choice == 2) {
              class LightSequence {
              String sequence; //create sequence variable

              public LightSequence(String sequence) { //calls this.sequence to LightSequence
                this.sequence = sequence;
              }

              public String insertSegment(String segment, int ind) { // create new class insertSegment
                  StringBuilder sb = new StringBuilder(segment);
                sb.insert(ind, segment); //has str and int parameters
                return sb.toString();
              }

              public void changeSequence(String sequence) {
                  this.sequence = sequence; //sets this.sequence to sequence
              }

              public void display() {
                  System.out.println(sequence); //prints sequence
              }

          }
          LightSequence GradShow = new LightSequence("0101 0101 0101");

          GradShow.display();

          GradShow.changeSequence("0011 0011 0011");

          String resultSeq = GradShow.insertSegment("1111 1111", 4);

          System.out.println(resultSeq + "4");

          String oldSeq = "1100000111";
          String segment = "11";

          int index = oldSeq.indexOf(segment);

          String newSeq = oldSeq.substring(0, index) + oldSeq.substring(index + segment.length());
          System.out.println(newSeq + "11");

          int a = 4;
          int b = 5;
          double c = Math.sqrt((a * a) + (b * b));
          System.out.println(c);
              }

            else if (choice == 3) {
              frq3 test_frq3 = new frq3(true, 2);

              test_frq3.attending();
            }

            else if (choice == 4) {
                frq4 c = new frq4(10, 20);
                c.playGame();
            }

            else if (choice == 5) {
              System.out.println("Part 1");
              frq5 test = new frq5("1234 test ave");

              System.out.println(test.getHostName());

              test.setAddress("5678 testing ave");

              test.invite("Bob");

              System.out.println("Part 2");
              frq5_2 password1 = new frq5_2(4,"chs");
              System.out.println(password1.pwCount());
              System.out.println(password1.pwGen());
              System.out.println(password1.pwGen());
              System.out.println(password1.pwCount());
              frq5_2 pw2 = new frq5_2(6);
              System.out.println(pw2.pwCount());
              System.out.println(pw2.pwGen());
              System.out.println(pw2.pwCount());
              System.out.println(password1.pwCount());
            }

            else if (choice == 6) {
                String userWord;
                String userWord2;

                System.out.println("Enter any word (x2)");
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

            else if (choice == 7) {
                ArrayList<String> possibleNames = new ArrayList<String>();
                System.out.println("Enter 4 Possible Names");
                possibleNames.add("test");
                possibleNames.add("test1");
                possibleNames.add("test2");
                possibleNames.add("test3");

                ArrayList<String> usedNames = new ArrayList<String>();
                usedNames.add("test2");

                frq7 test = new frq7(usedNames, possibleNames, "te", "st");
                test.setAvailableUserNames();

                System.out.println(test.getPossibleNames());
            }

            else if (choice == 8) {
              frq8 p1 = new frq8("corn", 20);
              frq8 p2 = new frq8("corn", 30);
              frq8 p3 = new frq8("peas", 10);
              frq8 p4 = new frq8("peas", 30);
              frq8 p5 = new frq8("corn", 40);
              frq8 p6 = new frq8("corn", 62);
              frq8 p7 = new frq8("wheat", 10);
              frq8 p8 = new frq8("corn", 50);
              frq8 p9 = new frq8("rice", 30);
              frq8 p10 = new frq8("corn", 55);
              frq8 p11 = new frq8("corn", 30);
              frq8 p12 = new frq8("peas", 30);

              frq8[][] plots = { { p1, p2, p3 }, { p4, p5, p6 }, { p7, p8, p9 }, { p10, p11, p12 } };

              frq8_2 f = new frq8_2(plots);

              frq8 highestYield = f.getHighestYield("corn");
              frq8 highestYield1 = f.getHighestYield("peas");
              frq8 highestYield2 = f.getHighestYield("bananas");

              System.out.println(f.sameCrop(0));

              System.out.println(f.sameCrop(1));
            }

            else if (choice == 9) {
                frq9 book1 = new frq9("Frankenstein", "Mary Shelley");
                frq9 book2 = new frq9_sub("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");

                System.out.println(book1.printBookInfo());
                System.out.println(book2.printBookInfo());
            }

            else if (choice == 10) {
                System.out.println("First Int");
                int a = myObj.nextInt();
                System.out.println("Second Int");
                int b = myObj.nextInt();
                frq10 test = new frq10();
                System.out.println("GCF: " + test.gcf(a, b));
                System.out.print("Reduce Fraction: ");
                test.reduceFraction(30, 10);
            }

            else {
                System.out.println("Enter a Valid Number");
            }
        }
    }

}