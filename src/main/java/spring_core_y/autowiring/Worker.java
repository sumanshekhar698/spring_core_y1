package spring_core_y.autowiring;

public class Worker {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Worker [address=" + address + "]";
	}

	public Worker(Address address) {
		super();
		this.address = address;
	}

}
