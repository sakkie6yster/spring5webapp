/**
 * 
 */
package guru.framework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.framework.spring5webapp.model.Publisher;

/**
 * @author ivanniekerk
 *
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
