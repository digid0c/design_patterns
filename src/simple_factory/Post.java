package simple_factory;

import java.time.LocalDateTime;

public abstract class Post {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime dateCreated;
    private LocalDateTime datePublished;

    public enum PostType {
        BLOG, NEWS, PRODUCT
    }

    @Override
    public String toString() {
        return "Hi! I am an instance of " + this.getClass().getSimpleName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(LocalDateTime datePublished) {
        this.datePublished = datePublished;
    }
}
