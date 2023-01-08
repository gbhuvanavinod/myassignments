package week1.day1;

public class fibonnacci {

	public static void main(String[] args) {
		int firstNum=0;int secondNum=1;int sum=0;
				System.out.print(firstNum+" "+ " "+secondNum);
		for (int i = 1; i < 10; i++) {
			sum=firstNum+secondNum;
			System.out.print(" "+sum);
			
			firstNum=secondNum;
			secondNum=sum;
					}
		


			}
}
