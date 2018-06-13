/**
 * 
 */
package com.transcript.model.test;

import com.transcript.model.CognitiveResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
/**
 * @author arunangsu.sahu
 *
 */
public class CognitiveResponseJsonJava {
	
	private static Logger logger = LogManager.getLogger(CognitiveResponseJsonJava.class);

	/**
	 * 
	 */
	public CognitiveResponseJsonJava() {
		//No-Arg
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		String file = "D:\\Jsondet\\Test3.json";
		try {
            // reading json input from the file and mapping to object
            File jsonInputFile = new File(file);
            CognitiveResponse cs = mapper.readValue(jsonInputFile, CognitiveResponse.class);
            logger.debug(cs);
        }catch(IOException ie) {
        	logger.error(ie);
        }


	}

}
