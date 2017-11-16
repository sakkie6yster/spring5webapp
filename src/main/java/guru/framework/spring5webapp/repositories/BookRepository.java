/**
 * 
 */
package guru.framework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.framework.spring5webapp.model.Book;

/**
 * Created by @author IzaakVanNiekerk @since 20 
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
