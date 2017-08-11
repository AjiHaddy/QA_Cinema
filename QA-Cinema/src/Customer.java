import java.util.List;
import java.util.ArrayList;

public class Customer {
	int CustomerID;
	String CustomerName="";
	String CustomerEmail="";
	String Password="";
	int age;
	
	
	String[] customer = {1 + "Lana Parilla" + "lp12@gmail.com"+"lpar"+ 16};


	public static void main(String[] args) {
		
	//	new Customer(int cID, cName, CustomerEmail, CustomerPassword);
	
	}

		public Customer(int cID, String cName, String cEmail, String cPass, int age)
		
		{
			addCustomer(cID, cName, cEmail,cPass, age);
		}

		
		public void addCustomer(int cID,String cName, String cEmail,String cPass, int age)
		{
			this.CustomerName= cName;
			
			
		}
		
		//find the age of customer so it can be categorised to adult, child and concession.
		public int getAge()
		{
			return age;
		}
		
		public void setAge(int age)
		{
			this.age =age;
			
		}
         
         
         
         public void removeCustomer(int index)
         {
             if(CustomerValid(index)) {
   //              Customer.remove(index);
             }
             
             //remove the customer if customer requests to be removed
         }
		private boolean CustomerValid(int index) {
	
			return false;
		}
}

