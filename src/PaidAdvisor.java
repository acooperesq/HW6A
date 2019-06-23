


public class PaidAdvisor extends Person {
	
	
	 public double regularPayRate;  // note - this is
	 
	 public double specialPayRate;
	 
	public double overtimePayRate;
	
	char c;
	
	int q;
	
	
	// value input from HW_6 
	
	
	public double hoursWorked;  
	
	public double hoursSpecial;
	
	// internal calculations
	
	public double hoursRegular;
	
	public double hoursOvertime;
	
	public double hours_comb = 0;   
	
	
	// Earned Pay Variables
	
	public double earned_regular;
	
	public double earned_overtime;
	
	public double earned_special;
	
	public double total_pay;
	
	
	
	public PaidAdvisor()
	
	
		{super();
		
		
		
		earned_regular = 0;   // in Dollars - pay
		
		earned_special = 0;
		
		earned_overtime = 0;
		
		};
		
		
	void calculatePay()  // note:  this is total Pay
		
		{
		
			hours_comb = hoursWorked - hoursSpecial;
			
			if (hours_comb > 30)
				{
				hoursOvertime = hours_comb -30;
				hoursRegular =30;
				
				}
			else
				
				{
				hoursRegular = hours_comb;
				
				}
			
			earned_regular = hoursRegular*getPayRate(c);
			
			earned_overtime = hoursOvertime*getPayRate(q);
			
			earned_special = hoursSpecial*specialPayRate;
			
			
			
		
		};
		
			
public String toString()
		
		{
			double result  = earned_regular +earned_overtime + earned_special;
			
			String wage = String.valueOf(result);
			return wage;
		}


//			note:  do we go polymorphic?

public double getPayRate(char c)
  {		return regularPayRate;
			}
public double getPayRate(int q)
  {		return overtimePayRate;			
		 
		
}
//

public double getHoursWorked()

	{
	
	return  hoursWorked;
	}
		
public void setNameRateHours()

{	
	String first_zz; 
			
	String	last_zz;
	
	first_zz ="";    
	
	last_zz ="";
	
	super.setName(first_zz, last_zz);
	

	
		regularPayRate = 25;					
	
		specialPayRate = 50;					
	
		overtimePayRate = 1.5 *regularPayRate;
	
		hoursWorked = 0;					
	
}
}


	


