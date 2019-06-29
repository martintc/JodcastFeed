import FileManager.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ButtonActions implements ActionListener {

	public ButtonActions () {
	
	}

	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action.equals("Exit") || action.equals("exit")) {
			System.exit(0);
		}
	}

	public static void downloadFromLink (String link) {
		String location = JOptionPane.showInputDialog("Give location and file name" + "\n" +
				"Example:" + "\n" + "/home/user/Music/episode.mp3");
		if(Downloader.downloadMP3(link, location)) {
			JOptionPane.showMessageDialog(null, "File downloaded");
		} else {
			JOptionPane.showMessageDialog(null, "Failed to download file.");
		}
	}

}	
