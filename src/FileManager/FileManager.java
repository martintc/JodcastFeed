import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.net.URL;
import java.io.FileOutputStream;
import java.io.File;
import java.io.InputStreamReader;

public class FileManager {

	private JFileChooser chooser;
	private File file;

	public FileManager () {
	
	}
	
	public void runTest () {
		try {
			Scanner scan = new Scanner(fileLoadFile());
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public File fileLoadFile() {
		chooser = new JFileChooser("~/");
		int returnVal = chooser.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			return file;
		}
		return null;
	}

	public boolean downloadPodcast (String url, String saveLocation) {
		try {
			URL conn = new URL(url);
			// InputStream is = new InputStream(conn);
			InputStreamReader isr = new InputStreamReader(new InputStream(conn));
			
			OutputStream os = new FileOutputStream(new File(saveLocation));
			byte[] buffer = new byte[4096];
			int len = buffer.size();
			//while ((len = isr.read(buffer)) > 0) {
				
			os.write(buffer, 0, len);
			//}
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}




}
