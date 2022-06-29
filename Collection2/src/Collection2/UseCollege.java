package Collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCollege {
	public static void main(String[] args) {
		College college1=new College("joseph","C",58000,3112);
		College college2=new College("loyalo","B",72000,4213);
		College college3=new College("vels","B",58000,3118);
		College college4=new College("texas","A",90000,3261);
		College college5=new College("AnnaUniversity","A",84000,1122);
		College college6=new College("panimalar","C",75000,3462);
		ArrayList<College> collegeDetails=new ArrayList<> ();
		collegeDetails.add(college1);
		collegeDetails.add(college2);
		collegeDetails.add(college3);
		collegeDetails.add(college4);
		collegeDetails.add(college5);
		collegeDetails.add(college6);
		List<College> gradeA=collegeDetails.stream().filter(x-> x.getGrade().equals("A")).collect(Collectors.toList());
		List<College> gradeB=collegeDetails.stream().filter(x-> x.getGrade().equals("B")).collect(Collectors.toList());
		List<College> gradeC=collegeDetails.stream().filter(x-> x.getGrade().equals("C")).collect(Collectors.toList());
		System.out.println(gradeA);
		System.out.println(gradeB);
		System.out.println(gradeC);
		
		}

}
