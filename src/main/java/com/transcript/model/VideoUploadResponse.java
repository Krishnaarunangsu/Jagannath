/**
 * 
 */
package com.transcript.model;

import java.io.Serializable;

/**
 * @author arunangsu.sahu
 *
 */
public class VideoUploadResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5495548610464471457L;
	private String accountId;
	private String id;
	private String name;
	private String description;
	private String privacyMode;
	private String userName;
	private String state;
	private String processingProgress;
	private int durationInSeconds;
	private String sthumbnailVideoId;
	/**
	 * 
	 */
	public VideoUploadResponse() {
		
	}
	/**
	 * @param accountId
	 * @param id
	 * @param name
	 * @param description
	 * @param privacyMode
	 * @param userName
	 * @param state
	 * @param processingProgress
	 * @param durationInSeconds
	 * @param sthumbnailVideoId
	 */
	public VideoUploadResponse(String accountId, String id, String name, String description, String privacyMode,
			String userName, String state, String processingProgress, int durationInSeconds, String sthumbnailVideoId) {
		super();
		this.accountId = accountId;
		this.id = id;
		this.name = name;
		this.description = description;
		this.privacyMode = privacyMode;
		this.userName = userName;
		this.state = state;
		this.processingProgress = processingProgress;
		this.durationInSeconds = durationInSeconds;
		this.sthumbnailVideoId = sthumbnailVideoId;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	 * @return the processingProgress
	 */
	public String getProcessingProgress() {
		return processingProgress;
	}
	/**
	 * @param processingProgress the processingProgress to set
	 */
	public void setProcessingProgress(String processingProgress) {
		this.processingProgress = processingProgress;
	}
	/**
	 * @return the durationInSeconds
	 */
	public int getDurationInSeconds() {
		return durationInSeconds;
	}
	/**
	 * @param durationInSeconds the durationInSeconds to set
	 */
	public void setDurationInSeconds(int durationInSeconds) {
		this.durationInSeconds = durationInSeconds;
	}
	/**
	 * @return the sthumbnailVideoId
	 */
	public String getSthumbnailVideoId() {
		return sthumbnailVideoId;
	}
	/**
	 * @param sthumbnailVideoId the sthumbnailVideoId to set
	 */
	public void setSthumbnailVideoId(String sthumbnailVideoId) {
		this.sthumbnailVideoId = sthumbnailVideoId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VideoUploadResponse [accountId=" + accountId + ", id=" + id + ", name=" + name + ", description="
				+ description + ", privacyMode=" + privacyMode + ", userName=" + userName + ", state=" + state
				+ ", processingProgress=" + processingProgress + ", durationInSeconds=" + durationInSeconds
				+ ", sthumbnailVideoId=" + sthumbnailVideoId + "]";
	}
	

}
