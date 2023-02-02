package week1day2;

public class JavaProb8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] nums= {1,2,3,1,2,3};
     int k=2;
     for (int i = 0; i < nums.length; i++) {
    	 for (int j = i+1; j < nums.length; j++) {
		   if(nums[i]==nums[j]&&(i-j)<=k) 
		   {
			   System.out.println("true");
			   break;
		   }	
		}
		
	}
	}

}
