import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Principal extends Employee{

	DecimalFormat moneyFormat = new DecimalFormat ("�#,##0.00");
	static Scanner sc = new Scanner(System.in);
	static String PpsNo;
	static double BasicPay = 60000;
	static double NumberOfTeachers;
	static double AdditionalPay;
	static double PreTaxPay=BasicPay+AdditionalPay+OverTimePay;
	static double TaxAmount;
	static double OverTimeRate = 34.04;
	static double PrsiAmount;
	static double AfterTaxPay;
	static double TotalTaxPaid;
	boolean again=true;


	public void TeachersAmount() {

		while(again) {
			try {
				System.out.println("Please Enter the Number of Teachers you have in the School: ");
				System.out.println(" If 0-9 press A\n If 10-99 press B\n If 100-199 press C\n If over 200 press D or press X to exit");
				String NumberOfTeachers= sc.nextLine ();



				switch (NumberOfTeachers) {
				case  "A": case "a": AdditionalPay = 9310; break;
				case  "B": case "b": AdditionalPay = 10432; break;
				case  "C": case "c": AdditionalPay = 12238; break;
				case "D": case "d": AdditionalPay = 14360; break;
				case "x":
					System.out.println("\tGoodbye");
					break;
					
				default:
					System.out.println("\t\nError in input: Choice must be A, B, C, D  or X");
					continue;
				
				}
			
				again=false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Error\n ");
				sc.next();
			}
			System.out.println("Your Additional Pay: " + moneyFormat.format(AdditionalPay));
		}
	}

	public void Tax() {

		PreTaxPay=OverTimePay+AdditionalPay+BasicPay;
		System.out.println("your Pre Tax pay is: " + moneyFormat.format(PreTaxPay));



		if (PreTaxPay<=40000) {
			TaxAmount = 40000*0.22;
			TotalTaxPaid=TaxAmount+PrsiAmount;
		}
		else {
			TaxAmount = 40000*0.22 + (PreTaxPay-40000)*0.42;
			
		}
		TotalTaxPaid=TaxAmount+PrsiAmount;
		PrsiAmount = PreTaxPay*0.04;
		AfterTaxPay = PreTaxPay - TotalTaxPaid;

		System.out.println("Your PRSI Deducted is: -" + moneyFormat.format(PrsiAmount));
		System.out.println("Your Total Tax Deducted is: -" + moneyFormat.format(TotalTaxPaid));
		System.out.println("Your Take Home Pay is: " + moneyFormat.format(AfterTaxPay));


	}

}
