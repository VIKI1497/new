package DEMO;

public class R2 {
	public static void main(String[] args) {
		String[] a={"anbu","arivu","ravi","sugumar"};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].startsWith("a")) {
				count=count+a[i].length();
			}
		}
		System.out.println(count);
		
	}

}
