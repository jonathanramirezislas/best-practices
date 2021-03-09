package generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Currency> coin = new ArrayList<>();
        
        coin.add(new Currency("MX",12));
        coin.add(new Currency("COL",8));
        //coin.add(new Bill("MX",45)); 

        coin.stream().forEach(System.out::println);
    
    }
    

}
