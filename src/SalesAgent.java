public class SalesAgent extends SalesEmployee {

	double COMMISSIONRATE = 0.1; //set the commission rate as constant 
	
	
	public SalesAgent() // constructor
	{ 
		super(); // call constructor from base super class
	}


	public SalesAgent(String name, String ppsNumber)
	{
		super(name, ppsNumber);
	}


	public void computeTotalPayment() 
	{
		commission = salesAmount * COMMISSIONRATE;	//commission calculation
	}


} // end class
