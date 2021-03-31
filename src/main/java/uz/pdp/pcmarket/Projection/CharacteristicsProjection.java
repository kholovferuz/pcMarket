package uz.pdp.pcmarket.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.Entity.*;

import java.util.List;


@Projection(types = Characteristic.class)
public interface CharacteristicsProjection {
    Integer getId();

    String getName();

    Product getProduct();

}
