package org.bankenterprises.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="primaryAccountDetails")
public class PrimaryAccountModel {

	private String userEmail;
	private int primaryId;
	private int primaryBalance;
	public PrimaryAccountModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PrimaryAccountModel(String userEmail, int primaryId, int primaryBalance) {
		super();
		this.userEmail = userEmail;
		this.primaryId = primaryId;
		this.primaryBalance = primaryBalance;
	}

	public int getPrimaryId() {
		return primaryId;
	}
	public void setPrimaryId(int primaryId) {
		this.primaryId = primaryId;
	}
	public int getPrimaryBalance() {
		return primaryBalance;
	}
	public void setPrimaryBalance(int primaryBalance) {
		this.primaryBalance = primaryBalance;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "PrimaryAccountModel [userEmail=" + userEmail + ", primaryId=" + primaryId + ", primaryBalance="
				+ primaryBalance + "]";
	}
		
}
