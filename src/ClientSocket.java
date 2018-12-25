import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;

public class ClientSocket extends Socket {

    public ClientSocket (String url) throws UnknownHostException, IOException {

        super(url, 80);

    }



}
