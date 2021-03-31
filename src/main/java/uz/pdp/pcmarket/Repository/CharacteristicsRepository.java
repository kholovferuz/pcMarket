package uz.pdp.pcmarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.Entity.Characteristic;
import uz.pdp.pcmarket.Projection.CharacteristicsProjection;

@RepositoryRestResource(path = "characteristics",excerptProjection = CharacteristicsProjection.class)
public interface CharacteristicsRepository extends JpaRepository<Characteristic, Integer> {

}
