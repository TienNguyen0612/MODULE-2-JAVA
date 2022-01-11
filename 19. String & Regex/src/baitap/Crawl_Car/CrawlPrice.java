package baitap.Crawl_Car;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlPrice {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://hoanghamobile.com/dien-thoai-di-dong");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();

            content = content.replaceAll("\\n+", "");

            Pattern pattern = Pattern.compile("strong>(.*?)<");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
