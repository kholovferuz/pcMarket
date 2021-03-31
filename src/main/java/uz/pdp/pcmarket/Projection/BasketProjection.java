package uz.pdp.pcmarket.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.Entity.Basket;
import uz.pdp.pcmarket.Entity.OutputProduct;
import uz.pdp.pcmarket.Entity.User;


@Projection(types = Basket.class)
public interface BasketProjection {
    Integer getId();

    OutputProduct getOutputProduct();

    User getUser();

    Double getTotalPrice();
}
