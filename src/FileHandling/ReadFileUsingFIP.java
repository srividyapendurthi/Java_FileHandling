package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFIP {

	public static void main(String[] args) {
		
		FileInputStream fip = null;
		String path = "C:\\Users\\a\\Desktop\\fileOutput.txt";
		
		File file= new File(path);
		try {
			
			fip = new FileInputStream(file);
		
		int c=0;
		while((c=fip.read())!=-1) {
			System.out.print((char)c);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fip.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
		}
		
		
		

	}

}
