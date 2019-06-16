import java.net.URL;
import java.net.URLConnection;

public class URLHandler {

  Private URLConnection connection;
  
  public URLHandler (String url) {
    
    connection = new URLConnection(new URL(url));
    
  }
  
}
