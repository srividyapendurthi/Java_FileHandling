package FileHandling;

import java.io.File;

public class FilePersmissions {

	public static void main(String[] args) {
		
		File file = 
				new File("C:\\vidya\\selenium\\fileHandling\\src\\FileHandling\\OpenFileUsingDesktop.java");
		file.setExecutable(true);
		file.setWritable(true);
		file.setReadable(true);
	}

}
