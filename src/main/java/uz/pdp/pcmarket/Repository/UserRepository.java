package uz.pdp.pcmarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.Entity.Attachment;
import uz.pdp.pcmarket.Entity.User;
import uz.pdp.pcmarket.Projection.UserProjection;

@RepositoryRestResource(path = "user", excerptProjection = UserProjection.class)
public interface UserRepository extends JpaRepository<User, Integer> {

}
