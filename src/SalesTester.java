import java.util.*;

import java.text.DecimalFormat;

public class SalesTester //testerClass
{

	public static void main(String [] args) //main method
	{
		
		SalesEmployee[] list = new SalesEmployee[5]; //space for 5 strings

		Scanner input = new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");


		//create array lists 
		list[0] = new SalesPerson("Tara Keena","3498574h");
		list[1] = new SalesAgent("Cialin Earls", "3847562f");
		list[2] = new SalesPerson("Paul Brady","4726391d");
		list[3] = new SalesAgent("Eddie Vedder", "2736482c");
		list[4] = new SalesPerson("Paul Simon", "17562906W");


		for (int i = 0; i < list.length; i++ ) //for loop/ increments by one through array
		{
			System.out.printf("Enter Sales amount for Employee %d: ", i +1);

			list[i].setSalesAmount(input.nextDouble());
		}

		for (int i = 0; i < list.length; i++) 
		{
			list[i].computeTotalPayment(); //invoke method for each increment of array
		}
		
		for (int i = 0; i < list.length; i++)
		{
			
			System.out.println();
			System.out.println(list[i].getName()+ "\nPPS NO: " + list[i].getPpsNumber() + "\nCommission Payment is: € " + df.format(list[i].getCommissionAmount()) );
			System.out.println("Total value of sales after commission: € " +df.format(list[i].GetSalesAmount()-list[i].getCommissionAmount() )+"\n");			

		} 
		
	}
	
} //end tester class

