package collection;

import java.util.ArrayList;

public class Employee1 {
	public static void main(String[] args) {
		ArrayList<Integer> employeeIds=new ArrayList<> ();
		employeeIds.add(15);
		employeeIds.add(16);
		employeeIds.add(17);
		employeeIds.add(20);
		employeeIds.add(25);
		for(int i=0;i<employeeIds.size();i++) {
			if(employeeIds.get(i)%2==0) {
			System.out.println(employeeIds.get(i)+" is even number");
			}
			else {
				System.out.println(employeeIds.get(i)+" is odd number");
			}
		}
	}

}
