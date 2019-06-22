import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonActions implements ActionListener {
 
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action.equals("Exit") || action.equals("exit")) {
			System.exit(0);
		}
	}

}	
