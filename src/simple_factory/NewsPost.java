package simple_factory;

import java.time.LocalDate;

public class NewsPost extends Post {

    private String headLine;
    private LocalDate newsDate;

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public LocalDate getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(LocalDate newsDate) {
        this.newsDate = newsDate;
    }
}
