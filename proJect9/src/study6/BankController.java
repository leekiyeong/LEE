package study6;

//사용클래스

public class BankController  {
	
	public static void main(String[] args) {
		
		BankServiceImpl bank = new BankServiceImpl();
		
		bank.moneyInput(5000); //용돈 5000
		System.out.println("현재잔액 : " + bank.getMoney());
		bank.moneyOutput(3000); //군것질 3000
		System.out.println("현재잔액 : " + bank.getMoney());
		bank.moneyBorrow(30000);//3만원 빌림
		bank.moneyPrint();//현재 남은돈 32000
		
	}

}
