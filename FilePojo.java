/**
 * 
 * @author Nupur Mishra
 * @since 24092017
 * Pojo object for File
 *
 */

public class FilePojo {
	
	private long length;
    private String fileName;
    private String extension;
    private String mimeType;
	public long getLength() {
		return length;
	}
	public void setLength(long length) {
		this.length = length;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getMimeType() {
		return mimeType;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
    

}
