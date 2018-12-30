import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBoxMenuItem;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MainView {

    /*
     * Instance variable
     */
    private JButton newRSS;
    private JButton syncButton;
    private JButton aboutButton;
    private JButton openPodcastButton;
    private JButton settingsButton;

    private JFrame mainFrame;

    private JPanel mainPanel;

    private ArrayList<JCheckBoxMenuItem> podcastMenu;
    private ArrayList<Podcast> podcasts;

    private Configuration config;

    /*
     * Default constructor
     * Future plans: Load information for podcast into an ArrayList
     */
    public MainView (Configuration pConfig) {
        config = pConfig;

    }

    /*
     * where main execution of this class takes place
     */
    public void run () {
        // populatePodcastMenu();
        mainWindow();

    }

    private void populatePodcastMenu () {
        for (Podcast p : podcasts) {
            podcastMenu.add(new JCheckBoxMenuItem(p.getPodcastName()));
        }

    }

    private void mainWindow () {
        mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.setSize(500, 500); // default values that may be changed

        mainFrame.add(mainPanel());



    }

    private JPanel mainPanel () {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // toolPanel set-up
        JPanel toolPanel = new JPanel();
        mainPanel.add(toolPanel, BorderLayout.NORTH); // add panel to the main panel

        newRSS = new JButton("Add Podcast");
        toolPanel.add(newRSS); // add to tool panel
        newRSS.addActionListener(this::actionPerformed);

        syncButton = new JButton("Sync");
        toolPanel.add(syncButton); // add to tool panel
        syncButton.addActionListener(this::actionPerformed);

        aboutButton = new JButton("About");
        toolPanel.add(aboutButton);
        aboutButton.addActionListener(this::actionPerformed);

        // PodcastList panel
        JPanel podcastListPanel = new JPanel();
        mainPanel.add(podcastListPanel, BorderLayout.CENTER);
        podcastListPanel.setLayout(new BoxLayout(podcastListPanel, BoxLayout.Y_AXIS));

        podcastListPanel.add(new JCheckBoxMenuItem("Test"));
        /*for (JCheckBoxMenuItem item : podcastMenu) {
            podcastListPanel.add(item);
        }*/

        // bottomPanel set-up
        JPanel bottomPanel = new JPanel();
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        openPodcastButton = new JButton("Open Podcast");
        bottomPanel.add(openPodcastButton);
        openPodcastButton.addActionListener(this::actionPerformed);

        settingsButton = new JButton("Settings");
        bottomPanel.add(settingsButton);
        settingsButton.addActionListener(this::actionPerformed);

        return mainPanel;
    }

    public void actionPerformed (ActionEvent e) {
        String action = e.getActionCommand();
        if (action == "About") {
            JOptionPane.showMessageDialog(null, About.getInformation());
        } else if (action == "Settings") {
            SettingsView settingsView = new SettingsView(config);
            config.writeConfiguration();
        } else if (action.equals("Add Podcast")) {
            AddPodcastView addPodCast = new AddPodcastView();
        }
    }

}
