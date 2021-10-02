package Backtracking;

public class Coin_denominaton {
	public static void main(String[] args) {
		int[]arr= {2,3,5,6};
		coin(10, arr, "");
		
	}
	public static void coin(int amount,int[] arr,String ans) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		if(amount<0)
		{
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
		coin(amount-arr[i], arr,ans+arr[i]);
		
	}}

}
