package uz.pdp.pcmarket.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.Entity.Comment;
import uz.pdp.pcmarket.Entity.OutputProduct;
import uz.pdp.pcmarket.Entity.User;


@Projection(types = Comment.class)
public interface CommentProjection {
    Integer getId();

    OutputProduct getOutputProduct();

    String getText();

    User getUser();
}
