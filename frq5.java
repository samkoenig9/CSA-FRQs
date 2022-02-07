import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class frq5 {

    //initialize variables
    //private ("Protected") meaning variable cannot be called without a getter
    private String hostName;
    private String address;

    public frq5(String address) {
        this.address = address;
        this.hostName = ("Craig");
    }

    //getter that makes private variable callable
    //not having a getter on a private variable would make it so that it cannot be called
    public String getHostName(){
        return hostName;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address)
    {
        this.address = address;
    }

    public void invite(String guest)
    {
        System.out.println("Dear "+ this.hostName +", please attend my event at "+ this.address +". See you then, "+ guest + ".");
    }

    public static void main(String[] args) {
        frq5 test = new frq5("1234 test ave");

        System.out.println(test.getHostName());

        test.setAddress("5678 testing ave");

        test.invite("Bob");
    }
}