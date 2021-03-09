package nullpoinyexception;

public class Main {
    public static void main(String[] args) {
     
        String name =null;

        //System.out.println(name.equals("jonathan"));// will launch a error NullPointException
        System.out.println("jonathan".equals(name));

    }
}
