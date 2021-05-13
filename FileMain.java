package m10.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain {
	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("C:\\Users\\123456\\Desktop\\Capg Inernship\\source.txt");
		
		File f2 = new File("destination.txt");
		
		 CopyDataThread obj = new CopyDataThread(f,f2);
		 
		
		
	}

}
