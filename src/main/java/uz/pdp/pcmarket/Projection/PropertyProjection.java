package uz.pdp.pcmarket.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.Entity.*;


@Projection(types = Property.class)
public interface PropertyProjection {
    Integer getId();

    String getName();

    Characteristic getCharacteristic();
}
