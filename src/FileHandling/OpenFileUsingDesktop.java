package FileHandling;

import java.awt.Desktop;
import java.io.File;

public class OpenFileUsingDesktop {

	public static void main(String[] args) {


		String path="C:\\Users\\a\\Desktop\\fileOutput.txt";
		
		File file = new File(path);
		
		try {
			
			if(!Desktop.isDesktopSupported()) {
				System.out.println("Desktop is not supported");
			}
			
			Desktop desktop = Desktop.getDesktop();
			if(file.exists()) {
				desktop.open(file);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
