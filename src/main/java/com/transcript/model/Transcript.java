/**
 * 
 */
package com.transcript.model;

import java.io.Serializable;

/**
 * @author arunangsu.sahu
 *
 */
public class Transcript implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -354269039775013132L;
	private String id;
	private String text;
	private String language;
	/**
	 * 
	 */
	public Transcript() {
		
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
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transcript [id=" + id + ", text=" + text + ", language=" + language + "]";
	}
	/**
	 * @param id
	 * @param text
	 * @param language
	 */
	public Transcript(String id, String text, String language) {
		super();
		this.id = id;
		this.text = text;
		this.language = language;
	}
	
	

}
