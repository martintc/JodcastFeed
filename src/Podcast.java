import java.util.ArrayList;

public class Podcast {

    private String podcastName;
    private String rssURL;
    private ArrayList<Episodes> episodes;

    /*
     * Default Constructor
     */

    public Podcast () {

    }

    public void setPodcastName (String pName) {
        podcastName = pName;
    }

    public void setRssURL (String pRSSUrl) {
        rssURL = pRSSUrl;
    }

    public void setEpisodes (ArrayList<Episodes> pEpisodes) {
        episodes = pEpisodes;
    }

    public String getPodcastName() {
        return podcastName;
    }

    public String getRssURL() {
        return rssURL;
    }

    public ArrayList<Episodes> getEpisodes () {
        return episodes;
    }
}
