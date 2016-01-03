package org.wso2.brs.sample;

public class LoanRequest {

	private String applicantFName;	//First name of the applicant
	private String applicantLName;	//Last name of the applicant
	private int applicantAge;	//Applicants age
	private Double applicantSalary;	//Applicants salary
	
	private Double loanAmount;	//Requested loan amount
	private Float loanInterest;	//Requested interest
	
	//Getters
	public String getApplicantFName () {
		return applicantFName;
	}
	
	public String getApplicantLName () {
		return applicantLName;
	}
	
	public int getApplicantAge () {
		return applicantAge;
	}
	
	public Double getApplicantSalary () {
		return applicantSalary;
	}
	
	public Double getLoanAmount () {
		return loanAmount;
	}
	
	public Float getLoanInterest () {
		return loanInterest;
	}
	
	//Setters
	public void setApplicantFName (String applicantFName) {
		this.applicantFName = applicantFName;		
	}
	
	public void setApplicantLName (String applicantLName) {
		this.applicantLName = applicantLName;
	}
	
	public void setApplicantAge (int applicantAge) {
		this.applicantAge = applicantAge;
	}
	
	public void setApplicantSalary (Double applicantSalary) {
		this.applicantSalary = applicantSalary;
	}
	
	public void setLoanAmount (Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public void setLoanInterest (Float loanInterest) {
		this.loanInterest = loanInterest;
	}
	
}
