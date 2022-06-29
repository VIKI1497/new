package collection;

import java.util.ArrayList;

public class Employee {
	public static void main(String[] args) {
		ArrayList<Integer> employeeIds=new ArrayList<> ();
		employeeIds.add(15);
		employeeIds.add(16);
		employeeIds.add(18);
		employeeIds.add(20);
		//remove 
		employeeIds.remove(1);
		System.out.println(employeeIds.get(1));
		//Add
		employeeIds.add(1,24);
		System.out.println(employeeIds.get(1));
		//
		employeeIds.set(1, 10);
		System.out.println(employeeIds.get(1));
	}

}
