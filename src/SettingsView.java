import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class SettingsView extends JFrame implements ActionListener {

    private JPanel mainPanel;
    private JButton saveSettings;
    private JButton exitButton;
    private JTextField locationTextField;
    public Configuration config;

    /*
     * Configuration File information
     * Podcast Episode Save spot
     */


    public SettingsView (Configuration pConfig) {

        config = pConfig;

        setVisible(true);
        setTitle("Settings");
        setSize(500,100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JLabel headerLabel = new JLabel("Settings Menu");
        mainPanel.add(headerLabel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1, 2));

        JLabel saveLocationLabel = new JLabel("Save Location");
        locationTextField = new JTextField();

        centerPanel.add(saveLocationLabel);
        centerPanel.add(locationTextField);

        JPanel southPanel = new JPanel();

        saveSettings = new JButton("Save");
        southPanel.add(saveSettings, BorderLayout.SOUTH);
        saveSettings.addActionListener(this);

        exitButton = new JButton("Exit");
        southPanel.add(exitButton, BorderLayout.SOUTH);
        exitButton.addActionListener(this);

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);
        add(mainPanel);
    }

    public void actionPerformed (ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("Save")) {
            if (config.loadSaveLocation(locationTextField.getText())) {
                JOptionPane.showMessageDialog(null, "Saved!");
            } else {
                JOptionPane.showMessageDialog(null, "System error!");
            }
        } else if (action.equals("Exit")) {
            // do nothing temporarily
        }
    }

}
