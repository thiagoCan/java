package Exer;

public class Conta {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Conta() {
		
	}
	
	public Conta(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalanca(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		if(withdrawLimit < amount) {
			throw new IllegalArgumentException("Withdraw error: The amount exceeds withdraw limit");
		}
		if(balance <= 0 || balance < amount) {
			throw new IllegalArgumentException("Withdraw error: Not enough balance");
		}
		
		balance -= amount;
	}

	public String toString() {
		return "New balance: "
				+ String.format("%.2f", balance);
	}

	
}
