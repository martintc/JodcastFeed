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

public class SettingsView extends JFrame {

    private JPanel mainPanel;
    private JButton saveSettings;
    private JButton exitButton;


    public SettingsView () {

        setVisible(true);
        setTitle("Settings");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JLabel headerLabel = new JLabel("Settings Menu");
        mainPanel.add(headerLabel, BorderLayout.NORTH);

        JPanel southPanel = new JPanel();


        saveSettings = new JButton("Save");
        southPanel.add(saveSettings, BorderLayout.SOUTH);

        exitButton = new JButton("Exit");
        southPanel.add(exitButton, BorderLayout.SOUTH);

        mainPanel.add(southPanel, BorderLayout.SOUTH);
        add(mainPanel);
    }

}
