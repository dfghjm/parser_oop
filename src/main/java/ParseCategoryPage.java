import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
public class ParseCategoryPage extends ParseReviews{
    public ParseCategoryPage(String url) throws IOException {
        super(url);
    }

    public void parse_category_page(String url) throws IOException {

        Elements links = doc.select("div.g-i-tile-i-title").nextAll();
        for (Element link : links) {
            if (!(link.select("a").attr("href").isEmpty()))
                parse_reviews(link.select("a").attr("href"));
        }
    }
}
