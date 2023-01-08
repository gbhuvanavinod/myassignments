package week1.day1;

public class Isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		int i,j;
		int counter=0;
		for ( i = 1; i <=n; i++) {
			
			for(j=2;j<=i;j++)
			{
				counter=0;
				if(i%j==0)
				{
					counter=counter+1;
				}
					
				
			}
			
			if(counter==2)
			{
				System.out.println(+i);
			}
			
		}
	}

}
