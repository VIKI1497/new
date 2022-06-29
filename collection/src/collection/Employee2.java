package collection;

import java.util.ArrayList;

public class Employee2 {
	public static void main(String[] args) {
		ArrayList<Integer> employeeIds=new ArrayList<> ();
		employeeIds.add(15);
		employeeIds.add(16);
		employeeIds.add(17);
		employeeIds.add(20);
		employeeIds.add(25);
		int max=0;
		for(Integer empId:employeeIds) {
			if(empId>max) {
				max=empId;
			}
		}
		System.out.println(max);
	}

}
