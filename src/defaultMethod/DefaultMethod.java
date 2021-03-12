package defaultMethod;

public class DefaultMethod implements PersonaA, PersonaB{

	@Override
	public void caminar() {		
		System.out.println("Walking");
	}	
		
	@Override
	public void hablar() {
		//PersonaA.super.hablar();
		PersonaB.super.hablar(); //uing method from Person B
		//System.out.println("Suscribanse Coders"); //you can overrride the default method
	}


	public static void main(String[] args) {
		DefaultMethod app = new DefaultMethod();
		app.hablar(); //acess to defaul method
	}
	
}
