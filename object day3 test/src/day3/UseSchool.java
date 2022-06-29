package day3;

public class UseSchool {
	public static void main(String[]args) {
		//Student1
		School S1=new School();
		S1.studentName="Siva";
		S1.id=234;
		S1.age=14;
		S1.studentClass="IX";
		S1.attendancePercent=75;
		S1.noOfDaysPresentInSchool=(240*S1.attendancePercent)/100;
		System.out.println("Name:"+S1.studentName);
		System.out.println("No Of Days Present In School:"+S1.noOfDaysPresentInSchool);
		System.out.println("");
		
		//Student2
		School S2=new School();
		S2.studentName="Mani";
		S2.id=236;
		S2.age=15;
		S2.studentClass="X";
		S2.attendancePercent=80;
		S2.noOfDaysPresentInSchool=(240*S2.attendancePercent)/100;
		System.out.println("Name:"+S2.studentName);
		System.out.println("No Of Days Present In School:"+S2.noOfDaysPresentInSchool);
		System.out.println("");
		
		//Student3
		School S3=new School();
		S3.studentName="Valli";
		S3.id=237;
		S3.age=13;
		S3.studentClass="VIII";
		S3.attendancePercent=90;
		S3.noOfDaysPresentInSchool=(240*S3.attendancePercent)/100;
		System.out.println("Name:"+S3.studentName);
		System.out.println("No Of Days Present In School:"+S3.noOfDaysPresentInSchool);
	
	}

}
