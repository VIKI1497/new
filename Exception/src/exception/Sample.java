package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Sample {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\New folder\\sample.txt");   ///create text in pad and save file to windows c copy the address and place here  
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)temp);
		}
	}

}
