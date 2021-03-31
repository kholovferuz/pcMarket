package uz.pdp.pcmarket.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.Entity.Supplier;


@Projection(types = Supplier.class)
public interface SupplierProjection {
    Integer getId();

    String getName();

    String getEmail();

    String getMessage();
}
