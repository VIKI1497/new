package collection1;

import java.util.*;

public class UseAadharCard {
	public static void main(String[] args) {
		AadharCard aadharcard1=new AadharCard(458596231475l,"ragu",23,"male","sanker");
		AadharCard aadharcard2=new AadharCard(872514203140l,"divya",26,"female","ganesh");
		AadharCard aadharcard3=new AadharCard(654230014811l,"lokesh",22,"male","ramesh");
		AadharCard aadharcard4=new AadharCard(452310411875l,"dinesh",25,"male","pugal");
		AadharCard aadharcard5=new AadharCard(775200336541l,"kavi",18,"female","suresh");
		AadharCard aadharcard6=new AadharCard(451210364852l,"naveen",22,"male","kamalesh");
		AadharCard aadharcard7=new AadharCard(125433689510l,"mega",23,"female","palani");
		AadharCard aadharcard8=new AadharCard(237514856200l,"gayathri",23,"female","hemnath");
		AadharCard aadharcard9=new AadharCard(455410012298l,"deva",33,"male","sujith");
		AadharCard aadharcard10=new AadharCard(234519867740l,"manoj",28,"male","balu");
		HashMap<Long,AadharCard> customerDetails=new HashMap<> ();
		customerDetails.put(aadharcard1.getAadharCardNo(), aadharcard1);
		customerDetails.put(aadharcard2.getAadharCardNo(), aadharcard2);
		customerDetails.put(aadharcard3.getAadharCardNo(), aadharcard3);
		customerDetails.put(aadharcard4.getAadharCardNo(), aadharcard4);
		customerDetails.put(aadharcard5.getAadharCardNo(), aadharcard5);
		customerDetails.put(aadharcard6.getAadharCardNo(), aadharcard6);
		customerDetails.put(aadharcard7.getAadharCardNo(), aadharcard7);
		customerDetails.put(aadharcard8.getAadharCardNo(), aadharcard8);
		customerDetails.put(aadharcard9.getAadharCardNo(), aadharcard9);
		customerDetails.put(aadharcard10.getAadharCardNo(), aadharcard10);
		String temp="";
		for(AadharCard ac:customerDetails.values()) {
			temp=temp.concat(ac.getName());
		}
		System.out.println(temp);
		Iterator itr=customerDetails.keySet().iterator();
		while(itr.hasNext()) {
			if(customerDetails.get(itr.next()).getGender()=="female") {
				itr.remove();
			}
		}
		customerDetails.forEach((k,v)-> System.out.println(k+","+v));
		int maxAge=0;
		for(AadharCard ac1:customerDetails.values()) {
			if(ac1.getAge()>maxAge) {
				maxAge=ac1.getAge();
				System.out.println(ac1.getName());
			}
		}
		System.out.println(maxAge+" is the Maximum Age");
	}

}
