package uz.pdp.pcmarket.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.Entity.Contact;

import java.sql.Time;


@Projection(types = Contact.class)
public interface ContactProjection {
    Integer getId();

    String getTelegram();

    String getInstagram();

    String getFacebook();

    String getEmail();

    String getPhoneNumber();

    Time getWorkTime();
}
