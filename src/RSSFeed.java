import java.net.URL;
import java.io.InputStream;
import java.util.regex.*;
import java.util.Scanner;
import java.util.ArrayList;

public class RSSFeed {
	
	private ArrayList<String> items = new ArrayList<>();
	private ArrayList<Episode> episodes = new ArrayList<>();


	public ArrayList<Episode> run (String url) {
		String urlFeed = url;
		try {
			Scanner scan = new Scanner(getIS(urlFeed));
			// int x = 0;
			/*while (scan.hasNextLine()) {
				String line = scan.nextLine();
				getTitle(line);
				getPubDate(line);
				getDescription(line);
			//	x++;
			}*/
			getItem(scan);
			makeEpisodes();
			return episodes;
			//for(String

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private void getItem (Scanner scan) { 
		String itemStartRegex = "<item>";
		String itemEndRegex = "</item>";
		Pattern pItemStart = Pattern.compile(itemStartRegex);
		Pattern pItemEnd = Pattern.compile(itemEndRegex);
		boolean inItem = false;
		int itemCount = 0;
		
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			Matcher startItem = pItemStart.matcher(line);
			Matcher endItem = pItemEnd.matcher(line);
			if (startItem.find()) {
				inItem = true;
				items.add(new String(""));
			}
			if (inItem) {
				items.set(itemCount, (items.get(itemCount) + line + "\n"));
			}
			if (endItem.find()) {
				inItem = false;
				itemCount++;
			}
		}

		/* for (String s : items) {
			System.out.println(s);
			System.out.println("\n");
		}*/	
			
	}


	private InputStream getIS (String feedURL) {
		InputStream is;
		try {
			URL url = new URL(feedURL);
			is = url.openStream();
			return is;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private String getTitle (String s) {
		String regex = "(<title>)(.{1,})(</title>)";
		s = s.trim();
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		// System.out.println("Input Line: " + s);
		while (m.find()) {
			System.out.println("----------------------------");
			String regex1 = "[^<title>](.{1,})[^</title>]";
			Pattern p1 = Pattern.compile(regex1);
			Matcher n = p1.matcher(m.group());
			if (n.find()) {
				return n.group();		
			}
		}
		return null;
		
	}

	private String getPubDate (String s) {
		String regex = "(<pubDate>)(.{1,})(</pubDate>)";
		s = s.trim();
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		while (m.find()) {
			String regex1 = "[^<pubDate>](.{1,})[^</pubDate>]";
			Pattern p1 = Pattern.compile(regex1);
			Matcher n = p1.matcher(m.group());
			if(n.find()) {
				return (n.group());
			}
		}
		return null;
	}
	
	private String getDescription (String s) {
		String regex = "(<description>)(.{1,})(</description>)";
		s = s.trim();
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		while(m.find()) {
			String regex1 = "[^<description>](.{1,})[^</description>]";
			Pattern p1 = Pattern.compile(regex1);
			Matcher n = p1.matcher(m.group());
			if (n.find()) {
				return (n.group());
			}
		}
		return null;
	}

	private String getLink (String s) {
		String regex = "(<link>)(.{1,})(/link)";
		s.trim();
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		while (m.find()) {
			String regex1 = "http://(.{1,})mp3";
			Pattern p1 = Pattern.compile(regex1);
			Matcher n = p1.matcher(m.group());
			if (n.find()) {
				return (n.group());
			}
		}
		return null;
	}
	
	private void makeEpisodes () {
		for (String s : items) {
			String title = getTitle(s);
			String description = getDescription(s);
			String pubDate = getPubDate(s);
			String link = getLink(s);
			episodes.add(new Episode(title, description, pubDate, link));
		}

		/*
		for (Episode e : episodes) {
			System.out.println(e.getTitle());
			System.out.println(e.getDescription());
			System.out.println(e.getPubDate());
			System.out.println(e.getLink());
			System.out.println("\n" + "------------------" + "\n");
		}*/
	}

}
