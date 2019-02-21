package org.bankenterprises.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="userDetails")
public class UserModel {
	
	private int userId;
    private String userFirstName;
    private String userLastName;
    private String userPassword;
    private String userEmail;
    private String userPhone;
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserModel(int userId, String userFirstName, String userLastName, String userPassword, String userEmail,
			String userPhone) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	@Override
	public String toString() {
		return "User [userID=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userPassword=" + userPassword + ", userEmail=" + userEmail + ", userPhone=" + userPhone + "]";
	}

    
}
