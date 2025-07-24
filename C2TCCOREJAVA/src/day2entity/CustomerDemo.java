package day2entity;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();//invoke default constructor
		c1.setCid(11);
		c1.setCname("sz");
		c1.setCity("Chennai");
		//System.out.println(c1);
		
		Customer c2=new Customer(22,"pp","chenai");
		c2.setCid(12);
		c2.setCname("ss");
		c2.setCity("Munnn");
		//System.out.println(c2);
		Customer c3=new Customer(23,"pp");
		System.out.println(c3);
		
		
		
		

	}

}
