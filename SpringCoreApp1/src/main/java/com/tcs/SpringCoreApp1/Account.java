package com.tcs.SpringCoreApp1;

public class Account {
	
	Integer accno;
	String branch;
	
	public Account() {
		 accno=2345;
		 branch="Hyderabad";
		
	}

	public Account(Integer accno, String branch) {
		
		this.accno = accno;
		this.branch = branch;
	}

	
}
