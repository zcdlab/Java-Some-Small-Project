import java.io.BufferedReader;
import java.io.FileReader;

public final class TextFileReader {
	private BufferedReader fReader = null;
	
	public boolean open(String path) {
		boolean ret = true;
		
		close();
		
		try {
			fReader = new BufferedReader(new FileReader(path));
		} catch (Exception e) {
			ret = false;
		}
		
		return ret;
	}
	
	public void close() {
		if( fReader != null ) {
			try {
				fReader.close();
			} catch (Exception e) {
				
			}
			
			fReader = null;
		}
	}
	
	public String readLine() {
		String ret = null;
		
		try {
			ret = fReader.readLine();
		} catch (Exception e) {
			ret = null;
		}
		
		return ret;
	}
}
