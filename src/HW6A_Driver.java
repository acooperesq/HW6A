

import java.util.Scanner;

public class HW6A_Driver {

	public static void main(String[] args) {

		double num_hours = 0;
		
		double er =0;
		
		double eo =0;
		
		double es = 0;
		
		PaidAdvisor SJW = new PaidAdvisor();
		
		
		
		SJW.setNameRateHours();
		
		boolean reset = false;
		
		//
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("WELCOME TO REGULAR PAY, OVERTIME AND SPECIAL CALCULATION PROGRAM");
		
		//	Note:  requesting first and last name may not be necessary under the assignment, but I thought I would add it if it was a little extra
		
		// Alternatively, the name can be set in "Paid Advisor" lines 129 and 131;
		
		System.out.println("What is Your First Name?");
		
		String selectionf = scanner.nextLine();
		
		System.out.println("What is Your Last Name?");
		
		String selectionl = scanner.nextLine();
		
		SJW.setName(selectionf, selectionl);  // assigning the name assigned to the object
		
		System.out.print(" Happy To Meet You:  " + SJW.getFirstName());
		
		System.out.println(" " + SJW.getLastname());
		
		
		
		//
		
		System.out.println("How Many HOURS IN TOTAL -INCLUDING SPECIAL SESSION HOURS - Did You Work? - Please Enter as Number");
		
		num_hours = scanner.nextDouble();
		
		SJW.hoursWorked   = num_hours; 
		
		
		
		System.out.println(" How Many SPECIAL HOURS ALONE -IF ANY- - Did You Work? -Please Enter as Number");
		
		num_hours = scanner.nextDouble();
		
		SJW.hoursSpecial   = num_hours; 
		
		if (SJW.hoursSpecial > SJW.hoursWorked)
		{
			System.out.println(" Too Many Special Hours- Special Hours Cannot Exceed Total Hours Worked");
			System.out.println(" Special Hours Now Equal Total Hours Worked");
			SJW.hoursSpecial = SJW.hoursWorked;
		}
		
		
		SJW.calculatePay();
		
		
		System.out.println("TOTAL WAGES Pay is:  $" + SJW.toString());
		
		
		System.out.println("\nBreakdown By Category:" );
		
		er = SJW.earned_regular;
		System.out.printf("     Earned regular wage:  $%2.2f   " , er);
		eo = SJW.earned_overtime;
		System.out.printf("\n     Earned overtime wage: $%2.2f" , eo);
		es = SJW.earned_special;
		System.out.printf("\n     Earned special wage:  $%2.2f", es);
	
		
	}

	

}
