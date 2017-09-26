import java.util.ArrayList;
import junit.framework.TestCase;
import static org.junit.Assert.*;

/**
 * 
 * @author Nupur Mishra
 * @since 24092017
 * Test Class. 
 *
 */

public class FileScannerTest extends TestCase {
	
FileService fileService = new FileService ();
ArrayList<FilePojo> fileResults = new ArrayList<FilePojo>();

   protected void setUp() throws Exception {
	   
	   super.setUp();
	   FilePojo filePojo = new FilePojo();
	   filePojo.setExtension("xlsx");
	   filePojo.setFileName("new-2.xlsx");
	   filePojo.setLength(8746);
	   filePojo.setMimeType("application/octet-stream");
	   fileResults.add(filePojo);
    }
	
   //Method to test list is Null or not.
	public void testFileListNotNull() {
		ArrayList<FilePojo> results = fileService.fileScanner();
		assertNotNull(results);	
    }
	
	//Method to compare elements in Array
	public void testFileListCompare() {
		ArrayList<FilePojo> results = fileService.fileScanner();
		assertArrayEquals(fileResults.toArray(), results.toArray());
    }
}  
