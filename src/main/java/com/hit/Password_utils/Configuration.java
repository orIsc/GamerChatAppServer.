package com.hit.Password_utils;

public class Configuration {

    private int length;
    private boolean upCase;
    private boolean lowCase;
    private boolean speChar;
    private boolean digits;
    private int loginAttempts;
	
	public Configuration() {

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isUpCase() {
		return upCase;
	}

	public void setUpCase(boolean upCase) {
		this.upCase = upCase;
	}

	public boolean isLowCase() {
		return lowCase;
	}

	public void setLowCase(boolean lowCase) {
		this.lowCase = lowCase;
	}

	public boolean isSpeChar() {
		return speChar;
	}

	public void setSpeChar(boolean speChar) {
		this.speChar = speChar;
	}

	public boolean isDigits() {
		return digits;
	}

	public void setDigits(boolean digits) {
		this.digits = digits;
	}

	public int getLoginAttempts() {
		return loginAttempts;
	}

	public void setLoginAttempts(int loginAttempts) {
		this.loginAttempts = loginAttempts;
	}

	@Override
	public String toString() {
		return "Configuration [length=" + length + ", upCase=" + upCase + ", lowCase=" + lowCase + ", speChar="
				+ speChar + ", digits=" + digits + ", loginAttempts=" + loginAttempts + "]";
	}
	
}
