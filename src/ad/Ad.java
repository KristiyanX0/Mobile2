package ad;

import ad.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Ad {
    private final Product pr;
    private final String owner;
    private final List<Comment> comments;

    public Ad(Product pr, String owner) {
        this.pr = pr;
        this.owner = owner;
        this.comments = new ArrayList<>();
    }

    public Product product() {
        return pr;
    }

    public Comment getComment(int index) {
        return comments.get(index);
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public String owner() {
        return owner;
    }
}
