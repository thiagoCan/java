package aula81;

public class Conta {
	private String number;
	private String holder;
	private double balance;
	
	

	public Conta(String number, String holder, double inicialDeposit) {
		this.number = number;
		this.holder = holder;
		Deposit(inicialDeposit);
	}
	
	public Conta(String number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public void Deposit(double inicialDeposit) {
		balance += inicialDeposit;
	}
	
	public void withDrawal(double saque) {
		balance -= saque + 5;
	}
	public String toString() {
		return "número da conta: "
			   + number
			   + "\ntitular: "
			   + holder
			   + "\nsaldo: "
			   + String.format("%.2f", balance);
				
	}
}
