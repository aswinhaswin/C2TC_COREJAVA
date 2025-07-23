package Day3.userinput;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.net.URL;
import java.io.File;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException{
		URL resource= FileReaderDemo.class.getResource("MVIT_TNS.txt");
		if(resource==null) {
			System.err.println("File not found");
		}
		//converting URL int file object
		File f=new File(resource.getFile());
		//obj creation for file reader
		FileReader fr=new FileReader(f);
		//obj creation for buffer reader
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line = br.readLine()) != null)
			System.out.println(line);
		
		br.close();
		
		

	}

}
