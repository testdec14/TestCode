public class SalesEmployee {

	private String name;
	private String ppsNumber;
	protected double salesAmount;
	protected double commission;


	public SalesEmployee() // default constructor
	{
		this ("No Name", "N/A"); // default values 	
	}


	public SalesEmployee(String employeeName, String pps) //constructors
	{
		name = employeeName;
		ppsNumber = pps;	
	}

	
	public String getName()
	{	
		return name;
	}
	
	
	public void setName(String employeeName)
	{
		name = employeeName;	
	}

	
	public String getPpsNumber() 
	{	
		return ppsNumber;	
	}
	
	
	public void setPpsNumber (String pps) 
	{
		ppsNumber = pps;	
	}

	
	public double GetSalesAmount()
	{
		return salesAmount;	
	}

	
	public void setSalesAmount(double sales)
	{	
		salesAmount = sales;
	}

	
	public double getCommissionAmount()
	{
		return commission;
	}

	
	public void computeTotalPayment()
	{

	}
	
} //end class


