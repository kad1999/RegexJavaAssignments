import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class question4 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\Divya Ann\\Desktop\\abc.txt");
		Scanner sc = new Scanner(file);
		int line=0, spaces = 0, chars =0;
	    while (sc.hasNextLine()) {
	    	line++;
	    	String s = sc.nextLine();
	    	
	    	for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)==' ') {
					spaces++;
				}else {
					chars++;
				}
			}
	    }
	    	
	     System.out.println("No of lines : "+line);
	     System.out.println("No of words : "+(spaces+line));
	     System.out.println("No of characters : "+chars);
		
	}
}
