import java.io.FileInputStream;
import java.io.IOException;

public class StudentsImporter {
    public static void main(String[] args) throws IOException {
        String jdbcURL = "ss";
        String username = "root";
        String password  = "password";
        String excelFilePath = "Student.xlsx";


        FileInputStream inputStream = new FileInputStream(excelFilePath);


    }
}
