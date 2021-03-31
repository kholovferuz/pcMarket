package uz.pdp.pcmarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.Entity.Attachment;
import uz.pdp.pcmarket.Entity.Team;
import uz.pdp.pcmarket.Projection.TeamProjection;

@RepositoryRestResource(path = "team",excerptProjection = TeamProjection.class)
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
