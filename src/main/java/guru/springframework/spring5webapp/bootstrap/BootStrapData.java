package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {
	
	private AuthorRepository authorRepo;
	private BookRepository bookRepo;
	private PublisherRepository publisherRepo;

	public BootStrapData(AuthorRepository authorRepo, BookRepository bookRepo, PublisherRepository publisherRepo) {
		super();
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
		this.publisherRepo = publisherRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Loading BootStrap class ==========================");
		Publisher pub= new Publisher();
		pub.setAddressline1("Address Line 1");
		pub.setCity("Edinburgh");
		pub.setName("Pub 1");
		pub.setState("Scotland");
		pub.setZip("heu7");
		publisherRepo.save(pub);
		
		Author au = new Author("Amrita","Bahadur");
		Book book= new Book("my First Book", "abcde");
		au.getBooks().add(book);
		book.getAuthors().add(au);
		book.setPublisher(pub);
		pub.getBooks().add(book);
		authorRepo.save(au);
		bookRepo.save(book);
		
		
		
		au=new Author("AMrita 1", "Bahadur1");
		book= new Book("my second book","cdefg");
		au.getBooks().add(book);
		book.getAuthors().add(au);
		book.setPublisher(pub);
		pub.getBooks().add(book);
		authorRepo.save(au);
		bookRepo.save(book);
		
	
		
		publisherRepo.save(pub);
		
		
		System.out.println(" Count for number of authors "+authorRepo.count());
		System.out.println(" Count for number of books "+bookRepo.count());
		System.out.println(" Count for number of publishers "+publisherRepo.count());
		System.out.println("Publisher Number of Books: " + pub.getBooks().size());
		
	}

}
