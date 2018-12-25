import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadRSSFile extends Scanner {

    public ReadRSSFile (String file) throws FileNotFoundException {
        super(new File(file));
    }



}
