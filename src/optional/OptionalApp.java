package optional;

import java.util.Optional;

public class OptionalApp {

	
	public void orElse(String valor){
		Optional<String> op = Optional.ofNullable(valor);
		String x = op.orElse("predeterminado");//set a default value
		System.out.println(x);
	}
	
	public void orElseThrow(String valor){
		Optional<String> op = Optional.ofNullable(valor);
		op.orElseThrow(NumberFormatException::new);//throw a new exception
	}
	
	public void isPresent(String valor){
		Optional<String> op = Optional.ofNullable(valor);
		System.out.println(op.isPresent());//true or false
	}
	
	public static void main(String[] args) {
		OptionalApp app = new OptionalApp();
		//app.orElse("Jona");
		//app.orElseThrow("Jona");
		app.isPresent("Mito");
	}
}
