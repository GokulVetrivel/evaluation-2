//10....


package Evaluation2Feb;
import java.util.*;
public class PairSumDivisibleByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,2,3,4,5,6};
		int k=5;
		pairDivisibleByK(ar,k);
	}

	private static void pairDivisibleByK(int[] ar, int k) {
		
		int count=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if((ar[i]+ar[j])%k==0) {
					List<Integer> list=new ArrayList();
					list.add(ar[i]);
					list.add(ar[j]);
					count++;
					System.out.println(list);
				}
			
			}
		}
		System.out.println("no.of.pairs :"+count);
		
	}
	

}
