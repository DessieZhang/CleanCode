package com.epam.engx.cleancode.naming.task2;

import java.util.Arrays;

public class User {

	protected boolean isAdmin = false;

	private String dateOfBirth;

	private String name;

	private User[] subordinates;

	private int iR;

	public User(String sName, String dBirth, User[] subordinates) {
		this.dateOfBirth = dBirth;
		this.name = sName;
		this.subordinates = subordinates;
	}

	@Override
	public String toString() {
		return "User [dateOfBirth=" + dateOfBirth + ", name=" + name + ", isAdmin=" + isAdmin + ", subordinates="
				+ Arrays.toString(subordinates) + ", rating=" + iR + "]";
	}

	public void setRating(int rating) {
		this.iR = rating;
	}
}
