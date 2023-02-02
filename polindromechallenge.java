package week1day2;

public class polindromechallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String S1="A man,a plan,a canal:Panama ";
       S1=S1.replaceAll("[^a-zA-Z0-9]","" );
       
       S1=S1.toLowerCase();
       System.out.println(S1);
       char[] charArray = S1.toCharArray();
       String rev= "";
       for (int i = charArray.length-1; i >=0 ; i--) {
    	   rev=rev+charArray[i];
		
	}
       if(S1.equalsIgnoreCase(rev)) {
    	   System.out.println("It is polindrome");
       }
       else {
    	   System.out.println("not a polindrome");
       }
	}

}
