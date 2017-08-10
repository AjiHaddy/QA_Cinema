import java.util.List;
import java.util.ArrayList;

public class Customer {
	int CustomerID;
	String CustomerName="";
	String CustomerEmail="";
	String Password="";
	int age;
	
	List<Customer>customer = new ArrayList<Customer>();
	customer.add(new Customer(1,"Lana Parilla","lp12@gmail.com","lpar",16)));

	public static void main(String[] args) {
		ArrayList<Customer>customer = new ArrayList<Customer>();
	}
public static void main (int[] arg) {
ArrayList<Customer>customer = new ArrayList<Customer>();
customer.add(new Customer(1,"Lana Parilla","lp12@gmail.com","lpar",16));
	
	}}
		public Customer(int cID, String cName, String cEmail,String cPass)
		
		{
			addCustomer(cID, cName, cEmail,cPass, age);
		}

		
		public void addCustomer(int cID,String cName, String cEmail,String cPass, int age)
		{
			this.CustomerName= cName;
			
		}
		
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
                 Customer.remove(index);
             }
         }
		private boolean CustomerValid(int index) {
			// TODO Auto-generated method stub
			return false;
		}
}

