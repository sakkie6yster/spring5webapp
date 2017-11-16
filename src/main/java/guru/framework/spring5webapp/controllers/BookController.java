/**
 * 
 */
package guru.framework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.framework.spring5webapp.repositories.BookRepository;

/**
 * Because of @Controller annotation, Spring will detect this class as a Spring <br>
 * bean and wire it into Spring context. <br>
 * Created by @author IzaakVanNiekerk @since 5 November 2017
 *
 */
@Controller
public class BookController {

	private BookRepository bookRepository;
	
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		return "books";
	}
	
}
