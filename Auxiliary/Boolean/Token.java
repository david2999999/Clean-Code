package com.a;

import java.util.Date;

public class Token {
	private static final String SECRET = "SECRET"; 
	private String encryptedString;
	private Date expirationDate;
	
	public boolean isValid() {
		return encryptedString.equals(SECRET);
	}
	
	public boolean hasExpired() {
		Date currentTime = new Date();
		return currentTime.after(expirationDate);
	}
	
	public boolean canBeValidated() {
		if (encryptedString == null) return false;
		
		return true;
	}
}


