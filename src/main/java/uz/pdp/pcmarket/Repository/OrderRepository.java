package uz.pdp.pcmarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.Entity.Attachment;
import uz.pdp.pcmarket.Entity.Order;
import uz.pdp.pcmarket.Projection.OrderProjection;

@RepositoryRestResource(path = "order",excerptProjection = OrderProjection.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
