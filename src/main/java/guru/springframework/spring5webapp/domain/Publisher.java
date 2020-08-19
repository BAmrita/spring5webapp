package guru.springframework.spring5webapp.domain;

import javax.persistence.*;

@Entity
public class Publisher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private String name;
	private String addressline1;
	private String city;
	private String state;
	private String zip;
	public Long getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
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

	     Publisher publisher = (Publisher) obj;

	     return Id != null ? Id.equals(publisher.Id) : publisher.Id == null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Publisher{" +
	    "id=" + Id +
	    ", Name='" + name + '\'' +
	    ", address Line 1 ='" + addressline1 + '\'' +
	    ", city =" + city +'\'' +
	    ", state ='" + state + '\'' +
	    ", zip=" + zip +
	    '}';
	}
}
