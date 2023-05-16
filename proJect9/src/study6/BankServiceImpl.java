package study6;

//구현클래스

public class BankServiceImpl implements BankService {
	private int money;
	
	public int getMoney() {
		return money;
	}
	@Override
	public void moneyInput(int money) {
		System.out.println("입금금액 : " + money);
		this.money += money; 
	}

	@Override
	public void moneyOutput(int money) {
		System.out.println("출금금액 : " + money);
		if(this.money<money) {
			System.out.println("잔액부족");
		}else {
			this.money -= money;
		}
	}
		

	@Override
	public void moneyPrint() {
		System.out.println("현재잔액 : " + money);
	}
	
	@Override
	public void moneyBorrow(int borrow) {
		System.out.println("빌린금액 : " + borrow);
		this.money += borrow;
	}

	

}
