package org.bankenterprises.models;

public class TransactionDetailsModel {
	
	private String userEmail;
	private String accountType;
	private int transactionId;
	private String transactionType;
	private String transactionName;
	private String transactionDate;
	private String transactionDescription;
	private String transactionLocation;
	
	public TransactionDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionDetailsModel(String userEmail, String accountType, int transactionId, String transactionType,
			String transactionName, String transactionDate, String transactionDescription, String transactionLocation) {
		super();
		this.userEmail = userEmail;
		this.accountType = accountType;
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.transactionName = transactionName;
		this.transactionDate = transactionDate;
		this.transactionDescription = transactionDescription;
		this.transactionLocation = transactionLocation;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionName() {
		return transactionName;
	}

	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public String getTransactionLocation() {
		return transactionLocation;
	}

	public void setTransactionLocation(String transactionLocation) {
		this.transactionLocation = transactionLocation;
	}
	
	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "TransactionDetailsModel [userEmail=" + userEmail + ", accountType=" + accountType + ", transactionId="
				+ transactionId + ", transactionType=" + transactionType + ", transactionName=" + transactionName
				+ ", transactionDate=" + transactionDate + ", transactionDescription=" + transactionDescription
				+ ", transactionLocation=" + transactionLocation + "]";
	}
	
}
