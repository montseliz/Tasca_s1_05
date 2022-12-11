package s1_5_niv1_ex4_montseliz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Directory4 {

	public static void main(String[] args) {
		String directoryPath = args[0]; 
		ArrayList <String> saveDirectory = new ArrayList<>(); 
		listDirectory(directoryPath, saveDirectory);
		createFile(saveDirectory); 
		readFile(); 
	}
	
	public static void listDirectory(String directoryPath, ArrayList <String> saveDirectory) {
		File directory = new File(directoryPath);
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
	            listDirectory(file.getAbsolutePath(),saveDirectory);
	        } else {
	            saveDirectory.add("F " + file.getName() + " " + dateString);
	        }
	    }
	}
	
	public static void createFile(ArrayList <String> saveDirectory) {
	 	File createFile = new File ("C:/Users/Usuario/eclipse-workspace_s1/s1_5_niv1_ex3_montseliz/src/s1_5_niv1_ex3_montseliz/fitxer.txt");
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
	
	public static void readFile() {
		try {
			FileReader fr = new FileReader ("C:/Users/Usuario/eclipse-workspace_s1/s1_5_niv1_ex3_montseliz/src/s1_5_niv1_ex3_montseliz/fitxer.txt");
			BufferedReader br = new BufferedReader(fr); 
			String line = "";
			while (line != null) {
				// El mètode readLine() llegeix fins que hi ha un \n o un \r. Retorna la línia o null. 
				line = br.readLine();
				// Creem el condicional per evitar que se'ns imprimeixi "null" al final.
				if (line != null) {
					System.out.println(line);
				}
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
			
}
