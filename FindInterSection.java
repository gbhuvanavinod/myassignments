package week1day2;

public class FindInterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] Array1= {2,3,4,7,8,9};
       int[] Array2= {3,7,4,1,5,6};
       //intersection
       for (int i = 0; i < Array2.length; i++) {
    	   
    	   for (int j = 0; j < Array2.length; j++) {
			if(Array1[i]==Array2[j])
               System.out.println(Array1[i]);
    		 
				
		}
		
	}
       //UnionAll
       for (int i = 0; i < Array2.length; i++) {
    	    System.out.print(Array1[i]+" ");
		   System.out.print(Array2[i]+" "); 
			
       }
       
	}

}
