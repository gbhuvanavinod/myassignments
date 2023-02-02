package javaChallenge12;



import java.util.Map;
import java.util.TreeMap;

public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] AL={1,2,2,1,1,3};
     Map<Integer,Integer> occ=new TreeMap<Integer,Integer>();
   
     
        for (int i = 0; i < AL.length-1; i++) {
			if(occ.containsKey(i)) 
			{
				int existingCount = occ.get(i);
				occ.put(i,existingCount+1);
				
	        }
			else {
				occ.put(i,1);
			}
			
		}
        System.out.println(occ);
	}
 
}
