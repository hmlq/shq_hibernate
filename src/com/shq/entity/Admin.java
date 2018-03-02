package com.shq.entity;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	private Integer adminId;
	private String adminName;
	private String adminPass;
	private String adminIdentity;
	private String adminSex;
	private Integer adminAge;
	private String adminIdcard;
	private String adminEmail;
	private String adminTelephone;
	private String adminAddress;

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** full constructor */
	public Admin(String adminName, String adminPass, String adminIdentity,
			String adminSex, Integer adminAge, String adminIdcard,
			String adminEmail, String adminTelephone, String adminAddress) {
		this.adminName = adminName;
		this.adminPass = adminPass;
		this.adminIdentity = adminIdentity;
		this.adminSex = adminSex;
		this.adminAge = adminAge;
		this.adminIdcard = adminIdcard;
		this.adminEmail = adminEmail;
		this.adminTelephone = adminTelephone;
		this.adminAddress = adminAddress;
	}

	// Property accessors

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPass() {
		return this.adminPass;
	}

	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}

	public String getAdminIdentity() {
		return this.adminIdentity;
	}

	public void setAdminIdentity(String adminIdentity) {
		this.adminIdentity = adminIdentity;
	}

	public String getAdminSex() {
		return this.adminSex;
	}

	public void setAdminSex(String adminSex) {
		this.adminSex = adminSex;
	}

	public Integer getAdminAge() {
		return this.adminAge;
	}

	public void setAdminAge(Integer adminAge) {
		this.adminAge = adminAge;
	}

	public String getAdminIdcard() {
		return this.adminIdcard;
	}

	public void setAdminIdcard(String adminIdcard) {
		this.adminIdcard = adminIdcard;
	}

	public String getAdminEmail() {
		return this.adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminTelephone() {
		return this.adminTelephone;
	}

	public void setAdminTelephone(String adminTelephone) {
		this.adminTelephone = adminTelephone;
	}

	public String getAdminAddress() {
		return this.adminAddress;
	}

	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}

}