import java.util.Random;

public class frq5_2 {
    private static int passwordsGenerated =0;
    private static Random random = new Random();
    private String prefix;
    private int length;
    public frq5_2(int length,String prefix) {
        this.prefix = prefix;
        this.length = length;
    }
    public frq5_2(int length) {
        this.prefix = "A";
        this.length = length;
    }
    public String pwGen(){
        String pwd= this.prefix+".";
        for(int i=1;i<=this.length;i++){
            pwd+=random.nextInt(10);
        }
        passwordsGenerated+=1;
        return pwd;
    }
    public int pwCount(){
        return passwordsGenerated;
    }
    public static void main(String[] args) {
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
}