package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File ifile =new File("C:\\Users\\a\\Desktop\\PY vidya\\practice.pdf");
		File ofile = new File("C:\\Users\\a\\Desktop\\PY vidya\\copiedfile.pdf");
		
		
		FileInputStream fileInputStream =null;
		FileOutputStream fileOutputStream = null;
		try {
			 fileInputStream = new FileInputStream(ifile);
			 fileOutputStream = new FileOutputStream(ofile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

		int i=0;
		try {
			while((i=fileInputStream.read())!=-1) {
				fileOutputStream.write(i);
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		finally {
			if(fileInputStream!=null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			}
			if(fileOutputStream!=null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
	}

}
