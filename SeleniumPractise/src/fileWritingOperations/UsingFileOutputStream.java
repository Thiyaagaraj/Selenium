package fileWritingOperations;

import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location ="UsingFileOutputStream.txt";
		String content="This is Thiyagaraj. I am learning Selenium WebDriver with TestNG,Java, maven and Jenkins.\n This is using File Output Stream Writer";
		
		FileOutputStream outputStream = new FileOutputStream(location);
		byte[] writeThis = content.getBytes();
		
		outputStream.write(writeThis);
		outputStream.close();	
	}
}
