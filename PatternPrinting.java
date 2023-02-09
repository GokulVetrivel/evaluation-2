package Evaluation2Feb;


public class PatternPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		print(n);
	}

	private static void print(int n) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || i==n || j==n || i==3 &&(j>=3 && j<=n-2))
					System.out.print(1+" ");
				
				else {
					System.out.print(0+" ");;
				}
				
			}
			System.out.println();
		}
		
//		int[][] a=new int[n][n];
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if((i==0 || i==n-1 || j==0 || j==n-1) && a[i][j]==0)
//					a[i][j]=1;
//				if((i==2 && j>=2 && j<=4) || (j==4 && i>=2 && i<=4))
//					a[i][j]=1;
//			}
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(a[i][j]+ " ");
//			}
//			System.out.println();
//		}
		
	}

}
