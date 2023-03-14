package spring_core_y.autowiring.annotaions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Worker {

	@Autowired
	@Qualifier("a1")
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("a2") // Higher priority over Properties injection
	public void setAddress(Address address) {
		System.out.println("Setter called");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Worker [address=" + address + "]";
	}

	@Autowired
//	@Qualifier("a2")//Qualifier cannot be used on a constructor
	public Worker(Address address) {
		super();
		System.out.println("Worker(Address address)");
		this.address = address;
	}

}
