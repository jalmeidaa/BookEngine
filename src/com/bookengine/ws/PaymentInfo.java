package com.bookengine.ws;

public class PaymentInfo {

	private String cardType;
	private String cardNumber;
	
	public PaymentInfo(){
		cardType = "Visa";
		cardNumber = "0000-1234-0342-1453";
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	};

}
