package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonReader {

    public static Object[][] getJSONdata(String JSON_path, String JSON_Data, int JSON_attributes) throws IOException, ParseException {
        Object object = new JSONParser().parse(new FileReader((JSON_path)));
        JSONObject jsonObject = (JSONObject) object;
        JSONArray jsonArray = (JSONArray) jsonObject.get(JSON_Data);

        Object[][] array = new String[jsonArray.size()][JSON_attributes];
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject1 = (JSONObject) jsonArray.get(i);
            array[i][0] = String.valueOf(jsonObject1.get("validPhoneNumber"));
            array[i][1] = String.valueOf(jsonObject1.get("validPin"));
        }

        for (int i = 1; i < jsonArray.size(); i++) {
            JSONObject jsonObject1 = (JSONObject) jsonArray.get(i);
            array[i][0] = String.valueOf(jsonObject1.get("validPhoneNumber"));
            array[i][1] = String.valueOf(jsonObject1.get("validPin"));
        }
        return array;
    }
}
