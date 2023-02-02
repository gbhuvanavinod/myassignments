package week1day2;


public class ArrayFindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] array1= {2,5,2,7,9,7,9};
     int length=array1.length;
     for (int i = 0; i <=length-1; i++) {
    	 for (int j = i+1; j <= length-1; j++) {
    		 if(array1[i]==array1[j])
    		 {
    			 System.out.println(array1[i]);
    			 break;
    		 }
			
		}
		
	}
      
	}

}
