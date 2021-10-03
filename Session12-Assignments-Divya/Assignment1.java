class AttendanceShortageException extends RuntimeException{
	public AttendanceShortageException() {
		super();
	}
	public AttendanceShortageException(String message) {
		super(message);
	}
}

class GPAException extends RuntimeException{
	public GPAException() {
		super();
	}
	public GPAException(String message) {
		super(message);
	}
}
public class Assignment1 {
	public static void main(String[] args) {
		int attendance = 80;
		int gpa = 6;
		
		if(attendance < 75) {
			throw new AttendanceShortageException("Attendance less than 75%");
		}
		else {
			System.out.println("Attendance greater than 75");
		}
		
		if(gpa<7) {
			throw new GPAException("GPA less than 7");
		}
		else {
			System.out.println("gpa greater than 7");
		}
	}
}
