package s1_5_niv2_ex1_montseliz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

public class Main_Properties {

	public static void main(String[] args) {
		Properties properties = new Properties(); 
		try {
			properties.load(new FileInputStream(new File("C:\\Users\\Usuario\\eclipse-workspace_s1\\s1_5_niv2_ex1_montseliz\\src\\s1_5_niv2_ex1_montseliz\\configuration.properties.txt")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String directoryPath = properties.getProperty("directoryPath");
		ArrayList <String> saveDirectory = new ArrayList<>(); 
		listDirectory(directoryPath, saveDirectory, properties);
		createFile(saveDirectory, properties); 
	}
	
	public static void listDirectory(String directoryPath, ArrayList <String> saveDirectory, Properties properties) {
		File directory = new File (directoryPath);
	    if (!directory.exists()) {
	      System.out.println("El directori no existeix.");
	      return;
	    }

	    File[] files = directory.listFiles();

	    Arrays.sort(files);
	    
	    for (File file : files) {
	    	long lastModified = file.lastModified();
	    	
	    	Date date = new Date(lastModified);
	   
	    	String dateString = date.toString(); 
	    	
	        if (file.isDirectory()) {
	            saveDirectory.add("D " + file.getName() + " " + dateString);
	            listDirectory(file.getAbsolutePath(), saveDirectory, properties);
	        } else {
	            saveDirectory.add("F " + file.getName() + " " + dateString);
	        }
	    }
	}
	
	public static void createFile(ArrayList <String> saveDirectory, Properties properties) {
	 	File createFile = new File (properties.getProperty("pathFileTxt") + File.separator + properties.getProperty("nameFileTxt"));
		try {
			FileWriter fw = new FileWriter(createFile);
			BufferedWriter bw = new BufferedWriter(fw);
			for (String string : saveDirectory) {
				bw.write(string + "\n");
			}	
			bw.close();
			fw.close();
			System.out.println("Arxiu guardat correctament.");
		} catch (IOException e) {
				e.printStackTrace();
		} 
			
	}
			
}