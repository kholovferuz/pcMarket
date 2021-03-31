package uz.pdp.pcmarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.Entity.Property;
import uz.pdp.pcmarket.Projection.PropertyProjection;

@RepositoryRestResource(path = "property",excerptProjection = PropertyProjection.class)
public interface PropertyRepository extends JpaRepository<Property, Integer> {


}
