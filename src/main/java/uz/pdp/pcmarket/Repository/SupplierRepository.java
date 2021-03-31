package uz.pdp.pcmarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.Entity.Attachment;
import uz.pdp.pcmarket.Entity.Supplier;
import uz.pdp.pcmarket.Projection.SupplierProjection;

@RepositoryRestResource(path = "supplier",excerptProjection = SupplierProjection.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
