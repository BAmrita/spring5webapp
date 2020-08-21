package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.BookRepository;

@Controller
public class BookController {
	
	private BookRepository bookRepo;

	public BookController(BookRepository bookRepo) {
		//super();
		this.bookRepo = bookRepo;
	}
	
	@RequestMapping("/book")
	public String getBooks(Model model) {
		model.addAttribute("bookList", bookRepo.findAll());
		
		return "book/list";
	}
	

}
