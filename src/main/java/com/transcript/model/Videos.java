/**
 * 
 */
package com.transcript.model;

import java.io.Serializable;

/**
 * @author arunangsu.sahu
 *
 */
public class Videos implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8304647385087245904L;
	private String accountId;
	private String id;
	private String state;
	private String privacyMode;
	private String processingStatus;
	private String failureCode;
	private String failureMessage;
	private Insights insights;
	/**
	 * 
	 */
	public Videos() {
		
	}
	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
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
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the privacyMode
	 */
	public String getPrivacyMode() {
		return privacyMode;
	}
	/**
	 * @param privacyMode the privacyMode to set
	 */
	public void setPrivacyMode(String privacyMode) {
		this.privacyMode = privacyMode;
	}
	/**
	 * @return the processingStatus
	 */
	public String getProcessingStatus() {
		return processingStatus;
	}
	/**
	 * @param processingStatus the processingStatus to set
	 */
	public void setProcessingStatus(String processingStatus) {
		this.processingStatus = processingStatus;
	}
	/**
	 * @return the failureCode
	 */
	public String getFailureCode() {
		return failureCode;
	}
	/**
	 * @param failureCode the failureCode to set
	 */
	public void setFailureCode(String failureCode) {
		this.failureCode = failureCode;
	}
	/**
	 * @return the failureMessage
	 */
	public String getFailureMessage() {
		return failureMessage;
	}
	/**
	 * @param failureMessage the failureMessage to set
	 */
	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}
	/**
	 * @return the insights
	 */
	public Insights getInsights() {
		return insights;
	}
	/**
	 * @param insights the insights to set
	 */
	public void setInsights(Insights insights) {
		this.insights = insights;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Videos [accountId=" + accountId + ", id=" + id + ", state=" + state + ", privacyMode=" + privacyMode
				+ ", processingStatus=" + processingStatus + ", failureCode=" + failureCode + ", failureMessage="
				+ failureMessage + ", insights=" + insights + "]";
	}
	/**
	 * @param accountId
	 * @param id
	 * @param state
	 * @param privacyMode
	 * @param processingStatus
	 * @param failureCode
	 * @param failureMessage
	 * @param insights
	 */
	public Videos(String accountId, String id, String state, String privacyMode, String processingStatus,
			String failureCode, String failureMessage, Insights insights) {
		super();
		this.accountId = accountId;
		this.id = id;
		this.state = state;
		this.privacyMode = privacyMode;
		this.processingStatus = processingStatus;
		this.failureCode = failureCode;
		this.failureMessage = failureMessage;
		this.insights = insights;
	}
	
}
