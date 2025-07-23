package Day3.userinput;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		System.out.println("enter name:");
		name=br.readLine();
		int id;
		System.out.println("enter the id");
		id=Integer.parseInt(br.readLine());
		float i;
		System.out.println("enter marks");
		i=Float.parseFloat(br.readLine());
		System.out.println("Name:" +name+" id:"+id+"i:"+i);
		

	}

}
