import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Teacher extends Employee {

	DecimalFormat moneyFormat = new DecimalFormat ("�#,##0.00");
	static Scanner sc = new Scanner(System.in);
	static String PpsNo;
	static double BasicPay = 40123;
	static byte PointsOnScale;
	static double AdditionalPay;
	static double ExamScriptAmount;
	static double ScriptRate=10.18;
	static double ScriptTotal;
	static double PreTaxPay=OverTimePay+AdditionalPay+BasicPay+ScriptTotal;
	static double TaxAmount;
	static double OverTimeRate=34.03;
	static double PrsiAmount;
	static double AfterTaxPay;
	static double TotalTaxPaid;
	boolean again=true;




	public void Points() {
		
		while(again) {
			try {
		System.out.println("Please select your points on the Scale: ");
		System.out.println("1 , 2, 3, 4 Or 0 to Exit=>");
		Byte PointsOnScale= sc.nextByte ();

		switch (PointsOnScale) {
		case 1: AdditionalPay = 5120; break;
		case 2: AdditionalPay = 6789; break;
		case 3: AdditionalPay = 7999; break;
		case 4: AdditionalPay = 9000; break;
		case 0:
			System.out.println("\tGoodbye");
			break;

		default:
			System.out.println("\t\nError in input: Choice must be 1, 2, 3, 4  or X");
			continue;
		}
		again=false;
			}
		catch(InputMismatchException ex) {
			System.out.println("Error\n ");
			sc.next();
		}
			
		}

	

	
		
			System.out.println("Your Additional Pay: " + moneyFormat.format(AdditionalPay));
	}

	public void ExamPapers () {

		System.out.println("Please Enter the Amount of Exam Papers: ");
		ExamScriptAmount =sc.nextDouble();
		ScriptTotal = ExamScriptAmount*ScriptRate;
		System.out.println("Your Total Exam papers Pay is: " + moneyFormat.format(ScriptTotal));

	}

	public void Tax() {

		double PreTaxPay=OverTimePay+AdditionalPay+BasicPay+ScriptTotal;
		System.out.println("your Pre Tax pay is: " + moneyFormat.format(PreTaxPay));


		if (PreTaxPay<=40000)
			TaxAmount = 40000*0.22;

		else 
			TaxAmount = 40000*0.22 + (PreTaxPay-40000)*0.42;


		PrsiAmount = PreTaxPay*0.04;
		TotalTaxPaid=TaxAmount+PrsiAmount;
		AfterTaxPay=PreTaxPay-TotalTaxPaid;

		System.out.println("Your PRSI Deducted is: -" + moneyFormat.format(PrsiAmount));
		System.out.println("Your Total Tax Deducted is: -" + moneyFormat.format(TotalTaxPaid));
		System.out.println("Your Take Home Pay is: " + moneyFormat.format(AfterTaxPay));

	}

}
