package org.bankenterprises.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="recipientDetails")
public class RecipientModel {
	
	private String userEmail;
	private int recipientId;
	private String recipientName;
	private String recipientEmail;
	private String recipientPhone;
	private String recipientAccountNo;
	public RecipientModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public RecipientModel(String userEmail, int recipientId, String recipientName, String recipientEmail,
			String recipientPhone, String recipientAccountNo) {
		super();
		this.userEmail = userEmail;
		this.recipientId = recipientId;
		this.recipientName = recipientName;
		this.recipientEmail = recipientEmail;
		this.recipientPhone = recipientPhone;
		this.recipientAccountNo = recipientAccountNo;
	}


	public int getRecipientId() {
		return recipientId;
	}
	public void setRecipientId(int recipientId) {
		this.recipientId = recipientId;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getRecipientEmail() {
		return recipientEmail;
	}
	public void setRecipientEmail(String recipientEmail) {
		this.recipientEmail = recipientEmail;
	}
	public String getRecipientPhone() {
		return recipientPhone;
	}
	public void setRecipientPhone(String recipientPhone) {
		this.recipientPhone = recipientPhone;
	}
	public String getRecipientAccountNo() {
		return recipientAccountNo;
	}
	public void setRecipientAccountNo(String recipientAccountNo) {
		this.recipientAccountNo = recipientAccountNo;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	@Override
	public String toString() {
		return "RecipientModel [userEmail=" + userEmail + ", recipientId=" + recipientId + ", recipientName="
				+ recipientName + ", recipientEmail=" + recipientEmail + ", recipientPhone=" + recipientPhone
				+ ", recipientAccountNo=" + recipientAccountNo + "]";
	}
	
	

}
