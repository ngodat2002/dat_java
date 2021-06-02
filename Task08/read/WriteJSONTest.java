package read;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;


import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONObject employeeDetails= new JSONObject();
        employeeDetails.put("firstname","Dang");
        employeeDetails.put("lastname","Kim Thi");
        employeeDetails.put("website","codelean.vn");
        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee",employeeDetails);
        //second employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstname","Dang");
        employeeDetails2.put("lastname","Kim Thi");
        employeeDetails2.put("website","codelean.vn");

        JSONObject employeeObject2= new JSONObject();
        employeeObject2.put("employee",employeeDetails2);
        //add employee to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
        try (FileWriter file= new FileWriter("employees.json")){
            file.write(employeeList.toJSONString());
            file.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
