package Day1.encapsulation;
//entity class
public class student {
     int a;
     private  String b;
 public String getB() {
	return b;
  }
 public void setB(String b) {
	this.b = b;
  }
  @Override
  public String toString() {
  	return "student [a=" + a + ", b=" + b + "]";
  }
   
	 
  

}
