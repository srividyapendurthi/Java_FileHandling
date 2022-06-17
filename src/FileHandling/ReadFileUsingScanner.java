package FileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadFileUsingScanner {

	public static void main(String[] args) {
		Scanner sc=null;
		String path="C:\\Users\\a\\Desktop\\fileOutput.txt";
		File file = new File(path);
		try {
		sc=new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			sc.close();
		}

}
}
