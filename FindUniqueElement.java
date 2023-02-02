package week1day2;

public class FindUniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int Array2[]= {1,2,3,1,2,4};
      for (int i = 0; i < Array2.length; i++)
      {
    	  int count=0;
    	  for (int j = i+1; j < Array2.length; j++)
    	  {
			if(Array2[i]==Array2[j])
			{
				count=count+1;
			}		
    	  }
    	   
    	  if(count==0)
    	  {
				System.out.println(Array2[i]);
			break;
    	  }	
		}
		
	}
	}


