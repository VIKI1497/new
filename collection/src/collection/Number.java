package collection;

import java.util.ArrayList;

public class Number {
	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		num.add(16);
		num.add(17);
		num.add(18);
		num.add(19);
		num.add(20);
		ArrayList<Integer> num1=new ArrayList<>();
		ArrayList<Integer> num2=new ArrayList<>();
		ArrayList<Integer> num3=new ArrayList<>();
		ArrayList<Integer> num4=new ArrayList<>();
		for(Integer a:num) {
			if(a>=1&&a<=5) {
				num1.add(a);
			}
		}
		for(Integer b:num) {
			if(b>=6&&b<=10) {
				num2.add(b);
			}
		}
		for(Integer c:num) {
			if(c>10&&c<=15) {
				num3.add(c);
			}
		}
		for(Integer d:num) {
			if(d>15&&d<=20) {
				num4.add(d);
			}
		}
		for(Integer x:num3) {
			System.out.println(x);
		}
	}
}
