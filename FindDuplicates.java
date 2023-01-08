package week1.day2;

import java.util.Arrays;

public class FindDuplicates {
	public static void main(String[] args) {
		int[] nums = {2,5,7,7,5,9,2,3};
		
		 int length =nums.length;
		for(int i=0;i<=length;i++) {
			
			for(int j=i+1;j<=length;j++) {
				if(nums[i]==nums[j])
				{
					System.out.println(nums[i]);
					break;
				}
			}
		}
		
		//Arrays.sort(nums);
		
	}

	

	
}
