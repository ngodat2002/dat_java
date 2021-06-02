package read;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonTest {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader= new FileReader("employees.json")){
            Object obj= jsonParser.parse(reader);
            JSONArray employeeList= (JSONArray)obj;
            System.out.println(employeeList);
            employeeList.forEach(emp -> parseEmployeeObject( (JSONObject)emp ) );
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
    private static void parseEmployeeObject(JSONObject employee){
        JSONObject employObject = (JSONObject) employee.get("employee");
        String firstname = (String) employObject.get("firstname");
        System.out.println(firstname);
        String lastname = (String) employObject.get("lastname");
        System.out.println(lastname);
        String website = (String) employObject.get("website");
        System.out.println(website);
    }
}
