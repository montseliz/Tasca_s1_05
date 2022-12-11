package s1_5_niv1_ex1_montseliz;
import java.io.File;
import java.util.Arrays;

public class Directory {
	
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

	    // Obtenim tots els arxius i carpetes del directori
	    File[] files = directory.listFiles();

	    // Ordenem els arxius i carpetes alfabèticament
	    Arrays.sort(files);

	    // Imprimim cada arxiu i carpeta en una línia
	    for (File file : files) {
	      System.out.println(file.getName());
	    }

	  }
}
