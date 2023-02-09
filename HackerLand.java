package Evaluation2Feb;

import java.util.Arrays;

public class HackerLand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] expenditure= {2,3,4,2,3,6,8,4,5};
		int n=9,d=5;
		System.out.println(NoOfClientNotifiactions(expenditure,n,d));
	}

	private static int NoOfClientNotifiactions(int[] expenditure, int n, int d) {
		// TODO Auto-generated method stub
		if(n<=d) return 0;
		int[] trail=new int[5];
		int median,count=0;
		for(int i=0;i<n-d;i++) {
			trail=Arrays.copyOfRange(expenditure, i,i+d );
//			for(int j=0;j<d;j++)
//				trail[j]=expenditure[d-1-j] ;
//			System.out.println("trail val "+Arrays.toString(trail));
			
		Arrays.sort(trail);
//		System.out.println("trail val "+Arrays.toString(trail));
		if(trail.length%2==0) {
		 median=trail[trail.length/2]+trail[(trail.length/2)+1];
		}
		else
			median=2*trail[trail.length/2];
		
		
		int t=expenditure[d+i];
//		System.out.println(" me"+ median);
//		System.out.println(t);
		if(t>=median) count++;
		}
//		System.out.println(count);
		return count;
	}

}
