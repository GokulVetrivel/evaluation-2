package Evaluation2Feb;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter list size :");
		int n=scan.nextInt();
		//int[] arr=new int[20];
		//String[] str=new String[20];
		int[] arr= {0,6,0,6,4,0,6,0,6,0,4,3,0,1,5,1,2,4};
		String[] str= {"ab","cd","ef","gh",};
		
//		for(int i=0;i<n;i++) {
//			arr[i]=scan.nextInt();
//			if(i>n/2)
//			str[i]=scan.next();
//			else {
//				scan.next();
//				str[i]="-";
//			}
//		}
		countingSort(arr,str,n);
	}

	private static void countingSort(int[] arr, String[] str, int n) {
		
		String temp="",ans="";
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arr[i]<arr[j]) {
					arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));
		for(int i=0;i<20;i++)
			ans+=str[i];
		
	}

}
//20
//0
//ab
//6
//cd
//0
//ef
//6 gh
//4 ij
//0 ab
//6 cd
//0 ef
//6 gh
//0 ij
//4 that
//3 be
//0 to
//1 be
//5 question
//1 or
//2 not
//4 is
//2 to
//4 the
