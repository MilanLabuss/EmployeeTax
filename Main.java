import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {

		Teacher TeacherObject = new Teacher ();
		Principal PrincipalObject = new Principal ();
		Byte Occupation;
		boolean again=true;


		while(again) {
			try {
				System.out.println("Please select your occupation: ");
				System.out.println("1:Teacher , 2:Principal Or 0 to Exit=>");
				Occupation= sc.nextByte ();

				switch (Occupation) {
				case 1: Employee.GetPPS();
				TeacherObject.Points();
				Employee.OverTime();
				TeacherObject.ExamPapers();
				TeacherObject.Tax(); break;
				case 2: Employee.GetPPS();
				PrincipalObject.TeachersAmount();
				Employee.OverTime();
				PrincipalObject.Tax(); break;
				case 0:
					System.out.println("\tThank you for using the Program");
					break;
				default:
					System.out.println("\t\nError in input: Choice must be 1, 2, or 0");
					continue;
				}
				again=false;

			}
			catch(InputMismatchException ex) {
				System.out.println("Error\n ");
				sc.next();
			}

		}
	}
}
