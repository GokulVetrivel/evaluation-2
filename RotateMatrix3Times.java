package Evaluation2Feb;

import java.util.Arrays;

public class RotateMatrix3Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		rotateClockWise3Times(a);

	}

	private static void rotateClockWise3Times(int[][] a) {
		// TODO Auto-generated method stub
		int[][] rotateArray=new int[a.length][a[0].length];
		for(int rotate=0;rotate<3;rotate++) {//rotate= no.of clock wise ratations
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				rotateArray[i][j]=a[a.length-i-1][j];
			}
		}
		// transpose of matrix
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				a[i][j]=rotateArray[j][i];
			}
		}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				 System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
