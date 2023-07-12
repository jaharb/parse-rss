package csa;

import com.sun.syndication.io.*;
import com.sun.syndication.feed.synd.*;
import java.net.URL;
import java.util.*;

// from 
// import com.rometools.rome.feed.synd.SyndEntry;
// import com.rometools.rome.feed.synd.SyndFeed;
// import com.rometools.rome.io.SyndFeedInput;
// import com.rometools.rome.io.XmlReader;

// import java.net.URL;
// import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SyndFeedInput sfi = new SyndFeedInput();
         String url = "https://www.nasa.gov/rss/dyn/breaking_news.rss";
         try {
             SyndFeed feed = sfi.build(new XmlReader(new URL(url)));
           
            System.out.println(feed.getTitle());
           

            List entries = feed.getEntries();
            System.out.println(entries.size());

            for( Object obj : entries )
            {
                SyndEntry syndEntry = (SyndEntry) obj;
                System.out.println(syndEntry.getTitle());
            }
        
         } catch (Exception e) {
            // TODO: handle exception
         }
        
      


       

        //System.out.println( "Hello World!" );

//         try {
//                 SyndFeedInput sfi = new SyndFeedInput();
//                 String urls[] = {"...", "..." };

//                 for(String url:urls) {
//                     SyndFeed feed = sfi.build(new XmlReader(new URL(url)));
//                     List entries = feed.getEntries();
//                     System.out.println(feed.getTitle());
//                     System.out.println(entries.size());
//                 }
// } catch (Exception ex) {
// throw new RuntimeException(ex);
// }
// }
    }
}
