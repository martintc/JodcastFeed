import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Podcast {
	
	private String title;
	private String link;
	private JPanel = new JPanel();

	public Podcast (String title, String link) {
		this.title = title;
		this.link = link;
	}

	public void setTitle (String title) {
		this.title = title;
	}

	public void setLink (String link) {
		this.link = link;
	}

	public String getTitle () {
		return this.title;
	}

	public String getLink () {
		return this.link;
	}

	public JPanel panel () {
		panel = new JPanel();
		JLabel titleLabel = new JLabel(this.title);
		JLabel linkLabel = new JLabel(this.link);
		JButton openButton = new JButton("Open");
		panel.add(titleLabel);
		panel.add(linkLabel);
		panel.add(openButton);
		return panel;
	}



}
