import java.io.File;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class PodcastLoader {

	private JFileChooser chooser;
	private File file;

	public PodcastLoader () {
	
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


}
