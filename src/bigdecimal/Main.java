package bigdecimal;

import java.math.BigDecimal;

public class Main {
    
    public static void main(String[] args) {
        
        //truncated numbers for example float, double 
        System.out.println(1.0/3.0);

    /* uses of bigDecimal bank, military */
    
        //high precision
        BigDecimal a = new BigDecimal(0.333333333);
        BigDecimal b = new BigDecimal(0.666666666);

        BigDecimal x = a.multiply(b);
        System.out.println(x);

        // less precission
        BigDecimal c = new BigDecimal("0.333333333");
        BigDecimal d = new BigDecimal("0.666666666");
        
        BigDecimal y = c.multiply(d);        
        System.out.println(y);




    }


}
