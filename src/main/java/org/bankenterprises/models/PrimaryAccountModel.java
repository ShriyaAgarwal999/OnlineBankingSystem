package org.bankenterprises.models;


public class PrimaryAccountModel {

	private int primaryId;
	private int primaryBalance;
	public PrimaryAccountModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PrimaryAccountModel( int primaryId, int primaryBalance) {
		super();
	
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

	@Override
	public String toString() {
		return "PrimaryAccountModel [primaryId=" + primaryId + ", primaryBalance=" + primaryBalance + "]";
	}
		
}
