package uz.pdp.pcmarket.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.Entity.Basket;
import uz.pdp.pcmarket.Entity.Order;

import java.sql.Date;


@Projection(types = Order.class)
public interface OrderProjection {
    Integer getId();

    Date getDate();

    Basket getBasket();
}
