package collection1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;

public class UseCustomer {
	public static void main(String[] args) {
		Customer customer1=new Customer("Ram",34,"ram@gmail",654372181264l,74000);
		Customer customer2=new Customer("Kavya",28,"kavya@gamil",543712854900l,84000);
		Customer customer3=new Customer("Hari",25,"hari@gmail",640012541132l,120000);
		Customer customer4=new Customer("Jagan",32,"jagan@gmail",332254128712l,215200);
		Customer customer5=new Customer("teejay",27,"teejay@gmail",654376512389l,250134);
		Customer customer6=new Customer("Mohan",46,"mohan@gmail",874123659842l,118345);
		Customer customer7=new Customer("Kamal",48,"kamal@gamil",463215285429l,280564);
		Customer customer8=new Customer("nithya",35,"nithya@gmail",325317643268l,243100);
		Customer customer9=new Customer("ruba",24,"ruba@gmail",642312457822l,38000);
		Customer customer10=new Customer("vijay",47,"vijay@gmail",553271248634l,430765);
		HashMap<Long,Customer> customerDetails=new HashMap<> ();
		customerDetails.put(customer1.getAccountNumber(),customer1);
		customerDetails.put(customer2.getAccountNumber(),customer2);
		customerDetails.put(customer3.getAccountNumber(),customer3);
		customerDetails.put(customer4.getAccountNumber(),customer4);
		customerDetails.put(customer5.getAccountNumber(),customer5);
		customerDetails.put(customer6.getAccountNumber(),customer6);
		customerDetails.put(customer7.getAccountNumber(),customer7);
		customerDetails.put(customer8.getAccountNumber(),customer8);
		customerDetails.put(customer9.getAccountNumber(),customer9);
		customerDetails.put(customer10.getAccountNumber(),customer10);
		customerDetails.forEach((accNo,name)-> System.out.println("Customer Account Number:"+accNo+","+"Customer Name:"+name));
		int maxAge=0;
	     Customer a=null;
		for(Customer ct:customerDetails.values()) {
			if(ct.getAge()>maxAge) {
				maxAge=ct.getAge();
				a=ct;
			}
		}
		System.out.println(a);
		Iterator<Long> itr=customerDetails.keySet().iterator();
		while(itr.hasNext()) {
			if(customerDetails.get(itr.next()).getAccountBalance()<50000) {
				itr.remove();
			}
		}
		customerDetails.forEach((k,v)-> System.out.println(k+","+v));
	ArrayList<Customer> seniorCustomers=new ArrayList<>();
	for(Customer i:customerDetails.values()) {
		if(i.getAge()>35) {
			seniorCustomers.add(i);
		}
	}
	System.out.println(seniorCustomers);
	}
}
