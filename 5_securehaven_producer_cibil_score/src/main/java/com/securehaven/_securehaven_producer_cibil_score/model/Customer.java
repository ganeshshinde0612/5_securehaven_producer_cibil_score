package com.securehaven._securehaven_producer_cibil_score.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
private int id;
	
	private long accountNo;
	
	private String accountHolderName;
	
	private String pancard;
	
	private long aadhar;
	
	private long accountBalance;
	
	private String loanStatus;
	
	private int numberOfLoan;
	
	private long currentLoanAmount;
	
	private long previousLoanAmount;

}
