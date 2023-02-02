package week1day2;

public class FindRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] nums= {1,2,3,1};
    boolean repeat=true;
    boolean unique=false;
     for (int i = 0; i < nums.length; i++) {
		int count=0;
		for (int j = i+1; j < nums.length; j++) {
			if(nums[i]==nums[j])
				count=count+1;
		}
		
		if(count!=0)
		{
			System.out.println(repeat);
			break;
		}
		else
		{
			
		    System.out.println(unique);
		    break;
	}
	}

}
}