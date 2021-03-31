package uz.pdp.pcmarket.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.Entity.OutputProduct;
import uz.pdp.pcmarket.Entity.Product;

import java.util.List;


@Projection(types = OutputProduct.class)
public interface OutputProductProjection {
    Integer getId();
    Integer getQuantity();

    List<Product> getProducts();
}
