/**
 * 
 */
package com.transcript.model.test;

import com.transcript.model.VideoUploadResponse;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author arunangsu.sahu
 *
 */
public class VideoUploadResponseJsonJava {
	private static Logger logger = LogManager.getLogger(VideoUploadResponseJsonJava.class);

	/**
	 * 
	 */
	public VideoUploadResponseJsonJava() {
		// No-Arg
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		String file = "D:\\Jsondet\\Test4.json";
		try {
            // reading json input from the file and mapping to object
            File jsonInputFile = new File(file);
            VideoUploadResponse vs = mapper.readValue(jsonInputFile, VideoUploadResponse.class);
            logger.debug(vs.getId());
        }catch(IOException ie) {
        	logger.error(ie);;
        }

	}

}
