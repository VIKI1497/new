package Array;

public class N6 {
	public static void main(String[] args) {
	String a="whiteBoard";
	char[] b=a.toCharArray();
	String rev=" ";
	for(int i=b.length-1;i>=0;i--) {
	  rev=rev+b[i];
	}
	System.out.println(rev);
}


}
