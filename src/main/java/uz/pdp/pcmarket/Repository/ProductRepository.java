package uz.pdp.pcmarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.pcmarket.Entity.Product;
import uz.pdp.pcmarket.Projection.ProductProjection;

import java.util.List;

@RepositoryRestResource(path = "product",excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @RestResource(path = "byPropertyId")
    @Query(value = "select * from product join characteristic c on product.id = c.product_id join property p on c.id = p.characteristic_id where p.id=:propertyId",nativeQuery = true)
    List<Product> getProductByCharacteristicsId_PropertyId(Integer propertyId);

    // filtrdagi narx uchun
    @RestResource(path = "byPrice")
    List<Product> getProductByPrice(@Param("minPrice")Double minPrice, @Param("maxPrice") Double maxPrice);
}
