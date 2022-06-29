package collection;

import java.util.ArrayList;

public  class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("aravind",101,true,15,45000);
		Student s2=new Student("kamesh",113,true,17,50000);
		Student s3=new Student("pooja",124,false,15,45000);
		Student s4=new Student("manoj",121,true,18,65000);
		Student s5=new Student("haris",100,true,14,37000);
		Student s6=new Student("kavya",102,false,15,48000);
		Student s7=new Student("priya",111,false,16,42000);
		Student s8=new Student("bala",107,true,12,28000);
		Student s9=new Student("kavi",103,false,14,26000);
		Student s10=new Student("ramKumar",102,true,20,57000);
		ArrayList<Student> students=new ArrayList<> ();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.add(s10);
		int max=0;
		int total=0;
		ArrayList<Student> femaleStudents=new ArrayList<> ();
		for(int i=0;i<students.size();i++) {
			System.out.println(students.get(i));
		}
		for(int j=0;j<students.size();j++) {
			total=total+students.get(j).getfees();
		}
		for(Student info: students) {
			if(info.getisMale()==true&&info.getage()>max) {
				max=info.getage();
			}
		}
		for(Student std: students) {
			if(std.getisMale()==false) {
				femaleStudents.add(std);
			}
		}
		System.out.println(max);
		System.out.println("total Fees: "+total);
		femaleStudents.forEach(std-> System.out.println(std));
	}

}
