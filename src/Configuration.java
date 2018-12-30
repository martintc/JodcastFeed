import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Configuration {

    private String saveLocation;


    public Configuration () {

    }

    public boolean loadSaveLocation (String pLocation) {
        saveLocation = pLocation;
        return true;
    }

    public String getSaveLocation () {
        return saveLocation;
    }

    public boolean loadConfiguration (String filePath) {
        try {
            Scanner in = new Scanner(new File(filePath));
            while (in.hasNextLine()) {
                saveLocation = in.nextLine();
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
