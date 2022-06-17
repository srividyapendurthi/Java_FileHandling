package FileHandling;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

public static void main(String[] args) {
		
		FileReader fr=null;
		try {
			String path = "C:\\Users\\a\\Desktop\\fileOutput.txt";
			
			File file= new File(path);
			
			fr= new FileReader(file);
			
			int c= 0;
			while((c=fr.read())!=-1) {
				System.out.print((char)c);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}

	}


		

	}

