package Day6.usingfinal;

final class FinalClass {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

//can't create child classes from Final class, Ex: String, Wrapper Classes, System, Scanner, Number are Final classes
class FinalChildClass extends FinalClass {
}
public class FinalClassDemo {
	public static void main(String[] args) {
		
		FinalClass f1 = new FinalClass(); 
		f1.show();
	}
}
