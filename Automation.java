package abstractionAssignment;

public class Automation implements Testtool,Language {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation am=new Automation();
		am.ruby();
		am.selenium();
		am.java();
		
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium");
	}

	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java language");
	}

}
