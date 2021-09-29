import java.util.*;
public class Assignment2 {
	public static void main(String[] args) {
		
		String ch;
		Scanner sc = new Scanner(System.in);
		do
		{
			//variable declaration and initialisation
			int studRno,marks[];
			marks = new int[6];
			String studName, grades[];
			grades = new String[6];
			int totalMarks = 0, pass=0, lowMark, highMark;
			String result;
			double  averageMarks;
			
			//inpit data 
			System.out.println("Enter student rno");
			studRno = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter student name");
			studName = sc.nextLine();			
			System.out.println("Enter student marks");
			for(int i=0;i<6;i++) {
				marks[i] = sc.nextInt();
		
			}
			System.out.println("Enter student grades");
			for(int i=0;i<6;i++) {
				grades[i] = sc.next();
		
			}
			
			//calculating total, average marks and result
			for (int i : marks) {
				totalMarks+=i;
				if(i>=40) {
					pass+=1;
				}
			}
			averageMarks = totalMarks/6.0;
			if(pass==6) {
				result = "PASS";
			}
			else {
				result = "FAIL";
			}
			Arrays.sort(marks);
			lowMark = marks[0];
			highMark = marks[5];
			
			//printing results
			System.out.println("---------STUDENT REPORT-----------");
			System.out.println("Student Roll No : "+studRno);
			System.out.println("Student Name    : "+studName);
			System.out.println("Student marks ");
			for(int i=0;i<6;i++) {				
				System.out.println("Marks in subject "+(i+1)+": "+marks[i]);
			}
			System.out.println("Highest subject mark  : "+highMark);
			System.out.println("Lowest subject mark   : "+lowMark);
			System.out.println("Student Total marks   : "+totalMarks);
			System.out.println("Student Average marks : "+averageMarks);
			System.out.println("Result                : "+result);
			
			System.out.println("Do you want to continue (Y/N)");
			ch = sc.next();
		}while(ch.equalsIgnoreCase("Y"));
		System.out.println("Exiting student report application");
	}
}
