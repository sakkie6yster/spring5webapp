/**
 * 
 */
package guru.framework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.framework.spring5webapp.repositories.AuthorRepository;

/**
 * Because of @Controller annotation, Spring will detect this class as a Spring <br>
 * bean and wire it into Spring context. <br>
 * <br>
 * Created by @author IzaakVanNiekerk @since 5 November 2017
 */
@Controller
public class AuthorController {

	private AuthorRepository authorRepository;
	
	public AuthorController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}

	@RequestMapping("/authors")
	public String getBooks(Model model) {
		model.addAttribute("authors", authorRepository.findAll());
		return "authors";
	}
	
}
