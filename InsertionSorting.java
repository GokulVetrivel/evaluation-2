package Evaluation2Feb;
import java.util.Arrays;

public class InsertionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,4,6,2,1,7};
		sort(a);
	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		int k=0;
		for(int i=0;i<a.length;i++) {
			int min=Integer.MAX_VALUE;
		for(int j=i;j<a.length;j++) {
			//System.out.print(a[j]+" ");
			if(min>a[j]) {
				min=a[j];
				k=j;
			}
			
		}
		a[k]=a[i];
		a[i]=min;
		System.out.println(Arrays.toString(a));
	}
		System.out.println("solution is :"+Arrays.toString(a));
	}
}
