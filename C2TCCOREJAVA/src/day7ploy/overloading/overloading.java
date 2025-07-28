package day7ploy.overloading;

public class overloading {
	
public static void main(String[] args) {
		Addition a=new Addition();
		a.add();
		System.out.println(a.add(7));
		System.out.println(a.add(9.2));
		a.show(412," aswin");
		a.show("aswin ",412);
		}

}
