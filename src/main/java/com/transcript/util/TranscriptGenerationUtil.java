/**
 * 
 */
package com.transcript.util;

import org.apache.commons.collections4.CollectionUtils;

import com.transcript.model.CognitiveResponse;
import com.transcript.model.Insights;
import com.transcript.model.Transcript;
import com.transcript.model.Videos;

import java.util.List;

/**
 * @author arunangsu.sahu
 *
 */
public class TranscriptGenerationUtil {

	/**
	 * 
	 */
	private TranscriptGenerationUtil() {
		// No-Argument Constructor
	}


	/**get the Array  or list of Transcript from the Videos ->Video ->Insight ->Transcripts -> Transcript
	 * @param insights
	 * @return transcriptBuilder
	 */
	public static String getTranscriptsFromInsights(Insights insights) {
		StringBuilder transcriptBuilder = new StringBuilder();
		List<Transcript> transcriptList = null;
		if (null != insights) {
			transcriptList = insights.getTranscript();
		}
		// null check required
		if (CollectionUtils.isNotEmpty(transcriptList)) {
			for (Transcript transcript : transcriptList) {
				transcriptBuilder.append(transcript.getText());
			}
		}
		return transcriptBuilder.toString();

	}

	/** Read all the parts of the Video Videos ->Video ->Insight ->Transcripts -> Transcript
	 * @param cognitiveResponse
	 * @return transcriptBuilder
	 */
	public static String getTranscriptsDetailsFromVideos(CognitiveResponse cognitiveResponse) {
		StringBuilder transcriptBuilder = new StringBuilder();
		List<Videos> videoList = null;
		if (null != cognitiveResponse) {
			videoList = cognitiveResponse.getVideos();
		}

		// null check required
		if (CollectionUtils.isNotEmpty(videoList)) {
			for (Videos video : videoList) {
				Insights insights = video.getInsights();
				transcriptBuilder.append(getTranscriptsFromInsights(insights));
			}
		}
		return transcriptBuilder.toString();

	}

}
