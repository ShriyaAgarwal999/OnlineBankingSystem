package org.bankenterprises.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="savingsAccountDetails")
public class SavingsAccountModel {

	private String userEmail;
	private int savingsId;
	private int savingsBalance;
	public SavingsAccountModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SavingsAccountModel(String userEmail, int savingsId, int savingsBalance) {
		super();
		this.userEmail = userEmail;
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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "SavingsAccountModel [userEmail=" + userEmail + ", savingsId=" + savingsId + ", savingsBalance="
				+ savingsBalance + "]";
	}
	
	
	
}
