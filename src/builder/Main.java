package builder;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle.Builder(100,100).x(5).y(6).build();
		System.out.println(rectangle.getX());

	}

}
