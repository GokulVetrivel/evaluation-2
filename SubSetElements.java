package Evaluation2Feb;
import java.util.*;
public class SubSetElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3};
		subset(a);
	}

	private static void subset(int[] a) {
		// TODO Auto-generated method stub
		List<List<Integer>> lol=new ArrayList();
		backtrack(0,a,a.length,lol,new ArrayList());
		System.out.println(lol);
	}

	private static void backtrack(int i, int[] a, int length, List<List<Integer>> lol, ArrayList arrayList) {
		// TODO Auto-generated method stub
		if(i==length) {
			lol.add(new ArrayList(arrayList));
			return;
		}
		arrayList.add(a[i]);
		//System.out.println(arrayList);
		backtrack(i+1,a,a.length,lol, arrayList);
		arrayList.remove(arrayList.size()-1);
		backtrack(i+1,a,a.length,lol, arrayList);
		
	}

}
