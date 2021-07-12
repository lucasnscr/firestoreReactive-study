package com.lucasnscr.gcp.firestorestudy.entity;

import com.google.cloud.firestore.annotation.DocumentId;

public class PhoneNumber {
	@DocumentId
	private String number;

	public PhoneNumber() {
	}

	public PhoneNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
