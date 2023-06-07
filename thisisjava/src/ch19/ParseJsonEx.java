package ch19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJsonEx {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("D:member.json"));

		String json = br.readLine();
		br.close();

		JSONObject root = new JSONObject(json);

		System.out.println("id" + root.getString("id"));
		System.out.println("name" + root.getString("id"));
		System.out.println("age" + root.getInt("age"));
		System.out.println("student" + root.getBoolean("student"));

		JSONObject tel = root.getJSONObject("tel");
		System.out.println("home" + tel.getString("home"));
		System.out.println("mobile" + tel.getString("mobile"));

		JSONArray skill = root.getJSONArray("skill");
		System.out.println("skill");
		for (int i = 0; i < skill.length; i++) {
			System.out.println(skill.get(i) + ",");

		}
	}

}
