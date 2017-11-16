/**
 * 
 */
package guru.framework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.framework.spring5webapp.model.Author;

/**
 * @author ivanniekerk
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
