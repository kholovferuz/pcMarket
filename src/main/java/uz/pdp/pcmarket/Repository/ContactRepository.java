package uz.pdp.pcmarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.Entity.Attachment;
import uz.pdp.pcmarket.Entity.Contact;
import uz.pdp.pcmarket.Projection.ContactProjection;

@RepositoryRestResource(path = "contact",excerptProjection = ContactProjection.class)
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
