package fileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class usingFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1. File  2. Content
		String location ="UsingFileWriter.txt";
		String content="This is Thiyagaraj. I am learning Selenium WebDriver with TestNG,Java, maven and Jenkins";
		
		FileWriter fileWriter = new FileWriter(location);
		fileWriter.write(content);
		fileWriter.close();		

	}

}
