package Oops2;

public class UseGovtSchool {
	public static void main(String[] args) {
		GovtSchool g=new GovtSchool();
		g.name( "ram",32 , "XII", "A", 17);
		System.out.println(g.total(60, 70, 60, 50, 40));
		System.out.println(g.avg(60, 50, 70, 40, 50));
		
	}

}
