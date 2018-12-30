import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;

public class Configuration {

    private String saveLocation;
    private String podcastFilePath;


    public Configuration () {

    }

    public boolean loadSaveLocation (String pLocation) {
        saveLocation = pLocation;
        return true;
    }

    public boolean loadPodcastFilePath (String pString) {
        podcastFilePath = pString;
        return true;
    }

    public String getPodcastFilePath () {
        return podcastFilePath;
    }


    public String getSaveLocation () {
        return saveLocation;
    }

    public boolean loadConfiguration (String filePath) {
        try {
            Scanner in = new Scanner(new File(filePath));
            while (in.hasNextLine()) {
                saveLocation = in.nextLine();
                podcastFilePath = in.nextLine();
            }
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean writeConfiguration (String filePath, ArrayList<String> settings) {
        try {
            PrintWriter out = new PrintWriter(new File(filePath));
            for (String s : settings) {
                out.println(s);
            }
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
