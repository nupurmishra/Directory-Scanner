/*
 * @author Nupur Mishra
 * @since 24092017
 * Class exposed to end user
 * 
 */

public class FileScanner {
	
	 public static void main(String[] args) {  
         FileCollection fileColl = new FileCollection();  
           
         for(Iterator iter = fileColl.getIterator(); iter.hasNext();){  
        	 FilePojo filePojo = (FilePojo)iter.next();  
        	 System.out.println("Mime Files :"+filePojo.getMimeType());
	         System.out.println("File Name :"+filePojo.getFileName());
	         System.out.println("File length :"+filePojo.getLength());
		     System.out.println("File Extension :"+filePojo.getExtension());
          }      
   }  

}
