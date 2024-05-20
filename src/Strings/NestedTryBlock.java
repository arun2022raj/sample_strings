package Strings;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

public class NestedTryBlock {
	public static void main(String[] args) {
		try{
			FileReader i= new FileReader("C:\\Users\\arunr\\eclipse-workspace\\Strings\\src\\Strings\\abs.txt");
			int c;
			while((c=i.read())!=-1){
				char ch=(char) c;
			}
			int r=10/c;
			FileWriter j=new FileWriter("C:\\Users\\arunr\\eclipse-workspace\\Strings\\src\\Strings\\abw.txt");
			j.write(r);
			}
			catch(IOException e)
			{
				
			}
	}

}
