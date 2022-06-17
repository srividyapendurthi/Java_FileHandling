package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferedReader {

	public static void main(String[] args) {
	
		BufferedReader br = null;
		
		try {
			String path = "C:\\Users\\a\\Desktop\\fileOutput.txt";
			File file= new File(path);
			br= new BufferedReader(new FileReader(file));
			
			int c= 0;
			while((c=br.read())!=-1) {
				System.out.print((char)c);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		finally {
			try {
				br.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}

	}

}
