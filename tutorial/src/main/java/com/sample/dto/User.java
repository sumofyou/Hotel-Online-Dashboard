package com.sample.dto;


public class User {

	/**
	 * id.
	 */
	private String id;

	/**
	 * username.
	 */
	private String username;

	/**
	 * firstName.
	 */
	private String firstName;

	/**
	 * lastName.
	 */
	private String lastName;

	/**
	 * userStatus.
	 */
	private String userStatus;

	/**
	 * mailId.
	 */
	private String mailId;

	/**
	 * password.
	 */
	private String password;

	/**
	 * reqNewPwd.
	 */
	private Boolean reqNewPwd = Boolean.FALSE;


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the userStatus
	 */
	public String getUserStatus() {
		return userStatus;
	}

	/**
	 * @param userStatus the userStatus to set
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	/**
	 * @return the mailId
	 */
	public String getMailId() {
		return mailId;
	}

	/**
	 * @param mailId the mailId to set
	 */
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the reqNewPwd
	 */
	public Boolean getReqNewPwd() {
		return reqNewPwd;
	}

	/**
	 * @param reqNewPwd the reqNewPwd to set
	 */
	public void setReqNewPwd(Boolean reqNewPwd) {
		this.reqNewPwd = reqNewPwd;
	}

}
