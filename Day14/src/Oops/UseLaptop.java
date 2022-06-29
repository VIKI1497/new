package Oops;

public class UseLaptop {
	public static void main(String[]args) {
		Processor p=new Processor();
		p.brand="Amd";
		p.speed="4GHz";
		p.chip="microprocessor";
		//
		Laptop l=new Laptop();
		l.brand="hp";
		l.price=48000;
		l.color="silver";
		l.processor=p;
		//
		System.out.println(l.brand+", "+l.price+", "+l.color+", "+l.processor.brand+", "+l.processor.speed+", "+l.processor.chip);
	}

}
