package ch19;

import java.io.FileWriter;
import java.io.Writer;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonEx {
	
	public static void main(String[] args) {
		JSONObject root=new JSONObject();
		
		root.put("id", "winter");
		root.put("name", "한겨울");
		root.put("age", 25);
		root.put("student", true);

		JSONObject.tel=new JSONObject();
		tel.put("home","02-1234-5678");
		tel.put("mobile","010-1234-5678");
		root.put("tel", tel);

		JSONArray skill=new JSONArray();
		skill.put("java");
		skill.put("c");
		skill.put("c++");
		root.put("skill",skill);
		
		String jsonString = root.toString();
		
		System.out.println(json);
		
		Writer writer = new FileWriter()
				writer.write(json);
		writer.flush();
		writer.close();
		
	}

}
