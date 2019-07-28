package com.test.upload.app.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opencsv.CSVReader;

/**
 * Reader for excel & csv file
 */
public class ReaderUtil {

	private static Logger log = LoggerFactory.getLogger(ReaderUtil.class);

	/**
	 * read input csv to list of array string
	 * 
	 * @param inputStream
	 * @return list of array string
	 */
	public static List<String[]> readCsv(InputStream inputStream) {
		return readCsv(inputStream, ',');
	}

	/**
	 * read input csv to list of array string
	 * 
	 * @param inputStream
	 * @param separator
	 * @return list of array string
	 */
	public static List<String[]> readCsv(InputStream inputStream, char separator) {
		List<String[]> result = new ArrayList<String[]>();
		CSVReader csvReader = new CSVReader(new InputStreamReader(inputStream),
				separator);
		try {
			result = csvReader.readAll();
		} catch (IOException e) {
			log.error(e.toString());
		} finally {
			try {
				csvReader.close();
			} catch (IOException e) {
				log.error(e.toString());
			}
		}
		return result;
	}

}
