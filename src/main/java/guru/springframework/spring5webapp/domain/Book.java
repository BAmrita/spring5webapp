package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String title;
	private String isBn;
	
	@ManyToMany
	@JoinTable(name="author_book",joinColumns = @JoinColumn(name="book_id"), 
	inverseJoinColumns = @JoinColumn(name="author_id"))
	private Set<Author> authors= new HashSet<Author>();
	
	@ManyToOne
	private Publisher publisher;

	public Book(String title, String isBn) {
		super();
		this.title = title;
		this.isBn = isBn;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Long getId() {
		return Id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsBn() {
		return isBn;
	}

	public void setIsBn(String isBn) {
		this.isBn = isBn;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Id != null ? Id.hashCode() : 0;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		 if (this == obj) return true;
	     if (obj == null || getClass() != obj.getClass()) return false;

	     Book book = (Book) obj;

	     return Id != null ? Id.equals(book.Id) : book.Id == null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book{" +
	    "id=" + Id +
	    ", Title='" + title + '\'' +
	    ", isBn='" + isBn + '\'' +
	    '}';
	}

	public Book() {
		super();
	}
	
}
