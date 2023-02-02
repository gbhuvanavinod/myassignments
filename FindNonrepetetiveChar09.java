package Week2Day2Assignments;

public class FindNonrepetetiveChar09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String S="leetcode";
       
      char[] charArray = S.toCharArray();
      
      for (int i = 0; i < charArray.length; i++) {
    	  int count=0;
    	  for (int j = i; j < charArray.length; j++) {
			if((charArray[i]!=charArray[j]) ){
				 count=0;
			
				
			}
			else {
				count=count+1;
			}
    	  }
    	  if(count==0) {
  			//System.out.println(charArray[i]);
  			 
  			System.out.println(S.charAt(i));
  		}
  	
		
	}
      
	}

}
