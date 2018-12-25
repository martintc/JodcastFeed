public class Episodes {

    private String episodeTitle;
    private String episodeDescription;
    private String episodeLength;

    public Episodes () {

    }

    public void setEpisodeTitle (String pEpisodeTitle) {
        episodeTitle = pEpisodeTitle;
    }

    public void setEpisodeDescription (String pEpisodeDescription) {
        episodeDescription = pEpisodeDescription;
    }

    public void setEpisodeLength (String pEpisodeLength) {
        episodeLength = pEpisodeLength;
    }

    public String getEpisodeTitle () {
        return episodeTitle;
    }

    public String getEpisodeDescription () {
        return episodeDescription;
    }

    public String getEpisodeLength () {
        return episodeLength;
    }

}
