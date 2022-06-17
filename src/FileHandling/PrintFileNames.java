package FileHandling;

import java.io.File;

public class PrintFileNames {

	public static void main(String[] args) {


		String path = "C:\\Users\\a\\Documents";
		
		File file = new File(path);
		File Documentsdir[] = file.listFiles();
		
		for(File f : Documentsdir) {
			if(f.isFile()) {
				System.out.println("File : " + f.getName());
			}
			else if (f.isDirectory()) {
				System.out.println("Directory :"+ f.getName());
			}
			else {
				System.out.println("Not known " + f.getName());
			}
		}
		
	}

}
