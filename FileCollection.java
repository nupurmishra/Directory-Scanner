import java.util.ArrayList;
/**
 * 
 * @author Nupur Mishra
 * @since 24092017
 * Class to customise logic of itration
 * to hide internal functionality. 
 *
 */

public class FileCollection implements FileContainer {
	
	FileService fileService = new FileService();
	ArrayList<FilePojo> file = fileService.fileScanner();
    
	public Iterator getIterator() {  
	        return new CollectionofFileIterate() ;  
	    }  
	    private class CollectionofFileIterate implements Iterator{  
	        int i=0; 
	        public boolean hasNext() {  
	            if (i<file.size()){  
	                return true;  
	            }  
	            return false;  
	        }  
	        public Object next() {  
	          if(this.hasNext()){  
	        	  i++;
	              return file.iterator().next();  
	          }  
	            return null;      
	       }  
	    }  
	}  

	
