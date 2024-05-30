package jSONPackge;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWriteExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("Name", "Thiyag");
		jsonObject.put("Age", 42);
		
		//["Magical smile","Magnetic eyes"]
		JSONArray array = new JSONArray();
		array.add("Magical smile");
		array.add("Magnetic Eyes");
		
		jsonObject.put("Special Features", array);
		
		FileWriter fileWriter = new FileWriter("Thiyag.json");
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();

	}

}
