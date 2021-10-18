package com.tcs.SpringCoreApp1;

public class Loan { //POJO , beans
	
	Integer loanId;
	String name;
	Double amount;
	
	Customer customer;
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Loan() {}
	public Loan(Integer loanId, String name, Double amount) {
		
		this.loanId = loanId;
		this.name = name;
		this.amount = amount;
	}
	public Integer getLoanId() {
		return loanId;
	}
	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", name=" + name + ", amount=" + amount + "]";
	}
	
	public void start() {
	System.out.println("bean created...");
	}
	public void stop() {
		System.out.println("bean is destroyed");
	}

}
