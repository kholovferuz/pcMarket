package uz.pdp.pcmarket.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.Entity.Attachment;
import uz.pdp.pcmarket.Entity.User;


@Projection(types = User.class)
public interface UserProjection {
    Integer getId();

    String getName();

    String getEmail();

    String getMessage();

    Attachment getAttachment();
}
