import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		//Create a file
		File myObj = new File("C:\\Users\\supri\\java_workspace\\TestFile.txt");
//		if(myObj.createNewFile())
//		{
//			System.out.println("File created : " + myObj.getName());
//		}
//		else
//		{
//			System.out.println("File already Exists");
//		}
		
         //getting file informaion
		  if(myObj.exists())
		  {
			  System.out.println("File Name : " + myObj.getName());
			  System.out.println("Absolute Path : " + myObj.getAbsolutePath());
			  System.out.println("Writeable : " + myObj.canWrite());
			  System.out.println("Readable : " + myObj.canRead());
			  System.out.println("File Size : " + myObj.length());
		  }
		  else {
			  System.out.println("File does not exists");
		  }
		  
		  //Writing to a file
		  FileWriter fw = new FileWriter(myObj);
		  fw.write("Hello from Us");
		  fw.close();
		  System.out.println("Sucess");
		  		  
		  
		  //Read from a file
		  Scanner sc = new Scanner(myObj);
		  while(sc.hasNextLine())
		  {
			  String s = sc.nextLine();
			  System.out.println(s);
		  }
		  sc.close();
	}

}
