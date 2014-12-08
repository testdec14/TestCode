public class SalesPerson extends SalesEmployee
{
	
	double COMMISSIONRATE = 0.15; //set commission rate as constant 

	public SalesPerson() // constructor
	{ 
		super(); // call constructor from base class SalesEmployee
	}

	
	public SalesPerson(String name, String ppsNumber) 
	{
		super(name, ppsNumber);
	}
	
	
	public void computeTotalPayment() //method to calculate commission
	{
		
		commission = salesAmount * COMMISSIONRATE;		
	}


}// end class
