public class Main {

    private Configuration config;

    /*
     * Main
     * Creates an object of itself
     * Passes the runtime of the program to run within the run method
     */
    public static void main (String[] args) {
        Main main = new Main();
        main.run();
    }

    /*
     * Run method
     * where execution of the program takes place
     */
    public void run () {
        config = new Configuration();
        if (!loadConfigs()) {
            System.exit(-1);
        }

        MainView mainView = new MainView(config);
        mainView.run();
    }

    /*
     * Load any configurations on launch
     * Load podcast list
     * work in progress; given a default behaviour
     */
    private boolean loadConfigs () {
        return true;
    }

}
