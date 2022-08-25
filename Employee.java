import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Employee {


	static DecimalFormat moneyFormat = new DecimalFormat ("�#,##0.00");
	static Scanner sc = new Scanner(System.in);
	static byte OvertimeHours;
	static double OverTimePay;
	static boolean again=true;
	static int PpsNo;



	public static void GetPPS () {
		while(again) {
			try {
				System.out.println("Please Enter your PPS Number: ");
				PpsNo = sc.nextInt ();
				System.out.println("Your PPS Number is: "  + PpsNo);
				again=false;
			}

			catch(InputMismatchException ex) {
				System.out.println("Error ");
				sc.next();
			}
		}
	}


	public static void OverTime () {


		while(again) {
			try {
				System.out.println("Please Enter Number of OverTime hours: ");
				int OverTimeHours = sc.nextInt ();
				OverTimePay = OverTimeHours*34.03;
				System.out.println("Your Ovetime pay is: " + moneyFormat.format(OverTimePay));
				again=false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Error");
				sc.next();

			}
		}

	}
}
