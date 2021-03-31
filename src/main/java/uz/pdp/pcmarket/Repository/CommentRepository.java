package uz.pdp.pcmarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.Entity.Attachment;
import uz.pdp.pcmarket.Entity.Comment;
import uz.pdp.pcmarket.Projection.CommentProjection;

@RepositoryRestResource(path = "comment",excerptProjection = CommentProjection.class)
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
