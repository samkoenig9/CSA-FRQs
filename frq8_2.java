public class frq8_2 {
  private frq8[][] farmPlots;

  public frq8_2(frq8[][] p) {
    this.farmPlots = p;
  }

  public frq8 getHighestYield(String c) {
    frq8 plot = null;
    int highest = this.farmPlots[0][0].getCropYield();

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        if (farmPlots[i][j].getCropType().equalsIgnoreCase(c) && farmPlots[i][j].getCropYield() > highest) {
          highest = farmPlots[i][j].getCropYield();
          plot = farmPlots[i][j];
        }
      }
    }
    if (plot != null)
      return plot;
    else
      return null;
  }

  public boolean sameCrop(int col) {
    boolean check = true;
    String crop = farmPlots[0][col].getCropType();

    for (int i = 0; i < 4; i++) {
      if (!farmPlots[i][col].getCropType().equalsIgnoreCase(crop)) {
        check = false;
        break;
      }
    }
    return check;
  }

  
  public static void main(String[] args) {
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
}