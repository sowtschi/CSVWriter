package tools;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

/** 
 * CSV-Writer implemantation.
 * 
 * @author Steffen Benjamin Owtschinnikow
 * @version 1.0
 * @since 2019-06-06
 */

public class CSVWriter {

	private BufferedWriter writer;
	private CSVPrinter csvPrinter;
	
	/*
	 * Create a CSV-printer object and define headernames.
	 * @param csvFile Path of a file to write csv.
	 * @param headerStrings Headernames for the CSV-File.
	 * */

	public CSVWriter(String csvFile, String[] headerStrings) {
		try {
			writer = Files.newBufferedWriter(Paths.get(csvFile));
			csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(headerStrings));
		} catch (IOException e) {
			System.out.println("Cant create filewriter.");
			e.printStackTrace();
		}
	}
	
	/*
	 * Add one row to write in CSV.
	 * @param rowData a list of String-Elements to write in one csv row.
	 * */

	public void writeRow(String[] rowData) {
		try {
			csvPrinter.printRecord(rowData);
		} catch (IOException e) {
			System.out.println("Error while writing a row.");
			e.printStackTrace();
		}
	}
	
	/*
	 * Flush the Stream
	 * */

	public void flush() {
		try {
			csvPrinter.flush();
		} catch (IOException e) {
			System.out.println("Error while writing file.");
			e.printStackTrace();
		}
	}
	
	/*
	 * Close CSV-Printer
	 * */

	public void close() {
		try {
			csvPrinter.close();
		} catch (IOException e) {
			System.out.println("Error while closing CSV-Printer.");
			e.printStackTrace();
		}
	}

}
