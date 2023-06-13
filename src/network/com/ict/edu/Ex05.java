package network.com.ict.edu;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// json	: xml과 함께 정보를 전달할때 사용

// 		  JavaScript Object Notation(JSON) : 데이터 교환 포맷

public class Ex05 {
	public static void main(String[] args) throws Exception {
		String jsonData = "{\"Persons\":[{\"name\":\"고경태\",\"age\":\"30\",\"블로그\":\"ktko.tistory.com\",\"gender\":\"남자\"},\r\n"
				+ "{\"name\":\"이홍준\",\"age\":\"31\",\"블로그\":\"없음\",\"gender\":\"남자\"},\r\n"
				+ "{\"name\":\"서정윤\",\"age\":\"30\",\"블로그\":\"없음\",\"gender\":\"여자\"}],\r\n"
				+ "\"Books\":[{\"name\":\"javascript의모든것\",\"price\":\"10000\"},{\"name\":\"java의모든것\",\"price\":\"15000\"}]}";

		JSONParser jsonParser = new JSONParser();

		// jsonparser에 json 데이터를 넣어, 파싱한 다음 jsonObject로 변환한다.
		JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonData);

		// Persons가 배열로 되어 있으므로 JSONArray
		JSONArray personArr = (JSONArray) jsonObj.get("Persons");
		for (int i = 0; i < personArr.size(); i++) {
			System.out.println("========person : " + i + " ========");
			JSONObject person_obj = (JSONObject) personArr.get(i);
			System.out.println(person_obj.get("name") + "\t" + person_obj.get("age") + "\t" + person_obj.get("블로그"));
		}
		System.out.println("=======================================");
		personArr = (JSONArray) jsonObj.get("Books");
		for (int i = 0; i < personArr.size(); i++) {
			System.out.println("========person : " + i + " ========");
			JSONObject person_obj = (JSONObject) personArr.get(i);
			System.out.println(person_obj.get("name") + "\t" + person_obj.get("price"));

		}
	}
}
