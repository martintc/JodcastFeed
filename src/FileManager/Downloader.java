package FileManager;

import java.net.URL;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;

public class Downloader {
	
	/* Test code
	public static void main (String[] args) {
		Downloader d = new Downloader();
		d.run();
	}
	*/

	public void run () {
		String url = "https://chtbl.com/track/392D9/aphid.fireside.fm/d/1437767933/f31a453c-fa15-491f-8618-3f71f1d565e5/5d949836-718b-4380-a9a8-e4d896d31d41.mp3";
		String location = "/home/todd/Music/test.mp3";
		if (downloadMP3(url, location)) {
			System.out.println("Success!");
		}
		
	}

	public static boolean downloadMP3 (String url, String saveLocation) {
		try {
			URL u = new URL(url);
			BufferedInputStream bIS = new BufferedInputStream(u.openStream());
			FileOutputStream fOS = new FileOutputStream(saveLocation);

			int data = bIS.read();
			System.out.println("Downloading...");
			while (data != -1) {
				System.out.print(Integer.toString(data) + " ");
				fOS.write(data);
				data=bIS.read();
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			
		}
	}
}
