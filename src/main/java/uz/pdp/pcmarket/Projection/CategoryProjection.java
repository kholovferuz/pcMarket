package uz.pdp.pcmarket.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.Entity.Category;


@Projection(types = Category.class)
public interface CategoryProjection {
    Integer getId();

    String getName();

    String getDescription();

    Category getParentCategory();
}
