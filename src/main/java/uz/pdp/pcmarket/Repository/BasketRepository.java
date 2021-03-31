package uz.pdp.pcmarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.Entity.Attachment;
import uz.pdp.pcmarket.Entity.Basket;
import uz.pdp.pcmarket.Projection.BasketProjection;

@RepositoryRestResource(path = "basket",excerptProjection = BasketProjection.class)
public interface BasketRepository extends JpaRepository<Basket, Integer> {

}
