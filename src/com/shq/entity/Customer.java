package com.shq.entity;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer customerId;
	private String customerName;
	private String customerPass;
	private String customerIdentity;
	private String customerSex;
	private Integer customerAge;
	private String customerIdcard;
	private String customerEmail;
	private String customerTelephone;
	private String customerAddress;

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** full constructor */
	public Customer(String customerName, String customerPass,
			String customerIdentity, String customerSex, Integer customerAge,
			String customerIdcard, String customerEmail,
			String customerTelephone, String customerAddress) {
		this.customerName = customerName;
		this.customerPass = customerPass;
		this.customerIdentity = customerIdentity;
		this.customerSex = customerSex;
		this.customerAge = customerAge;
		this.customerIdcard = customerIdcard;
		this.customerEmail = customerEmail;
		this.customerTelephone = customerTelephone;
		this.customerAddress = customerAddress;
	}

	// Property accessors

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPass() {
		return this.customerPass;
	}

	public void setCustomerPass(String customerPass) {
		this.customerPass = customerPass;
	}

	public String getCustomerIdentity() {
		return this.customerIdentity;
	}

	public void setCustomerIdentity(String customerIdentity) {
		this.customerIdentity = customerIdentity;
	}

	public String getCustomerSex() {
		return this.customerSex;
	}

	public void setCustomerSex(String customerSex) {
		this.customerSex = customerSex;
	}

	public Integer getCustomerAge() {
		return this.customerAge;
	}

	public void setCustomerAge(Integer customerAge) {
		this.customerAge = customerAge;
	}

	public String getCustomerIdcard() {
		return this.customerIdcard;
	}

	public void setCustomerIdcard(String customerIdcard) {
		this.customerIdcard = customerIdcard;
	}

	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerTelephone() {
		return this.customerTelephone;
	}

	public void setCustomerTelephone(String customerTelephone) {
		this.customerTelephone = customerTelephone;
	}

	public String getCustomerAddress() {
		return this.customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

}