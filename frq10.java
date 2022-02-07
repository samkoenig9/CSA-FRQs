public class frq10 {

    public static int gcf(int x, int y){

        int temp = x % y;
        if(temp == 0){
            return y;
        }
        else{
            return gcf(y, temp);
        }
    }

    public static String reduceFraction(int numerator, int denominator){
        String returnValue = "";
        if(numerator % denominator == 0){
            int i = numerator / denominator;
            System.out.println(i);
        }
        else{
            frq10 temp = new frq10();
            int gcf = temp.gcf(numerator, denominator);
            int num = numerator/gcf;
            int den = denominator/gcf;
            returnValue = num + "/" + den;
            System.out.println(returnValue);
        }

        return returnValue;

    }

    public static void main(String[] args){
        int a = 36;
        int b = 8;
        System.out.println(gcf(a, b));
        reduceFraction(30, 10);
    }

}