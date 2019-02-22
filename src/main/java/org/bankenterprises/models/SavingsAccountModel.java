package org.bankenterprises.models;

public class SavingsAccountModel {

	private int savingsId;
	private int savingsBalance;
	
	public SavingsAccountModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SavingsAccountModel(int savingsId, int savingsBalance) {
		super();

		this.savingsId = savingsId;
		this.savingsBalance = savingsBalance;
	}

	public int getSavingsId() {
		return savingsId;
	}
	public void setSavingsId(int savingsId) {
		this.savingsId = savingsId;
	}
	public int getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(int savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	@Override
	public String toString() {
		return "SavingsAccountModel [savingsId=" + savingsId + ", savingsBalance=" + savingsBalance + "]";
	}


}
