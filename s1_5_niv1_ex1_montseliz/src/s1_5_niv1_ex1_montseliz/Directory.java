package s1_5_niv1_ex1_montseliz;
import java.io.File;

public class Directory {
	
	public static void main(String[] args) {
		if (args.length == 0 || args.length > 1) {
			System.out.println("Error, el directori no existeix.");
		} else {
			String directoryPath = args[0]; 
			listDirectory(directoryPath);
		}
	}
	
	public static void listDirectory(String directoryPath) {
		File directory = new File(directoryPath);
		
	    // Obtenim tots els arxius i carpetes del directori
	    File[] files = directory.listFiles();

	    // Ordenem els arxius i carpetes alfabèticament (No caldria, s'ordena automàticament)
	    //Arrays.sort(files);

	    // Imprimim cada arxiu i carpeta en una línia
	    for (File file : files) {
	      System.out.println(file.getName());
	    }

	  }
}
