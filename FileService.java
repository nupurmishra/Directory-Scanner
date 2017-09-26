import java.io.File;
import java.util.ArrayList;
import javax.activation.MimetypesFileTypeMap;

/**
 * 
 * @author Nupur
 * @since 24092017
 * Service which has logic to fetch 
 * file property.
 * 
 */

public class FileService {
	
	MimetypesFileTypeMap mimeTypesMap = new MimetypesFileTypeMap();

	//Method returning Object of File with Description
	public ArrayList<FilePojo> fileScanner()  {
		
		ArrayList<FilePojo> results = new ArrayList<FilePojo>();
		try {
			FilePojo filePojo;

			File[] files = new File("D:/work/Files").listFiles();
			//If this pathname does not denote a directory, then listFiles() returns null. 

			for (File file : files) {
			    if (file.isFile()) {
			        
			        if (mimeTypesMap.getContentType(file).equals("application/octet-stream")) {
			        	filePojo = new FilePojo();
			        	filePojo.setFileName(file.getName());
			        	filePojo.setLength(file.length());
			        	filePojo.setMimeType(mimeTypesMap.getContentType(file));
			        	filePojo.setExtension(org.apache.commons.io.FilenameUtils.getExtension("C:/Work/Files" + file.getName()));
				        results.add(filePojo);
			        } else {
			        	System.out.println("MIME files not supported");
			        }	        
			    }
			}
			} catch(ArrayIndexOutOfBoundsException ex) {
				    System.out.println("Exception thrown  :" + ex.getMessage());
			} catch(Exception e) {
			         System.out.println("Exception thrown  :" + e.getMessage());
			}
		return results;
	}
	
	//String fileName = "/path/to/file";
	
	// only by file name
	//String mimeType = mimeTypesMap.getContentType(fileName);

	// or by actual File instance
	//File mimefile = new File(fileName);
	//mimeType = mimeTypesMap.getContentType(mimefile);
	//System.out.println("File Type :"+mimeType);
	

}
