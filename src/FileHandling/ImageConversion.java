package FileHandling;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageConversion {

	public static void main(String[] args) {
		
		try {
			URL url =new URL("https://jakho.rs/wp-content/uploads/2018/01/circle.png");
			//File file =new File("C:\\Users\\a\\Desktop\\qa.jpg");
			try {
				BufferedImage image= ImageIO.read(url);//file
				ImageIO.write(image, "jpg", new File("C:\\Users\\a\\Desktop\\qa.jpg"));
				ImageIO.write(image, "gif", new File("C:\\Users\\a\\Desktop\\qa.gif"));
				ImageIO.write(image, "bmp", new File("C:\\Users\\a\\Desktop\\qa.bmp"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
		
			e.printStackTrace();
		}
		

	}

}
