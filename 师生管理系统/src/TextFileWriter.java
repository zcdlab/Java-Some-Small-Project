import java.io.FileWriter;

public final class TextFileWriter {
	private FileWriter fWriter = null;
	
	public boolean open(String path) {
		boolean ret = true;
		
		try {
			fWriter = new FileWriter(path);
		} catch (Exception e) {
			ret = false;
		}
		
		return ret;
	}
	
	public void close() {
		if( fWriter != null ) {
			try {
				fWriter.flush();
				fWriter.close();
			} catch (Exception e) {
				
			}
			
			fWriter = null;
		}
	}
	
	public boolean writeLine(String text) {
		boolean ret = true;
		
		try {
			fWriter.write(text + System.getProperty("line.separator"));
		} catch (Exception e) {
			ret = false;
		}
		
		return ret;
	}
}
