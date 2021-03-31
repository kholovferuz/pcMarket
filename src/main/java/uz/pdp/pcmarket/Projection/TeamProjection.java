package uz.pdp.pcmarket.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.Entity.*;


@Projection(types = Team.class)
public interface TeamProjection {
    Integer getId();

    String getName();

    String getPosition();

    Attachment getAttachment();
}
