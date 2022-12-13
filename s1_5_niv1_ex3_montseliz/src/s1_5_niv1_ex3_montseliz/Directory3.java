package s1_5_niv1_ex3_montseliz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Directory3 {

	public static void main(String[] args) {
		if (args.length == 0 || args.length > 1) {
			System.out.println("Error, el directori no existeix.");
		} else {
			String directoryPath = args[0]; 
			ArrayList <String> saveDirectory = new ArrayList<>(); 
			listDirectory(directoryPath, saveDirectory);
			createFile(saveDirectory); 
		}
	}
	
	public static void listDirectory(String directoryPath, ArrayList <String> saveDirectory) {
		File directory = new File(directoryPath);
		
	    File[] files = directory.listFiles();

	    Arrays.sort(files);
	    
	    for (File file : files) {
	    	long lastModified = file.lastModified();
	    	
	    	Date date = new Date(lastModified);
	   
	    	String dateString = date.toString(); 
	    	
	        if (file.isDirectory()) {
	            saveDirectory.add("|-> D: " + file.getName() + " // " + dateString);
	            listDirectory(file.getAbsolutePath(),saveDirectory);
	        } else {
	            saveDirectory.add("+----> F: " + file.getName() + " // " + dateString);
	        }
	    }
	}
	
	public static void createFile(ArrayList <String> saveDirectory) {
		// Creem un objecte File per especificar la ruta on volem que es crei el "fitxer.txt"
	 	File createFile = new File ("C:\\Users\\Usuario\\GIT\\tasca_s1_05\\s1_5_niv1_ex3_montseliz\\src\\s1_5_niv1_ex3_montseliz\\fitxer.txt");
		try {
			// Creem el Filewriter i el BufferedWriter que escrigui en el "fitxer.txt" 
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
