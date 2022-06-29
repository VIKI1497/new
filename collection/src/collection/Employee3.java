package collection;

import java.util.ArrayList;

public class Employee3 {
	public static void main(String[] args) {
		ArrayList<Integer> employeeIds=new ArrayList<> ();
		employeeIds.add(15);
		employeeIds.add(16);
		employeeIds.add(17);
		employeeIds.add(20);
		employeeIds.add(25);
		employeeIds.forEach(emp->System.out.println(emp));
	}

}
