package Evaluation2Feb;

import java.util.Arrays;

public class TwoFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cost= {1,3,4,5,6};
		int money=6;
		flavours(cost,money);
	}

	private static void flavours(int[] cost, int money) {
		// TODO Auto-generated method stub
		int[] ans=new int[2];
		for(int i=0;i<cost.length;i++) {
			for(int j=i+1;j<cost.length;j++) {
				if(cost[i]+cost[j]==money) {
					// adding 1 indexed array positions of flavours
					ans[0]=i+1;
					ans[1]=j+1;
				}
			}
		}
		System.out.println("sleted two flavours :"+Arrays.toString(ans));
	}

}
