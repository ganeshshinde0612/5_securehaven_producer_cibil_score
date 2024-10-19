package com.securehaven._securehaven_producer_cibil_score.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ICICI {

	private int id;

	private String bankName;
	
	private String ifscCode;
	
	private String email;
	
	private long mobileNo;
	
	private Customer customer;
}
