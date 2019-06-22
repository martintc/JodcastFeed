import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Episode {

	private String title;
	private String description;
	private String pubDate;
	private String link;
	private JPanel panel;
	private JLabel titleLabel = new JLabel();;
	private JLabel descriptionLabel = new JLabel();
	private JLabel pubDateLabel = new JLabel();
	private JLabel linkLabel = new JLabel();

	public Episode (String title, String description, String pubDate, String link) {
		this.title = title;
		this.description = description;
		this.pubDate = pubDate;
		this.link = link;
	}

	public void setTitle (String title) {
		this.title = title;
		this.titleLabel.setText(title);
	}

	public void setDescription (String description) {
		this.description = description;
		this.descriptionLabel.setText(description);
	}

	public void setPubDate (String pubDate) {
		this.pubDate = pubDate;
		this.pubDateLabel.setText(pubDate);
	}
	
	public void setLink (String link) {
		this.link = link;
		this.linkLabel.setText(link);
	}

	public String getTitle () {
		return this.title;
	}

	public String getPubDate () {
		return this.pubDate;
	}

	public String getDescription () {
		return this.description;
	}

	public String getLink () {
		return this.link;
	}

	public JPanel getJPanel () {
		this.panel = new JPanel();
		JButton downloadButton = new JButton("Download");
		panel.add(this.titleLabel);
		panel.add(this.pubDateLabel);
		panel.add(this.descriptionLabel);
		panel.add(downloadButton);
		return this.panel;
	}
		
}
