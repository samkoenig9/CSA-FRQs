import java.util.ArrayList;

public class frq7 {
    // The list of possible user names, based on a user’s first and last names and initialized by the constructor.
    private ArrayList<String> possibleNames;
    private ArrayList<String> usedNames;
    private String UserName;

    public frq7(ArrayList<String> usedNames, ArrayList<String> possibleNames, String firstName, String lastName) {
        this.usedNames = usedNames;
        this.possibleNames = possibleNames;
        this.UserName = firstName.concat(" " + lastName);
    }

    public boolean isUsed(String name){
        for(String pos_name : this.possibleNames){
            if(pos_name.equals(name)){
                return true;
            }
            else{
                ;
            }
        }
        return false;
    }

    public void setAvailableUserNames(){
        if (isUsed(this.UserName)) {
            this.usedNames.add(this.UserName);
        }
        for (int i = 0; i < this.possibleNames.size(); i++) {
            for (String name : this.usedNames) {
                if (name.equals(this.possibleNames.get(i))) {
                    this.possibleNames.remove(i);
                }
            }
        }
    }

    public ArrayList<String> getPossibleNames() {
      return possibleNames;
    }

    public static void main(String[] args){
        ArrayList<String> possibleNames = new ArrayList<String>();
        possibleNames.add("test");
        possibleNames.add("test1");
        possibleNames.add("test2");
        possibleNames.add("test3");

        ArrayList<String> usedNames = new ArrayList<String>();
        usedNames.add("test2");

        frq7 test = new frq7(usedNames, possibleNames, "te", "st");
        test.setAvailableUserNames();

        System.out.println(test.possibleNames);
    }
}