package uz.pdp.pcmarket.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.Entity.*;

@Projection(types = Product.class)
public interface ProductProjection {
    Integer getId();

    String getName();

    String getModel();

    String getDescription();

    Double getPrice();

    Integer getStarRate();

    Attachment getAttachment();

    Category getCategory();

}
