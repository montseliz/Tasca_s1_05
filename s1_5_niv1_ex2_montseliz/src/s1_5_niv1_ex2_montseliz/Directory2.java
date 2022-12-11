package s1_5_niv1_ex2_montseliz;
import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class Directory2 {

	public static void main(String[] args) {
		String directoryPath = args[0]; 
		listDirectory(directoryPath);
	}
	
	public static void listDirectory(String directoryPath) {
		File directory = new File(directoryPath);
	    if (!directory.exists()) {
	      System.out.println("El directori no existeix.");
	      return;
	    }

	    File[] files = directory.listFiles();

	    Arrays.sort(files);
	    
	    for (File file : files) {
	    	// S'obté la data de modificació de l'arxiu com un valor de tipus long
	    	long lastModified = file.lastModified();
	    	
	    	// Es crea un objecte de tipus Date utilitzant la data de modificació de l'arxiu
	    	Date date = new Date(lastModified);
	    	
	    	// S'obté la representació en format cadena de text de l'objecte Date
	    	String dateString = date.toString(); 
	    	
	        if (file.isDirectory()) {
	            // Si es tracta d'un directori, s'imprimeix la informació i es fa una crida recursiva a la funció
	            System.out.println("D " + file.getName() + " " + dateString);
	            listDirectory(file.getAbsolutePath());
	        } else {
	            // Si es tracta d'un arxiu, s'imprimeix la informació
	            System.out.println("F " + file.getName() + " " + dateString);
	        }
	    }
	}





}