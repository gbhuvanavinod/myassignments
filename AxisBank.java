package overrideAssigment;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Axis bank deposit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank ab=new AxisBank();
		ab.deposit();
		ab.saving();
		ab.fixed();
		BankInfo bi=new BankInfo();
		bi.deposit();
	}

}
