package New;

import java.util.Arrays;

public class Mini {
	public static int getSmallest(int[]a) {
		Arrays.sort(a);
		return a[0];
	}
	public static void main(String[] args) {
		int[] a= {26,31,21,43,37};
		System.out.println("smallest:"+getSmallest(a));
	}

}
