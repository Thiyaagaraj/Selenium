package fileWritingOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class UsingPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location ="UsingPaths.txt";
		String content="This is Thiyagaraj. I am learning Selenium WebDriver with TestNG,Java, maven and Jenkins."
				+ " This is using Paths";
		Path path = Paths.get(location);
		Files.write(path, content.getBytes() );

	}

}
