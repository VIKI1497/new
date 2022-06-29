package Collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop("Dell","i5",45000);
		Laptop l2=new Laptop("lenovo","i7",78000);
		Laptop l3=new Laptop("acer","i3",35000);
		Laptop l4=new Laptop("hp","i5",58000);
		ArrayList<Laptop> laptopDetails=new ArrayList<> ();
		laptopDetails.add(l1);
		laptopDetails.add(l2);
		laptopDetails.add(l3);
		laptopDetails.add(l4);
//		laptopDetails.stream().map(x->x.getPrice()+((x.getPrice()*18)/100)).forEach(y-> System.out.println(y));
//		laptopDetails.stream().filter(p->p.getProccessor().equals("i5")).forEach(q->System.out.println(q.getBrand().toUpperCase()));
//		long a=laptopDetails.stream().count();
//		System.out.println(a);
//		List<Integer> lapPrice=laptopDetails.stream().map(x->x.getPrice()+((x.getPrice()*18)/100)).collect(Collectors.toList());
//		System.out.println(lapPrice);
//		for(Integer l:lapPrice) {
//			System.out.println(l);
//		}
//		lapPrice.forEach(v->System.out.println(v));
//		List<Laptop> lapt=laptopDetails.stream().filter(x->x.getProccessor().equals("i5")).collect(Collectors.toList());
//		System.out.println(lapt);
//		lapt.forEach(y-> System.out.println(y));
//		List<Boolean> lap=laptopDetails.stream().map(y->y.getBrand().startsWith("a")).collect(Collectors.toList());
//		System.out.println(lap);
//		List<String> laps=laptopDetails.stream().filter(x->x.getPrice()<=50000).map(y->y.getBrand().toUpperCase()).collect(Collectors.toList());
//		System.out.println(laps);
		List<String> laps=laptopDetails.stream().filter(x->x.getBrand().equals("Dell")).map(y->y.getBrand().toUpperCase()).collect(Collectors.toList());
		laps.forEach(x->System.out.println(x));


}
}
