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
public class Insights implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2512134311084774966L;
	private String version;
	private String sourcelanguage;
	private String language;
	private List<Transcript> transcript;
	

	/**
	 * 
	 */
	public Insights() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}


	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}


	/**
	 * @return the sourcelanguage
	 */
	public String getSourcelanguage() {
		return sourcelanguage;
	}


	/**
	 * @param sourcelanguage the sourcelanguage to set
	 */
	public void setSourcelanguage(String sourcelanguage) {
		this.sourcelanguage = sourcelanguage;
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


	/**
	 * @return the transcript
	 */
	public List<Transcript> getTranscript() {
		return transcript;
	}


	/**
	 * @param transcript the transcript to set
	 */
	public void setTranscript(List<Transcript> transcript) {
		this.transcript = transcript;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Insights [version=" + version + ", sourcelanguage=" + sourcelanguage + ", language=" + language
				+ ", transcript=" + transcript + "]";
	}


	/**
	 * @param version
	 * @param sourcelanguage
	 * @param language
	 * @param transcript
	 */
	public Insights(String version, String sourcelanguage, String language, List<Transcript> transcript) {
		super();
		this.version = version;
		this.sourcelanguage = sourcelanguage;
		this.language = language;
		this.transcript = transcript;
	}
	
}
