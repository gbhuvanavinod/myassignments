package week1day2;

public class FindMajarityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] Array1= {1,2,1,3,1,4,2,3};
        for (int i = 0; i < Array1.length; i++) {
			int count=0;
			for (int j = i+1; j < Array1.length; j++) {
				if(Array1[i]==Array1[j])
				{
					count=count+1;
				}
				
				if(count>=2)
				{
					System.out.println(Array1[i]);
					break;
				}
			}
		}
	}

}
