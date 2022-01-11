package baitap.Crawl_Clothes_YODY;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlClothes {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://tiki.vn/dien-thoai-may-tinh-bang/c1789");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            System.out.println(content);
            scanner.close();

            content = content.replaceAll("\\n+", "");

            Pattern pattern = Pattern.compile("alt=\"(.*?)\"");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
