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

}
