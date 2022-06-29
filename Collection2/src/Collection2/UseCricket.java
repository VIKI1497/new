package Collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCricket {
	public static void main(String[] args) {
		Cricket p1=new Cricket("sachin",48,true,200,0);
		Cricket p2=new Cricket("virat",33,true,150,0);
		Cricket p3=new Cricket("Bumrah",30,false,83,5);
		Cricket p4=new Cricket("zaheer",42,false,22,2);
		Cricket p5=new Cricket("Ashish",45,false,6,0);
		Cricket p6=new Cricket("bhuvaneshwar",34,false,15,2);
		ArrayList<Cricket> playerDetails=new ArrayList<> ();
		playerDetails.add(p1);
		playerDetails.add(p2);
		playerDetails.add(p3);
		playerDetails.add(p4);
		playerDetails.add(p5);
		playerDetails.add(p6);
		List<Cricket> player=playerDetails.stream().filter(x->x.getIsBatsman()==false).collect(Collectors.toList());
		player.stream().map(x-> x.getPlayerName().charAt(x.getPlayerName().length()-1)).forEach(y->System.out.println(y));;
		System.out.println(player);
		List<Integer> pS=player.stream().map(x->x.getPlayerScore()).collect(Collectors.toList());
		System.out.println(pS);
		int max=0;
		String temp="";
		for(Cricket i:player) {
			if(i.getPlayerScore()>max) {
			max=i.getPlayerScore();
			temp=temp+i.getPlayerName();
			}
		}
		System.out.println(max);
		System.out.println(temp);
		List<Cricket> bat=playerDetails.stream().filter(x->x.getIsBatsman()==true).collect(Collectors.toList());
		int max1=0;
		String temp1="";
		for(Cricket j:bat) {
			if(j.getPlayerScore()>max1) {
				max1=j.getPlayerScore();
				temp1=temp1+j.getPlayerName();
			}
		}
		System.out.println(temp1+" has highest score "+max1);
		playerDetails.stream().filter(x->(x.getAge()<40)&&(x.getPlayerScore()>50)).map(y-> y.getPlayerName().substring(1, y.getPlayerName().length()-1)).forEach(z->System.out.println(z));
		List<Cricket> nam=playerDetails.stream().filter(x->x.getPlayerWickets()==0).collect(Collectors.toList());
		String temp3="";
		for(Cricket t:nam) {
			temp3=temp3+t.getPlayerName();
		}
		System.out.println(temp3);
		playerDetails.stream().filter(x-> x.getPlayerName().contains("a")&&x.getIsBatsman()==true).forEach(y-> System.out.println(y.getAge()));
		int max2=0;
		String a="";
		for(Cricket k:player) {
			if(k.getPlayerName().length()>max2) {
				a=k.getPlayerName();
			}
		}
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
			System.out.println(b);
		}
		System.out.println(b);
	}
	}

