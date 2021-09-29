import java.util.*;

public class Assignment1{
	public static void main(String[] args){
		int id = Integer.parseInt(args[0]);
		String name = args[1];
		
		System.out.println("Enter marks of 6 subjects");
		Scanner sc = new Scanner(System.in);
		int mark1 = sc.nextInt();
		int mark2 = sc.nextInt();
		int mark3 = sc.nextInt();
		int mark4 = sc.nextInt();
		int mark5 = sc.nextInt();
		int mark6 = sc.nextInt();
		
		System.out.println("=======STUDENT DETAILS=======\n");
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Subject 1 mark : "+mark1);
		System.out.println("Subject 2 mark : "+mark2);
		System.out.println("Subject 3 mark : "+mark3);
		System.out.println("Subject 4 mark : "+mark4);
		System.out.println("Subject 5 mark : "+mark5);
		System.out.println("Subject 6 mark :"+mark6);
		
		
		int total = mark1+mark2+mark3+mark4+mark5+mark6;
		double avg = total/6.0;
		System.out.println("Total Marks : "+total);
		System.out.println("Average Marks: "+avg);
		}
	}
		
		
		
