class frq3 {

  private boolean rsvp;
  private int selection;
  private String food;
 
  public frq3(boolean rsvp, int selection) {
    this.selection = selection;
    this.rsvp = rsvp;
  }
 
  public int getSelection(int n) {
    return this.selection;
  }
 
 public String getFood() {
   return this.food;
 }
 
 public boolean getRsvp() {
   return this.rsvp;
 }

  public void attending () {
    if (this.rsvp == true) {
      if (this.selection == 1) {
        this.food = "Beef";
      }
      else if (this.selection == 2) {
        this.food = "Chicken";
      }
      else if (this.selection == 3) {
        this.food = "Pasta";
      }
      else {
        this.food = "Fish";
      }

      System.out.println("Thank you for attending, you will be served " + this.food);
    }
    else {
      System.out.println("Sorry you couldn't come");
    }
  }

  public static void main(String[] arg) {
    frq3 test_frq3 = new frq3(true, 2);

    test_frq3.attending();
  }
}