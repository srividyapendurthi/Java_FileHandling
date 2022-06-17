package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		
		//1.Using File
		
		String path = "C:\\Users\\a\\Desktop\\vidyaNewFile.txt";
		File file = new File(path);
		try {
			Boolean flag= file.createNewFile();
			if(flag) {
				System.out.println("New file is created");
			}
			else {
				System.out.println("The file already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2.Using Fileoutputstream
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Pleaes enter file name with path : ");
		String fileName= sc.nextLine();
		
		FileOutputStream fileNew;
		try {
			fileNew = new FileOutputStream(fileName, true);
			System.out.println("Please enter the content : ");
			String content= sc.nextLine();
			byte[] b= content.getBytes();
			try {
				fileNew.write(b);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	
		
		

	}

}
