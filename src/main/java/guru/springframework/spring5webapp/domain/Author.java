package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Author {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long Id;
private String firstName;
private String lastName;

@ManyToMany(mappedBy = "authors")
private Set<Book> books= new HashSet<Book>();



public Author() {
	super();
}

public Author(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}

public Long getId() {
	return Id;
}


public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public Set<Book> getBooks() {
	return books;
}

public void setBooks(Set<Book> books) {
	this.books = books;
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

     Author author = (Author) obj;

     return Id != null ? Id.equals(author.Id) : author.Id == null;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Author{" +
    "id=" + Id +
    ", firstName='" + firstName + '\'' +
    ", lastName='" + lastName + '\'' +
    ", books=" + books +
    '}';
}

}
