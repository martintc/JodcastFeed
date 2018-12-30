import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPodcastView extends JFrame implements ActionListener {

    private JTextField podcastName;
    private JTextField podcastURLRSS;
    private JButton saveButton;

    public AddPodcastView () {
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 2));

        /* information format in order
         *
         * Podcast Name
         * RSS URL
         *
         */

        JLabel podcastNameLabel = new JLabel("Podcast Name:");
        centerPanel.add(podcastNameLabel);
        podcastName = new JTextField();
        centerPanel.add(podcastName);

        JLabel rssLabel = new JLabel("RSS URL:");
        centerPanel.add(rssLabel);
        podcastURLRSS = new JTextField();
        centerPanel.add(podcastURLRSS);

        saveButton = new JButton("Save");
        mainPanel.add(saveButton, BorderLayout.SOUTH);

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        add(mainPanel);

    }

    public void actionPerformed (ActionEvent e) {

    }

}
