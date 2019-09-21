package simple_factory;

public class PostFactory {

    public static Post createPost(Post.PostType postType) {
        switch (postType) {
            case BLOG: return new BlogPost();
            case NEWS: return new NewsPost();
            case PRODUCT: return new ProductPost();
            default: throw new IllegalArgumentException("Post type is unknown!");
        }
    }
}
