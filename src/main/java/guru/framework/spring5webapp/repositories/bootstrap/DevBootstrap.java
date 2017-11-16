/**
 * 
 */
package guru.framework.spring5webapp.repositories.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import guru.framework.spring5webapp.model.Author;
import guru.framework.spring5webapp.model.Book;
import guru.framework.spring5webapp.model.Publisher;
import guru.framework.spring5webapp.repositories.AuthorRepository;
import guru.framework.spring5webapp.repositories.BookRepository;
import guru.framework.spring5webapp.repositories.PublisherRepository;

/**
 * @author sakkie6yster
 * @Component: Makes this a Spring Component or Spring Bean!
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;

	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		initData();
	}

	private void initData() {

		Publisher harperCollins = new Publisher("Harper Collins", "San Francisco");
		Publisher worx = new Publisher("Worx", "London");
		publisherRepository.save(harperCollins);
		publisherRepository.save(worx);

		// Eric
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "1234", harperCollins);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);

		authorRepository.save(eric);
		bookRepository.save(ddd);

		// Rod
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("JEE Development without EJB", "2344", harperCollins);
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);

		authorRepository.save(rod);
		bookRepository.save(noEJB);

	}

}
