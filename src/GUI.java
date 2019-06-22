import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
// import java.awt.event.ActionListener;
// import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JButton;


public class GUI {

	private JFrame mainFrame;
	private JButton exitButton;
	private JButton addPodCastButton;
	private JButton removePodCastButton;

	public void run () {
		mainFrame = initFrame();
		mainFrame.setVisible(true);
	}


	public JFrame initFrame () {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		// frame.setResizeable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		frame.add(titlePanel(), BorderLayout.NORTH);
		frame.add(optionPanel(), BorderLayout.SOUTH);

		return frame;
	}

	public JPanel titlePanel () {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("JPodCatcher");
		panel.add(label);
		return panel;
	}

	public JPanel optionPanel() {
		JPanel panel = new JPanel();
		exitButton = new JButton("Exit");
		exitButton.addActionListener(new ButtonActions());
		addPodCastButton = new JButton("Add Podcast");
		addPodCastButton.addActionListener(new ButtonActions());
		removePodCastButton = new JButton("Remove Podcast");
		removePodCastButton.addActionListener(new ButtonActions());
		panel.add(addPodCastButton);
		panel.add(removePodCastButton);
		panel.add(exitButton);
		return panel;
	}


}
