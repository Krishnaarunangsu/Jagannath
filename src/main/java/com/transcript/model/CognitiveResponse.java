/**
 * 
 */
package com.transcript.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author arunangsu.sahu
 *
 */
public class CognitiveResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5036506816434064961L;
	private String accountId;
	private String id;
	private String name;
	private String description;
	private String userName;
	private String state;
	private List<Videos> videos;
	/**
	 * 
	 */
	public CognitiveResponse() {
		
	}
	/**
	 * @param accountId
	 * @param id
	 * @param name
	 * @param description
	 * @param userName
	 * @param state
	 * @param videos
	 */
	public CognitiveResponse(String accountId, String id, String name, String description, String userName,
			String state, List<Videos> videos) {
		super();
		this.accountId = accountId;
		this.id = id;
		this.name = name;
		this.description = description;
		this.userName = userName;
		this.state = state;
		this.videos = videos;
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
	 * @return the videos
	 */
	public List<Videos> getVideos() {
		return videos;
	}
	/**
	 * @param videos the videos to set
	 */
	public void setVideos(List<Videos> videos) {
		this.videos = videos;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CognitiveResponse [accountId=" + accountId + ", id=" + id + ", name=" + name + ", description="
				+ description + ", userName=" + userName + ", state=" + state + ", videos=" + videos + "]";
	}
	
	
}
