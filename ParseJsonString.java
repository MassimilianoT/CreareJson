import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParseJsonString {
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        Scanner scn = new Scanner(new File("filename.json"));

        while (scn.hasNextLine()){
           sb.append(scn.nextLine()).append("\n");
        }
        System.out.println(sb.toString());
        JSONObject obj = new JSONObject(sb.toString());

        System.out.println(obj.getString("nome"));
        JSONArray arr = obj.getJSONArray("corsi");

        for (int i = 0; i < arr.length(); i++) {
           JSONObject currentOBj = (JSONObject) arr.get(i);
           System.out.println(currentOBj.getInt("id"));
           System.out.println(currentOBj.getString("nome_corso"));
        }
    }
}

