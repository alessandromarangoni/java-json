import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import it.betacom.json.DemoBean;

public class JsonExample {

	public static void main(String[] args) {
		
		JSONObject job = new JSONObject();
		job.put("name", "luigi");
		job.put("age", 22);
		job.put("city", "milan");
		
		System.out.println("json ottenuto: "+ job);
		Map<String,String> map = new HashMap<String, String>();
		map.put("name", "silvio");
		map.put("city", "roma");
		
		JSONObject job2 = new JSONObject(map);
		System.out.println(job2);
		
		JSONObject job3 = new JSONObject("{\"city\":\"chicago\",\"name\":\"daniele\",\"age\":\"22\"}");
		System.out.println(job3);
		
		DemoBean DBean = new DemoBean(12,"giacomo","poretti");
		JSONObject job4 = new JSONObject(DBean);
		System.out.println(job4);
		
		JSONArray ja = new JSONArray();
		ja.put(Boolean.TRUE);
		ja.put("stefano");
		System.out.println("json ottenuto = "+ ja );
		
	}

}
