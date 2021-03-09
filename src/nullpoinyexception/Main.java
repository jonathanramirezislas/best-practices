package nullpoinyexception;

public class Main {
    public static void main(String[] args) {

        String name = null;

        // System.out.println(name.equals("jonathan"));// will launch a error
        // NullPointException
        System.out.println("jonathan".equals(name));
        
        /**
         * JAVA 8
            Address defaultAddress = new Address (....); 
            Optional<Address> optAddress =user.getAddress();
            Address address = optAddress.orElse(defaultAddress);
        
            Optional<Address> optAddress = user.getAddress();
            Address address = optAddress.orElseThrow(UserNotFoundException::new)
        

            Address address;
            if(optAddress.isPresent){
            address = optAddress.get();
            }

            Optional<Address> optAddress = user.getAddress();
            optAddress.ifPresent(System.out::println);
          
            */


    }
}
