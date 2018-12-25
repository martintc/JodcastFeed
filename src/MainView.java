import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MainView {

    /*
     * Default constructor
     * Future plans: Load information for podcast into an ArrayList
     */
    public MainView () {

    }

    /*
     * where main execution of this class takes place
     */
    public void run () {
        mainWindow();

    }

    private void mainWindow () {
        JFrame mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.setSize(500, 500); // default values that may be changed

        mainFrame.add(mainPanel());



    }

    private JPanel mainPanel () {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // toolPanel set-up
        JPanel toolPanel = new JPanel();
        mainPanel.add(toolPanel, BorderLayout.NORTH); // add panel to the main panel

        JButton newRSS = new JButton("Add Podcast");
        toolPanel.add(newRSS); // add to tool panel

        JButton syncButton = new JButton("Sync");
        toolPanel.add(syncButton); // add to tool panel

        // PodcastList panel
        JPanel podcastListPanel = new JPanel();
        mainPanel.add(podcastListPanel, BorderLayout.CENTER);

        

        // bottomPanel set-up
        JPanel bottomPanel = new JPanel();
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        JButton openPodcastButton = new JButton("Open Podcast");
        bottomPanel.add(openPodcastButton);

        return mainPanel;
    }

}
