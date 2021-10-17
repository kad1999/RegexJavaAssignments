import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Assignment4 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String file = "src/course_details.properties"; 
		Properties p = new Properties();
		p.load(new FileInputStream(file));
		
		
		System.out.println(p.getProperty("courseName"));
		System.out.println(p.getProperty("duration"));
		
	}
}
