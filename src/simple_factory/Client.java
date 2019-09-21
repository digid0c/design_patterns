package simple_factory;

public class Client {

    public static void main(String[] args) {
        System.out.println(PostFactory.createPost(Post.PostType.BLOG));
        System.out.println(PostFactory.createPost(Post.PostType.NEWS));
        System.out.println(PostFactory.createPost(Post.PostType.PRODUCT));
    }
}
